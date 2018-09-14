package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.entity.Cidade;

public class ConsoleView {

	public static void main(String[] args) {
		
		EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
		EntityManager em  = f.createEntityManager();
		
		CidadeDAO dao = new CidadeDAOImpl(em);
		
		
		List<Cidade> lista = dao.listar();
		
		for (Cidade cidade : lista) {
			System.out.println(cidade.getNome());
		}
		
		List<Cidade> listaNome = dao.listarNome("Parana");
		
		for (Cidade cidade : listaNome) {
			System.out.println(cidade.getNome());
		}
	
		em.close();
		f.close();
	}

}



