package aWsREST_202404020829.pkgs.ws.rest.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
	public Pessoa buscar(@PathParam("id") final Integer id) {
		System.out.println("PessoaRest.buscar()");
		return pessoasService.buscar(id);
	}

}