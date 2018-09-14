package br.com.fiap.ddd.ead.aula06.daoImpl;

import javax.persistence.EntityManager;

import br.com.fiap.ddd.ead.aula06.dao.NotaFiscalDAO;
import br.com.fiap.ead.aula07.entity.NotaFiscal;

public class NotaFiscalDAOImpl extends GenericDAOImpl<NotaFiscal, Integer> implements NotaFiscalDAO{

	public NotaFiscalDAOImpl(EntityManager em) {
		super(em);
	}

}
