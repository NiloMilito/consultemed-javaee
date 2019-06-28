package br.com.consultemed.service;

import br.com.consultemed.dao.PacienteDao;
import br.com.consultemed.facade.IPaciente;
import br.com.consultemed.facadedao.IPacienteDao;
import br.com.consultemed.model.Paciente;

public class PacienteService implements IPaciente{
	
	private IPacienteDao pacienteDao = new PacienteDao();

	@Override
	public <T> void salvar(T object) {
		this.pacienteDao.salvar((Paciente) object);		
	}

	@Override
	public <T> void alterar(T object) {		
		this.pacienteDao.alterar((Paciente) object);
	}

	@Override
	public <T> void remover(T object) {
		// TODO Auto-generated method stub		
	}

	@Override
	public Object buscar(Long id) {
		return this.pacienteDao.buscarPorId(id);
	}

	@Override
	public Paciente buscarPorNome(String nome) {		
		return this.pacienteDao.buscarPorNome(nome);
	}

	@Override
	public Paciente buscarPorCpf(String cpf) {		
		return this.pacienteDao.buscarPorCpf(cpf);
	}

}
