package br.com.consultemed.facadedao;

import br.com.consultemed.model.Consulta;

public interface IConsultaDao {
	
	public void salvar(Consulta consulta);
	
	public void alterar(Consulta consulta);
	
	public void remover (Consulta consulta);
	
	public Consulta buscar(Long id);

}
