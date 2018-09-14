package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.entity.Cidade;

public class CidadeDAOImpl extends GenericDAOImpl<Cidade,Integer> implements CidadeDAO{

	public CidadeDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cidade> listar() {
		//criar a query	
		TypedQuery<Cidade> query = em.createQuery("FROM Cidade", Cidade.class);
	
		//executar a query
		return query.getResultList();
	}

	@Override
	public List<Cidade> listarNome(String nome) {
		//criar query		//usei o like para buscar o que contém 
		TypedQuery<Cidade> query = em.createQuery("FROM Cidade c WHERE c.nome LIKE = :nomeCidade", Cidade.class);
		//passar parametro para a query		//como usei o like preciso incrementar com a %
		query.setParameter("nomeCidade", "%" + nome + "%");
		//executar a query
		return query.getResultList();
	}

}
