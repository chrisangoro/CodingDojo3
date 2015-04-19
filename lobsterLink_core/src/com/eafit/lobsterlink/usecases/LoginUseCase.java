package com.eafit.lobsterlink.usecases;

import com.eafit.lobsterlink.dto.UsuarioDTO;
import com.eafit.lobsterlink.entities.User;
import com.eafit.lobsterlink.exceptions.UserException;
import com.eafit.lobsterlink.soporte.UserRepositorio;

public class LoginUseCase {

	UserRepositorio repo;
	UsuarioDTO usr;
	
	public LoginUseCase(UserRepositorio rep){
		repo = rep;
	}
	
	public void setParametros(UsuarioDTO entrada){
		usr = entrada;
	}
	
	public void excecute() throws UserException{
		if(validarUsuario()){
			Login();
		}
	}
	
	public boolean validarUsuario(){
		User usuario = repo.getUser(usr.getNombre());
		return usuario != null;
	}
	
	public void Login() throws UserException{
		User usuario = repo.getUser(usr.getNombre());
		usuario.validateUser(usr.getNombre(), usr.getPassword());
		repo.update(usuario);
	}
}
