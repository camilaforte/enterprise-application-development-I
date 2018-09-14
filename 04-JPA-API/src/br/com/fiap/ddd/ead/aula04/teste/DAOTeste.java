package br.com.fiap.ddd.ead.aula04.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.ddd.ead.aula04.dao.CarroDAO;
import br.com.fiap.ddd.ead.aula04.dao.impl.CarroDAOImpl;
import br.com.fiap.ddd.ead.aula04.entidade.Carro;
import br.com.fiap.ddd.ead.aula04.entidade.TipoCarro;
import br.com.fiap.ddd.ead.aula04.exception.CommitException;

public class DAOTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		CarroDAO dao = new CarroDAOImpl(em);
		Carro car = new Carro("Hyundai", 2016, "ADD1478", TipoCarro.UTILITARIO,
				new GregorianCalendar(2016, Calendar.JULY, 2), null);

		try {
			dao.create(car);
			dao.commit();
			System.out.println("Carro cadastrado!");
		} catch (CommitException e) {
			System.err.println(e.getMessage());
		}
		// busca
		Carro carBusca = dao.find(car.getCodigo());
		System.out.println(carBusca.getModelo());

		// atualização
		carBusca.setModelo("KIA");
		try {
			dao.update(carBusca);
			dao.commit();
			System.out.println("Atualizado");
		} catch (CommitException e) {
			System.err.println(e.getMessage());
		}

		// remoção

		try {
			dao.delete(carBusca.getCodigo());
			dao.commit();
			System.out.println("Removido!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		em.close();
		fabrica.close();
	}
}
