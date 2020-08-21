package br.com.consultemed.service;

public interface IGeneric<T> {
	
	public void salvar(T object);
	
	public void alterar(T object);
	
	public void remover (T object);
	
	public T buscar(Long id);

}
