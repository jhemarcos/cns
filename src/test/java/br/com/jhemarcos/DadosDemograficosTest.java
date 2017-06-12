package br.com.jhemarcos;

import org.junit.Test;

import br.com.jhemarcos.cns.DadosDemograficosImpl;

public class DadosDemograficosTest {
	
	@Test(expected = RuntimeException.class)
	public void documentoXmlInvalido() {
		
		new DadosDemograficosImpl(null);				
	}

}
