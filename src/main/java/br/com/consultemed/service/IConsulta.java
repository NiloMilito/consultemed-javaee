package br.com.consultemed.service;

import br.com.consultemed.model.Consulta;

public interface IConsulta extends IGeneric<Consulta>{
	
	public void cancelarConsulta(Consulta consulta);

}
