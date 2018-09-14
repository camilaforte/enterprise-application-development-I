package br.com.fiap.ads.ead.aula02.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ads.ead.aula02.entity.Aluno;
import br.com.fiap.ads.ead.aula02.entity.Periodo;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");	//Para criar o entityManager
		EntityManager em = fabrica.createEntityManager();									//EntityManager é pra tudo que eu possa persistir no banco 
		
		Aluno aluno = new Aluno("Camila", "ADS", new GregorianCalendar(2000, Calendar.OCTOBER, 2), true, Periodo.NOTURMO, 3, null, null);
		
		
		em.getTransaction().begin();		//inicializar a transação, antes de fazer qlq CRUD no banco							
		em.persist(aluno);					//em para cadastrar, atualizar, remover, tudo do banco vai ser atraves deste objeto
		em.getTransaction().commit();		//comito a transação 
		
		
		em.close();
		fabrica.close();
	}
}
