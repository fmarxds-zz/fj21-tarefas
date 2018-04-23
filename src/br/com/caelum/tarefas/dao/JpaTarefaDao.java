package br.com.caelum.tarefas.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import br.com.caelum.tarefas.modelo.Tarefa;

@Component
public class JpaTarefaDao implements TarefaDao {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Tarefa buscaPorId(Long id) {
		return manager.find(Tarefa.class, id);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Tarefa> lista() {
		return manager.createQuery("select t from Tarefa as t").getResultList();
	}

	@Override
	public void adiciona(Tarefa t) {
		manager.persist(t);
	}

	@Override
	public void altera(Tarefa t) {
		Tarefa tarefa = buscaPorId(t.getId());
		manager.merge(tarefa);
	}

	@Override
	public void remove(Tarefa t) {
		Tarefa tarefa = buscaPorId(t.getId());
		manager.remove(tarefa);
	}

	@Override
	public void finaliza(Tarefa t) {
		Tarefa tarefa = buscaPorId(t.getId());
		tarefa.setFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
	}
	
}
