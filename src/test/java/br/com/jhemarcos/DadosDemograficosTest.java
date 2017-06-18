package br.com.jhemarcos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.jhemarcos.models.DadosDemograficosImpl;

public class DadosDemograficosTest {
	
	@Test
	public void documentoXmlNullo() {
		DadosDemograficosImpl dadosDemograficosImpl = new DadosDemograficosImpl(null);
		assertFalse(dadosDemograficosImpl.sucesso());
	}

}
