package com.github.cns;

import java.util.List;

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

	public List<String> get(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
