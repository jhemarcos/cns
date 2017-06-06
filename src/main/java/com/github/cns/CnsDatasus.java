package com.github.cns;

public class CnsDatasus implements Cns {
	
	private ConexaoDatasus conexao;
	
	public CnsDatasus(ConexaoDatasus conexao) {
		this.conexao = conexao;
	}

	public DadosDemograficos buscaPorCPF(String cpf) {
		// 1. Monta requisicao (documento XML)
		// 2. Submete a requisicao
		// 3. Monta instancia de DadosDemograficos com a resposta
		
		// Monta a requisicao aqui...
		String xmlRequisicao = montaRequisicaoBuscaPorCPF(cpf);
		
		// Submeter a requisicao
		String xml = conexao.requisicao(xmlRequisicao);
		
		return new DadosDemograficosImpl(xml);
	}
	
	public String montaRequisicaoBuscaPorCPF(String cpf) {
		return cpf;
	}

}
