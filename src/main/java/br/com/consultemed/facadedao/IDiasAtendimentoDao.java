package br.com.consultemed.facadedao;

import java.util.Date;

import br.com.consultemed.model.DiasAtendimento;

public interface IDiasAtendimentoDao {
		
	public void salvar(DiasAtendimento diasAtendimento);
		
	public void alterar(DiasAtendimento diasAtendimento);
		
	public void remover(DiasAtendimento diasAtendimento);
		
	public DiasAtendimento buscarPorId(Long id);

}
