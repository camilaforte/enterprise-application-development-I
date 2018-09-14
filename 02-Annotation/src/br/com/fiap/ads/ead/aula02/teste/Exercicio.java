package br.com.fiap.ads.ead.aula02.teste;

import br.com.fiap.ads.ead.aula02.annotation.Tabela;
import br.com.fiap.ads.ead.aula02.bean.Pessoa;

public class Exercicio {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		//RECUPERAR ANOTACAO
		Tabela anotacao = pessoa.getClass().getAnnotation(Tabela.class);
		System.out.println("Select * from " + anotacao.nome());
		
		
	}
}
