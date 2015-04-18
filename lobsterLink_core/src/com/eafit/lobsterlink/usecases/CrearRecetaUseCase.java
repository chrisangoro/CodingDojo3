package com.eafit.lobsterlink.usecases;

import com.eafit.lobsterlink.dto.RecetaDTO;
import com.eafit.lobsterlink.entities.Receta;
import com.eafit.lobsterlink.soporte.RecetasRepositorio;

public class CrearRecetaUseCase {
	
        RecetaDTO datos;
        RecetasRepositorio repo;
    
    public CrearRecetaUseCase(RecetasRepositorio repoIn) {
	repo = repoIn;
    }  
    
    public void setParametros(RecetaDTO entrada){
	datos = entrada;
	}
    
    public void execute(){
        Receta rec = repo.crearReceta(datos.getNombre(), datos.getIngredientes(),
                datos.getDescripcion(), datos.getReceta());
        repo.guardarReceta(rec);
    }

    
}
