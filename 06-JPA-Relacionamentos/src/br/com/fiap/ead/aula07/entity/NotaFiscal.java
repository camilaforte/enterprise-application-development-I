package br.com.fiap.ead.aula07.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "T_NOTA_FISCAL")
@SequenceGenerator (name = "notaFiscal", sequenceName = "SQ_T_NOTA_FISCAL", allocationSize =1)
public class NotaFiscal {

	//adicionar pedido a nota
	@OneToOne (cascade = CascadeType.PERSIST)		//digo o tipo de relacionamento entre nota fiscal e pedido
	@JoinColumn (name = "cd_pedido")
	private Pedido pedido;

	
	//criar uma lista de impostos
	@ManyToMany (cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	//joinColumn a chave desta tabela, e a inverse da outra, neste cado imposto, assim j� cria a associativa
	@JoinTable (name = "T_IMPOSTO_NOTA_FISCAL", joinColumns = @JoinColumn(name = "cd_nota_fiscal"), inverseJoinColumns = @JoinColumn(name = "cd_imposto"))
	private List<Imposto> impostos;
	
	@Id
	@Column (name = "cd_nota_fiscal")
	@GeneratedValue (generator = "notaFiscal", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column (name = "dt_nota", nullable = false)
	@Temporal (TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Column(name = "vl_nota", nullable = false)
	private double valor;
	
	
	
	public NotaFiscal() {
		super();
	}



	public NotaFiscal(Calendar data, double valor, Pedido pedido) {
		super();
		this.pedido = pedido;
		this.data = data;
		this.valor = valor;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public Calendar getData() {
		return data;
	}



	public void setData(Calendar data) {
		this.data = data;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public Pedido getPedido() {
		return pedido;
	}



	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}



	public List<Imposto> getImpostos() {
		return impostos;
	}



	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}
	
	
	
}
