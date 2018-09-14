package br.com.fiap.ads.ead.aula02.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.ads.ead.aula02.annotation.Coluna;
import br.com.fiap.ads.ead.aula02.bean.Pessoa;

public class AnotacaoTeste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		// API Reflection
		String nomeClasse = pessoa.getClass().getName();
		System.out.println(nomeClasse);
		//RECUPERAR OS ATRIBUTOS
		Field[] attrs = pessoa.getClass().getDeclaredFields(); // retorno de atributos
			for(Field field : attrs) {
				System.out.println(field.getName());
				//RECUPERAR AS ANOTACOES
				Coluna anotacao = field.getAnnotation(Coluna.class);
				if(anotacao != null) {
					System.out.println(anotacao.nome());
				}
			}
			
			
		//RECUPERAR OS METODOS
		Method[] attrs2 = pessoa.getClass().getDeclaredMethods(); //retorno metodos
			for(Method method : attrs2) {
				System.out.println(method.getName());
			}
		
			
	}
}
