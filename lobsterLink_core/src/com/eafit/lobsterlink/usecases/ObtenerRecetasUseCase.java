/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eafit.lobsterlink.usecases;

import com.eafit.lobsterlink.dto.RecetaDTO;
import com.eafit.lobsterlink.entities.Receta;
import com.eafit.lobsterlink.soporte.RecetasRepositorio;
import java.util.Iterator;

/**
 *
 * @author felipelondono
 */
public class ObtenerRecetasUseCase {
        RecetaDTO datos;
        RecetasRepositorio repo;
        
     public ObtenerRecetasUseCase(RecetasRepositorio repoIn) {
	repo = repoIn;
    }  
    
    public void setParametros(RecetaDTO entrada){
	datos = entrada;
	}
    
    public void execute(){
        Iterator it = repo.consultarRecetas().iterator();
        while(it.hasNext()){
            sacarReceta(it);
        }
    }
    
    public Receta sacarReceta(Iterator it1){
        return (Receta)it1.next();
    }
}
