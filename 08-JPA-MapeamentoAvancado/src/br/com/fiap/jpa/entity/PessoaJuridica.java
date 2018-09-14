package br.com.fiap.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa implements Serializable {

	@Transient
	private static final long serialVersionUID = 2948320353014143033L;

	// @Id vem da classe que extendo
	@Column(name = "nr_cnpj")
	private String cnpj;

	@Column(name = "ds_razao_social")
	private String razaoSocial;

	// colocar os atributos do da classe extendida
	public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public PessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
