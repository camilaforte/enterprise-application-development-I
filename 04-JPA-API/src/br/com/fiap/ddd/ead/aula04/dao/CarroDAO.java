package br.com.fiap.ddd.ead.aula04.dao;

import br.com.fiap.ddd.ead.aula04.entidade.Carro;
import br.com.fiap.ddd.ead.aula04.exception.CarNotFoundException;
import br.com.fiap.ddd.ead.aula04.exception.CommitException;

public interface CarroDAO {

	//inteface de DAO
	
	void create(Carro carro);
	void update (Carro carro);
	Carro find(int codigo);
	void delete (int codigo) throws CarNotFoundException;
	
	void commit() throws CommitException;
	
}
