package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> pesquisarPorTransporte(Transporte transporte) {
		
		return em.createQuery("FROM Pacote p WHERE p.transporte = :t", Pacote.class).setParameter("t", transporte).getResultList();
	}

	@Override
	public List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim) {
		 
		return em.createQuery("FROM Pacote p WHERE p.dataSaida BETWEEN :pdtInicio AND :pdtFim", Pacote.class).setParameter("pdtFim", fim).setParameter("pdtInicio", inicio).getResultList();
		
	}

	@Override
	public double calcularMediaPreco() {
		return em.createQuery("SELECT AVG.(p.preco) FROM Pacote p", Double.class).getSingleResult();
	}

}
