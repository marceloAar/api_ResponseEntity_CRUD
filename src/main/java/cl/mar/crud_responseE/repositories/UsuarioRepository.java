package cl.mar.crud_responseE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.mar.crud_responseE.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
