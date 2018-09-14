package br.com.fiap.ddd.ead.aula04.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ddd.ead.aula04.dao.CarroDAO;
import br.com.fiap.ddd.ead.aula04.entidade.Carro;
import br.com.fiap.ddd.ead.aula04.exception.CarNotFoundException;
import br.com.fiap.ddd.ead.aula04.exception.CommitException;

public class CarroDAOImpl implements CarroDAO {
	//classe de implementa��o de DAO
	
	
	private EntityManager em;

	// construtor do entityManager
	public CarroDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Carro carro) {
		em.persist(carro);
	}

	@Override
	public void update(Carro carro) {
		em.merge(carro);
	}

	@Override
	public Carro find(int codigo) {
		return em.find(Carro.class, codigo);
	}

	@Override
	public void delete(int codigo) throws CarNotFoundException {
		Carro car = em.find(Carro.class, codigo);
		if(car == null) {
			throw new CarNotFoundException("Carro n�o encontrado!");
		}
		em.remove(car);
	}
	
	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();		//se der erro eu fico com a transa��o aberta, por isso crio um catch
			
		} catch (Exception e) {					//crio um catch de roll back para commitar a transa��o
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException ("Erro ao gravar!");
		}
	}
	
}
