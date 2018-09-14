package br.com.fiap.ead.aula07.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.ddd.ead.aula06.dao.ItemPedidoDAO;
import br.com.fiap.ddd.ead.aula06.dao.NotaFiscalDAO;
import br.com.fiap.ddd.ead.aula06.dao.PedidoDAO;
import br.com.fiap.ddd.ead.aula06.daoImpl.ItemPedidoDAOImpl;
import br.com.fiap.ddd.ead.aula06.daoImpl.NotaFiscalDAOImpl;
import br.com.fiap.ddd.ead.aula06.daoImpl.PedidoDAOImpl;
import br.com.fiap.ddd.ead.aula06.expeption.CommitExption;
import br.com.fiap.ddd.ead.aula06.singleton.EntityManagerFactorySingleton;
import br.com.fiap.ead.aula07.entity.Imposto;
import br.com.fiap.ead.aula07.entity.ItemPedido;
import br.com.fiap.ead.aula07.entity.NotaFiscal;
import br.com.fiap.ead.aula07.entity.Pedido;

public class Teste {

	
	public static void main(String[] args) {
		
		//criar a entity atraves da singleton
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//crio um DAO e o contrutor DAOImpl
		NotaFiscalDAO notaDAO = new NotaFiscalDAOImpl(em);			//crio um dao pelo daoimpl
		PedidoDAO pedidoDAO = new PedidoDAOImpl(em);				//crio um dao pelo daoimpl
		
		//crio as entidades com seus valores
		Pedido pedido = new Pedido(new GregorianCalendar(2010, Calendar.FEBRUARY, 02), "Bolachas");
		NotaFiscal nf = new NotaFiscal(new GregorianCalendar(2017, Calendar.JANUARY, 14), 23.5, pedido);
		Imposto imposto = new Imposto(0.08, "ICMS");
		Imposto imposto2 = new Imposto(0.06, "IOF");
		ItemPedido item = new ItemPedido("bolacha", 4.50);
		ItemPedido item2 = new ItemPedido("biscoito", 5.50);
		ItemPedido item3 = new ItemPedido("polvinho", 3.50);
		
		List<Imposto> impostos = new ArrayList<>();
		impostos.add(imposto);
		impostos.add(imposto2);
		
		pedido.adicionarItem(item);
		pedido.adicionarItem(item2);
		pedido.adicionarItem(item3);
		
	
		//create 
		//crio, comito um só, tanto faz e ele pede o try/catch
		try {
			notaDAO.inserir(nf);
			pedidoDAO.inserir(pedido);
			notaDAO.commit();
		} catch (CommitExption e1) {
			e1.printStackTrace();
		}
		
		//find
		NotaFiscal busca = notaDAO.pesquisar(nf.getCodigo());
		System.out.println(busca.getCodigo());
		Pedido busca2 = pedidoDAO.pesquisar(1);
		System.out.println(busca2.getDescricao());
		System.out.println(busca2.getNotaFiscal().getValor());

		//update
		try {
			
		} catch (Exception e) {

		}
		
		//delete
		try {
			
			
		} catch (Exception e) {

		}
		
		//listar
		try {
			
		} catch (Exception e) {

		}
		
		
		//fechar fabrica e em
		
		em.close();
		fabrica.close();
		
	}
}
