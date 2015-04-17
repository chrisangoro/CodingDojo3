package com.eafit.lobsterlink.soporte;

import java.util.List;

import com.eafit.lobsterlink.entities.User;

public interface UserRepositorio {
	public User getUser(String username);
	public List<User> consultarUsuarios();
	public void crearUsuario(String nombre, String password);
	public void save(User user);
}
