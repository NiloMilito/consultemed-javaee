package br.com.consultemed.service;

import br.com.consultemed.dao.MedicoDao;
import br.com.consultemed.facade.IMedico;
import br.com.consultemed.facadedao.IMedicoDao;
import br.com.consultemed.model.Medico;

public class MedicoService implements IMedico{
	
	private IMedicoDao medicoDao = new MedicoDao();

	@Override
	public <T> void salvar(T object) {
		this.medicoDao.salvar((Medico) object);		
	}

	@Override
	public <T> void alterar(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void remover(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
