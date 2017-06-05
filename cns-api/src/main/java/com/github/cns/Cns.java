package com.github.cns;

/**
 * Permite montagem e requisição de consulta aos serviços do CNS oferecidos
 * pelo DATASUS.
 * 
 */
public interface Cns {
	
	/**
	 * Recupera dados demográficos para o CPF fornecido.
	 */
	DadosDemograficos buscaPorCPF(String cpf);
	
}