package com.eafit.lobsterlink.entities;

public class User {
	
	private String username;
	private String password;
	private boolean logueado;
	
	public boolean validateUser(String usr, String pass){
		if(usr == username && pass==password){
			return true;
		}else{
			System.out.println("Usuario o Contraseña incorrectos");
			return false;
		}
	}
	
	public void logOut(){
		if(logueado == true){
			logueado = false;
		}else{
			System.out.println("not logged in");
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
