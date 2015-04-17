package com.eafit.lobsterlink.entities;

import com.eafit.lobsterlink.exceptions.UserException;

public class User {
	
	private String username;
	private String password;
	private boolean logueado;
	
	public void validateUser(String usr, String pass) throws UserException{
		if(usr != username || pass!=password){
			throw new UserException("Usuario o Contraseņa incorrectos");
		}
	}
	
	public boolean passwordValidation(String pass){
		if(pass.length() < 6){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean userValidation(String user){
		if(user.length() < 4){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean logOutValidation(){
		if(logueado == true){
			logueado = false;
			return true;
		}else{
			System.out.println("not logged in");
			return false;
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLogueado() {
		return logueado;
	}

	public void setLogueado(boolean logueado) {
		this.logueado = logueado;
	}


}
