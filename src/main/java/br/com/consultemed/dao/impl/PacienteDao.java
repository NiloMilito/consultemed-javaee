package br.com.consultemed.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultemed.dao.IPacienteDao;
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
		this.manager.getTransaction().begin();
		this.manager.merge(paciente);
		this.manager.getTransaction().commit();
		this.manager.close();
		
	}

	@Override
	public void remover(Paciente paciente) {	
		// TODO Auto-generated method stub
	}

	@Override
	public Paciente buscar(Long id) {	
		this.manager.getTransaction().begin();
		return this.manager.find(Paciente.class, id);
		
	}

	@Override
	public Paciente buscarPorNome(String nome) {
		Query query = this.manager.createQuery("SELECT a FROM Paciente a Where a.nome LIKE :nome ");
		query.setParameter("nome", nome);	
		return (Paciente) query.getSingleResult();
	}

	@Override
	public Paciente buscarPorCpf(String cpf) {
		Query query = this.manager.createQuery("SELECT a FROM Paciente a Where a.cpf LIKE :cpf ");
		query.setParameter("cpf", cpf);	
		return (Paciente) query.getSingleResult();
	}

}
