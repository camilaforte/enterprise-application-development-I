package br.com.fiap.ddd.ead.aula04.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ddd.ead.aula04.entidade.Carro;

public class AtualizarTeste {

	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager();
		
			Carro carro = em.find(Carro.class, 1);
			carro.setModelo("Prisma"); 			//como alterei devo criar a transação
			
			em.getTransaction().begin(); 
			em.merge(carro);					//merge cadastra e atualiza, porem como ele já esta no banco eu não precisaria do merge, somente se ele tivesse sido criado agora
			em.getTransaction().commit();
		
		
		em.close();
		fabrica.close();
	}
}
