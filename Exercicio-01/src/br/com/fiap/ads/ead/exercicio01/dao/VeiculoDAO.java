package br.com.fiap.ads.ead.exercicio01.dao;

import br.com.fiap.ads.ead.exercicio01.entidade.Veiculo;
import br.com.fiap.ads.ead.exercicio01.exception.VeiculoNotFoundException;

public interface VeiculoDAO {

	
	void create (Veiculo veiculo);
	void upadate (Veiculo veiculo);
	Veiculo find (int codigo);
	void delete (int codigo) throws VeiculoNotFoundException, Exception;
	
	void commit ();
	
	
	
}
