package cl.mar.crud_responseE.services.usuarioIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.mar.crud_responseE.models.Usuario;
import cl.mar.crud_responseE.repositories.UsuarioRepository;
import cl.mar.crud_responseE.services.IUsuarioService;

@Service
public class UsuarioServiceIMPL implements IUsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> listarUsuarios() {
		
		return this.usuarioRepository.findAll();
		
	}

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario buscarUsuario(int id) {
		
		return this.usuarioRepository.findById(id).get();
	}

	@Override
	public void eliminarUsuario(int id) {
		
		this.usuarioRepository.deleteById(id);
		
	}

	
}
