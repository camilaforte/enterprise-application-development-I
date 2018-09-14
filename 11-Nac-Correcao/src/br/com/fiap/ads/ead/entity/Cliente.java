package br.com.fiap.ads.ead.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name = "T_CLIENTE")
@SequenceGenerator (name = "cliente", allocationSize = 1, sequenceName= "SEQ_NAC_CLIENTE")
public class Cliente implements Serializable{

	@OneToMany(mappedBy = "cliente")
	private List<Locacao> locacoes;
	
	@Transient
	private static final long serialVersionUID = 2808647225737355587L;

	@Id
	@Column (name = "cd_cliente", nullable=false)
	@GeneratedValue (generator = "cliente", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_cliente", nullable=false)
	private String nome;
	
	@Column (name = "dt_nascimento")
	@Temporal (TemporalType.DATE)
	private Calendar dataNascimento;
	
	//neste caso � ordinal, pq na tabela ta number
	@Enumerated (EnumType.ORDINAL)
	private Sexo sexo;
	
		
	public Cliente() {
		super();
	}

	public Cliente(String nome, Calendar dataNascimento, Sexo sexo) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	
	
	
	
}
