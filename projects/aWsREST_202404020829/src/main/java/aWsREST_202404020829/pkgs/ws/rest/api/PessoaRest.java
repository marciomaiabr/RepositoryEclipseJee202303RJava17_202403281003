package aWsREST_202404020829.pkgs.ws.rest.api;

import javax.ws.rs.Produces;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import aModelsJPA22_202403290320.pkgs.models.Pessoa;
import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;

@Path("pessoaRS")
public class PessoaRest {

	@Inject
	private PessoasServiceSpec pessoasService;

	public PessoaRest() {
		System.out.println("PessoaRest.()");
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa buscar(@PathParam("id") final Integer id) {
		System.out.println("PessoaRest.buscar()[id=" + (id) + "]");
		Pessoa pessoa = pessoasService.buscar(id);
		System.out.println("[pessoa=" + (pessoa) + "]");
		return pessoa;
	}

}

/*
http://localhost:8080/aWsREST_202404020829/rest/pessoaRS/9
*/
