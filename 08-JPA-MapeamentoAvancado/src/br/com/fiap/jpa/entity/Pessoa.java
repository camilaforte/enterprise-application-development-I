package br.com.fiap.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//coloca a estrategia de herança
@Inheritance (strategy = InheritanceType.SINGLE_TABLE) 
//@Inheritance (strategy = InheritanceType.JOINED) e tiro os dois de baixo, pq nao faz mais sentido 
@DiscriminatorColumn(name = "DS_TIPO")
@DiscriminatorValue ("P")

@Entity
@Table(name = "T_PESSOA")
@SequenceGenerator(sequenceName = "SQ_T_PESSOA", allocationSize = 1, name = "pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -1434864665968922463L;

	@Id
	@Column(name = "cd_pessoa")
	@GeneratedValue(generator = "pessoa", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_pessoa", nullable = false)
	private String nome;

	@Column(name = "ds_endereco")
	private String endereco;
	

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
