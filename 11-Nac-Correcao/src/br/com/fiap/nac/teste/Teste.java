package br.com.fiap.nac.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.ads.ead.entity.Apartamento;
import br.com.fiap.ads.ead.entity.Cliente;
import br.com.fiap.ads.ead.entity.Locacao;
import br.com.fiap.ads.ead.entity.Sexo;
import br.com.fiap.nac.dao.LocacaoDAO;
import br.com.fiap.nac.dao.impl.LocacaoDAOImpl;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
		EntityManager em = f.createEntityManager();

		
		Cliente cli = new Cliente("camila", Calendar.getInstance(), Sexo.FEMININO);
		Apartamento apto = new Apartamento("Av Pauslitas", "teste", null);
		Locacao loc = new Locacao(Calendar.getInstance(), Calendar.getInstance());
		loc.setApartamento(apto);
		loc.setCliente(cli);
		
		//cadastrar
		LocacaoDAO dao = new LocacaoDAOImpl(em);
		try {
			dao.cadastrar(loc);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
			
	
		em.close();
		f.close();
	
	}
	
	
}
