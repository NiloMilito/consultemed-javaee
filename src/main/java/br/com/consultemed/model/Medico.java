package br.com.consultemed.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="tb_medico")
@Entity
public class Medico extends Pessoa {

	@Column(name="crm", unique=true)
	private String crm;
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.DETACH)
    @JoinColumn(name="diasAtendimento_id")
	private DiasAtendimento diasAtendimento;
	
	public Medico() {
		
	}

	public Medico(String crm, DiasAtendimento diasAtendimento) {
		super();
		this.crm = crm;
		this.diasAtendimento = diasAtendimento;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public DiasAtendimento getDiasAtendimento() {
		return diasAtendimento;
	}

	public void setDiasAtendimento(DiasAtendimento diasAtendimento) {
		this.diasAtendimento = diasAtendimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((crm == null) ? 0 : crm.hashCode());
		result = prime * result + ((diasAtendimento == null) ? 0 : diasAtendimento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (diasAtendimento == null) {
			if (other.diasAtendimento != null)
				return false;
		} else if (!diasAtendimento.equals(other.diasAtendimento))
			return false;
		return true;
	}
	
}
