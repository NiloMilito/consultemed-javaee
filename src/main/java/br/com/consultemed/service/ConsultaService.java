package br.com.consultemed.service;

import java.util.Date;

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
		this.consultaDao.remover((Consulta) object);
		
	}

	@Override
	public Object buscar(Long id) {		
		return this.consultaDao.buscarPorId(id);
	}
	
	public Consulta buscarPorPeriodo(Date inicio, Date fim) {
		return this.consultaDao.buscarPorPeriodo(inicio, fim);
	}

	@Override
	public void cancelarConsulta(Consulta consulta) {
		this.remover(consulta);	
	}

}
