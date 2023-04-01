package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	/**
	 * @param nome
	 * @param cep
	 */
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		String pais = CepApi.getInstancia().recuperarPais(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado, pais);
	}
}
