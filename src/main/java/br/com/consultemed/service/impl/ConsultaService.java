package br.com.consultemed.service.impl;

import java.util.Date;

import br.com.consultemed.dao.IConsultaDao;
import br.com.consultemed.dao.impl.ConsultaDao;
import br.com.consultemed.model.Consulta;
import br.com.consultemed.service.IConsulta;

public class ConsultaService implements IConsulta{
	
	private IConsultaDao consultaDao = new ConsultaDao();

	@Override
	public void salvar(Consulta object) {
		this.consultaDao.salvar(object);		
	}

	@Override
	public void alterar(Consulta object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Consulta object) {
		this.consultaDao.remover(object);
		
	}

	@Override
	public Consulta buscar(Long id) {		
		return this.consultaDao.buscar(id);
	}
	
	public Consulta buscarPorPeriodo(Date inicio, Date fim) {
		return this.consultaDao.buscarPorPeriodo(inicio, fim);
	}

	@Override
	public void cancelarConsulta(Consulta consulta) {
		this.remover(consulta);	
	}

}
