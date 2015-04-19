package com.eafit.lobsterlink.soporte;

import com.eafit.lobsterlink.entities.User;
import java.util.List;

public interface UserRepositorio {
	public User getUser(String username);
	public List<User> consultarUsuarios();
	public void crearUsuario(String nombre, String password);
	public void save(User user);
	public void update(User user);
}
