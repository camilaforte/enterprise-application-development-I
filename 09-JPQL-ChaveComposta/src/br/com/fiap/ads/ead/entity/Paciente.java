package br.com.fiap.ads.ead.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table (name = "TB_PACIENTE")
@SequenceGenerator (name = "paciente", allocationSize = 1, sequenceName = "SQ_T_PACIENTE")
public class Paciente implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8408136282691299544L;
	@Id
	@Column (name = "cd_paciente")
	@GeneratedValue (generator = "paciente", strategy = GenerationType.SEQUENCE)
	private int codigo;
	@Column (name = "nm_paciente")
	private String nome;
	@Column (name = "dt_nascimento_paciente")
	@Temporal (TemporalType.DATE)
	private Calendar dataNascimento;
	
	
	
	public Paciente() {
		super();
	}



	public Paciente(String nome, Calendar dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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



	public Calendar getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
