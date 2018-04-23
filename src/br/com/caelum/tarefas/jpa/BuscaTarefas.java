package br.com.caelum.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.caelum.tarefas.modelo.Tarefa;

public class BuscaTarefas {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefa");
		EntityManager manager = factory.createEntityManager();
		
		Query querySQL = manager.createQuery("select t from Tarefa as t");
		
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = querySQL.getResultList();
		
		lista.forEach(x -> System.out.println(x.getDescricao()));
		
		manager.close();		
		
	}

}
