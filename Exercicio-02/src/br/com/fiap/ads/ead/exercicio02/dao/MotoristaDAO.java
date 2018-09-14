package br.com.fiap.ads.ead.exercicio02.dao;

import br.com.fiap.ads.ead.exercicio02.entidade.Motorista;
import br.com.fiap.ads.ead.exercicio02.exception.CommitExcpetion;
import br.com.fiap.ads.ead.exercicio02.exception.MotoristaNotFoundException;

public interface MotoristaDAO {

	void create (Motorista motorista);
	void update (Motorista motorista);
	Motorista find (int numeroCarteira);
	void delete (int numeroCarteira) throws MotoristaNotFoundException, Exception;
	
	void commit () throws CommitExcpetion, Exception;
}
