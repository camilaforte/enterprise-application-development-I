package br.com.fiap.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.impl.PessoaDAOImpl;
import br.com.fiap.jpa.entity.Pessoa;
import br.com.fiap.jpa.entity.PessoaFisica;
import br.com.fiap.jpa.entity.PessoaJuridica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class HerencaTeste {

	public static void main(String[] args) {
		
		EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
		EntityManager em = f.createEntityManager();
		
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		Pessoa p = new Pessoa("Amanda", "Rua Guatas");
		PessoaFisica pf = new PessoaFisica("Camila Forte", "Av Indianopolis", "37124788541", "34277317");
		PessoaJuridica pj = new PessoaJuridica("Vidraçaria", "AV. Paulista", "00000003111", "Vid - LTMA");
		
		
		try {
			dao.inserir(p);
			dao.inserir(pf);
			dao.inserir(pj);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		f.close();
	}
}
