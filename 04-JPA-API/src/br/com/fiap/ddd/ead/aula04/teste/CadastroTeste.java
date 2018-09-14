package br.com.fiap.ddd.ead.aula04.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ddd.ead.aula04.entidade.Carro;
import br.com.fiap.ddd.ead.aula04.entidade.TipoCarro;

public class CadastroTeste {

	public static void main(String[] args) {
		
		//criei o objeto, enqto não fizer o persist eu não estou gerenciando o objeto.
		Carro carro = new Carro("Jeep", 2015, "ADA1454", TipoCarro.SUV, new GregorianCalendar(2015, Calendar.FEBRUARY, 14), null);
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle"); //este nome deve estar no classe persistence.xml
		
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();		//inicio a transação pq vou add
		em.persist(carro);					//.persis ou .merge ambos  criam
		em.getTransaction().commit();		//comito sempre a transação
		
		
		em.close();
		fabrica.close();
	}
}
