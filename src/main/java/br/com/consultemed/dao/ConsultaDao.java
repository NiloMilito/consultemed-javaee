package br.com.consultemed.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultemed.facadedao.IConsultaDao;
import br.com.consultemed.model.Consulta;
import br.com.consultemed.utils.JPAUtils;

public class ConsultaDao implements IConsultaDao{
	
	private EntityManagerFactory factory = JPAUtils.getEntityManagerFactory();
	private EntityManager manager = factory.createEntityManager();
	
	@Override
	public void salvar(Consulta consulta) {
		this.manager.getTransaction().begin();
		this.manager.persist(consulta);
		this.manager.getTransaction().commit();
		this.manager.close();
	}
	
	@Override
	public void alterar(Consulta consulta) {
		this.manager.getTransaction().begin();
		this.manager.merge(consulta);
		this.manager.getTransaction().commit();
		this.manager.close();		
	}
	
	@Override
	public void remover(Consulta consulta) {
		this.manager.getTransaction().begin();
		this.manager.remove(consulta);
		this.manager.getTransaction().commit();
		this.manager.close();			
	}
	
	@Override
	public Consulta buscar(Long id) {		
		return manager.find(Consulta.class, id);
	}

}
