package br.com.fiap.ads.ead.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_MEDICO")
public class Medico implements Serializable {

	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -4487231327352302415L;

	@Id
	@Column (name = "cd_crm")
	
	private int crm;
	
	@Column (name = "nm_medico")
	private String nome;
	
	@Enumerated (EnumType.STRING)
	@Column (name = "ds_especialidade")
	private Especialidade especialidade;
	
	
	
	public Medico() {
		super();
	}

	public Medico(int crm, String nome, Especialidade especialidade) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
