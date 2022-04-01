package br.com.jhemarcos.conexao;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ConexaoDatasusImpl implements ConexaoDatasus {
	
	private static final String CADSUS_ENDPOINT_HOMOLOGACAO = "https://servicoshm.saude.gov.br/cadsus/PDQSupplier";
	private static final String CADSUS_ENDPOINT_PRODUCAO = "https://servicos.saude.gov.br/cadsus/PDQSupplier";
	
	private static final String USUARIO_MATCH = "[[FIELD_USUARIO]]";
	private static final String SENHA_MATCH = "[[FIELD_SENHA]]";
	
	/**
	 * O usuário usado para se autenticar no barramento Datasus
	 */
	private String usuario;
	
	/**
	 * O senha usada para se autenticar no barramento Datasus
	 */
	private String senha;
	
	/**
	 * O endpoint do barramento Datasus
	 */
	private String endpoint;
	
	/**
	 * Construtor da classe de conexão ao barramento que deve
	 * receber o usuário e senha usados para se autenticar
	 * no barramento do Datasus
	 * 
	 * @param usuario
	 * @param senha
	 */
	public ConexaoDatasusImpl (String usuario, String senha, boolean producao) {
		this.usuario = usuario;
		this.senha = senha;
		this.endpoint = producao ? CADSUS_ENDPOINT_PRODUCAO : CADSUS_ENDPOINT_HOMOLOGACAO;
	}

	/**
	 * Realiza a requisição enviando o xml e retornando a resposta do barramento
	 * @param xmlRequisicao A requisição pronta a ser enviada
	 * @return A resposta do barramento
	 */
	public String requisicao(String xmlRequisicao) {
		xmlRequisicao = configurarAutorizacao(xmlRequisicao);
		
		try { 
	        
	        HttpClient client = HttpClientBuilder.create().build();
	        HttpPost post = new HttpPost(this.endpoint);
	        HttpEntity entity = new ByteArrayEntity(xmlRequisicao.getBytes("UTF-8"));
	        post.setEntity(entity);
	        HttpResponse response = client.execute(post);
	        String result = EntityUtils.toString(response.getEntity());
	        
	        return result;
	    } catch(Exception e) {
	       e.printStackTrace();
	       return null;
	    }
		
	}
	
	/**
	 * Adiciona os parâmetros obrigatórios de usuário e senha
	 * no cabeçalho das requisições xml padrões
	 * @param xmlRequisicao
	 * @return
	 */
	private String configurarAutorizacao(String xmlRequisicao) {
		xmlRequisicao = xmlRequisicao.replace(USUARIO_MATCH, this.usuario);
		xmlRequisicao = xmlRequisicao.replace(SENHA_MATCH, this.senha);
		return xmlRequisicao;
	}

}
