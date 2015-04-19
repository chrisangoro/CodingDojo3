
package com.eafit.lobsterlink.ws;

import com.eafit.lobsterlink.dto.RecetaDTO;
import com.eafit.lobsterlink.soporte.RecetasRepositorio;
import com.eafit.lobsterlink.usecases.CrearRecetaUseCase;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author felipelondono
 */
@Path("CrearReceta")
public class CrearRecetaResource {

    
    RecetasRepositorio repo;
    
    @Context
    private UriInfo context;

    public CrearRecetaResource() {
    }

    @PUT
    @Consumes("text/plain")
    @Path("/crear")
    public void putText(String nombre, String descripcion,String ingredientes,
    String receta) {
        RecetaDTO dto;
        dto.setNombre(nombre);
        dto.setDescripcion(descripcion);
        dto.setIngredientes(ingredientes);
        dto.setReceta(receta);
        CrearRecetaUseCase rec = new CrearRecetaUseCase(repo);
        rec.setParametros(dto);
        rec.execute();
    }
}
