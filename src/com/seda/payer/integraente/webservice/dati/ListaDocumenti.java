/**
 * ListaDocumenti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class ListaDocumenti  implements java.io.Serializable {
    /* anno emissione AAAA */
    private java.lang.String annoEmissione;

    /* Descrizione tipologia servizio */
    private java.lang.String numeroEmissione;

    /* identificativo documento */
    private java.lang.String identificativoDocumento;

    /* identificativo cartella solo se tipo documento = RR */
    private java.lang.String identificativoCartella;

    /* tipologia servizio */
    private java.lang.String tipologiaServizio;

    /* descrizione tipologia documento */
    private java.lang.String descTipologiaServizio;

    /* tipo documento solo se tipo documento = RR */
    private java.lang.String tipoDocumento;

    /* stato documento R=rendicontato e  E=Estinto */
    private java.lang.String statoDocumento;

    /* documento collegato solo se stato documento = R */
    private java.lang.String documentoCollegato;

    /* tipo documento I=Insoluti e S=Storico */
    private java.lang.String tipoDocumentoCollegato;

    /* numeroBollettino */
    private java.lang.String numeroBollettino;

    /* denominazione */
    private java.lang.String denominazione;

    /* imposta servizio */
    private java.lang.String impostaServizio;

    /* descrizione imposta servizio */
    private java.lang.String descImpostaServizio;

    /* descrizione ente */
    private java.lang.String descEnte;

    /* data Notifica */
    private java.lang.String dataNotifica;

    /* Importo Iniziale Documento */
    private java.math.BigDecimal impInizialeDocumento;

    /* Importo Pagato Documento */
    private java.math.BigDecimal impPagatoDocumento;

    /* Importo Residuo Documento */
    private java.math.BigDecimal impResiduoDocumento;

    /* presenza pagamento in acquisizione Y/N */
    private java.lang.String pagamentoAcquisizione;

    /* codice Bollettino Freccia */
    private java.lang.String codiceBollettinoFreccia;

    /* Importo Compenso per Ritardato Pagamento Iniziale */
    private java.math.BigDecimal impCompRitardoPagIniziale;

    /* Importo Compenso per Ritardato Pagamento Pagato */
    private java.math.BigDecimal impCompRitardoPagPagato;

    /* Importo Compenso per Ritardato Pagamento Residuo */
    private java.math.BigDecimal impCompRitardoPagResiduo;

    /* Importo Compenso per Ritardato Pagamento Residuo */
    private java.lang.String pagamentoAbilitato;

    /* Importo Compenso per Ritardato Pagamento Residuo */
    private java.lang.String tipoBollettino;

    /* Flag Evidenza */
    private java.lang.String flagEvidenza;

    /* Flag Eccedenza */
    private java.lang.String flagEccedenza;

    /* Scadenza prima rata */
    private java.lang.String scadenzaPrimaRata;

    /* flag maggior rateazione */
    private java.lang.String flagMaggiorRateazione;

    /* presenza atti contenzioso */
    private java.lang.String attiContenzioso;

    /* progressivo coobbligato */
    private java.math.BigDecimal progressivoCoobbligato;

    /* codice fiscale debitore principale */
    private java.lang.String codiceFiscaleDebitorePrincipale;

    /* denominazione debitore principale */
    private java.lang.String denominazioneDebitorePrincipale;

    /* codice iban */
    private java.lang.String codiceIban;

    public ListaDocumenti() {
    }

    public ListaDocumenti(
           java.lang.String annoEmissione,
           java.lang.String numeroEmissione,
           java.lang.String identificativoDocumento,
           java.lang.String identificativoCartella,
           java.lang.String tipologiaServizio,
           java.lang.String descTipologiaServizio,
           java.lang.String tipoDocumento,
           java.lang.String statoDocumento,
           java.lang.String documentoCollegato,
           java.lang.String tipoDocumentoCollegato,
           java.lang.String numeroBollettino,
           java.lang.String denominazione,
           java.lang.String impostaServizio,
           java.lang.String descImpostaServizio,
           java.lang.String descEnte,
           java.lang.String dataNotifica,
           java.math.BigDecimal impInizialeDocumento,
           java.math.BigDecimal impPagatoDocumento,
           java.math.BigDecimal impResiduoDocumento,
           java.lang.String pagamentoAcquisizione,
           java.lang.String codiceBollettinoFreccia,
           java.math.BigDecimal impCompRitardoPagIniziale,
           java.math.BigDecimal impCompRitardoPagPagato,
           java.math.BigDecimal impCompRitardoPagResiduo,
           java.lang.String pagamentoAbilitato,
           java.lang.String tipoBollettino,
           java.lang.String flagEvidenza,
           java.lang.String flagEccedenza,
           java.lang.String scadenzaPrimaRata,
           java.lang.String flagMaggiorRateazione,
           java.lang.String attiContenzioso,
           java.math.BigDecimal progressivoCoobbligato,
           java.lang.String codiceFiscaleDebitorePrincipale,
           java.lang.String denominazioneDebitorePrincipale,
           java.lang.String codiceIban) {
           this.annoEmissione = annoEmissione;
           this.numeroEmissione = numeroEmissione;
           this.identificativoDocumento = identificativoDocumento;
           this.identificativoCartella = identificativoCartella;
           this.tipologiaServizio = tipologiaServizio;
           this.descTipologiaServizio = descTipologiaServizio;
           this.tipoDocumento = tipoDocumento;
           this.statoDocumento = statoDocumento;
           this.documentoCollegato = documentoCollegato;
           this.tipoDocumentoCollegato = tipoDocumentoCollegato;
           this.numeroBollettino = numeroBollettino;
           this.denominazione = denominazione;
           this.impostaServizio = impostaServizio;
           this.descImpostaServizio = descImpostaServizio;
           this.descEnte = descEnte;
           this.dataNotifica = dataNotifica;
           this.impInizialeDocumento = impInizialeDocumento;
           this.impPagatoDocumento = impPagatoDocumento;
           this.impResiduoDocumento = impResiduoDocumento;
           this.pagamentoAcquisizione = pagamentoAcquisizione;
           this.codiceBollettinoFreccia = codiceBollettinoFreccia;
           this.impCompRitardoPagIniziale = impCompRitardoPagIniziale;
           this.impCompRitardoPagPagato = impCompRitardoPagPagato;
           this.impCompRitardoPagResiduo = impCompRitardoPagResiduo;
           this.pagamentoAbilitato = pagamentoAbilitato;
           this.tipoBollettino = tipoBollettino;
           this.flagEvidenza = flagEvidenza;
           this.flagEccedenza = flagEccedenza;
           this.scadenzaPrimaRata = scadenzaPrimaRata;
           this.flagMaggiorRateazione = flagMaggiorRateazione;
           this.attiContenzioso = attiContenzioso;
           this.progressivoCoobbligato = progressivoCoobbligato;
           this.codiceFiscaleDebitorePrincipale = codiceFiscaleDebitorePrincipale;
           this.denominazioneDebitorePrincipale = denominazioneDebitorePrincipale;
           this.codiceIban = codiceIban;
    }


    /**
     * Gets the annoEmissione value for this ListaDocumenti.
     * 
     * @return annoEmissione   * anno emissione AAAA
     */
    public java.lang.String getAnnoEmissione() {
        return annoEmissione;
    }


    /**
     * Sets the annoEmissione value for this ListaDocumenti.
     * 
     * @param annoEmissione   * anno emissione AAAA
     */
    public void setAnnoEmissione(java.lang.String annoEmissione) {
        this.annoEmissione = annoEmissione;
    }


    /**
     * Gets the numeroEmissione value for this ListaDocumenti.
     * 
     * @return numeroEmissione   * Descrizione tipologia servizio
     */
    public java.lang.String getNumeroEmissione() {
        return numeroEmissione;
    }


    /**
     * Sets the numeroEmissione value for this ListaDocumenti.
     * 
     * @param numeroEmissione   * Descrizione tipologia servizio
     */
    public void setNumeroEmissione(java.lang.String numeroEmissione) {
        this.numeroEmissione = numeroEmissione;
    }


    /**
     * Gets the identificativoDocumento value for this ListaDocumenti.
     * 
     * @return identificativoDocumento   * identificativo documento
     */
    public java.lang.String getIdentificativoDocumento() {
        return identificativoDocumento;
    }


    /**
     * Sets the identificativoDocumento value for this ListaDocumenti.
     * 
     * @param identificativoDocumento   * identificativo documento
     */
    public void setIdentificativoDocumento(java.lang.String identificativoDocumento) {
        this.identificativoDocumento = identificativoDocumento;
    }


    /**
     * Gets the identificativoCartella value for this ListaDocumenti.
     * 
     * @return identificativoCartella   * identificativo cartella solo se tipo documento = RR
     */
    public java.lang.String getIdentificativoCartella() {
        return identificativoCartella;
    }


    /**
     * Sets the identificativoCartella value for this ListaDocumenti.
     * 
     * @param identificativoCartella   * identificativo cartella solo se tipo documento = RR
     */
    public void setIdentificativoCartella(java.lang.String identificativoCartella) {
        this.identificativoCartella = identificativoCartella;
    }


    /**
     * Gets the tipologiaServizio value for this ListaDocumenti.
     * 
     * @return tipologiaServizio   * tipologia servizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this ListaDocumenti.
     * 
     * @param tipologiaServizio   * tipologia servizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the descTipologiaServizio value for this ListaDocumenti.
     * 
     * @return descTipologiaServizio   * descrizione tipologia documento
     */
    public java.lang.String getDescTipologiaServizio() {
        return descTipologiaServizio;
    }


    /**
     * Sets the descTipologiaServizio value for this ListaDocumenti.
     * 
     * @param descTipologiaServizio   * descrizione tipologia documento
     */
    public void setDescTipologiaServizio(java.lang.String descTipologiaServizio) {
        this.descTipologiaServizio = descTipologiaServizio;
    }


    /**
     * Gets the tipoDocumento value for this ListaDocumenti.
     * 
     * @return tipoDocumento   * tipo documento solo se tipo documento = RR
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ListaDocumenti.
     * 
     * @param tipoDocumento   * tipo documento solo se tipo documento = RR
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the statoDocumento value for this ListaDocumenti.
     * 
     * @return statoDocumento   * stato documento R=rendicontato e  E=Estinto
     */
    public java.lang.String getStatoDocumento() {
        return statoDocumento;
    }


    /**
     * Sets the statoDocumento value for this ListaDocumenti.
     * 
     * @param statoDocumento   * stato documento R=rendicontato e  E=Estinto
     */
    public void setStatoDocumento(java.lang.String statoDocumento) {
        this.statoDocumento = statoDocumento;
    }


    /**
     * Gets the documentoCollegato value for this ListaDocumenti.
     * 
     * @return documentoCollegato   * documento collegato solo se stato documento = R
     */
    public java.lang.String getDocumentoCollegato() {
        return documentoCollegato;
    }


    /**
     * Sets the documentoCollegato value for this ListaDocumenti.
     * 
     * @param documentoCollegato   * documento collegato solo se stato documento = R
     */
    public void setDocumentoCollegato(java.lang.String documentoCollegato) {
        this.documentoCollegato = documentoCollegato;
    }


    /**
     * Gets the tipoDocumentoCollegato value for this ListaDocumenti.
     * 
     * @return tipoDocumentoCollegato   * tipo documento I=Insoluti e S=Storico
     */
    public java.lang.String getTipoDocumentoCollegato() {
        return tipoDocumentoCollegato;
    }


    /**
     * Sets the tipoDocumentoCollegato value for this ListaDocumenti.
     * 
     * @param tipoDocumentoCollegato   * tipo documento I=Insoluti e S=Storico
     */
    public void setTipoDocumentoCollegato(java.lang.String tipoDocumentoCollegato) {
        this.tipoDocumentoCollegato = tipoDocumentoCollegato;
    }


    /**
     * Gets the numeroBollettino value for this ListaDocumenti.
     * 
     * @return numeroBollettino   * numeroBollettino
     */
    public java.lang.String getNumeroBollettino() {
        return numeroBollettino;
    }


    /**
     * Sets the numeroBollettino value for this ListaDocumenti.
     * 
     * @param numeroBollettino   * numeroBollettino
     */
    public void setNumeroBollettino(java.lang.String numeroBollettino) {
        this.numeroBollettino = numeroBollettino;
    }


    /**
     * Gets the denominazione value for this ListaDocumenti.
     * 
     * @return denominazione   * denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this ListaDocumenti.
     * 
     * @param denominazione   * denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the impostaServizio value for this ListaDocumenti.
     * 
     * @return impostaServizio   * imposta servizio
     */
    public java.lang.String getImpostaServizio() {
        return impostaServizio;
    }


    /**
     * Sets the impostaServizio value for this ListaDocumenti.
     * 
     * @param impostaServizio   * imposta servizio
     */
    public void setImpostaServizio(java.lang.String impostaServizio) {
        this.impostaServizio = impostaServizio;
    }


    /**
     * Gets the descImpostaServizio value for this ListaDocumenti.
     * 
     * @return descImpostaServizio   * descrizione imposta servizio
     */
    public java.lang.String getDescImpostaServizio() {
        return descImpostaServizio;
    }


    /**
     * Sets the descImpostaServizio value for this ListaDocumenti.
     * 
     * @param descImpostaServizio   * descrizione imposta servizio
     */
    public void setDescImpostaServizio(java.lang.String descImpostaServizio) {
        this.descImpostaServizio = descImpostaServizio;
    }


    /**
     * Gets the descEnte value for this ListaDocumenti.
     * 
     * @return descEnte   * descrizione ente
     */
    public java.lang.String getDescEnte() {
        return descEnte;
    }


    /**
     * Sets the descEnte value for this ListaDocumenti.
     * 
     * @param descEnte   * descrizione ente
     */
    public void setDescEnte(java.lang.String descEnte) {
        this.descEnte = descEnte;
    }


    /**
     * Gets the dataNotifica value for this ListaDocumenti.
     * 
     * @return dataNotifica   * data Notifica
     */
    public java.lang.String getDataNotifica() {
        return dataNotifica;
    }


    /**
     * Sets the dataNotifica value for this ListaDocumenti.
     * 
     * @param dataNotifica   * data Notifica
     */
    public void setDataNotifica(java.lang.String dataNotifica) {
        this.dataNotifica = dataNotifica;
    }


    /**
     * Gets the impInizialeDocumento value for this ListaDocumenti.
     * 
     * @return impInizialeDocumento   * Importo Iniziale Documento
     */
    public java.math.BigDecimal getImpInizialeDocumento() {
        return impInizialeDocumento;
    }


    /**
     * Sets the impInizialeDocumento value for this ListaDocumenti.
     * 
     * @param impInizialeDocumento   * Importo Iniziale Documento
     */
    public void setImpInizialeDocumento(java.math.BigDecimal impInizialeDocumento) {
        this.impInizialeDocumento = impInizialeDocumento;
    }


    /**
     * Gets the impPagatoDocumento value for this ListaDocumenti.
     * 
     * @return impPagatoDocumento   * Importo Pagato Documento
     */
    public java.math.BigDecimal getImpPagatoDocumento() {
        return impPagatoDocumento;
    }


    /**
     * Sets the impPagatoDocumento value for this ListaDocumenti.
     * 
     * @param impPagatoDocumento   * Importo Pagato Documento
     */
    public void setImpPagatoDocumento(java.math.BigDecimal impPagatoDocumento) {
        this.impPagatoDocumento = impPagatoDocumento;
    }


    /**
     * Gets the impResiduoDocumento value for this ListaDocumenti.
     * 
     * @return impResiduoDocumento   * Importo Residuo Documento
     */
    public java.math.BigDecimal getImpResiduoDocumento() {
        return impResiduoDocumento;
    }


    /**
     * Sets the impResiduoDocumento value for this ListaDocumenti.
     * 
     * @param impResiduoDocumento   * Importo Residuo Documento
     */
    public void setImpResiduoDocumento(java.math.BigDecimal impResiduoDocumento) {
        this.impResiduoDocumento = impResiduoDocumento;
    }


    /**
     * Gets the pagamentoAcquisizione value for this ListaDocumenti.
     * 
     * @return pagamentoAcquisizione   * presenza pagamento in acquisizione Y/N
     */
    public java.lang.String getPagamentoAcquisizione() {
        return pagamentoAcquisizione;
    }


    /**
     * Sets the pagamentoAcquisizione value for this ListaDocumenti.
     * 
     * @param pagamentoAcquisizione   * presenza pagamento in acquisizione Y/N
     */
    public void setPagamentoAcquisizione(java.lang.String pagamentoAcquisizione) {
        this.pagamentoAcquisizione = pagamentoAcquisizione;
    }


    /**
     * Gets the codiceBollettinoFreccia value for this ListaDocumenti.
     * 
     * @return codiceBollettinoFreccia   * codice Bollettino Freccia
     */
    public java.lang.String getCodiceBollettinoFreccia() {
        return codiceBollettinoFreccia;
    }


    /**
     * Sets the codiceBollettinoFreccia value for this ListaDocumenti.
     * 
     * @param codiceBollettinoFreccia   * codice Bollettino Freccia
     */
    public void setCodiceBollettinoFreccia(java.lang.String codiceBollettinoFreccia) {
        this.codiceBollettinoFreccia = codiceBollettinoFreccia;
    }


    /**
     * Gets the impCompRitardoPagIniziale value for this ListaDocumenti.
     * 
     * @return impCompRitardoPagIniziale   * Importo Compenso per Ritardato Pagamento Iniziale
     */
    public java.math.BigDecimal getImpCompRitardoPagIniziale() {
        return impCompRitardoPagIniziale;
    }


    /**
     * Sets the impCompRitardoPagIniziale value for this ListaDocumenti.
     * 
     * @param impCompRitardoPagIniziale   * Importo Compenso per Ritardato Pagamento Iniziale
     */
    public void setImpCompRitardoPagIniziale(java.math.BigDecimal impCompRitardoPagIniziale) {
        this.impCompRitardoPagIniziale = impCompRitardoPagIniziale;
    }


    /**
     * Gets the impCompRitardoPagPagato value for this ListaDocumenti.
     * 
     * @return impCompRitardoPagPagato   * Importo Compenso per Ritardato Pagamento Pagato
     */
    public java.math.BigDecimal getImpCompRitardoPagPagato() {
        return impCompRitardoPagPagato;
    }


    /**
     * Sets the impCompRitardoPagPagato value for this ListaDocumenti.
     * 
     * @param impCompRitardoPagPagato   * Importo Compenso per Ritardato Pagamento Pagato
     */
    public void setImpCompRitardoPagPagato(java.math.BigDecimal impCompRitardoPagPagato) {
        this.impCompRitardoPagPagato = impCompRitardoPagPagato;
    }


    /**
     * Gets the impCompRitardoPagResiduo value for this ListaDocumenti.
     * 
     * @return impCompRitardoPagResiduo   * Importo Compenso per Ritardato Pagamento Residuo
     */
    public java.math.BigDecimal getImpCompRitardoPagResiduo() {
        return impCompRitardoPagResiduo;
    }


    /**
     * Sets the impCompRitardoPagResiduo value for this ListaDocumenti.
     * 
     * @param impCompRitardoPagResiduo   * Importo Compenso per Ritardato Pagamento Residuo
     */
    public void setImpCompRitardoPagResiduo(java.math.BigDecimal impCompRitardoPagResiduo) {
        this.impCompRitardoPagResiduo = impCompRitardoPagResiduo;
    }


    /**
     * Gets the pagamentoAbilitato value for this ListaDocumenti.
     * 
     * @return pagamentoAbilitato   * Importo Compenso per Ritardato Pagamento Residuo
     */
    public java.lang.String getPagamentoAbilitato() {
        return pagamentoAbilitato;
    }


    /**
     * Sets the pagamentoAbilitato value for this ListaDocumenti.
     * 
     * @param pagamentoAbilitato   * Importo Compenso per Ritardato Pagamento Residuo
     */
    public void setPagamentoAbilitato(java.lang.String pagamentoAbilitato) {
        this.pagamentoAbilitato = pagamentoAbilitato;
    }


    /**
     * Gets the tipoBollettino value for this ListaDocumenti.
     * 
     * @return tipoBollettino   * Importo Compenso per Ritardato Pagamento Residuo
     */
    public java.lang.String getTipoBollettino() {
        return tipoBollettino;
    }


    /**
     * Sets the tipoBollettino value for this ListaDocumenti.
     * 
     * @param tipoBollettino   * Importo Compenso per Ritardato Pagamento Residuo
     */
    public void setTipoBollettino(java.lang.String tipoBollettino) {
        this.tipoBollettino = tipoBollettino;
    }


    /**
     * Gets the flagEvidenza value for this ListaDocumenti.
     * 
     * @return flagEvidenza   * Flag Evidenza
     */
    public java.lang.String getFlagEvidenza() {
        return flagEvidenza;
    }


    /**
     * Sets the flagEvidenza value for this ListaDocumenti.
     * 
     * @param flagEvidenza   * Flag Evidenza
     */
    public void setFlagEvidenza(java.lang.String flagEvidenza) {
        this.flagEvidenza = flagEvidenza;
    }


    /**
     * Gets the flagEccedenza value for this ListaDocumenti.
     * 
     * @return flagEccedenza   * Flag Eccedenza
     */
    public java.lang.String getFlagEccedenza() {
        return flagEccedenza;
    }


    /**
     * Sets the flagEccedenza value for this ListaDocumenti.
     * 
     * @param flagEccedenza   * Flag Eccedenza
     */
    public void setFlagEccedenza(java.lang.String flagEccedenza) {
        this.flagEccedenza = flagEccedenza;
    }


    /**
     * Gets the scadenzaPrimaRata value for this ListaDocumenti.
     * 
     * @return scadenzaPrimaRata   * Scadenza prima rata
     */
    public java.lang.String getScadenzaPrimaRata() {
        return scadenzaPrimaRata;
    }


    /**
     * Sets the scadenzaPrimaRata value for this ListaDocumenti.
     * 
     * @param scadenzaPrimaRata   * Scadenza prima rata
     */
    public void setScadenzaPrimaRata(java.lang.String scadenzaPrimaRata) {
        this.scadenzaPrimaRata = scadenzaPrimaRata;
    }


    /**
     * Gets the flagMaggiorRateazione value for this ListaDocumenti.
     * 
     * @return flagMaggiorRateazione   * flag maggior rateazione
     */
    public java.lang.String getFlagMaggiorRateazione() {
        return flagMaggiorRateazione;
    }


    /**
     * Sets the flagMaggiorRateazione value for this ListaDocumenti.
     * 
     * @param flagMaggiorRateazione   * flag maggior rateazione
     */
    public void setFlagMaggiorRateazione(java.lang.String flagMaggiorRateazione) {
        this.flagMaggiorRateazione = flagMaggiorRateazione;
    }


    /**
     * Gets the attiContenzioso value for this ListaDocumenti.
     * 
     * @return attiContenzioso   * presenza atti contenzioso
     */
    public java.lang.String getAttiContenzioso() {
        return attiContenzioso;
    }


    /**
     * Sets the attiContenzioso value for this ListaDocumenti.
     * 
     * @param attiContenzioso   * presenza atti contenzioso
     */
    public void setAttiContenzioso(java.lang.String attiContenzioso) {
        this.attiContenzioso = attiContenzioso;
    }


    /**
     * Gets the progressivoCoobbligato value for this ListaDocumenti.
     * 
     * @return progressivoCoobbligato   * progressivo coobbligato
     */
    public java.math.BigDecimal getProgressivoCoobbligato() {
        return progressivoCoobbligato;
    }


    /**
     * Sets the progressivoCoobbligato value for this ListaDocumenti.
     * 
     * @param progressivoCoobbligato   * progressivo coobbligato
     */
    public void setProgressivoCoobbligato(java.math.BigDecimal progressivoCoobbligato) {
        this.progressivoCoobbligato = progressivoCoobbligato;
    }


    /**
     * Gets the codiceFiscaleDebitorePrincipale value for this ListaDocumenti.
     * 
     * @return codiceFiscaleDebitorePrincipale   * codice fiscale debitore principale
     */
    public java.lang.String getCodiceFiscaleDebitorePrincipale() {
        return codiceFiscaleDebitorePrincipale;
    }


    /**
     * Sets the codiceFiscaleDebitorePrincipale value for this ListaDocumenti.
     * 
     * @param codiceFiscaleDebitorePrincipale   * codice fiscale debitore principale
     */
    public void setCodiceFiscaleDebitorePrincipale(java.lang.String codiceFiscaleDebitorePrincipale) {
        this.codiceFiscaleDebitorePrincipale = codiceFiscaleDebitorePrincipale;
    }


    /**
     * Gets the denominazioneDebitorePrincipale value for this ListaDocumenti.
     * 
     * @return denominazioneDebitorePrincipale   * denominazione debitore principale
     */
    public java.lang.String getDenominazioneDebitorePrincipale() {
        return denominazioneDebitorePrincipale;
    }


    /**
     * Sets the denominazioneDebitorePrincipale value for this ListaDocumenti.
     * 
     * @param denominazioneDebitorePrincipale   * denominazione debitore principale
     */
    public void setDenominazioneDebitorePrincipale(java.lang.String denominazioneDebitorePrincipale) {
        this.denominazioneDebitorePrincipale = denominazioneDebitorePrincipale;
    }


    /**
     * Gets the codiceIban value for this ListaDocumenti.
     * 
     * @return codiceIban   * codice iban
     */
    public java.lang.String getCodiceIban() {
        return codiceIban;
    }


    /**
     * Sets the codiceIban value for this ListaDocumenti.
     * 
     * @param codiceIban   * codice iban
     */
    public void setCodiceIban(java.lang.String codiceIban) {
        this.codiceIban = codiceIban;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaDocumenti)) return false;
        ListaDocumenti other = (ListaDocumenti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annoEmissione==null && other.getAnnoEmissione()==null) || 
             (this.annoEmissione!=null &&
              this.annoEmissione.equals(other.getAnnoEmissione()))) &&
            ((this.numeroEmissione==null && other.getNumeroEmissione()==null) || 
             (this.numeroEmissione!=null &&
              this.numeroEmissione.equals(other.getNumeroEmissione()))) &&
            ((this.identificativoDocumento==null && other.getIdentificativoDocumento()==null) || 
             (this.identificativoDocumento!=null &&
              this.identificativoDocumento.equals(other.getIdentificativoDocumento()))) &&
            ((this.identificativoCartella==null && other.getIdentificativoCartella()==null) || 
             (this.identificativoCartella!=null &&
              this.identificativoCartella.equals(other.getIdentificativoCartella()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.descTipologiaServizio==null && other.getDescTipologiaServizio()==null) || 
             (this.descTipologiaServizio!=null &&
              this.descTipologiaServizio.equals(other.getDescTipologiaServizio()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.statoDocumento==null && other.getStatoDocumento()==null) || 
             (this.statoDocumento!=null &&
              this.statoDocumento.equals(other.getStatoDocumento()))) &&
            ((this.documentoCollegato==null && other.getDocumentoCollegato()==null) || 
             (this.documentoCollegato!=null &&
              this.documentoCollegato.equals(other.getDocumentoCollegato()))) &&
            ((this.tipoDocumentoCollegato==null && other.getTipoDocumentoCollegato()==null) || 
             (this.tipoDocumentoCollegato!=null &&
              this.tipoDocumentoCollegato.equals(other.getTipoDocumentoCollegato()))) &&
            ((this.numeroBollettino==null && other.getNumeroBollettino()==null) || 
             (this.numeroBollettino!=null &&
              this.numeroBollettino.equals(other.getNumeroBollettino()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.impostaServizio==null && other.getImpostaServizio()==null) || 
             (this.impostaServizio!=null &&
              this.impostaServizio.equals(other.getImpostaServizio()))) &&
            ((this.descImpostaServizio==null && other.getDescImpostaServizio()==null) || 
             (this.descImpostaServizio!=null &&
              this.descImpostaServizio.equals(other.getDescImpostaServizio()))) &&
            ((this.descEnte==null && other.getDescEnte()==null) || 
             (this.descEnte!=null &&
              this.descEnte.equals(other.getDescEnte()))) &&
            ((this.dataNotifica==null && other.getDataNotifica()==null) || 
             (this.dataNotifica!=null &&
              this.dataNotifica.equals(other.getDataNotifica()))) &&
            ((this.impInizialeDocumento==null && other.getImpInizialeDocumento()==null) || 
             (this.impInizialeDocumento!=null &&
              this.impInizialeDocumento.equals(other.getImpInizialeDocumento()))) &&
            ((this.impPagatoDocumento==null && other.getImpPagatoDocumento()==null) || 
             (this.impPagatoDocumento!=null &&
              this.impPagatoDocumento.equals(other.getImpPagatoDocumento()))) &&
            ((this.impResiduoDocumento==null && other.getImpResiduoDocumento()==null) || 
             (this.impResiduoDocumento!=null &&
              this.impResiduoDocumento.equals(other.getImpResiduoDocumento()))) &&
            ((this.pagamentoAcquisizione==null && other.getPagamentoAcquisizione()==null) || 
             (this.pagamentoAcquisizione!=null &&
              this.pagamentoAcquisizione.equals(other.getPagamentoAcquisizione()))) &&
            ((this.codiceBollettinoFreccia==null && other.getCodiceBollettinoFreccia()==null) || 
             (this.codiceBollettinoFreccia!=null &&
              this.codiceBollettinoFreccia.equals(other.getCodiceBollettinoFreccia()))) &&
            ((this.impCompRitardoPagIniziale==null && other.getImpCompRitardoPagIniziale()==null) || 
             (this.impCompRitardoPagIniziale!=null &&
              this.impCompRitardoPagIniziale.equals(other.getImpCompRitardoPagIniziale()))) &&
            ((this.impCompRitardoPagPagato==null && other.getImpCompRitardoPagPagato()==null) || 
             (this.impCompRitardoPagPagato!=null &&
              this.impCompRitardoPagPagato.equals(other.getImpCompRitardoPagPagato()))) &&
            ((this.impCompRitardoPagResiduo==null && other.getImpCompRitardoPagResiduo()==null) || 
             (this.impCompRitardoPagResiduo!=null &&
              this.impCompRitardoPagResiduo.equals(other.getImpCompRitardoPagResiduo()))) &&
            ((this.pagamentoAbilitato==null && other.getPagamentoAbilitato()==null) || 
             (this.pagamentoAbilitato!=null &&
              this.pagamentoAbilitato.equals(other.getPagamentoAbilitato()))) &&
            ((this.tipoBollettino==null && other.getTipoBollettino()==null) || 
             (this.tipoBollettino!=null &&
              this.tipoBollettino.equals(other.getTipoBollettino()))) &&
            ((this.flagEvidenza==null && other.getFlagEvidenza()==null) || 
             (this.flagEvidenza!=null &&
              this.flagEvidenza.equals(other.getFlagEvidenza()))) &&
            ((this.flagEccedenza==null && other.getFlagEccedenza()==null) || 
             (this.flagEccedenza!=null &&
              this.flagEccedenza.equals(other.getFlagEccedenza()))) &&
            ((this.scadenzaPrimaRata==null && other.getScadenzaPrimaRata()==null) || 
             (this.scadenzaPrimaRata!=null &&
              this.scadenzaPrimaRata.equals(other.getScadenzaPrimaRata()))) &&
            ((this.flagMaggiorRateazione==null && other.getFlagMaggiorRateazione()==null) || 
             (this.flagMaggiorRateazione!=null &&
              this.flagMaggiorRateazione.equals(other.getFlagMaggiorRateazione()))) &&
            ((this.attiContenzioso==null && other.getAttiContenzioso()==null) || 
             (this.attiContenzioso!=null &&
              this.attiContenzioso.equals(other.getAttiContenzioso()))) &&
            ((this.progressivoCoobbligato==null && other.getProgressivoCoobbligato()==null) || 
             (this.progressivoCoobbligato!=null &&
              this.progressivoCoobbligato.equals(other.getProgressivoCoobbligato()))) &&
            ((this.codiceFiscaleDebitorePrincipale==null && other.getCodiceFiscaleDebitorePrincipale()==null) || 
             (this.codiceFiscaleDebitorePrincipale!=null &&
              this.codiceFiscaleDebitorePrincipale.equals(other.getCodiceFiscaleDebitorePrincipale()))) &&
            ((this.denominazioneDebitorePrincipale==null && other.getDenominazioneDebitorePrincipale()==null) || 
             (this.denominazioneDebitorePrincipale!=null &&
              this.denominazioneDebitorePrincipale.equals(other.getDenominazioneDebitorePrincipale()))) &&
            ((this.codiceIban==null && other.getCodiceIban()==null) || 
             (this.codiceIban!=null &&
              this.codiceIban.equals(other.getCodiceIban())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAnnoEmissione() != null) {
            _hashCode += getAnnoEmissione().hashCode();
        }
        if (getNumeroEmissione() != null) {
            _hashCode += getNumeroEmissione().hashCode();
        }
        if (getIdentificativoDocumento() != null) {
            _hashCode += getIdentificativoDocumento().hashCode();
        }
        if (getIdentificativoCartella() != null) {
            _hashCode += getIdentificativoCartella().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        if (getDescTipologiaServizio() != null) {
            _hashCode += getDescTipologiaServizio().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getStatoDocumento() != null) {
            _hashCode += getStatoDocumento().hashCode();
        }
        if (getDocumentoCollegato() != null) {
            _hashCode += getDocumentoCollegato().hashCode();
        }
        if (getTipoDocumentoCollegato() != null) {
            _hashCode += getTipoDocumentoCollegato().hashCode();
        }
        if (getNumeroBollettino() != null) {
            _hashCode += getNumeroBollettino().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getImpostaServizio() != null) {
            _hashCode += getImpostaServizio().hashCode();
        }
        if (getDescImpostaServizio() != null) {
            _hashCode += getDescImpostaServizio().hashCode();
        }
        if (getDescEnte() != null) {
            _hashCode += getDescEnte().hashCode();
        }
        if (getDataNotifica() != null) {
            _hashCode += getDataNotifica().hashCode();
        }
        if (getImpInizialeDocumento() != null) {
            _hashCode += getImpInizialeDocumento().hashCode();
        }
        if (getImpPagatoDocumento() != null) {
            _hashCode += getImpPagatoDocumento().hashCode();
        }
        if (getImpResiduoDocumento() != null) {
            _hashCode += getImpResiduoDocumento().hashCode();
        }
        if (getPagamentoAcquisizione() != null) {
            _hashCode += getPagamentoAcquisizione().hashCode();
        }
        if (getCodiceBollettinoFreccia() != null) {
            _hashCode += getCodiceBollettinoFreccia().hashCode();
        }
        if (getImpCompRitardoPagIniziale() != null) {
            _hashCode += getImpCompRitardoPagIniziale().hashCode();
        }
        if (getImpCompRitardoPagPagato() != null) {
            _hashCode += getImpCompRitardoPagPagato().hashCode();
        }
        if (getImpCompRitardoPagResiduo() != null) {
            _hashCode += getImpCompRitardoPagResiduo().hashCode();
        }
        if (getPagamentoAbilitato() != null) {
            _hashCode += getPagamentoAbilitato().hashCode();
        }
        if (getTipoBollettino() != null) {
            _hashCode += getTipoBollettino().hashCode();
        }
        if (getFlagEvidenza() != null) {
            _hashCode += getFlagEvidenza().hashCode();
        }
        if (getFlagEccedenza() != null) {
            _hashCode += getFlagEccedenza().hashCode();
        }
        if (getScadenzaPrimaRata() != null) {
            _hashCode += getScadenzaPrimaRata().hashCode();
        }
        if (getFlagMaggiorRateazione() != null) {
            _hashCode += getFlagMaggiorRateazione().hashCode();
        }
        if (getAttiContenzioso() != null) {
            _hashCode += getAttiContenzioso().hashCode();
        }
        if (getProgressivoCoobbligato() != null) {
            _hashCode += getProgressivoCoobbligato().hashCode();
        }
        if (getCodiceFiscaleDebitorePrincipale() != null) {
            _hashCode += getCodiceFiscaleDebitorePrincipale().hashCode();
        }
        if (getDenominazioneDebitorePrincipale() != null) {
            _hashCode += getDenominazioneDebitorePrincipale().hashCode();
        }
        if (getCodiceIban() != null) {
            _hashCode += getCodiceIban().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaDocumenti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaDocumenti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoEmissione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoEmissione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEmissione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroEmissione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoCartella");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoCartella"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descTipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "descTipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "statoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoCollegato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "documentoCollegato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumentoCollegato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoDocumentoCollegato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descImpostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "descImpostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "descEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNotifica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataNotifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impInizialeDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impInizialeDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impPagatoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impPagatoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impResiduoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impResiduoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagamentoAcquisizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "pagamentoAcquisizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBollettinoFreccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceBollettinoFreccia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impCompRitardoPagIniziale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impCompRitardoPagIniziale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impCompRitardoPagPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impCompRitardoPagPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impCompRitardoPagResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impCompRitardoPagResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagamentoAbilitato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "pagamentoAbilitato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagEvidenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagEvidenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagEccedenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagEccedenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scadenzaPrimaRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "scadenzaPrimaRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagMaggiorRateazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagMaggiorRateazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attiContenzioso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "attiContenzioso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoCoobbligato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "progressivoCoobbligato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscaleDebitorePrincipale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscaleDebitorePrincipale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazioneDebitorePrincipale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "denominazioneDebitorePrincipale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIban");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceIban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
