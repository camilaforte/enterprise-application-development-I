package br.com.fiap.ads.ead.exercicio02.dao;

import br.com.fiap.ads.ead.exercicio02.entidade.Pagamento;

public interface PagamentoDAO {

	
	void create (Pagamento pagamento);
	void update (Pagamento pagamento);
	Pagamento find (Pagamento codigo);
	void delete (Pagamento codigo);
	
	void commit();
	
	
}
