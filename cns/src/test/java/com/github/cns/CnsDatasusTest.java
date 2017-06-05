package com.github.cns;

import static org.junit.Assert.*;

import org.junit.Test;

public class CnsDatasusTest {
	
	@Test
	public void buscaPorCpfExigeChamarRequisicao() {

		MinhaConexaoDatasus cd = new MinhaConexaoDatasus();
		
		CnsDatasus cns = new CnsDatasus(cd);
		cns.buscaPorCPF("true");
		assertTrue(cd.ok);
	}

}

class MinhaConexaoDatasus implements ConexaoDatasus {

	public boolean ok = false;
	
	public String requisicao(String xmlRequisicao) {
		ok = "true".equals(xmlRequisicao);
		return "ok";
	}
	
};
