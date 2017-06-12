package br.com.jhemarcos.cns;

public class RunPDQ {

	public static void main(String[] args) {
		System.out.println("ok");
		
		ConexaoDatasusImpl conexaoDatasusImpl = new ConexaoDatasusImpl("", "");
		CnsDatasus cns = new CnsDatasus(conexaoDatasusImpl);
		
		DadosDemograficosImpl dadosDemograficosImpl = (DadosDemograficosImpl) cns.buscaPorCPF("123.456.789-10");
		
		System.out.println(dadosDemograficosImpl.getRespostaXml());
		
		System.out.println("fim");
	
	}

}
