package com.eafit.lobsterlink.usecases;

import com.eafit.lobsterlink.dto.RecetaDTO;
import com.eafit.lobsterlink.soporte.RecetasRepositorio;

public class CrearRecetaUseCase {
	
        RecetaDTO receta;
        RecetasRepositorio repo;
    
    public CrearRecetaUseCase(RecetasRepositorio repoIn) {
	repo = repoIn;
    }  
    
}
