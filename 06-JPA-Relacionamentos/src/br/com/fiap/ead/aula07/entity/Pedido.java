package br.com.fiap.ead.aula07.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_PEDIDO")
@SequenceGenerator (name = "pedido", sequenceName = "SQ_T_PEDIDO", allocationSize = 1)
public class Pedido {
	
	//crio nota aqui
	@OneToOne(mappedBy = "pedido")		//mappedBy sempre que for bidirecional o nome é do atributo
	private NotaFiscal notaFiscal;	
	
	//crio lista item de pedido aqui
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
	private List<ItemPedido> itens = new ArrayList<>();
	
	//crio metodo de add item
	public void adicionarItem(ItemPedido item) {
		itens.add(item);
		item.setPedido(this);
	}
	
	
	@Id
	@Column (name = "cd_pedido")
	@GeneratedValue (generator = "pedido", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column (name = "dt_pedido", nullable = false)
	@Temporal (TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Column (name = "ds_pedido", nullable = false, length = 200)
	private String descricao;

	public Pedido() {
		super();
	}

	public Pedido(Calendar data, String descricao) {
		super();
		this.data = data;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	

}
