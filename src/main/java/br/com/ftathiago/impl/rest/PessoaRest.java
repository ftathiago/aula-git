package br.com.ftathiago.impl.rest;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ftathiago.docman.model.Pessoa;
import br.com.ftathiago.intf.services.IPessoaService;


@ManagedBean
@Path("/pessoas")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaRest {

	@Inject
	private IPessoaService pessoaService;

	
	@GET
	public List<Pessoa> getCursos () {
		return pessoaService.getTodos();
	}
	
	@POST
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}
	
	@PUT
	public void alterar(Pessoa pessoa) {		
		pessoaService.salvar(pessoa);
	}
	
	@DELETE
	@Path("/{ID}")
	public void excluir(@PathParam("ID") Integer ID) {		
		pessoaService.excluir(ID);
	}
}
