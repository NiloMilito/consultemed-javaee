package br.com.consultemed.service.impl;

import br.com.consultemed.dao.IMedicoDao;
import br.com.consultemed.dao.impl.DiasAtendimentoDao;
import br.com.consultemed.dao.impl.MedicoDao;
import br.com.consultemed.model.Consulta;
import br.com.consultemed.model.Medico;
import br.com.consultemed.service.IMedico;

public class MedicoService implements IMedico{
	
	private IMedicoDao medicoDao = new MedicoDao();
	private DiasAtendimentoDao diasDao = new DiasAtendimentoDao();
	private ConsultaService cservice = new ConsultaService();
	
	@Override
	public void salvar(Medico object) {
		Medico medico = (Medico) object;
		this.diasDao.salvar(medico.getDiasAtendimento());
		this.medicoDao.salvar(medico);		
	}

	@Override
	public void alterar(Medico object) {
		Medico medico = (Medico) object;		
		this.medicoDao.alterar(medico);		
		this.diasDao.alterar(medico.getDiasAtendimento());
	}

	@Override
	public void remover(Medico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medico buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelarConsulta(Consulta consulta) {
		this.cservice.cancelarConsulta(consulta);
	//	this.aservice.reagendamentoConsulta(consulta, nova);
	}

}
