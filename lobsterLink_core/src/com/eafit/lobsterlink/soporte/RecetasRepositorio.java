/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eafit.lobsterlink.soporte;

import com.eafit.lobsterlink.entities.Receta;
import java.util.List;

/**
 *
 * @author felipelondono
 */
public interface RecetasRepositorio {
    public List<Receta> consultarRecetas(String nombre, String ingredientes,String receta);
    public void guardarReceta(Receta receta);
}
