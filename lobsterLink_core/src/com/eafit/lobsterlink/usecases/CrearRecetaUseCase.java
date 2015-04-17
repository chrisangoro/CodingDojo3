/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eafit.lobsterlink.usecases;

import com.eafit.lobsterlink.dto.RecetaDTO;
import com.eafit.lobsterlink.soporte.RecetasRepositorio;

/**
 *
 * @author felipelondono
 */
public class CrearRecetaUseCase {
        RecetaDTO receta;
        RecetasRepositorio repo;
    
    public CrearRecetaUseCase(RecetasRepositorio repoIn) {
	repo = repoIn;
    }
 
    
    
}
