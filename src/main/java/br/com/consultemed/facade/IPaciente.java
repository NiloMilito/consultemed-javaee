package br.com.consultemed.facade;

import br.com.consultemed.model.Paciente;

public interface IPaciente extends IGeneric{
	
	public Paciente buscarPorNome(String nome);
	
	public Paciente buscarPorCpf(String cpf);

}
