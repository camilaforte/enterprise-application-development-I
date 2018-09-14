package br.com.fiap.ads.ead.exercicio02.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//construtor privado
	public EntityManagerFactorySingleton() {

		super();
	}

	//atributo privado static
	private static EntityManagerFactory fabricaSingleton;
	
	//metodo publico static
	public static EntityManagerFactory getInstance() {
		
		if(fabricaSingleton == null) {
			fabricaSingleton = Persistence.createEntityManagerFactory("oracle");
		}
		return fabricaSingleton;
	}
	
}
