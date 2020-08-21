package br.com.consultemed.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultemed.dao.IDiasAtendimentoDao;
import br.com.consultemed.model.DiasAtendimento;
import br.com.consultemed.utils.JPAUtils;

public class DiasAtendimentoDao implements IDiasAtendimentoDao{
	
	private EntityManagerFactory factory = JPAUtils.getEntityManagerFactory();
	private EntityManager manager = factory.createEntityManager();

	@Override
	public void salvar(DiasAtendimento diasAtendimento) {
		this.manager.getTransaction().begin();
		this.manager.persist(diasAtendimento);
		this.manager.getTransaction().commit();
		this.manager.close();	
	}

	@Override
	public void alterar(DiasAtendimento diasAtendimento) {
		this.manager.getTransaction().begin();
		this.manager.merge(diasAtendimento);
		this.manager.getTransaction().commit();
		this.manager.close();	
	}

	@Override
	public void remover(DiasAtendimento diasAtendimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DiasAtendimento buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
