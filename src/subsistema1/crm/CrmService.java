package subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado, String pais) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.printf( "%nNome: %s%nCep: %s%nCidade: %s%nEstado: %s%nPais: %s%n%n"
		, nome, cep, cidade, estado, pais);
	
	}
}
