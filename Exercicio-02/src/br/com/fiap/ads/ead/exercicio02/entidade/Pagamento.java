package br.com.fiap.ads.ead.exercicio02.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "T_PAGAMENTO")
@SequenceGenerator (name = "pagamento", sequenceName = "SQ_T_PAGAMENTO", allocationSize = 1)
public class Pagamento {

	@Id
	@Column (name = "cd_pagamento", nullable = false, length = 150)
	@GeneratedValue(generator="pagamento", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column (name = "dt_pagamento", nullable = false)
	@Temporal (TemporalType.DATE)
	private Calendar dataPagamento;
	
	@Column (name = "vl_pagamento", nullable = false)
	private float pagamento;
	
	@Enumerated (EnumType.STRING)
	@Column (name = "ds_forma_pagamento", nullable = false)
	private FormaPagamento formaPagamento;

	
	
	public Pagamento() {
		super();
	}

	public Pagamento(Calendar dataPagamento, float pagamento, FormaPagamento formaPagamento) {
		super();
		this.dataPagamento = dataPagamento;
		this.pagamento = pagamento;
		this.formaPagamento = formaPagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public float getPagamento() {
		return pagamento;
	}

	public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	
	
	
	
}