package com.github.cns;

import org.junit.Test;

public class DadosDemograficosTest {
	
	@Test(expected = RuntimeException.class)
	public void documentoXmlInvalido() {
		
		new DadosDemograficosImpl(null);				
	}

}
