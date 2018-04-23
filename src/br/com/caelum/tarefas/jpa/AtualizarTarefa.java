package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class AtualizarTarefa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefa");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = new Tarefa();
		tarefa.setId(13L);
		tarefa.setDescricao("JPA Testando 1234");
		tarefa.setDataFinalizacao(Calendar.getInstance());
		tarefa.setFinalizado(true);
		
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
		
		manager.close();
	}

}
