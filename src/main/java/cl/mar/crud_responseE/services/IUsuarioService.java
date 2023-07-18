package cl.mar.crud_responseE.services;

import java.util.List;

import cl.mar.crud_responseE.models.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listarUsuarios();
	
	public Usuario crearUsuario(Usuario usuario);
	
	public Usuario modificarUsuario(Usuario usuario);
	
	public Usuario buscarUsuario(int id);
	
	public void eliminarUsuario(int id);

}
