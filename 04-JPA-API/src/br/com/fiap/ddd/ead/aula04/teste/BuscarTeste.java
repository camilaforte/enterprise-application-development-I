package br.com.fiap.ddd.ead.aula04.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ddd.ead.aula04.entidade.Carro;

public class BuscarTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		EntityManager em = fabrica.createEntityManager();

		//nao preciso de transação, pois é somente pesquisa
		Carro carro = em.find(Carro.class, 1); 		//find busca no banco, veiculo com a chave 1 neste caso
	
		System.out.println(carro.getModelo());
		
		
		
		em.close();
		fabrica.close();
	}
}
