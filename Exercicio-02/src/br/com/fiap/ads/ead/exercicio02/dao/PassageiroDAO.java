package br.com.fiap.ads.ead.exercicio02.dao;

import br.com.fiap.ads.ead.exercicio02.entidade.Passageiro;
import br.com.fiap.ads.ead.exercicio02.exception.PassageiroNotFoundException;

public interface PassageiroDAO {

	void create (Passageiro passageiro);
	void update (Passageiro passageiro);
	Passageiro find (Passageiro codigo);
	void delete (Passageiro codigo) throws PassageiroNotFoundException, Exception;
	
	void commit();
}
