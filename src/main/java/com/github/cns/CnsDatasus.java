package com.github.cns;

import br.com.jhemarcos.Cns;
import br.com.jhemarcos.DadosDemograficos;

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

	public DadosDemograficos buscaPorCNS(String cns) {
		// TODO Auto-generated method stub
		return null;
	}

	public DadosDemograficos buscaPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public DadosDemograficos buscaPorNomeMae(String nomeMae) {
		// TODO Auto-generated method stub
		return null;
	}

}
