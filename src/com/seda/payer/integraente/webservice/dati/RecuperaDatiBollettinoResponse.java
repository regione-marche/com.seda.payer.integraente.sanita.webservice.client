/**
 * RecuperaDatiBollettinoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDatiBollettinoResponse  implements java.io.Serializable {
    /* Codice Utente */
    private java.lang.String codiceUtente;

    /* Codice Ente */
    private java.lang.String codiceEnte;

    /* Tipo Ufficio */
    private java.lang.String tipoUfficio;

    /* Codice Ufficio */
    private java.lang.String codiceUfficio;

    /* Tipologia di Operazione 
     * 						("01" - PAGAMENTO CON BOLLETTINO) */
    private java.lang.String tipologiaOperazione;

    /* Tipologia Servizio da pagare (deve essere proposto il codice
     * rappresentativo:
     * 						ICI --> ICI
     * 						ISC --> ISCOP
     * 						BOL --> BOLLO
     * 						SPO --> SPONTANEO
     * 						PRM --> Premarcato
     * 						MAV --> MAV
     * 						CDS --> CDS
     * 						FRC --> FRECCIA */
    private java.lang.String tipologiaServizio;

    /* Imposta Servizio */
    private java.lang.String impostaServizio;

    /* Identificativo Bollettino */
    private java.lang.String identificativoBollettino;

    /* Importo del Bollettino */
    private long importoBollettino;

    /* Data Interessi/Spese (equivale alla data di richiesta pagamento) */
    private java.lang.String dataInteressi_Spese;

    /* Flag Interessi Mora */
    private java.lang.String flagInteressiMora;

    /* Importo Interessi Mora */
    private long importoInteressiMora;

    /* Flag Altre Spese */
    private java.lang.String flagAltreSpese;

    /* Importo AltreSpese */
    private long importAltreSpese;

    /* Flag Importo Variato */
    private java.lang.String flagImportoVariato;

    /* Data Esito */
    private java.lang.String dataEsito;

    /* Codice Esito */
    private java.lang.String codiceEsito;

    /* Msg Esito */
    private java.lang.String msgEsito;

    /* Parametri generici del mittente del Bollettino */
    private com.seda.payer.integraente.webservice.dati.TipoBollettino anagraficaBollettino;

    /* Identificativo Univoco Versamento */
    private java.lang.String identificativoUnivocoVersamento;

    /* Causale */
    private java.lang.String causale;

    public RecuperaDatiBollettinoResponse() {
    }

    //PG180020 CT -- Costruttore senza causale necessario per retrocombatibilità
    public RecuperaDatiBollettinoResponse(
            java.lang.String codiceUtente,
            java.lang.String codiceEnte,
            java.lang.String tipoUfficio,
            java.lang.String codiceUfficio,
            java.lang.String tipologiaOperazione,
            java.lang.String tipologiaServizio,
            java.lang.String impostaServizio,
            java.lang.String identificativoBollettino,
            long importoBollettino,
            java.lang.String dataInteressi_Spese,
            java.lang.String flagInteressiMora,
            long importoInteressiMora,
            java.lang.String flagAltreSpese,
            long importAltreSpese,
            java.lang.String flagImportoVariato,
            java.lang.String dataEsito,
            java.lang.String codiceEsito,
            java.lang.String msgEsito,
            com.seda.payer.integraente.webservice.dati.TipoBollettino anagraficaBollettino,
            java.lang.String identificativoUnivocoVersamento) {
            this.codiceUtente = codiceUtente;
            this.codiceEnte = codiceEnte;
            this.tipoUfficio = tipoUfficio;
            this.codiceUfficio = codiceUfficio;
            this.tipologiaOperazione = tipologiaOperazione;
            this.tipologiaServizio = tipologiaServizio;
            this.impostaServizio = impostaServizio;
            this.identificativoBollettino = identificativoBollettino;
            this.importoBollettino = importoBollettino;
            this.dataInteressi_Spese = dataInteressi_Spese;
            this.flagInteressiMora = flagInteressiMora;
            this.importoInteressiMora = importoInteressiMora;
            this.flagAltreSpese = flagAltreSpese;
            this.importAltreSpese = importAltreSpese;
            this.flagImportoVariato = flagImportoVariato;
            this.dataEsito = dataEsito;
            this.codiceEsito = codiceEsito;
            this.msgEsito = msgEsito;
            this.anagraficaBollettino = anagraficaBollettino;
            this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
            this.causale = "";
     }

    public RecuperaDatiBollettinoResponse(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String tipologiaOperazione,
           java.lang.String tipologiaServizio,
           java.lang.String impostaServizio,
           java.lang.String identificativoBollettino,
           long importoBollettino,
           java.lang.String dataInteressi_Spese,
           java.lang.String flagInteressiMora,
           long importoInteressiMora,
           java.lang.String flagAltreSpese,
           long importAltreSpese,
           java.lang.String flagImportoVariato,
           java.lang.String dataEsito,
           java.lang.String codiceEsito,
           java.lang.String msgEsito,
           com.seda.payer.integraente.webservice.dati.TipoBollettino anagraficaBollettino,
           java.lang.String identificativoUnivocoVersamento,
           java.lang.String causale) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
           this.tipologiaOperazione = tipologiaOperazione;
           this.tipologiaServizio = tipologiaServizio;
           this.impostaServizio = impostaServizio;
           this.identificativoBollettino = identificativoBollettino;
           this.importoBollettino = importoBollettino;
           this.dataInteressi_Spese = dataInteressi_Spese;
           this.flagInteressiMora = flagInteressiMora;
           this.importoInteressiMora = importoInteressiMora;
           this.flagAltreSpese = flagAltreSpese;
           this.importAltreSpese = importAltreSpese;
           this.flagImportoVariato = flagImportoVariato;
           this.dataEsito = dataEsito;
           this.codiceEsito = codiceEsito;
           this.msgEsito = msgEsito;
           this.anagraficaBollettino = anagraficaBollettino;
           this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
           this.causale = causale;
    }


    /**
     * Gets the codiceUtente value for this RecuperaDatiBollettinoResponse.
     * 
     * @return codiceUtente   * Codice Utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaDatiBollettinoResponse.
     * 
     * @param codiceUtente   * Codice Utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this RecuperaDatiBollettinoResponse.
     * 
     * @return codiceEnte   * Codice Ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this RecuperaDatiBollettinoResponse.
     * 
     * @param codiceEnte   * Codice Ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this RecuperaDatiBollettinoResponse.
     * 
     * @return tipoUfficio   * Tipo Ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this RecuperaDatiBollettinoResponse.
     * 
     * @param tipoUfficio   * Tipo Ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this RecuperaDatiBollettinoResponse.
     * 
     * @return codiceUfficio   * Codice Ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this RecuperaDatiBollettinoResponse.
     * 
     * @param codiceUfficio   * Codice Ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the tipologiaOperazione value for this RecuperaDatiBollettinoResponse.
     * 
     * @return tipologiaOperazione   * Tipologia di Operazione 
     * 						("01" - PAGAMENTO CON BOLLETTINO)
     */
    public java.lang.String getTipologiaOperazione() {
        return tipologiaOperazione;
    }


    /**
     * Sets the tipologiaOperazione value for this RecuperaDatiBollettinoResponse.
     * 
     * @param tipologiaOperazione   * Tipologia di Operazione 
     * 						("01" - PAGAMENTO CON BOLLETTINO)
     */
    public void setTipologiaOperazione(java.lang.String tipologiaOperazione) {
        this.tipologiaOperazione = tipologiaOperazione;
    }


    /**
     * Gets the tipologiaServizio value for this RecuperaDatiBollettinoResponse.
     * 
     * @return tipologiaServizio   * Tipologia Servizio da pagare (deve essere proposto il codice
     * rappresentativo:
     * 						ICI --> ICI
     * 						ISC --> ISCOP
     * 						BOL --> BOLLO
     * 						SPO --> SPONTANEO
     * 						PRM --> Premarcato
     * 						MAV --> MAV
     * 						CDS --> CDS
     * 						FRC --> FRECCIA
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this RecuperaDatiBollettinoResponse.
     * 
     * @param tipologiaServizio   * Tipologia Servizio da pagare (deve essere proposto il codice
     * rappresentativo:
     * 						ICI --> ICI
     * 						ISC --> ISCOP
     * 						BOL --> BOLLO
     * 						SPO --> SPONTANEO
     * 						PRM --> Premarcato
     * 						MAV --> MAV
     * 						CDS --> CDS
     * 						FRC --> FRECCIA
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the impostaServizio value for this RecuperaDatiBollettinoResponse.
     * 
     * @return impostaServizio   * Imposta Servizio
     */
    public java.lang.String getImpostaServizio() {
        return impostaServizio;
    }


    /**
     * Sets the impostaServizio value for this RecuperaDatiBollettinoResponse.
     * 
     * @param impostaServizio   * Imposta Servizio
     */
    public void setImpostaServizio(java.lang.String impostaServizio) {
        this.impostaServizio = impostaServizio;
    }


    /**
     * Gets the identificativoBollettino value for this RecuperaDatiBollettinoResponse.
     * 
     * @return identificativoBollettino   * Identificativo Bollettino
     */
    public java.lang.String getIdentificativoBollettino() {
        return identificativoBollettino;
    }


    /**
     * Sets the identificativoBollettino value for this RecuperaDatiBollettinoResponse.
     * 
     * @param identificativoBollettino   * Identificativo Bollettino
     */
    public void setIdentificativoBollettino(java.lang.String identificativoBollettino) {
        this.identificativoBollettino = identificativoBollettino;
    }


    /**
     * Gets the importoBollettino value for this RecuperaDatiBollettinoResponse.
     * 
     * @return importoBollettino   * Importo del Bollettino
     */
    public long getImportoBollettino() {
        return importoBollettino;
    }


    /**
     * Sets the importoBollettino value for this RecuperaDatiBollettinoResponse.
     * 
     * @param importoBollettino   * Importo del Bollettino
     */
    public void setImportoBollettino(long importoBollettino) {
        this.importoBollettino = importoBollettino;
    }


    /**
     * Gets the dataInteressi_Spese value for this RecuperaDatiBollettinoResponse.
     * 
     * @return dataInteressi_Spese   * Data Interessi/Spese (equivale alla data di richiesta pagamento)
     */
    public java.lang.String getDataInteressi_Spese() {
        return dataInteressi_Spese;
    }


    /**
     * Sets the dataInteressi_Spese value for this RecuperaDatiBollettinoResponse.
     * 
     * @param dataInteressi_Spese   * Data Interessi/Spese (equivale alla data di richiesta pagamento)
     */
    public void setDataInteressi_Spese(java.lang.String dataInteressi_Spese) {
        this.dataInteressi_Spese = dataInteressi_Spese;
    }


    /**
     * Gets the flagInteressiMora value for this RecuperaDatiBollettinoResponse.
     * 
     * @return flagInteressiMora   * Flag Interessi Mora
     */
    public java.lang.String getFlagInteressiMora() {
        return flagInteressiMora;
    }


    /**
     * Sets the flagInteressiMora value for this RecuperaDatiBollettinoResponse.
     * 
     * @param flagInteressiMora   * Flag Interessi Mora
     */
    public void setFlagInteressiMora(java.lang.String flagInteressiMora) {
        this.flagInteressiMora = flagInteressiMora;
    }


    /**
     * Gets the importoInteressiMora value for this RecuperaDatiBollettinoResponse.
     * 
     * @return importoInteressiMora   * Importo Interessi Mora
     */
    public long getImportoInteressiMora() {
        return importoInteressiMora;
    }


    /**
     * Sets the importoInteressiMora value for this RecuperaDatiBollettinoResponse.
     * 
     * @param importoInteressiMora   * Importo Interessi Mora
     */
    public void setImportoInteressiMora(long importoInteressiMora) {
        this.importoInteressiMora = importoInteressiMora;
    }


    /**
     * Gets the flagAltreSpese value for this RecuperaDatiBollettinoResponse.
     * 
     * @return flagAltreSpese   * Flag Altre Spese
     */
    public java.lang.String getFlagAltreSpese() {
        return flagAltreSpese;
    }


    /**
     * Sets the flagAltreSpese value for this RecuperaDatiBollettinoResponse.
     * 
     * @param flagAltreSpese   * Flag Altre Spese
     */
    public void setFlagAltreSpese(java.lang.String flagAltreSpese) {
        this.flagAltreSpese = flagAltreSpese;
    }


    /**
     * Gets the importAltreSpese value for this RecuperaDatiBollettinoResponse.
     * 
     * @return importAltreSpese   * Importo AltreSpese
     */
    public long getImportAltreSpese() {
        return importAltreSpese;
    }


    /**
     * Sets the importAltreSpese value for this RecuperaDatiBollettinoResponse.
     * 
     * @param importAltreSpese   * Importo AltreSpese
     */
    public void setImportAltreSpese(long importAltreSpese) {
        this.importAltreSpese = importAltreSpese;
    }


    /**
     * Gets the flagImportoVariato value for this RecuperaDatiBollettinoResponse.
     * 
     * @return flagImportoVariato   * Flag Importo Variato
     */
    public java.lang.String getFlagImportoVariato() {
        return flagImportoVariato;
    }


    /**
     * Sets the flagImportoVariato value for this RecuperaDatiBollettinoResponse.
     * 
     * @param flagImportoVariato   * Flag Importo Variato
     */
    public void setFlagImportoVariato(java.lang.String flagImportoVariato) {
        this.flagImportoVariato = flagImportoVariato;
    }


    /**
     * Gets the dataEsito value for this RecuperaDatiBollettinoResponse.
     * 
     * @return dataEsito   * Data Esito
     */
    public java.lang.String getDataEsito() {
        return dataEsito;
    }


    /**
     * Sets the dataEsito value for this RecuperaDatiBollettinoResponse.
     * 
     * @param dataEsito   * Data Esito
     */
    public void setDataEsito(java.lang.String dataEsito) {
        this.dataEsito = dataEsito;
    }


    /**
     * Gets the codiceEsito value for this RecuperaDatiBollettinoResponse.
     * 
     * @return codiceEsito   * Codice Esito
     */
    public java.lang.String getCodiceEsito() {
        return codiceEsito;
    }


    /**
     * Sets the codiceEsito value for this RecuperaDatiBollettinoResponse.
     * 
     * @param codiceEsito   * Codice Esito
     */
    public void setCodiceEsito(java.lang.String codiceEsito) {
        this.codiceEsito = codiceEsito;
    }


    /**
     * Gets the msgEsito value for this RecuperaDatiBollettinoResponse.
     * 
     * @return msgEsito   * Msg Esito
     */
    public java.lang.String getMsgEsito() {
        return msgEsito;
    }


    /**
     * Sets the msgEsito value for this RecuperaDatiBollettinoResponse.
     * 
     * @param msgEsito   * Msg Esito
     */
    public void setMsgEsito(java.lang.String msgEsito) {
        this.msgEsito = msgEsito;
    }


    /**
     * Gets the anagraficaBollettino value for this RecuperaDatiBollettinoResponse.
     * 
     * @return anagraficaBollettino   * Parametri generici del mittente del Bollettino
     */
    public com.seda.payer.integraente.webservice.dati.TipoBollettino getAnagraficaBollettino() {
        return anagraficaBollettino;
    }


    /**
     * Sets the anagraficaBollettino value for this RecuperaDatiBollettinoResponse.
     * 
     * @param anagraficaBollettino   * Parametri generici del mittente del Bollettino
     */
    public void setAnagraficaBollettino(com.seda.payer.integraente.webservice.dati.TipoBollettino anagraficaBollettino) {
        this.anagraficaBollettino = anagraficaBollettino;
    }


    /**
     * Gets the identificativoUnivocoVersamento value for this RecuperaDatiBollettinoResponse.
     * 
     * @return identificativoUnivocoVersamento   * Identificativo Univoco Versamento
     */
    public java.lang.String getIdentificativoUnivocoVersamento() {
        return identificativoUnivocoVersamento;
    }


    /**
     * Sets the identificativoUnivocoVersamento value for this RecuperaDatiBollettinoResponse.
     * 
     * @param identificativoUnivocoVersamento   * Identificativo Univoco Versamento
     */
    public void setIdentificativoUnivocoVersamento(java.lang.String identificativoUnivocoVersamento) {
        this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }


    /**
     * Gets the causale value for this RecuperaDatiBollettinoResponse.
     * 
     * @return causale   * Causale
     */
    public java.lang.String getCausale() {
        return causale;
    }


    /**
     * Sets the causale value for this RecuperaDatiBollettinoResponse.
     * 
     * @param causale   * Causale
     */
    public void setCausale(java.lang.String causale) {
        this.causale = causale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDatiBollettinoResponse)) return false;
        RecuperaDatiBollettinoResponse other = (RecuperaDatiBollettinoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.tipoUfficio==null && other.getTipoUfficio()==null) || 
             (this.tipoUfficio!=null &&
              this.tipoUfficio.equals(other.getTipoUfficio()))) &&
            ((this.codiceUfficio==null && other.getCodiceUfficio()==null) || 
             (this.codiceUfficio!=null &&
              this.codiceUfficio.equals(other.getCodiceUfficio()))) &&
            ((this.tipologiaOperazione==null && other.getTipologiaOperazione()==null) || 
             (this.tipologiaOperazione!=null &&
              this.tipologiaOperazione.equals(other.getTipologiaOperazione()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.impostaServizio==null && other.getImpostaServizio()==null) || 
             (this.impostaServizio!=null &&
              this.impostaServizio.equals(other.getImpostaServizio()))) &&
            ((this.identificativoBollettino==null && other.getIdentificativoBollettino()==null) || 
             (this.identificativoBollettino!=null &&
              this.identificativoBollettino.equals(other.getIdentificativoBollettino()))) &&
            this.importoBollettino == other.getImportoBollettino() &&
            ((this.dataInteressi_Spese==null && other.getDataInteressi_Spese()==null) || 
             (this.dataInteressi_Spese!=null &&
              this.dataInteressi_Spese.equals(other.getDataInteressi_Spese()))) &&
            ((this.flagInteressiMora==null && other.getFlagInteressiMora()==null) || 
             (this.flagInteressiMora!=null &&
              this.flagInteressiMora.equals(other.getFlagInteressiMora()))) &&
            this.importoInteressiMora == other.getImportoInteressiMora() &&
            ((this.flagAltreSpese==null && other.getFlagAltreSpese()==null) || 
             (this.flagAltreSpese!=null &&
              this.flagAltreSpese.equals(other.getFlagAltreSpese()))) &&
            this.importAltreSpese == other.getImportAltreSpese() &&
            ((this.flagImportoVariato==null && other.getFlagImportoVariato()==null) || 
             (this.flagImportoVariato!=null &&
              this.flagImportoVariato.equals(other.getFlagImportoVariato()))) &&
            ((this.dataEsito==null && other.getDataEsito()==null) || 
             (this.dataEsito!=null &&
              this.dataEsito.equals(other.getDataEsito()))) &&
            ((this.codiceEsito==null && other.getCodiceEsito()==null) || 
             (this.codiceEsito!=null &&
              this.codiceEsito.equals(other.getCodiceEsito()))) &&
            ((this.msgEsito==null && other.getMsgEsito()==null) || 
             (this.msgEsito!=null &&
              this.msgEsito.equals(other.getMsgEsito()))) &&
            ((this.anagraficaBollettino==null && other.getAnagraficaBollettino()==null) || 
             (this.anagraficaBollettino!=null &&
              this.anagraficaBollettino.equals(other.getAnagraficaBollettino()))) &&
            ((this.identificativoUnivocoVersamento==null && other.getIdentificativoUnivocoVersamento()==null) || 
             (this.identificativoUnivocoVersamento!=null &&
              this.identificativoUnivocoVersamento.equals(other.getIdentificativoUnivocoVersamento()))) &&
            ((this.causale==null && other.getCausale()==null) || 
             (this.causale!=null &&
              this.causale.equals(other.getCausale())));
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
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getTipoUfficio() != null) {
            _hashCode += getTipoUfficio().hashCode();
        }
        if (getCodiceUfficio() != null) {
            _hashCode += getCodiceUfficio().hashCode();
        }
        if (getTipologiaOperazione() != null) {
            _hashCode += getTipologiaOperazione().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        if (getImpostaServizio() != null) {
            _hashCode += getImpostaServizio().hashCode();
        }
        if (getIdentificativoBollettino() != null) {
            _hashCode += getIdentificativoBollettino().hashCode();
        }
        _hashCode += new Long(getImportoBollettino()).hashCode();
        if (getDataInteressi_Spese() != null) {
            _hashCode += getDataInteressi_Spese().hashCode();
        }
        if (getFlagInteressiMora() != null) {
            _hashCode += getFlagInteressiMora().hashCode();
        }
        _hashCode += new Long(getImportoInteressiMora()).hashCode();
        if (getFlagAltreSpese() != null) {
            _hashCode += getFlagAltreSpese().hashCode();
        }
        _hashCode += new Long(getImportAltreSpese()).hashCode();
        if (getFlagImportoVariato() != null) {
            _hashCode += getFlagImportoVariato().hashCode();
        }
        if (getDataEsito() != null) {
            _hashCode += getDataEsito().hashCode();
        }
        if (getCodiceEsito() != null) {
            _hashCode += getCodiceEsito().hashCode();
        }
        if (getMsgEsito() != null) {
            _hashCode += getMsgEsito().hashCode();
        }
        if (getAnagraficaBollettino() != null) {
            _hashCode += getAnagraficaBollettino().hashCode();
        }
        if (getIdentificativoUnivocoVersamento() != null) {
            _hashCode += getIdentificativoUnivocoVersamento().hashCode();
        }
        if (getCausale() != null) {
            _hashCode += getCausale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDatiBollettinoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDatiBollettinoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaOperazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaOperazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "importoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInteressi_Spese");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataInteressi_Spese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagInteressiMora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagInteressiMora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoInteressiMora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "importoInteressiMora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAltreSpese");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagAltreSpese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importAltreSpese");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ImportAltreSpese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagImportoVariato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagImportoVariato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEsito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataEsito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEsito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceEsito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgEsito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "msgEsito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "anagraficaBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TipoBollettino"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoUnivocoVersamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "causale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
