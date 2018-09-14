package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> pesquisarPorEstado(String estado);
	
	List<Cliente> pesquisarPorDiasReserva(int dias);
}