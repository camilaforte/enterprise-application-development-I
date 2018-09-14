package br.com.fiap.ads.ead.exercicio01.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ads.ead.exercicio01.entidade.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");

		EntityManager em = f.createEntityManager();

		Veiculo veiculo = new Veiculo("ABD9874", "Preto", 2015);
		
		em.getTransaction().begin();
		em.remove(veiculo);
		em.getTransaction().commit();

		em.close();
		f.close();

	}
}
