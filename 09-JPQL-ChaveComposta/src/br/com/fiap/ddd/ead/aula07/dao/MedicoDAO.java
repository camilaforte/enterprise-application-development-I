package br.com.fiap.ddd.ead.aula07.dao;

import javax.persistence.EntityManager;

import br.com.fiap.ads.ead.entity.Medico;
import br.com.fiap.ddd.ead.aula07.daoImpl.GenericDAOImpl;

public class MedicoDAO extends GenericDAOImpl<Medico, Integer>{

	public MedicoDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
