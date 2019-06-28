package br.com.consultemed.facadedao;

import br.com.consultemed.model.Paciente;

public interface IPacienteDao {
	
	public void salvar(Paciente paciente);
	
	public void alterar(Paciente paciente);
	
	public void remover(Paciente paciente);
	
	public Paciente buscarPorId(Long id);

	public Paciente buscarPorNome(String nome);
	
	public Paciente buscarPorCpf(String cpf);
}
