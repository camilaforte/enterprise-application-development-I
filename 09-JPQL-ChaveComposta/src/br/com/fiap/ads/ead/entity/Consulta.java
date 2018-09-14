package br.com.fiap.ads.ead.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table (name = "TB_CONSULTA")
@IdClass (ConsultaPK.class)
public class Consulta implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -4480737619944047934L;
	
	
	//colocar id em todos os atributos que compoe o id da ClassePK
	
	@Id
	@ManyToOne(cascade = CascadeType.PERSIST) //cascade 
	@JoinColumn (name = "nr_crm")
	private Medico medico;
	
	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name = "cd_paciente")
	private Paciente paciente;
	
	@Id
	@Column (name = "dt_consulta")
	@Temporal (TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Column (name= "ds_consultorio")
	private String consultorio;
	
	@Column (name = "st_convenio")
	private boolean convenio;

	public Consulta() {
		super();
	}

	public Consulta(Medico medico, Paciente paciente, Calendar data, String consultorio, boolean convenio) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
		this.consultorio = consultorio;
		this.convenio = convenio;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	public boolean isConvenio() {
		return convenio;
	}

	public void setConvenio(boolean convenio) {
		this.convenio = convenio;
	}

}