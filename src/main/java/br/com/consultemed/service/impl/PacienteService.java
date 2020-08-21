package br.com.consultemed.service.impl;

import br.com.consultemed.dao.IPacienteDao;
import br.com.consultemed.dao.impl.PacienteDao;
import br.com.consultemed.model.Paciente;
import br.com.consultemed.service.IPaciente;

public class PacienteService implements IPaciente{
	
	private IPacienteDao pacienteDao = new PacienteDao();

	@Override
	public void salvar(Paciente object) {
		this.pacienteDao.salvar((Paciente) object);		
	}

	@Override
	public void alterar(Paciente object) {		
		this.pacienteDao.alterar(object);
	}

	@Override
	public void remover(Paciente object) {
		// TODO Auto-generated method stub		
	}

	@Override
	public Paciente buscar(Long id) {
		return this.pacienteDao.buscar(id);
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
