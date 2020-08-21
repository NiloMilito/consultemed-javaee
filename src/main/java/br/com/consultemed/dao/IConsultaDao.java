package br.com.consultemed.dao;

import java.util.Date;

import br.com.consultemed.model.Consulta;

public interface IConsultaDao extends IGenericFacade<Consulta> {	
	
	public Consulta buscarPorPeriodo(Date inicio, Date fim);

}
