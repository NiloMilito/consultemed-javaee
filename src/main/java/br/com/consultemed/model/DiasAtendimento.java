package br.com.consultemed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_dias_atendimento")
@Entity
public class DiasAtendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@Column(name="segunda")
	private Boolean segunda;
	
	@Column(name="terca")
	private Boolean terca;
	
	@Column(name="quarta")
	private Boolean quarta;
	
	@Column(name="quinta")
	private Boolean quinta;
	
	@Column(name="sexta")
	private Boolean sexta;
	
	@Column(name="sabado")
	private Boolean sabado;
	
	@Column(name="domingo")
	private Boolean domingo;
	
	public DiasAtendimento() {
		
	}

	public DiasAtendimento(Boolean segunda, Boolean terca, Boolean quarta, Boolean quinta,
			Boolean sexta, Boolean sabado, Boolean domingo) {
		super();			
		this.segunda = segunda;
		this.terca = terca;
		this.quarta = quarta;
		this.quinta = quinta;
		this.sexta = sexta;
		this.sabado = sabado;
		this.domingo = domingo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getSegunda() {
		return segunda;
	}

	public void setSegunda(Boolean segunda) {
		this.segunda = segunda;
	}

	public Boolean getTerca() {
		return terca;
	}

	public void setTerca(Boolean terca) {
		this.terca = terca;
	}

	public Boolean getQuarta() {
		return quarta;
	}

	public void setQuarta(Boolean quarta) {
		this.quarta = quarta;
	}

	public Boolean getQuinta() {
		return quinta;
	}

	public void setQuinta(Boolean quinta) {
		this.quinta = quinta;
	}

	public Boolean getSexta() {
		return sexta;
	}

	public void setSexta(Boolean sexta) {
		this.sexta = sexta;
	}

	public Boolean getSabado() {
		return sabado;
	}

	public void setSabado(Boolean sabado) {
		this.sabado = sabado;
	}

	public Boolean getDomingo() {
		return domingo;
	}

	public void setDomingo(Boolean domingo) {
		this.domingo = domingo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((domingo == null) ? 0 : domingo.hashCode());
		result = prime * result + ((segunda == null) ? 0 : segunda.hashCode());
		result = prime * result + ((terca == null) ? 0 : terca.hashCode());
		result = prime * result + ((quarta == null) ? 0 : quarta.hashCode());
		result = prime * result + ((quinta == null) ? 0 : quinta.hashCode());
		result = prime * result + ((sexta == null) ? 0 : sexta.hashCode());
		result = prime * result + ((sabado == null) ? 0 : sabado.hashCode());
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
		DiasAtendimento other = (DiasAtendimento) obj;		
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;		
		if (domingo == null) {
			if (other.domingo != null)
				return false;
		} else if (!domingo.equals(other.domingo))
			return false;
		if (segunda == null) {
			if (other.segunda != null)
				return false;
		} else if (!segunda.equals(other.segunda))
			return false;
		if (terca == null) {
			if (other.terca != null)
				return false;
		} else if (!terca.equals(other.terca))
			return false;
		if (quarta == null) {
			if (other.quarta != null)
				return false;
		} else if (!quarta.equals(other.quarta))
			return false;
		if (quinta == null) {
			if (other.quinta != null)
				return false;
		} else if (!quinta.equals(other.quinta))
			return false;
		if (sexta == null) {
			if (other.sexta != null)
				return false;
		} else if (!sexta.equals(other.sexta))
			return false;
		if (sabado == null) {
			if (other.sabado != null)
				return false;
		} else if (!sabado.equals(other.sabado))
			return false;	
		
		return true;
	}
	
}
