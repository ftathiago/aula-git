package br.com.ftathiago.intf.services;

import java.util.List;


public interface IServices<T> {
	
		T salvar(T entidade);
		
		void excluir(Integer id);

		List<T> getTodos();	
		
		T getByID(Integer id);
}
