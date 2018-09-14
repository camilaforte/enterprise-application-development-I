package br.com.fiap.ads.ead.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.ads.ead.entity.Consulta;
import br.com.fiap.ads.ead.entity.Especialidade;
import br.com.fiap.ads.ead.entity.Medico;
import br.com.fiap.ads.ead.entity.Paciente;
import br.com.fiap.ddd.ead.aula07.dao.ConsultaDAO;
import br.com.fiap.ddd.ead.aula07.daoImpl.ConsultaDAOImpl;
import br.com.fiap.ddd.ead.aula07.expeption.CommitExption;
import br.com.fiap.ddd.ead.aula07.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		
		//cadastrar medico, paciente, consulta
		Medico medico = new Medico(124, "Joao Almeida", Especialidade.CLINICO_GERAL);
		Paciente paciente = new Paciente("Fernando França", new GregorianCalendar(1987, Calendar.JANUARY, 02));
		Consulta consulta = new Consulta(medico, paciente, Calendar.getInstance(), "02", true);
		
		//criar entitymaager
		EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
		EntityManager em = f.createEntityManager();
		
		//o dao
		ConsultaDAO dao = new ConsultaDAOImpl(em);
		
		//cadastro
		try {
			dao.inserir(consulta);
			dao.commit();
		} catch (CommitExption e) {
			e.printStackTrace();
		}
	
				
		em.close();
		f.close();
	}
}
