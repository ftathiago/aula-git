package br.com.ftathiago.impl.services;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import br.com.ftathiago.docman.model.Pessoa;
import br.com.ftathiago.intf.dao.IPessoaDAO;
import br.com.ftathiago.intf.services.IPessoaService;

public class PessoaService implements IPessoaService {
	
	@Inject
	private IPessoaDAO pessoaDAO;

	@Override
	@Transactional
	public Pessoa salvar(Pessoa entidade) {
		return pessoaDAO.salvar(entidade);
	}

	@Override
	@Transactional
	public void excluir(Integer id) {		
		Pessoa pessoa = pessoaDAO.getById(id);
		pessoaDAO.excluir(pessoa);
	}

	@Override
	public List<Pessoa> getTodos() {
		return pessoaDAO.getTodos();
	}
	
	@Override
	public Pessoa getByID(Integer id) {
		return pessoaDAO.getById(id);
	}

}
