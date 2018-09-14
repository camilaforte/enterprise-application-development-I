package br.com.fiap.ead.aula07.entity;

import javax.persistence.*;


@Entity
@Table (name = "T_ITEM_PEDIDO")
@SequenceGenerator (name = "item", sequenceName = "SQ_T_ITEM_PEDIDO", allocationSize = 1)
public class ItemPedido {

	@ManyToOne								//muitos itens para um pedido
	@JoinColumn (name = "cd_pedido")
	private Pedido pedido;
	
	@Id
	@Column (name = "cd_item")
	@GeneratedValue (generator = "item", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column (name = "ds_item", nullable = false, length = 100)
	private String descricao;
	
	@Column (name = "vl_item")
	private double valor;
	
	
	
	
	public ItemPedido() {
		super();
	}


	public ItemPedido(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	
	
	
	
	
}
