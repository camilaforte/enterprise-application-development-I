package br.com.fiap.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_PESSOA_FISICA")
public class PessoaFisica extends Pessoa implements Serializable {

	@Transient
	private static final long serialVersionUID = 6720051504974225131L;

	// @Id nao preciso pois j� recebe da pessoa
	@Column(name = "nr_cpf")
	private String cpf;

	@Column(name = "nr_rg")
	private String rg;

	public PessoaFisica() {
		super();
	}

	//colocar os atributos do da classe extendida
	public PessoaFisica(String nome, String endereco, String cpf, String rg) {
		super(nome, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
