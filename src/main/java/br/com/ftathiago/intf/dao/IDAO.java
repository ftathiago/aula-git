package br.com.ftathiago.intf.dao;

import java.util.List;

public interface IDAO<T> {

	T salvar(T entidade);
	void excluir(T entidade);
	List<T> getTodos();
	T getById(Integer ID);

}
