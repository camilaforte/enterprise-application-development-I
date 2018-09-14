package br.com.fiap.ddd.ead.aula06.daoImpl;

import javax.persistence.EntityManager;

import br.com.fiap.ddd.ead.aula06.dao.PedidoDAO;
import br.com.fiap.ead.aula07.entity.Pedido;

public class PedidoDAOImpl extends GenericDAOImpl<Pedido, Integer> implements PedidoDAO{

	public PedidoDAOImpl(EntityManager em) {
		super(em);
	}

}
