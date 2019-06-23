package br.com.consultemed.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultemed.model.Contato;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = JPAUtils.getEntityManagerFactory();
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("Criando o Contato ");
		
		Contato contato = new Contato();
		
		contato.setNome("Danilo");
		contato.setEmail("nilomilito@gmail.com");
		contato.setTelefone("9 98288071");
		//contato.setId(null);
		
		System.out.println("Contato criado ");
		
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Contato "+contato.getNome() + " cadastrado com sucesso !");
		
	}

}
