package aWsSOAP_202404020535.pkgs.sibs;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;
import aWsSOAP_202404020535.pkgs.seis.PessoaWsSpec;

@WebService(endpointInterface = "aWsSOAP_202404020535.pkgs.seis.PessoaWsSpec")
public class PessoaWsImpl implements PessoaWsSpec {

	public PessoaWsImpl() {
		System.out.println("PessoaWsImpl.PessoaWsImpl()");
	}

	@Inject
	private PessoasServiceSpec pessoasService;

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return pessoasService.salvar(pessoa);
	}

	@Override
	public Pessoa buscar(Integer id) {
		return pessoasService.buscar(id);
	}

	@Override
	public List<Pessoa> listar() {
		return pessoasService.listar();
	}

	@Override
	public void excluir(Pessoa pessoa) {
		pessoasService.excluir(pessoa);
	}

}
