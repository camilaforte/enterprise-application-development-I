package br.com.fiap.ads.ead.aula02.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity						//obrigatorio para criar a tabela no banco de dados
@Table(name="T_ALUNO")
@SequenceGenerator(name = "aluno", sequenceName = "SQ_T_ALUNO", allocationSize=1) //alocationSize = incremento da chave primaria
public class Aluno implements Serializable{

	@Id /*obrigatorio para nao dar erro*/ @GeneratedValue(generator="aluno", strategy=GenerationType.SEQUENCE) //generator mesmo nome da sequenceGenerator
	private int rm; 
	
	@Column(name = "nm_aluno", nullable = false, length = 150)
	private String nome;
	
	@Column(name = "nm_curso", length = 50)
	private String curso;
	
	@Temporal(TemporalType.DATE)		//utiliza somente a data, n�o me interessa a hora e o Calendar smp tras as horas junto
	@Column(name = "dt_nascimento", nullable = false)
	private Calendar dataNascimento;
	
	@Column(name = "st_matricula", nullable = false)
	private boolean matriculado;
	
	@Enumerated(EnumType.STRING)		//melhor deixar sempre o nome, mas facil para entender o banco, caso contrario ele salvara numero
	@Column(name = "nm_periodo")
	private Periodo periodo;
	
	@Column(name = "nr_semestre")
	private Integer semestre;  		//integer � uma classe o dado come�a como null, ao inves de come�ar com 0 se fosse int
	
	@Transient						//n�o ser� uma coluna no banco
	private String token;
	
	@Lob							//gravar arquivo no banco
	@Column(name = "fl_foto")		//fl file
	private byte[] foto;

	
	public Aluno() {
	}
	
	//construtor
	public Aluno(String nome, String curso, Calendar dataNascimento, boolean matriculado, Periodo periodo,
			Integer semestre, String token, byte[] foto) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.dataNascimento = dataNascimento;
		this.matriculado = matriculado;
		this.periodo = periodo;
		this.semestre = semestre;
		this.token = token;
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	
	
	
	
	
	
}
