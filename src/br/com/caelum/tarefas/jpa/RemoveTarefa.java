package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class RemoveTarefa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefa");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = manager.find(Tarefa.class, 13L);
		
		manager.getTransaction().begin();
		manager.remove(tarefa);
		manager.getTransaction().commit();
		
		manager.close();
		
	}

}
