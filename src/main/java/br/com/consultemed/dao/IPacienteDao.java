package br.com.consultemed.dao;

import br.com.consultemed.model.Paciente;

public interface IPacienteDao extends IGenericFacade<Paciente> {	

	public Paciente buscarPorNome(String nome);
	
	public Paciente buscarPorCpf(String cpf);
}
