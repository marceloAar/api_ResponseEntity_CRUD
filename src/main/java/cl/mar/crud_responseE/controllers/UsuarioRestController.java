//API - CRUD Spring Boot - ResponseEntity - Usuarios - MySQL
//mAR -2023
package cl.mar.crud_responseE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.mar.crud_responseE.models.Usuario;
import cl.mar.crud_responseE.services.usuarioIMPL.UsuarioServiceIMPL;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

	@Autowired
	private UsuarioServiceIMPL usuariosIMPL;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listarUsuarios(){
		List<Usuario> listarUsuarios = this.usuariosIMPL.listarUsuarios();		
		return ResponseEntity.ok(listarUsuarios);
	}
	
	
	@PostMapping("/crear")
	public ResponseEntity<?> crearUsuarios(@RequestBody Usuario usuario){		
		Usuario usuarioCreado = this.usuariosIMPL.crearUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCreado);
	}
	
	
	@PutMapping("/modificar")
	public ResponseEntity<?> modificarUsuarios(@RequestBody Usuario usuario){		
		Usuario usuarioModificado = this.usuariosIMPL.modificarUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModificado);
	}
	
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<?> buscarUsuario(@PathVariable int id){
		Usuario usuarioEncontrado= this.usuariosIMPL.buscarUsuario(id);		
		return ResponseEntity.ok(usuarioEncontrado);
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarUsuario(@PathVariable int id){
		this.usuariosIMPL.eliminarUsuario(id);		
		return ResponseEntity.ok().build();
	}
	
	
}
