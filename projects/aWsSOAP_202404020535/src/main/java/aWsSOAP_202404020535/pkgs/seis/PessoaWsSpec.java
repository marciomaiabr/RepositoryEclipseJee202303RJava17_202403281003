package aWsSOAP_202404020535.pkgs.seis;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import pkgs.persistence.models.Pessoa;

@WebService
@SOAPBinding(style = Style.RPC)
public interface PessoaWsSpec {

	@WebMethod
	Pessoa salvar(Pessoa pessoa);

	@WebMethod
	Pessoa buscar(Integer id);

	@WebMethod
	List<Pessoa> listar();

	@WebMethod
	void excluir(Pessoa pessoa);

}
