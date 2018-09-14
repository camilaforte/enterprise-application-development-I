package br.com.fiap.ads.ead.exercicio01.entidade;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "T_MOTORISTA")
public class Motorista implements Serializable {

	@Id
	@Column(name = "nr_carteira", nullable = false)
	private int numeroCarteira;

	@Column(name = "nm_motorista", nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento")
	private Calendar dataNasc;

	@Lob
	@Column (name = "fl_carteiro")
	private byte[] foto;

	@Enumerated(EnumType.STRING)
	@Column (name = "ds_genero")
	private Genero genero;

	
	
	public Motorista() {
		super();
	}

	public Motorista(String nome, Calendar dataNasc, byte[] foto, Genero genero) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.foto = foto;
		this.genero = genero;
	}

	public int getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public byte [] getFoto() {
		return foto ;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
