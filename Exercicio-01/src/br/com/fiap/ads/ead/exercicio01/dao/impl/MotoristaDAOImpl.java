package br.com.fiap.ads.ead.exercicio01.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.ead.exercicio01.dao.MotoristaDAO;
import br.com.fiap.ads.ead.exercicio01.entidade.Motorista;
import br.com.fiap.ads.ead.exercicio01.exception.CommitExcpetion;
import br.com.fiap.ads.ead.exercicio01.exception.MotoristaNotFoundException;

public class MotoristaDAOImpl implements MotoristaDAO {

	private EntityManager em;

	public MotoristaDAOImpl() {
		super();
	}

	@Override
	public void create(Motorista motorista) {
		em.persist(motorista);
	}

	@Override
	public void update(Motorista motorista) {
		em.merge(motorista);
	}

	@Override
	public Motorista find(int numeroCarteira) {
		return em.find(Motorista.class, numeroCarteira);
	}

	@Override
	public void delete(int numeroCarteira) throws MotoristaNotFoundException, Exception {
		Motorista motorista = em.find(Motorista.class, numeroCarteira);
		if(motorista == null) {
			throw new MotoristaNotFoundException ("Motorista não encontrado!"); 
		}
		em.remove(motorista);
	}

	@Override
	public void commit() throws CommitExcpetion, Exception {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitExcpetion("Erro ao grava!");
			
			
		}
		
		
	}
	
	
	
}
