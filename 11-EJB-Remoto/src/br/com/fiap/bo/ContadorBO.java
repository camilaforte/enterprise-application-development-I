package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface ContadorBO {

	//contador de acesso
	
	void incrementar();
	
	int verTotal();
	
}
