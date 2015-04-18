
package com.eafit.lobsterlink.ws;

import com.eafit.lobsterlink.dto.RecetaDTO;
import com.eafit.lobsterlink.entities.Receta;
import com.eafit.lobsterlink.soporte.RecetasRepositorio;
import com.eafit.lobsterlink.usecases.CrearRecetaUseCase;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

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

    @GET
    @Produces("text/plain")
    public String getText() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @PUT
    @Consumes("text/plain")
    @Path("/crear")
    public void putText(String nombre, String descripcion,String ingredientes,
    String receta) {
        RecetaDTO dto = new RecetaDTO();
        dto.setNombre(nombre);
        dto.setDescripcion(descripcion);
        dto.setIngredientes(ingredientes);
        dto.setReceta(receta);
        CrearRecetaUseCase rec = new CrearRecetaUseCase(repo);
        rec.setParametros(dto);
        rec.execute();
    }
}
