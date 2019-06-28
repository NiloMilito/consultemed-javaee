package br.com.consultemed.service;

import br.com.consultemed.dao.DiasAtendimentoDao;
import br.com.consultemed.dao.MedicoDao;
import br.com.consultemed.facade.IMedico;
import br.com.consultemed.facadedao.IMedicoDao;
import br.com.consultemed.model.Consulta;
import br.com.consultemed.model.Medico;

public class MedicoService implements IMedico{
	
	private IMedicoDao medicoDao = new MedicoDao();
	private DiasAtendimentoDao diasDao = new DiasAtendimentoDao();
	private ConsultaService cservice = new ConsultaService();
	private AgendamentoService aservice = new AgendamentoService();

	@Override
	public <T> void salvar(T object) {
		Medico medico = (Medico) object;
		this.diasDao.salvar(medico.getDiasAtendimento());
		this.medicoDao.salvar(medico);		
	}

	@Override
	public <T> void alterar(T object) {
		Medico medico = (Medico) object;		
		this.medicoDao.alterar(medico);		
		this.diasDao.alterar(medico.getDiasAtendimento());
	}

	@Override
	public <T> void remover(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelarConsulta(Consulta consulta) {
		this.cservice.cancelarConsulta(consulta);
	//	this.aservice.reagendamentoConsulta(consulta, nova);
	}

}
