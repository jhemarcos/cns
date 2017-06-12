package com.github.cns;

import java.util.List;

import br.com.jhemarcos.DadosDemograficos;

public class DadosDemograficosImpl implements DadosDemograficos {
	
	private String respostaXml;
	
	public DadosDemograficosImpl(String resposta) {
		this.respostaXml = resposta;
		if (resposta == null) {
			throw new RuntimeException();
		}
	}

	public String getNome() {
		// Extrai de respostaXml o nome..
		return null;
	}

	public List<String> getIds() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<String> getIds(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String get(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
