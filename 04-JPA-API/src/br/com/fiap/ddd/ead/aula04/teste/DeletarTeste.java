package br.com.fiap.ddd.ead.aula04.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ddd.ead.aula04.entidade.Carro;
import br.com.fiap.ddd.ead.aula04.entidade.TipoCarro;

public class DeletarTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle"); //essa é a mesma unidade que coloquei no persistence.xml
		
		EntityManager em = fabrica.createEntityManager();
		
		//para deletar não basta passar o numero de ID por exemplo, vc deve passar o objeto.
		em.getTransaction().begin();
		
		Carro carro2 = new Carro("Honda", 2018, "CDA2058", TipoCarro.PASSEIO, new GregorianCalendar(2015, Calendar.JANUARY, 15), null);
		em.persist(carro2);
		em.getTransaction().commit();
		
		Carro cDeleado = em.find(Carro.class, 2);
		em.remove(cDeleado);
		
		
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
		
	}


}
