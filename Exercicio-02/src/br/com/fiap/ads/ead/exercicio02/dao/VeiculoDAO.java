package br.com.fiap.ads.ead.exercicio02.dao;

import br.com.fiap.ads.ead.exercicio02.entidade.Veiculo;
import br.com.fiap.ads.ead.exercicio02.exception.VeiculoNotFoundException;

public interface VeiculoDAO {

	
	void create (Veiculo veiculo);
	void upadate (Veiculo veiculo);
	Veiculo find (int codigo);
	void delete (int codigo) throws VeiculoNotFoundException, Exception;
	
	void commit ();
	
	
	
}
