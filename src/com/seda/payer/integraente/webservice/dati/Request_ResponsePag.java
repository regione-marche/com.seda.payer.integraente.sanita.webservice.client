/**
 * Request_ResponsePag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class Request_ResponsePag  implements java.io.Serializable {
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

    /* data di pagamento da */
    private java.lang.String dataPagamentoDa;

    /* data di pagamento a */
    private java.lang.String dataPagamentoA;

    /* tipo integrazione I=Immediata e D = Differita */
    private java.lang.String tipoIntegrazione;

    /* codice ente di pertinenza */
    private java.lang.String entePertinenza;

    /* diverso da 00 errore */
    private java.lang.String esitoRichiesta;

    /* messaggio dell'esito dell'operazione */
    private java.lang.String messaggioEsito;

    public Request_ResponsePag() {
    }

    public Request_ResponsePag(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String codiceFiscale,
           java.lang.String tipoServizio,
           java.lang.String dataPagamentoDa,
           java.lang.String dataPagamentoA,
           java.lang.String tipoIntegrazione,
           java.lang.String entePertinenza,
           java.lang.String esitoRichiesta,
           java.lang.String messaggioEsito) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
           this.codiceFiscale = codiceFiscale;
           this.tipoServizio = tipoServizio;
           this.dataPagamentoDa = dataPagamentoDa;
           this.dataPagamentoA = dataPagamentoA;
           this.tipoIntegrazione = tipoIntegrazione;
           this.entePertinenza = entePertinenza;
           this.esitoRichiesta = esitoRichiesta;
           this.messaggioEsito = messaggioEsito;
    }


    /**
     * Gets the codiceUtente value for this Request_ResponsePag.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this Request_ResponsePag.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this Request_ResponsePag.
     * 
     * @return codiceEnte   * codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this Request_ResponsePag.
     * 
     * @param codiceEnte   * codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this Request_ResponsePag.
     * 
     * @return tipoUfficio   * tipo ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this Request_ResponsePag.
     * 
     * @param tipoUfficio   * tipo ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this Request_ResponsePag.
     * 
     * @return codiceUfficio   * codice ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this Request_ResponsePag.
     * 
     * @param codiceUfficio   * codice ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the codiceFiscale value for this Request_ResponsePag.
     * 
     * @return codiceFiscale   * codice fiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this Request_ResponsePag.
     * 
     * @param codiceFiscale   * codice fiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoServizio value for this Request_ResponsePag.
     * 
     * @return tipoServizio   * tipo servizio EP = entrate
     */
    public java.lang.String getTipoServizio() {
        return tipoServizio;
    }


    /**
     * Sets the tipoServizio value for this Request_ResponsePag.
     * 
     * @param tipoServizio   * tipo servizio EP = entrate
     */
    public void setTipoServizio(java.lang.String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }


    /**
     * Gets the dataPagamentoDa value for this Request_ResponsePag.
     * 
     * @return dataPagamentoDa   * data di pagamento da
     */
    public java.lang.String getDataPagamentoDa() {
        return dataPagamentoDa;
    }


    /**
     * Sets the dataPagamentoDa value for this Request_ResponsePag.
     * 
     * @param dataPagamentoDa   * data di pagamento da
     */
    public void setDataPagamentoDa(java.lang.String dataPagamentoDa) {
        this.dataPagamentoDa = dataPagamentoDa;
    }


    /**
     * Gets the dataPagamentoA value for this Request_ResponsePag.
     * 
     * @return dataPagamentoA   * data di pagamento a
     */
    public java.lang.String getDataPagamentoA() {
        return dataPagamentoA;
    }


    /**
     * Sets the dataPagamentoA value for this Request_ResponsePag.
     * 
     * @param dataPagamentoA   * data di pagamento a
     */
    public void setDataPagamentoA(java.lang.String dataPagamentoA) {
        this.dataPagamentoA = dataPagamentoA;
    }


    /**
     * Gets the tipoIntegrazione value for this Request_ResponsePag.
     * 
     * @return tipoIntegrazione   * tipo integrazione I=Immediata e D = Differita
     */
    public java.lang.String getTipoIntegrazione() {
        return tipoIntegrazione;
    }


    /**
     * Sets the tipoIntegrazione value for this Request_ResponsePag.
     * 
     * @param tipoIntegrazione   * tipo integrazione I=Immediata e D = Differita
     */
    public void setTipoIntegrazione(java.lang.String tipoIntegrazione) {
        this.tipoIntegrazione = tipoIntegrazione;
    }


    /**
     * Gets the entePertinenza value for this Request_ResponsePag.
     * 
     * @return entePertinenza   * codice ente di pertinenza
     */
    public java.lang.String getEntePertinenza() {
        return entePertinenza;
    }


    /**
     * Sets the entePertinenza value for this Request_ResponsePag.
     * 
     * @param entePertinenza   * codice ente di pertinenza
     */
    public void setEntePertinenza(java.lang.String entePertinenza) {
        this.entePertinenza = entePertinenza;
    }


    /**
     * Gets the esitoRichiesta value for this Request_ResponsePag.
     * 
     * @return esitoRichiesta   * diverso da 00 errore
     */
    public java.lang.String getEsitoRichiesta() {
        return esitoRichiesta;
    }


    /**
     * Sets the esitoRichiesta value for this Request_ResponsePag.
     * 
     * @param esitoRichiesta   * diverso da 00 errore
     */
    public void setEsitoRichiesta(java.lang.String esitoRichiesta) {
        this.esitoRichiesta = esitoRichiesta;
    }


    /**
     * Gets the messaggioEsito value for this Request_ResponsePag.
     * 
     * @return messaggioEsito   * messaggio dell'esito dell'operazione
     */
    public java.lang.String getMessaggioEsito() {
        return messaggioEsito;
    }


    /**
     * Sets the messaggioEsito value for this Request_ResponsePag.
     * 
     * @param messaggioEsito   * messaggio dell'esito dell'operazione
     */
    public void setMessaggioEsito(java.lang.String messaggioEsito) {
        this.messaggioEsito = messaggioEsito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request_ResponsePag)) return false;
        Request_ResponsePag other = (Request_ResponsePag) obj;
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
            ((this.dataPagamentoDa==null && other.getDataPagamentoDa()==null) || 
             (this.dataPagamentoDa!=null &&
              this.dataPagamentoDa.equals(other.getDataPagamentoDa()))) &&
            ((this.dataPagamentoA==null && other.getDataPagamentoA()==null) || 
             (this.dataPagamentoA!=null &&
              this.dataPagamentoA.equals(other.getDataPagamentoA()))) &&
            ((this.tipoIntegrazione==null && other.getTipoIntegrazione()==null) || 
             (this.tipoIntegrazione!=null &&
              this.tipoIntegrazione.equals(other.getTipoIntegrazione()))) &&
            ((this.entePertinenza==null && other.getEntePertinenza()==null) || 
             (this.entePertinenza!=null &&
              this.entePertinenza.equals(other.getEntePertinenza()))) &&
            ((this.esitoRichiesta==null && other.getEsitoRichiesta()==null) || 
             (this.esitoRichiesta!=null &&
              this.esitoRichiesta.equals(other.getEsitoRichiesta()))) &&
            ((this.messaggioEsito==null && other.getMessaggioEsito()==null) || 
             (this.messaggioEsito!=null &&
              this.messaggioEsito.equals(other.getMessaggioEsito())));
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
        if (getDataPagamentoDa() != null) {
            _hashCode += getDataPagamentoDa().hashCode();
        }
        if (getDataPagamentoA() != null) {
            _hashCode += getDataPagamentoA().hashCode();
        }
        if (getTipoIntegrazione() != null) {
            _hashCode += getTipoIntegrazione().hashCode();
        }
        if (getEntePertinenza() != null) {
            _hashCode += getEntePertinenza().hashCode();
        }
        if (getEsitoRichiesta() != null) {
            _hashCode += getEsitoRichiesta().hashCode();
        }
        if (getMessaggioEsito() != null) {
            _hashCode += getMessaggioEsito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request_ResponsePag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "Request_ResponsePag"));
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
        elemField.setFieldName("dataPagamentoDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataPagamentoDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamentoA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataPagamentoA"));
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
        elemField.setFieldName("entePertinenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "entePertinenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
