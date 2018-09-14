package br.com.fiap.ads.ead.exercicio02.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.ead.exercicio02.dao.VeiculoDAO;
import br.com.fiap.ads.ead.exercicio02.entidade.Veiculo;
import br.com.fiap.ads.ead.exercicio02.exception.VeiculoNotFoundException;

public class VeiculoDAOImpl implements VeiculoDAO{

	private EntityManager em;
	
	
	//construtor do Entity
	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Veiculo veiculo) {
		em.persist(veiculo);
	}

	@Override
	public void upadate(Veiculo veiculo) {
		em.merge(veiculo);
	}

	@Override
	public Veiculo find(int codigo) {
		em.find(Veiculo.class, codigo);
		return null;
	}

	@Override
	public void delete(int codigo) throws VeiculoNotFoundException, Exception {
		Veiculo veiculo = em.find(Veiculo.class, codigo);
		if(veiculo == null) {
			throw new VeiculoNotFoundException ("Veiculo não encontrado!");
		}
			
		em.remove(veiculo);
	}

	@Override
	public void commit() {
		
	}
	
}
