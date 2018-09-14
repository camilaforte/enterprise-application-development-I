package br.com.fiap.ads.ead.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table (name = "T_LOCACAO")
@SequenceGenerator (name = "locacao", allocationSize = 1, sequenceName = "SEQ_T_LOCACAO")
public class Locacao implements Serializable{

	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_cliente")
	private Cliente cliente;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "cd_apartamento")
	private Apartamento apartamento;
	
	
	
	@Transient
	private static final long serialVersionUID = -494802021906339359L;

	@Id
	@Column(name = "cd_locacao")
	@GeneratedValue (generator="locacao", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_inicio", nullable=false)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_fim", nullable=false)
	private Calendar dataFim;

	
	public Locacao(Calendar dataInicio, Calendar dataFim) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Locacao() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	
	
	
	
}
