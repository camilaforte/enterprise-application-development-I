package br.com.fiap.nac.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.ead.entity.Apartamento;
import br.com.fiap.nac.dao.ApartamentoDAO;

public class ApartamentoDAOImpl extends GenericDAOImpl<Apartamento, Integer> implements ApartamentoDAO{

	public ApartamentoDAOImpl(EntityManager em) {
		super(em);
	}

}
