package com.eafit.lobsterlink.usecases;

import java.util.ArrayList;
import java.util.List;

import com.eafit.lobsterlink.dto.UsuarioDTO;
import com.eafit.lobsterlink.entities.User;
import com.eafit.lobsterlink.soporte.UserRepositorio;

public class RegistrarseUseCase {
	UserRepositorio repo;
	UsuarioDTO usr;
	
	public RegistrarseUseCase(UserRepositorio rep){
		repo = rep;
	}
	
	public void setParametros(UsuarioDTO entrada){
		usr = entrada;
	}
	
	public void execute(){
		if(validarUsuario()){
			registrarse();
		}
	}
	
	private void registrarse(){
		User usuario = repo.getUser(usr.getNombre());
		repo.save(usuario);
	}
	
	private boolean validarUsuario(){
		User user = repo.getUser(usr.getNombre());
		if(user.userValidation(user.getUsername())){
			if(user.passwordValidation(user.getPassword())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	private boolean UsernameNoRepetido(){
		User user = repo.getUser(usr.getNombre());
		List<User> usuarios = repo.consultarUsuarios();
		for(int i=1;i<usuarios.size()-1;i++){
			if(user.getUsername()==usuarios.get(i).getUsername()){
				return false;
			}
		}
		return true;
	}
}
