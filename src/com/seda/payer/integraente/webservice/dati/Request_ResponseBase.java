/**
 * Request_ResponseBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class Request_ResponseBase  implements java.io.Serializable {
    /* codice utente */
    private java.lang.String codiceUtente;

    /* codice ente */
    private java.lang.String codiceEnte;

    /* tipo ufficio */
    private java.lang.String tipoUfficio;

    /* codice ufficio */
    private java.lang.String codiceUfficio;

    /* codice fiscale */
    private java.lang.String codiceFiscale;

    /* tipo servizio EP = entrate */
    private java.lang.String tipoServizio;

    /* tipo richiesta I=Insoluti e S=Storico */
    private java.lang.String tipoRichiesta;

    /* documento optional */
    private java.lang.String documento;

    /* documento optional */
    private java.lang.String annoEmissione;

    /* tipo integrazione I=Immediata e D = Differita */
    private java.lang.String tipoIntegrazione;

    /* Id Documento */
    private java.lang.String idDocumento;

    /* Numero Bollettino */
    private java.math.BigDecimal numeroBollettino;

    /* Numero Raccomandata */
    private java.lang.String numeroRaccomandata;

    /* Numero Cronologico */
    private java.lang.String numeroCronologico;

    /* Id BarCode */
    private java.lang.String idBarCode;

    /* Id Procedura */
    private java.lang.String idProcedura;

    /* Progressivo Coobbligato */
    private java.math.BigDecimal progCoobbligato;

    /* diverso da 00 errore */
    private java.lang.String esitoRichiesta;

    /* messaggio dell'esito dell'operazione */
    private java.lang.String messaggioEsito;

    /* tipologia servizio optional */
    private java.lang.String tipologiaServizio;

    public Request_ResponseBase() {
    }

    public Request_ResponseBase(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String codiceFiscale,
           java.lang.String tipoServizio,
           java.lang.String tipoRichiesta,
           java.lang.String documento,
           java.lang.String annoEmissione,
           java.lang.String tipoIntegrazione,
           java.lang.String idDocumento,
           java.math.BigDecimal numeroBollettino,
           java.lang.String numeroRaccomandata,
           java.lang.String numeroCronologico,
           java.lang.String idBarCode,
           java.lang.String idProcedura,
           java.math.BigDecimal progCoobbligato,
           java.lang.String esitoRichiesta,
           java.lang.String messaggioEsito,
           java.lang.String tipologiaServizio) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
           this.codiceFiscale = codiceFiscale;
           this.tipoServizio = tipoServizio;
           this.tipoRichiesta = tipoRichiesta;
           this.documento = documento;
           this.annoEmissione = annoEmissione;
           this.tipoIntegrazione = tipoIntegrazione;
           this.idDocumento = idDocumento;
           this.numeroBollettino = numeroBollettino;
           this.numeroRaccomandata = numeroRaccomandata;
           this.numeroCronologico = numeroCronologico;
           this.idBarCode = idBarCode;
           this.idProcedura = idProcedura;
           this.progCoobbligato = progCoobbligato;
           this.esitoRichiesta = esitoRichiesta;
           this.messaggioEsito = messaggioEsito;
           this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the codiceUtente value for this Request_ResponseBase.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this Request_ResponseBase.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this Request_ResponseBase.
     * 
     * @return codiceEnte   * codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this Request_ResponseBase.
     * 
     * @param codiceEnte   * codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this Request_ResponseBase.
     * 
     * @return tipoUfficio   * tipo ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this Request_ResponseBase.
     * 
     * @param tipoUfficio   * tipo ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this Request_ResponseBase.
     * 
     * @return codiceUfficio   * codice ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this Request_ResponseBase.
     * 
     * @param codiceUfficio   * codice ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the codiceFiscale value for this Request_ResponseBase.
     * 
     * @return codiceFiscale   * codice fiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this Request_ResponseBase.
     * 
     * @param codiceFiscale   * codice fiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoServizio value for this Request_ResponseBase.
     * 
     * @return tipoServizio   * tipo servizio EP = entrate
     */
    public java.lang.String getTipoServizio() {
        return tipoServizio;
    }


    /**
     * Sets the tipoServizio value for this Request_ResponseBase.
     * 
     * @param tipoServizio   * tipo servizio EP = entrate
     */
    public void setTipoServizio(java.lang.String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }


    /**
     * Gets the tipoRichiesta value for this Request_ResponseBase.
     * 
     * @return tipoRichiesta   * tipo richiesta I=Insoluti e S=Storico
     */
    public java.lang.String getTipoRichiesta() {
        return tipoRichiesta;
    }


    /**
     * Sets the tipoRichiesta value for this Request_ResponseBase.
     * 
     * @param tipoRichiesta   * tipo richiesta I=Insoluti e S=Storico
     */
    public void setTipoRichiesta(java.lang.String tipoRichiesta) {
        this.tipoRichiesta = tipoRichiesta;
    }


    /**
     * Gets the documento value for this Request_ResponseBase.
     * 
     * @return documento   * documento optional
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this Request_ResponseBase.
     * 
     * @param documento   * documento optional
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the annoEmissione value for this Request_ResponseBase.
     * 
     * @return annoEmissione   * documento optional
     */
    public java.lang.String getAnnoEmissione() {
        return annoEmissione;
    }


    /**
     * Sets the annoEmissione value for this Request_ResponseBase.
     * 
     * @param annoEmissione   * documento optional
     */
    public void setAnnoEmissione(java.lang.String annoEmissione) {
        this.annoEmissione = annoEmissione;
    }


    /**
     * Gets the tipoIntegrazione value for this Request_ResponseBase.
     * 
     * @return tipoIntegrazione   * tipo integrazione I=Immediata e D = Differita
     */
    public java.lang.String getTipoIntegrazione() {
        return tipoIntegrazione;
    }


    /**
     * Sets the tipoIntegrazione value for this Request_ResponseBase.
     * 
     * @param tipoIntegrazione   * tipo integrazione I=Immediata e D = Differita
     */
    public void setTipoIntegrazione(java.lang.String tipoIntegrazione) {
        this.tipoIntegrazione = tipoIntegrazione;
    }


    /**
     * Gets the idDocumento value for this Request_ResponseBase.
     * 
     * @return idDocumento   * Id Documento
     */
    public java.lang.String getIdDocumento() {
        return idDocumento;
    }


    /**
     * Sets the idDocumento value for this Request_ResponseBase.
     * 
     * @param idDocumento   * Id Documento
     */
    public void setIdDocumento(java.lang.String idDocumento) {
        this.idDocumento = idDocumento;
    }


    /**
     * Gets the numeroBollettino value for this Request_ResponseBase.
     * 
     * @return numeroBollettino   * Numero Bollettino
     */
    public java.math.BigDecimal getNumeroBollettino() {
        return numeroBollettino;
    }


    /**
     * Sets the numeroBollettino value for this Request_ResponseBase.
     * 
     * @param numeroBollettino   * Numero Bollettino
     */
    public void setNumeroBollettino(java.math.BigDecimal numeroBollettino) {
        this.numeroBollettino = numeroBollettino;
    }


    /**
     * Gets the numeroRaccomandata value for this Request_ResponseBase.
     * 
     * @return numeroRaccomandata   * Numero Raccomandata
     */
    public java.lang.String getNumeroRaccomandata() {
        return numeroRaccomandata;
    }


    /**
     * Sets the numeroRaccomandata value for this Request_ResponseBase.
     * 
     * @param numeroRaccomandata   * Numero Raccomandata
     */
    public void setNumeroRaccomandata(java.lang.String numeroRaccomandata) {
        this.numeroRaccomandata = numeroRaccomandata;
    }


    /**
     * Gets the numeroCronologico value for this Request_ResponseBase.
     * 
     * @return numeroCronologico   * Numero Cronologico
     */
    public java.lang.String getNumeroCronologico() {
        return numeroCronologico;
    }


    /**
     * Sets the numeroCronologico value for this Request_ResponseBase.
     * 
     * @param numeroCronologico   * Numero Cronologico
     */
    public void setNumeroCronologico(java.lang.String numeroCronologico) {
        this.numeroCronologico = numeroCronologico;
    }


    /**
     * Gets the idBarCode value for this Request_ResponseBase.
     * 
     * @return idBarCode   * Id BarCode
     */
    public java.lang.String getIdBarCode() {
        return idBarCode;
    }


    /**
     * Sets the idBarCode value for this Request_ResponseBase.
     * 
     * @param idBarCode   * Id BarCode
     */
    public void setIdBarCode(java.lang.String idBarCode) {
        this.idBarCode = idBarCode;
    }


    /**
     * Gets the idProcedura value for this Request_ResponseBase.
     * 
     * @return idProcedura   * Id Procedura
     */
    public java.lang.String getIdProcedura() {
        return idProcedura;
    }


    /**
     * Sets the idProcedura value for this Request_ResponseBase.
     * 
     * @param idProcedura   * Id Procedura
     */
    public void setIdProcedura(java.lang.String idProcedura) {
        this.idProcedura = idProcedura;
    }


    /**
     * Gets the progCoobbligato value for this Request_ResponseBase.
     * 
     * @return progCoobbligato   * Progressivo Coobbligato
     */
    public java.math.BigDecimal getProgCoobbligato() {
        return progCoobbligato;
    }


    /**
     * Sets the progCoobbligato value for this Request_ResponseBase.
     * 
     * @param progCoobbligato   * Progressivo Coobbligato
     */
    public void setProgCoobbligato(java.math.BigDecimal progCoobbligato) {
        this.progCoobbligato = progCoobbligato;
    }


    /**
     * Gets the esitoRichiesta value for this Request_ResponseBase.
     * 
     * @return esitoRichiesta   * diverso da 00 errore
     */
    public java.lang.String getEsitoRichiesta() {
        return esitoRichiesta;
    }


    /**
     * Sets the esitoRichiesta value for this Request_ResponseBase.
     * 
     * @param esitoRichiesta   * diverso da 00 errore
     */
    public void setEsitoRichiesta(java.lang.String esitoRichiesta) {
        this.esitoRichiesta = esitoRichiesta;
    }


    /**
     * Gets the messaggioEsito value for this Request_ResponseBase.
     * 
     * @return messaggioEsito   * messaggio dell'esito dell'operazione
     */
    public java.lang.String getMessaggioEsito() {
        return messaggioEsito;
    }


    /**
     * Sets the messaggioEsito value for this Request_ResponseBase.
     * 
     * @param messaggioEsito   * messaggio dell'esito dell'operazione
     */
    public void setMessaggioEsito(java.lang.String messaggioEsito) {
        this.messaggioEsito = messaggioEsito;
    }


    /**
     * Gets the tipologiaServizio value for this Request_ResponseBase.
     * 
     * @return tipologiaServizio   * tipologia servizio optional
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this Request_ResponseBase.
     * 
     * @param tipologiaServizio   * tipologia servizio optional
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request_ResponseBase)) return false;
        Request_ResponseBase other = (Request_ResponseBase) obj;
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
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.tipoServizio==null && other.getTipoServizio()==null) || 
             (this.tipoServizio!=null &&
              this.tipoServizio.equals(other.getTipoServizio()))) &&
            ((this.tipoRichiesta==null && other.getTipoRichiesta()==null) || 
             (this.tipoRichiesta!=null &&
              this.tipoRichiesta.equals(other.getTipoRichiesta()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.annoEmissione==null && other.getAnnoEmissione()==null) || 
             (this.annoEmissione!=null &&
              this.annoEmissione.equals(other.getAnnoEmissione()))) &&
            ((this.tipoIntegrazione==null && other.getTipoIntegrazione()==null) || 
             (this.tipoIntegrazione!=null &&
              this.tipoIntegrazione.equals(other.getTipoIntegrazione()))) &&
            ((this.idDocumento==null && other.getIdDocumento()==null) || 
             (this.idDocumento!=null &&
              this.idDocumento.equals(other.getIdDocumento()))) &&
            ((this.numeroBollettino==null && other.getNumeroBollettino()==null) || 
             (this.numeroBollettino!=null &&
              this.numeroBollettino.equals(other.getNumeroBollettino()))) &&
            ((this.numeroRaccomandata==null && other.getNumeroRaccomandata()==null) || 
             (this.numeroRaccomandata!=null &&
              this.numeroRaccomandata.equals(other.getNumeroRaccomandata()))) &&
            ((this.numeroCronologico==null && other.getNumeroCronologico()==null) || 
             (this.numeroCronologico!=null &&
              this.numeroCronologico.equals(other.getNumeroCronologico()))) &&
            ((this.idBarCode==null && other.getIdBarCode()==null) || 
             (this.idBarCode!=null &&
              this.idBarCode.equals(other.getIdBarCode()))) &&
            ((this.idProcedura==null && other.getIdProcedura()==null) || 
             (this.idProcedura!=null &&
              this.idProcedura.equals(other.getIdProcedura()))) &&
            ((this.progCoobbligato==null && other.getProgCoobbligato()==null) || 
             (this.progCoobbligato!=null &&
              this.progCoobbligato.equals(other.getProgCoobbligato()))) &&
            ((this.esitoRichiesta==null && other.getEsitoRichiesta()==null) || 
             (this.esitoRichiesta!=null &&
              this.esitoRichiesta.equals(other.getEsitoRichiesta()))) &&
            ((this.messaggioEsito==null && other.getMessaggioEsito()==null) || 
             (this.messaggioEsito!=null &&
              this.messaggioEsito.equals(other.getMessaggioEsito()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio())));
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
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getTipoServizio() != null) {
            _hashCode += getTipoServizio().hashCode();
        }
        if (getTipoRichiesta() != null) {
            _hashCode += getTipoRichiesta().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getAnnoEmissione() != null) {
            _hashCode += getAnnoEmissione().hashCode();
        }
        if (getTipoIntegrazione() != null) {
            _hashCode += getTipoIntegrazione().hashCode();
        }
        if (getIdDocumento() != null) {
            _hashCode += getIdDocumento().hashCode();
        }
        if (getNumeroBollettino() != null) {
            _hashCode += getNumeroBollettino().hashCode();
        }
        if (getNumeroRaccomandata() != null) {
            _hashCode += getNumeroRaccomandata().hashCode();
        }
        if (getNumeroCronologico() != null) {
            _hashCode += getNumeroCronologico().hashCode();
        }
        if (getIdBarCode() != null) {
            _hashCode += getIdBarCode().hashCode();
        }
        if (getIdProcedura() != null) {
            _hashCode += getIdProcedura().hashCode();
        }
        if (getProgCoobbligato() != null) {
            _hashCode += getProgCoobbligato().hashCode();
        }
        if (getEsitoRichiesta() != null) {
            _hashCode += getEsitoRichiesta().hashCode();
        }
        if (getMessaggioEsito() != null) {
            _hashCode += getMessaggioEsito().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request_ResponseBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "Request_ResponseBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRichiesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoRichiesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoEmissione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoEmissione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIntegrazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoIntegrazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "idDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRaccomandata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroRaccomandata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCronologico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroCronologico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBarCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "idBarCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProcedura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "idProcedura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progCoobbligato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "progCoobbligato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esitoRichiesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "esitoRichiesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messaggioEsito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "messaggioEsito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaServizio"));
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
