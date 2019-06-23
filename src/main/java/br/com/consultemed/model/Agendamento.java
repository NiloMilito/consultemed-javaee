package br.com.consultemed.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="tb_agendamento")
@Entity
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_agendamento")
	private Date dataAgendamento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_consulta")
	private Date dataConsulta;
	
	@OneToOne
	private Paciente paciente;
	

}
