package br.com.consultemed.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="tb_paciente")
@Entity
public class Paciente extends Pessoa{
	
	@Column(name="ficha")
	private Integer ficha;
	
	@Embedded
	private Endereco endereco;

}
