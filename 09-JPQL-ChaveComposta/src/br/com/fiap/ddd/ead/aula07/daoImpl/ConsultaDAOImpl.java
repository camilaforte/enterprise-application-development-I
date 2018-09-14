package br.com.fiap.ddd.ead.aula07.daoImpl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.ead.entity.Consulta;
import br.com.fiap.ads.ead.entity.ConsultaPK;
import br.com.fiap.ddd.ead.aula07.dao.ConsultaDAO;

public class ConsultaDAOImpl extends GenericDAOImpl<Consulta, ConsultaPK> implements ConsultaDAO{

	public ConsultaDAOImpl(EntityManager em) {
		super(em);
	}

}
