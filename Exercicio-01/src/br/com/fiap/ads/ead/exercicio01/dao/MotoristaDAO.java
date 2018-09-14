package br.com.fiap.ads.ead.exercicio01.dao;

import br.com.fiap.ads.ead.exercicio01.entidade.Motorista;
import br.com.fiap.ads.ead.exercicio01.exception.CommitExcpetion;
import br.com.fiap.ads.ead.exercicio01.exception.MotoristaNotFoundException;

public interface MotoristaDAO {

	void create (Motorista motorista);
	void update (Motorista motorista);
	Motorista find (int numeroCarteira);
	void delete (int numeroCarteira) throws MotoristaNotFoundException, Exception;
	
	void commit () throws CommitExcpetion, Exception;
}
