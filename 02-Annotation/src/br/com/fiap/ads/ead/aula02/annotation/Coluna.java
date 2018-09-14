package br.com.fiap.ads.ead.aula02.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)		//em tempo de execução
@Target(ElementType.FIELD) 				//atributo
public @interface Coluna {

	String nome();
}
