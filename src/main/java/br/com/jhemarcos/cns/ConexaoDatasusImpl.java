package br.com.jhemarcos.cns;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.bind.JAXBContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class ConexaoDatasusImpl implements ConexaoDatasus {
	
	/**
	 * O usuário usado para se autenticar no barramento Datasus
	 */
	private String usuario;
	
	/**
	 * O senha usada para se autenticar no barramento Datasus
	 */
	private String senha;
	
	/**
	 * Construtor da classe de conexão ao barramento que deve
	 * receber o usuário e senha usados para se autenticar
	 * no barramento do Datasus
	 * 
	 * @param usuario
	 * @param senha
	 */
	public ConexaoDatasusImpl (String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	/**
	 * Realiza a requisição enviando o xml e retornando a resposta do barramento
	 */
	public String requisicao(String xmlRequisicao) {
		
		try { 
	        
	        HttpClient client = new DefaultHttpClient();
	        HttpPost post = new HttpPost("https://servicoshm.saude.gov.br/cadsus/PDQSupplier");
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

}
