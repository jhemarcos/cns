package br.com.jhemarcos.cns;

import br.com.jhemarcos.Cns;
import br.com.jhemarcos.DadosDemograficos;
import br.com.jhemarcos.conexao.ConexaoDatasus;
import br.com.jhemarcos.models.DadosDemograficosImpl;
import br.com.jhemarcos.utils.FileRequestUtils;

public class CnsDatasus implements Cns {
	
	private ConexaoDatasus conexao;
	
	public CnsDatasus(ConexaoDatasus conexao) {
		this.conexao = conexao;
	}

	public DadosDemograficos buscaPorCPF(String cpf) {
		String xmlRequisicao = FileRequestUtils.getCPFXmlRequest(cpf);		
		String xmlResponse = conexao.requisicao(xmlRequisicao);
		return new DadosDemograficosImpl(xmlResponse);
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
