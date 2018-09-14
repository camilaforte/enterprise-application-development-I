package br.com.fiap.ddd.ead.aula04.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ddd.ead.aula04.entidade.Carro;

public class RefreshTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Carro carro2 = em.find(Carro.class, 1);
		carro2.setModelo("Jeep");					//fiz a alteração, mas não commitei, entao faz sentido fazer um refesh
		
		System.out.println(carro2.getModelo());
		
		em.refresh(carro2);						//como não em aleração não é necessário criar transação
		
		System.out.println(carro2.getModelo());

		em.close();
		fabrica.close();
	}
	
	
	
}
