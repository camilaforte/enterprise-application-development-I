package br.com.fiap.ads.ead.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataTeste {

	public static void main(String[] args) {
		
//		criar variavel de Calendar e atribuir uma data 
		Calendar hj = Calendar.getInstance(); //retorna data e hora do sistema
		
//		criar formatador de data (date)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
//		imprimir data de forma amigavel
		System.out.println(sdf.format(hj.getTime())); //td formatação te devolve uma String
		
//		pegar String e transformar em data
		String formatura = "12/12/2018";
		
	try {
		Date f = sdf.parse(formatura);
		System.out.println(f);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
//		criar data especifica
		Calendar carnaval = new GregorianCalendar(2018, Calendar.FEBRUARY, 13);
		
//		imprimir data formatada usar o objeto simples ja criado
		System.out.println(sdf.format(carnaval.getTime()));
	
	
	}
}
