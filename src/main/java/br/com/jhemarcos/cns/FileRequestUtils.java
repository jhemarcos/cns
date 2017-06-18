package br.com.jhemarcos.cns;

import java.io.InputStream;
import java.util.Scanner;

@SuppressWarnings("resource")
public final class FileRequestUtils {
	
	private static final String CPF_XML_PATH_FILE = "br/com/jhemarcos/cns/cpf_request.xml";
	private static final String CNS_XML_PATH_FILE = "br/com/jhemarcos/cns/cns_request.xml";
	private static final String NOME_XML_PATH_FILE = "br/com/jhemarcos/cns/nome_request.xml";
	private static final String NOME_MAE_XML_PATH_FILE = "br/com/jhemarcos/cns/nome_mae_request.xml";
	
	private static final String CPF_MATCH = "[[FIELD_CPF]]";
	private static final String CNS_MATCH = "[[FIELD_CNS]]";
	private static final String NOME_MATCH = "[[FIELD_NOME]]";
	private static final String NOME_MAE_MATCH = "[[FIELD_NOME_MAE]]";
	
	/**
	 * Carrega o arquivo que contém a requisição xml padrão para busca
	 * por CPF e adiciona o CPF a ser buscado
	 * @param cpf O cpf que será usado na busca
	 * @return A requisição a ser enviada com o CPF
	 */
	public static String getCPFXmlRequest(String cpf){
		InputStream file = ClassLoader.getSystemResourceAsStream(CPF_XML_PATH_FILE);
		Scanner s = new Scanner(file).useDelimiter("\\A");
		String cpfXmlRequest = s.hasNext() ? s.next() : "";
		
		return replaceMatchParam(cpfXmlRequest, CPF_MATCH, cpf);
	}
	
	/**
	 * Carrega o arquivo que contém a requisição xml padrão para busca
	 * por CNS e adiciona o CNS a ser buscado
	 * @param cns O cns que será usado na busca
	 * @return A requisição a ser enviada com o CNS
	 */
	public static String getCNSXmlRequest(String cns){
		InputStream file = ClassLoader.getSystemResourceAsStream(CNS_XML_PATH_FILE);
		Scanner s = new Scanner(file).useDelimiter("\\A");
		String cpfXmlRequest = s.hasNext() ? s.next() : "";
		
		return replaceMatchParam(cpfXmlRequest, CNS_MATCH, cns);
	}
	
	/**
	 * Carrega o arquivo que contém a requisição xml padrão para busca
	 * por nome e adiciona o nome a ser buscado
	 * @param nome O nome que será usado na busca
	 * @return A requisição a ser enviada com o nome
	 */
	public static String getNomeXmlRequest(String nome){
		InputStream file = ClassLoader.getSystemResourceAsStream(NOME_XML_PATH_FILE);
		Scanner s = new Scanner(file).useDelimiter("\\A");
		String cpfXmlRequest = s.hasNext() ? s.next() : "";
		
		return replaceMatchParam(cpfXmlRequest, NOME_MATCH, nome);
	}
	
	/**
	 * Carrega o arquivo que contém a requisição xml padrão para busca
	 * por nome da mae e adiciona o nome da mae a ser buscado
	 * @param nomeMae O nome da mae que será usado na busca
	 * @return A requisição a ser enviada com o nome da mae
	 */
	public static String getNomeMaeXmlRequest(String nomeMae){
		InputStream file = ClassLoader.getSystemResourceAsStream(NOME_MAE_XML_PATH_FILE);
		Scanner s = new Scanner(file).useDelimiter("\\A");
		String cpfXmlRequest = s.hasNext() ? s.next() : "";
		
		return replaceMatchParam(cpfXmlRequest, NOME_MAE_MATCH, nomeMae);
	}
	
	/**
	 * Substitui no texto o token pelo novo valor informado
	 * @param text O texto onde o token será buscado
	 * @param math O token a ser buscado
	 * @param replace O texto que será inserido no lugar do token
	 * @return O texto com o token substituído
	 */
	private static String replaceMatchParam(String text, String math, String replace){
		return text.replace(math, replace);
	}

}
