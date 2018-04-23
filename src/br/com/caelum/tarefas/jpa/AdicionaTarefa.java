package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class AdicionaTarefa {
	
	public static void main(String[] args) {
		
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Teste JPA 2");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefa");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("Id da tarefa persistida: " + tarefa.getId());
		
		manager.close();
		
	}

}
