package br.com.consultemed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="tb_exame")
@Entity
public class Exame {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="laudo")
	private String laudo;
	
	@ManyToOne
	@JoinColumn(name = "exames")
	private Consulta consulta;

}
