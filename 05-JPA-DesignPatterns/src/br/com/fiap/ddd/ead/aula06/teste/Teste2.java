package br.com.fiap.ddd.ead.aula06.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.ddd.ead.aula06.dao.AlunoDAO;
import br.com.fiap.ddd.ead.aula06.daoImpl.AlunoDAOImpl;
import br.com.fiap.ddd.ead.aula06.entity.Aluno;
import br.com.fiap.ddd.ead.aula06.expeption.CommitExption;
import br.com.fiap.ddd.ead.aula06.expeption.KeyNotFoundException;
import br.com.fiap.ddd.ead.aula06.singleton.EntityManagerFactorySingleton;

public class Teste2 {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		Aluno aluno = new Aluno("78943", "Camila");
		AlunoDAO dao = new AlunoDAOImpl(em); // polimorfismo, declaro um e instancio outra class

		// Cadastrar
		try {

			dao.inserir(aluno);
			dao.commit();
		} catch (CommitExption e) {
			e.printStackTrace();
		}

		// Buscar

		Aluno busca = dao.pesquisar(aluno.getRm());
		System.out.println(busca.getNome());

		// Atualizar

		busca.setNome("Camila");
		try {
			dao.atualizar(busca);
			dao.commit();
		} catch (CommitExption e) {
			e.printStackTrace();
		}

		// Remover

		try {
			dao.remover(busca.getRm());
			dao.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
