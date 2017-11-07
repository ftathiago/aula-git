package br.com.ftathiago.docman.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.ftathiago.docman.model.Pessoa;
import br.com.ftathiago.intf.services.IPessoaService;

@ManagedBean
@ViewScoped
public class PessoasController {

	@Inject
	private IPessoaService pessoaService;

	private Pessoa pessoa;

	private List<Pessoa> pessoas;

	private Integer tabActive = 0;

	public void salvar(Pessoa pessoa) {
		pessoas.remove(pessoa);
		pessoas.add(pessoaService.salvar(pessoa));
		setTabActive(0);
	}

	public void excluir(Pessoa pessoa) {
		pessoaService.excluir(pessoa.getPessId());
		pessoas.remove(pessoa);
		setNovoPessoa();
		setTabActive(0);
	}

	public void setNovoPessoa() {
		pessoa = new Pessoa();
		setTabActive(1);
	}

	public Pessoa getPessoa() {
		if (this.pessoa == null) {
			pessoa = new Pessoa();
		}
		return this.pessoa;

	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		setTabActive(1);
	}

	public List<Pessoa> getTodos() {
		if (pessoas == null)
			pessoas = pessoaService.getTodos();
		setTabActive(0);
		return pessoas;
	}

	public void setTabActive(Integer tabActive) {
		this.tabActive = tabActive;
	}

	public Integer getTabActive() {
		return tabActive;
	}

}
