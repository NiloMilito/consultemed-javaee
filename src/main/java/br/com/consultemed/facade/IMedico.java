package br.com.consultemed.facade;

import br.com.consultemed.model.Consulta;

public interface IMedico extends IGeneric{
	
	public void cancelarConsulta(Consulta consulta);

}
