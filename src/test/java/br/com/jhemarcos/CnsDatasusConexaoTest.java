package br.com.jhemarcos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.jhemarcos.cns.CnsDatasus;
import br.com.jhemarcos.cns.ConexaoDatasus;
import br.com.jhemarcos.cns.ConexaoDatasusImpl;
import br.com.jhemarcos.cns.DadosDemograficosImpl;

public class CnsDatasusConexaoTest {
	
	@Test
	public void cnsConsegueConectarBarramento() {

		ConexaoDatasusImpl conexaoDatasusImpl = new ConexaoDatasusImpl("", "", false);
		CnsDatasus cns = new CnsDatasus(conexaoDatasusImpl);
		
		DadosDemograficosImpl dadosDemograficosImpl= (DadosDemograficosImpl) cns.buscaPorCPF("123.456.789-10");
		
		assertTrue(dadosDemograficosImpl.sucesso());
	}

}
