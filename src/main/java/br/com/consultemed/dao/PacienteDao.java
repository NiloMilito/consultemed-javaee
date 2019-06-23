package br.com.consultemed.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultemed.facadedao.IPacienteDao;
import br.com.consultemed.model.Paciente;
import br.com.consultemed.utils.JPAUtils;

public class PacienteDao implements IPacienteDao{
	
	private EntityManagerFactory factory = JPAUtils.getEntityManagerFactory();
	private EntityManager manager = factory.createEntityManager();

	@Override
	public void salvar(Paciente paciente) {
		this.manager.getTransaction().begin();
		this.manager.persist(paciente);
		this.manager.getTransaction().commit();
		this.manager.close();		
	}

	@Override
	public void alterar(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
