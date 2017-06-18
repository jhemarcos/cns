package br.com.jhemarcos.cns;

public class RunPDQ {

	public static void main(String[] args) {
		System.out.println("ok");
		
		ConexaoDatasusImpl conexaoDatasusImpl = new ConexaoDatasusImpl("CADSUS.CNS.PDQ.PUBLICO", "kUXNmiiii#RDdlOELdoe00966", false);
		CnsDatasus cns = new CnsDatasus(conexaoDatasusImpl);
		
		DadosDemograficosImpl dadosDemograficosImpl = (DadosDemograficosImpl) cns.buscaPorCPF("90005031249");
		
		System.out.println(dadosDemograficosImpl.getRespostaXml());
		
		System.out.println("fim");
	
	}

}
