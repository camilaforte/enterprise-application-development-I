package br.com.fiap.ads.ead.entity;

import java.io.Serializable;
import java.util.Calendar;

//cria um IDCLASS

public class ConsultaPK implements Serializable {


	private static final long serialVersionUID = 1463145966194122400L;

	// todos os atributos que formam a chave
	private int medico;

	private int paciente;

	private Calendar data;

	public ConsultaPK() {
		super();
	}

	public ConsultaPK(int medico, int paciente, Calendar data) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
	}

	public int getMedico() {
		return medico;
	}

	public void setMedico(int medico) {
		this.medico = medico;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	
	//verificar se uma consultar fo igual a outra consulta
		//gerar hashCode e equals
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((data == null) ? 0 : data.hashCode());
			result = prime * result + medico;
			result = prime * result + paciente;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ConsultaPK other = (ConsultaPK) obj;
			if (data == null) {
				if (other.data != null)
					return false;
			} else if (!data.equals(other.data))
				return false;
			if (medico != other.medico)
				return false;
			if (paciente != other.paciente)
				return false;
			return true;
		}
		
	
}
