package br.com.consultemed.service;

import br.com.consultemed.model.Paciente;

public interface IPaciente extends IGeneric<Paciente>{
	
	public Paciente buscarPorNome(String nome);
	
	public Paciente buscarPorCpf(String cpf);

}
