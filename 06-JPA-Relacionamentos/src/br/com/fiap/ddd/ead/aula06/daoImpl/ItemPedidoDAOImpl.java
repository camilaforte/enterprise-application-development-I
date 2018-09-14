package br.com.fiap.ddd.ead.aula06.daoImpl;

import javax.persistence.EntityManager;

import br.com.fiap.ddd.ead.aula06.dao.ItemPedidoDAO;
import br.com.fiap.ead.aula07.entity.ItemPedido;

public class ItemPedidoDAOImpl extends GenericDAOImpl<ItemPedido, Integer> implements ItemPedidoDAO{

	public ItemPedidoDAOImpl(EntityManager em) {
		super(em);
	}
	

}
