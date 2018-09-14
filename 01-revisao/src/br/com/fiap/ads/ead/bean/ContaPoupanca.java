package br.com.fiap.ads.ead.bean;

import java.io.Serializable;

public class ContaPoupanca implements ContaInvestimento, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public double calculaRetornoInvestimento() {
		return 0;
	}
	
	
	
}
