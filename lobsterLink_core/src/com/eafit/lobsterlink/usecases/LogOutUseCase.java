package com.eafit.lobsterlink.usecases;

import com.eafit.lobsterlink.dto.UsuarioDTO;
import com.eafit.lobsterlink.entities.User;
import com.eafit.lobsterlink.exceptions.UserException;
import com.eafit.lobsterlink.soporte.UserRepositorio;

public class LogOutUseCase {
	UserRepositorio repo;
	UsuarioDTO usr;
	
	public LogOutUseCase(UserRepositorio rep) {
		repo=rep;
	}
	
	public void setParametros(UsuarioDTO entrada){
		usr = entrada;
	}
	
	public void excecute() throws UserException{
		if(validarUsuario()){
			Logout();
		}
	}
	
	public boolean validarUsuario(){
		User usuario = repo.getUser(usr.getNombre());
		return usuario != null;
	}
	
	public void Logout() throws UserException{
		User usuario = repo.getUser(usr.getNombre());
		usuario.logOutValidation();
		repo.update(usuario);
	}
}
