package br.com.fiap.ads.ead.aula02.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table (name = "T_CURSO")
@SequenceGenerator (name = "curso", sequenceName = "SQ_T_CURSO", allocationSize = 1)
public class Curso implements Serializable {

	@Id 
	@Column (name = "cd_curso")
	@GeneratedValue (generator = "curso", strategy = GenerationType.SEQUENCE)
	private int curso;
	@Column (name = "nm_curso")
	private String nome;
	@Column (name = "st_curso")
	private Status status;
	@Column (name = "nr_semestre")
	private int semestre;
	@Column (name = "dt_criacao")
	private Calendar dataCriacao;
	@Column (name = "fl_logo")
	private byte[] logo;
	
	
	public Curso() {
		super();
	}


	public Curso(int curso, String nome, Status ativo, int semestre, Calendar data, byte[] logo) {
		super();
		this.curso = curso;
		this.nome = nome;
		this.status = ativo;
		this.semestre = semestre;
		this.dataCriacao = data;
		this.logo = logo;
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Status isAtivo() {
		return status;
	}


	public void setAtivo(Status status) {
		this.status = status;
	}


	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public Calendar getData() {
		return dataCriacao;
	}


	public void setData(Calendar data) {
		this.dataCriacao = data;
	}


	public byte[] getLogo() {
		return logo;
	}


	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
	
	

	
}
