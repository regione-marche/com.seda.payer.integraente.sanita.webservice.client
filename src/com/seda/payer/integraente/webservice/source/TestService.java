package com.seda.payer.integraente.webservice.source;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.seda.payer.integraente.webservice.dati.NotificaPagamentoRequest;
import com.seda.payer.integraente.webservice.dati.NotificaPagamentoResponse;
import com.seda.payer.integraente.webservice.dati.RecuperaDatiBollettinoRequest;
import com.seda.payer.integraente.webservice.dati.RecuperaDatiBollettinoResponse;
import com.seda.payer.integraente.webservice.dati.RecuperaListDocRequest;
import com.seda.payer.integraente.webservice.dati.RecuperaListDocResponse;


public class TestService {

	public static void main(String[] args) {
		String messaggio = "";
		
			
		try {
			
			IntegraEnteSanitaServiceLocator integraEnteSanitaServiceLocator = new IntegraEnteSanitaServiceLocator();
			IntegraEnteSanitaInterface integraEnteSanitaInterface = integraEnteSanitaServiceLocator.getIntegraEnteSanitaPort(new URL("http://localhost:8611/IntegraEnteSanitaService/integraentesanita"));
			/* Chiamata in sicurezza
			IntegraEnteSanitaInterface integraEnteSanitaInterface = integraEnteSanitaServiceLocator.getIntegraEnteSanitaPort(new URL("http://10.10.80.6:8857/NotificheServiceNew/notifiche"), "username", "password");
			*/
			if(true) {
				NotificaPagamentoRequest in = new NotificaPagamentoRequest();
				in.setCodiceTransazionePagonet("codiceTransazionePagonet");
				in.setCodiceDettaglioTransazionePagonet("codiceDettaglioTransazionePagonet");
				in.setCodiceEnte("codiceEnte");
				in.setCodiceFiscale("BRHHNZ77C25B220J");
				in.setDataPagamento("20170801120000");
				in.setImportoPagato(99);
				in.setNumeroAvvisoPagoPA("301160000000515140");
				in.setNumeroDocumento("1234");
				in.setRtXML("rtXML");
				
				
				NotificaPagamentoResponse response = integraEnteSanitaInterface.notificaPagamento(in);
				
				System.out.println(response.getRisultato().getRetcode());
				System.out.println(response.getRisultato().getRetmessage());
				
			}
			
			if(false) {
				IntegraEntePgServiceLocator integraEntePgServiceLocator = new IntegraEntePgServiceLocator();
				IntegraEntePgInterface integraEntePgInterface = integraEntePgServiceLocator.getIntegraentePort(new URL("http://localhost:8611/IntegraEnteSanitaService/integraentepg"));
	
				RecuperaDatiBollettinoRequest in = new RecuperaDatiBollettinoRequest();
				//Set dei parametri in
				in.setCodiceEnte("codiceEnte");
				in.setCodiceUfficio("codiceUfficio");
				in.setCodiceUtente("codiceUtente");
				in.setDataVerbale("");
				//in.setIdentificativoBollettino("301160000000515140"); //già con data esito
				in.setIdentificativoBollettino("301160000000999999"); //codice non presente
				//in.setIdentificativoBollettino("301160000000515818"); //da pagare
				in.setIdentificativoUnivocoVersamento("identificativoUnivocoVersamento");
				in.setIdentificativoVerbale("");
				in.setTargaVeicolo("");
				in.setTipologiaOperazione("");
				in.setTipologiaServizio("");
				in.setTipoUfficio("");
				
				
				RecuperaDatiBollettinoResponse response = integraEntePgInterface.recuperaDatiBollettino(in);
				System.out.println(response.getCodiceEsito());
				System.out.println(response.getMsgEsito());
				
				if(response.getCodiceEsito().equals("00")) {
					System.out.println("NumeroDocumento: " + response.getAnagraficaBollettino().getNumeroDocumento());
					System.out.println("CodiceFiscale_PIVA: " + response.getAnagraficaBollettino().getCodiceFiscale_PIVA());
					System.out.println("Intestatario: " + response.getAnagraficaBollettino().getIntestatario());
					System.out.println("DataScadenza: " + response.getAnagraficaBollettino().getDataScadenza());
					System.out.println("ImportoBollettino: " + response.getImportoBollettino());
				}
			}

			if(false) {
				IntegraEnteEcServiceLocator integraEnteEcServiceLocator = new IntegraEnteEcServiceLocator();
				IntegraEnteEcInterface integraEnteEcInterface = integraEnteEcServiceLocator.getIntegraenteEcPort(new URL("http://localhost:8611/IntegraEnteSanitaService/integraenteec"));
	
				RecuperaListDocRequest in = new RecuperaListDocRequest();
				//Set dei parametri in
				in.setAnnoEmissione("2016"); // ---
				in.setCodiceEnte("codiceEnte");
				in.setCodiceFiscale("BRHHNZ77C25B220J");// --- codiceFiscale
				in.setCodiceUfficio("codiceUfficio");
				in.setCodiceUtente("codiceUtente");
				in.setDocumento("1234"); // --- documento
				in.setIdDocumento("1234"); // --- idDocumento
				in.setEntePertinenza("entePertinenza");
				in.setEsitoRichiesta("P"); // --- P => Pagato ?? oppure vuoto
				in.setIdBarCode("idBarCode");
				in.setIdProcedura("idProcedura");
				in.setImpostaServizio("impostaServizio");
				in.setMessaggioEsito(""); // ??? messaggioEsito 
				in.setNumeroBollettino(BigDecimal.valueOf(Long.parseLong("301160000000515140"))); // "numeroBollettino" => IUV
				in.setNumeroCronologico("numeroCronologico");
				in.setNumeroRaccomandata("numeroRaccomandata");
				in.setProgCoobbligato(BigDecimal.valueOf(0)); //"progCoobbligato"
				in.setTipoIntegrazione("tipoIntegrazione");
				in.setTipologiaServizio("tipologiaServizio");
				in.setTipologiaUtenza("tipologiaUtenza");
				in.setTipoRichiesta("I"); //I=> Non pagati; S=>Pagati
				in.setTipoServizio("tipoServizio");
				in.setTipoUfficio("tipoUfficio");
				
				
				
				RecuperaListDocResponse response = integraEnteEcInterface.recuperaListDoc(in);
				System.out.println(response.getResp().getEsitoRichiesta());
				System.out.println(response.getResp().getMessaggioEsito());
				
				
			}
			
			
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} finally {
			System.out.println(messaggio);
		}
	}
}
