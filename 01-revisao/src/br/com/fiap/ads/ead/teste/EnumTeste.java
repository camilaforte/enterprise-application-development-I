package br.com.fiap.ads.ead.teste;

import br.com.fiap.ads.ead.bean.TipoConta;

public class EnumTeste {

	public static void main(String[] args) {
		
		TipoConta tipo = TipoConta.COMUM;
		if(tipo == TipoConta.COMUM);
			System.out.println(tipo);
	}
}
