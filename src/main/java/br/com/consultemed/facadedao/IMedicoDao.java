package br.com.consultemed.facadedao;

import br.com.consultemed.model.Medico;

public interface IMedicoDao {
	
	public void salvar (Medico medico);
	
	public void alterar (Medico medico);
	
	public void remover (Medico medico);
	
	public Medico buscar(Long id);

}
