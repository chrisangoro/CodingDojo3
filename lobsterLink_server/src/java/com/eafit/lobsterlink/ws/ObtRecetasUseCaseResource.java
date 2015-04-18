/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eafit.lobsterlink.ws;

import com.eafit.lobsterlink.soporte.RecetasRepositorio;
import com.eafit.lobsterlink.usecases.ObtenerRecetasUseCase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("ObtRecetasUseCase")
public class ObtRecetasUseCaseResource {

    RecetasRepositorio repo;
    
    @Context
    private UriInfo context;

    public ObtRecetasUseCaseResource() {
    }

    @GET
    @Produces("application/json")
    @Path("/obtener")
    public String getJson() {
        ObtenerRecetasUseCase rec = new ObtenerRecetasUseCase(repo);
        return rec.execute();
    }
}
