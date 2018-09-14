package br.com.fiap.ddd.ead.aula06.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//o ideal é ter um entitymanager para cada operação dentro do projeto
	
	//CONTRUTOR PRIVADO
	private EntityManagerFactorySingleton() {

	}
	
	//ATRIBUTO STATICO E PRIVADO
	private static EntityManagerFactory fabricaSingleton; 
	
	
	//METODO STATICO E PUBLIC
	public static EntityManagerFactory getInstance() {
		
		if(fabricaSingleton == null) {
			fabricaSingleton = Persistence.createEntityManagerFactory("oracle");		//o oracle vai ser trocado no dia da prova
		}
		return fabricaSingleton; 
	}
	
	
	
	
}
