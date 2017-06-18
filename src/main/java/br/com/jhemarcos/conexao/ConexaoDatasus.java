package br.com.jhemarcos.conexao;

/**
 * Servicos oferecidos para conexao com Datasus para acesso ao CNS. 
 * @author jean_
 *
 */
public interface ConexaoDatasus {
	
	String requisicao(String xmlRequisicao);
	
}
