package br.com.consultemed.service;

import br.com.consultemed.dao.ConsultaDao;
import br.com.consultemed.facade.IConsulta;
import br.com.consultemed.facadedao.IConsultaDao;
import br.com.consultemed.model.Consulta;

public class ConsultaService implements IConsulta{
	
	private IConsultaDao consultaDao = new ConsultaDao();

	@Override
	public <T> void salvar(T object) {
		this.consultaDao.salvar((Consulta) object);		
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
