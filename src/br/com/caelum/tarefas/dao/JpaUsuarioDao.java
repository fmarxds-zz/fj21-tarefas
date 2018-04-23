package br.com.caelum.tarefas.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import br.com.caelum.tarefas.modelo.Usuario;

@Component
public class JpaUsuarioDao implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public boolean existeUsuario(Usuario usuario) {
		Usuario user = manager.find(Usuario.class, usuario);
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}

}
