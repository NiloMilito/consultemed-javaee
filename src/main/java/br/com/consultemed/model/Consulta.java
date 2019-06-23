package br.com.consultemed.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="tb_consulta")
@Entity
public class Consulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="motivo")
	private String motivo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
	private List<Exame> exames = new ArrayList<>();

}
