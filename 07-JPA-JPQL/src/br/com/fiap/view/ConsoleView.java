package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class ConsoleView {

	public static void main(String[] args) {
		EntityManagerFactory fabrica =
			EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//Listar as cidades
		//Cria o DAO
		CidadeDAO cidadeDao = new CidadeDAOImpl(em);
		//Busca as cidades
		System.out.println("LISTAR CIDADES");
		List<Cidade> lista = cidadeDao.listar();
		//Exibe o nome e o estado
		for (Cidade cidade : lista) {
			System.out.println(cidade.getNome() + " " +
					cidade.getUf());
		}
		
		System.out.println("BUSCAR POR NOME");
		lista = cidadeDao.buscarPorNome("Lon");
		for (Cidade cidade : lista) {
			System.out.println(cidade.getNome() + " " +
					cidade.getUf());
		}
		
		ClienteDAO clientaDAO = new ClienteDAOImpl(em);
		List<Cliente> clientes = clientaDAO.listar();
		System.out.println("Listar os cliente");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
		
		PacoteDAO pacoteDAO = new PacoteDAOImpl(em);
		TransporteDAO transporteDAO = new TransporteDAOImpl(em);
		//pesquisa o transporte pelo codigo
		Transporte transporte = transporteDAO.pesquisar(1);
		//pesquisa o pacote pelo objeto
		List<Pacote> pacotes = pacoteDAO.pesquisarPorTransporte(transporte);
		
		
		em.close();
		fabrica.close();
	}

}



