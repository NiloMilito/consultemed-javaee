package br.com.consultemed.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultemed.facadedao.IMedicoDao;
import br.com.consultemed.model.Medico;
import br.com.consultemed.utils.JPAUtils;

public class MedicoDao implements IMedicoDao{
	
	private EntityManagerFactory factory = JPAUtils.getEntityManagerFactory();
	private EntityManager manager = factory.createEntityManager();

	@Override
	public void salvar(Medico medico) {
		this.manager.getTransaction().begin();
		this.manager.persist(medico);
		this.manager.getTransaction().commit();
		this.manager.close();		
	}

	@Override
	public void alterar(Medico medico) {
		this.manager.getTransaction().begin();
		this.manager.merge(medico);
		this.manager.getTransaction().commit();
		this.manager.close();
	}

	@Override
	public void remover(Medico medico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medico buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
