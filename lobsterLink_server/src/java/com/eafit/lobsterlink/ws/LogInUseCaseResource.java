/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eafit.lobsterlink.ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import com.eafit.lobsterlink.dto.UsuarioDTO;
import com.eafit.lobsterlink.support.UserRepositorio;
import com.eafit.lobsterlink.usecases.LoginUseCase;


@Path("LogInUseCase")
public class LogInUseCaseResource {

    @Context
    private UriInfo context;

    UserRepositorio repo;

    /**
     * Creates a new instance of LogInUseCaseResource
     */
    public LogInUseCaseResource() {
    }

    /**
     * PUT method for updating or creating an instance of LogInUseCaseResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String nombre, String password) {
        UsuarioDTO usrdto;
        usrdto.setNombre(nombre);
        usrdto.setPassword(password);
        LoginUseCase login = new LoginUseCase(repo);
        login.setParametros(usrdto);
        login.execute();
    }
}
