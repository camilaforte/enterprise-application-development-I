package br.com.fiap.ads.ead.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_APARTAMENTO")
@SequenceGenerator (name = "apartamento", sequenceName = "SEQ_T_APARTAMENTO", allocationSize=1)
public class Apartamento implements Serializable{
	
	@OneToMany(mappedBy= "apartamento")
	private List<Locacao> locacoes;

	@Transient
	private static final long serialVersionUID = 9196363457937720215L;

	@Id
	@Column(name="cd_apartamento")
	@GeneratedValue (generator="apartamento", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_endereco", nullable=false)
	private String endereco;
	
	@Column(name="ds_detalhes")
	private String detalhes;
	
	@Lob
	@Column(name="ft_apartamento")
	private byte[] foto;

	public Apartamento(String endereco, String detalhes, byte[] foto) {
		super();
		this.endereco = endereco;
		this.detalhes = detalhes;
		this.foto = foto;
	}

	public Apartamento() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	
}
