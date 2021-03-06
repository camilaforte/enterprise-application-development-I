package br.com.fiap.ddd.ead.aula07.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//o ideal � ter um entitymanager para cada opera��o dentro do projeto
	
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
