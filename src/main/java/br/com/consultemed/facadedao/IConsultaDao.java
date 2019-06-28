package br.com.consultemed.facadedao;

import java.util.Date;

import br.com.consultemed.model.Consulta;

public interface IConsultaDao {
	
	public void salvar(Consulta consulta);
	
	public void alterar(Consulta consulta);
	
	public void remover(Consulta consulta);
	
	public Consulta buscarPorId(Long id);
	
	public Consulta buscarPorPeriodo(Date inicio, Date fim);

}
