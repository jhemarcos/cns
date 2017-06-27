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

	/**
	 * Realiza uma busca no barramento datasus usando
	 * como parâmetro um CPF válido
	 * @param cpf {@link String} Número de CPF válido sem pontuações
	 * @return {@link DadosDemograficosImpl} Instância de dados demográficos com a resposta do barramento
	 */
	public DadosDemograficos buscaPorCPF(String cpf) {
		String xmlRequisicao = FileRequestUtils.getCPFXmlRequest(cpf);		
		String xmlResponse = conexao.requisicao(xmlRequisicao);
		return new DadosDemograficosImpl(xmlResponse);
	}

	/**
	 * Realiza uma busca no barramento datasus usando
	 * como parâmetro um CNS válido
	 * @param cns {@link String} Número de CNS válido sem pontuações
	 * @return {@link DadosDemograficosImpl} Instância de dados demográficos com a resposta do barramento
	 */
	public DadosDemograficos buscaPorCNS(String cns) {
		String xmlRequisicao = FileRequestUtils.getCNSXmlRequest(cns);
		String xmlResponse = conexao.requisicao(xmlRequisicao);
		return new DadosDemograficosImpl(xmlResponse);
	}

	/**
	 * Realiza uma busca no barramento datasus usando
	 * como parâmetro um nome completo válido.
	 * A listagem de nomes inválidos está disponível na wiki desse projeto no github.
	 * @param nome {@link String} Nome completo válido
	 * @return {@link DadosDemograficosImpl} Instância de dados demográficos com a resposta do barramento
	 */
	public DadosDemograficos buscaPorNome(String nome) {
		String xmlRequisicao = FileRequestUtils.getNomeXmlRequest(nome);		
		String xmlResponse = conexao.requisicao(xmlRequisicao);
		return new DadosDemograficosImpl(xmlResponse);
	}

	/**
	 * Realiza uma busca no barramento datasus usando
	 * como parâmetro um nome de mãe completo válido.
	 * A listagem de nomes inválidos está disponível na wiki desse projeto no github.
	 * @param nomeMae {@link String} Nome completo válido
	 * @return {@link DadosDemograficosImpl} Instância de dados demográficos com a resposta do barramento
	 */
	public DadosDemograficos buscaPorNomeMae(String nomeMae) {
		String xmlRequisicao = FileRequestUtils.getNomeMaeXmlRequest(nomeMae);		
		String xmlResponse = conexao.requisicao(xmlRequisicao);
		return new DadosDemograficosImpl(xmlResponse);
	}

}
