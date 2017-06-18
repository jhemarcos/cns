package br.com.jhemarcos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.jhemarcos.cns.CnsDatasus;
import br.com.jhemarcos.cns.ConexaoDatasus;

public class CnsDatasusTest {
	
	@Test
	public void buscaPorCpfExigeChamarRequisicao() {
		MinhaConexaoDatasus cd = new MinhaConexaoDatasus();
		CnsDatasus cns = new CnsDatasus(cd);
		cns.buscaPorCPF("12346678910");
		assertTrue(cd.chamou);
	}

}

class MinhaConexaoDatasus implements ConexaoDatasus {

	public boolean chamou = false;
	public String requisicao(String xmlRequisicao) {
		chamou = xmlRequisicao != null;
		return "resposta";
	}
	
};
