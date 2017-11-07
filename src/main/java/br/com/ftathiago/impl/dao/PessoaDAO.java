package br.com.ftathiago.impl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.ftathiago.docman.model.Pessoa;
import br.com.ftathiago.intf.dao.IPessoaDAO;

public class PessoaDAO implements IPessoaDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Pessoa salvar(Pessoa entidade) {
		if (entidade.getPessId() == null)
			entityManager.persist(entidade);
		else
			entityManager.merge(entidade);
		return entidade;
	}

	@Override
	@Transactional
	public void excluir(Pessoa entidade) {
		Pessoa pessoa = getById(entidade.getPessId());
		entityManager.remove(pessoa);			
	}

	@Override
	public List<Pessoa> getTodos() {
		return entityManager.createQuery("from Pessoa", Pessoa.class).getResultList();
	}

	@Override
	public Pessoa getById(Integer ID) {		
		return entityManager.find(Pessoa.class,ID);
	}
}
