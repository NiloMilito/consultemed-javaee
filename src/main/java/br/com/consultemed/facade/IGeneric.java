package br.com.consultemed.facade;

public interface IGeneric {
	
	public <T> void salvar(T object);
	
	public <T> void alterar(T object);
	
	public <T> void remover (T object);
	
	public Object buscar(Long id);

}
