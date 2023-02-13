/**
 * NotificaPagamentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class NotificaPagamentoRequest  implements java.io.Serializable {
    /* Codice Transazione Pagonet, indica il codice transazione presente
     * sull'applicazione Pagonet */
    private java.lang.String codiceTransazionePagonet;

    /* Codice Dettaglio Transazione Pagonet, indica il codice del
     * dettaglio della transazione presente sull'applicazione Pagonet */
    private java.lang.String codiceDettaglioTransazionePagonet;

    /* Codice Ente, indica il codice Ente censito su Pagonet */
    private java.lang.String codiceEnte;

    /* Codice Fiscale, indica il codice fiscale associato al bollettino
     * pagato */
    private java.lang.String codiceFiscale;

    /* Numero Documento, indica il numero documento associato al bollettino
     * pagato */
    private java.lang.String numeroDocumento;

    /* Numero Avviso PagoPA, indica il bollettino pagato. Nel database
     * della Sanit� corrisponde al campo IUV */
    private java.lang.String numeroAvvisoPagoPA;

    private com.seda.payer.integraente.webservice.dati.PagamentoSpontaneo pagamentoSpontaneo;

    /* Importo Pagato, in centesimi di Euro */
    private long importoPagato;

    /* Data Pagamento, data in cui � stato effettuato
     * 						il pagamento, in formato YYYYMMDDHHMMSS */
    private java.lang.String dataPagamento;

    /* Rt XML, XML della ricevuta telematica nel caso
     * in cui il pagamento sia stato effettuato con il
     * Nodo Nazionale dei Pagamenti PagoPA */
    private java.lang.String rtXML;

    public NotificaPagamentoRequest() {
    }

    public NotificaPagamentoRequest(
           java.lang.String codiceTransazionePagonet,
           java.lang.String codiceDettaglioTransazionePagonet,
           java.lang.String codiceEnte,
           java.lang.String codiceFiscale,
           java.lang.String numeroDocumento,
           java.lang.String numeroAvvisoPagoPA,
           com.seda.payer.integraente.webservice.dati.PagamentoSpontaneo pagamentoSpontaneo,
           long importoPagato,
           java.lang.String dataPagamento,
           java.lang.String rtXML) {
           this.codiceTransazionePagonet = codiceTransazionePagonet;
           this.codiceDettaglioTransazionePagonet = codiceDettaglioTransazionePagonet;
           this.codiceEnte = codiceEnte;
           this.codiceFiscale = codiceFiscale;
           this.numeroDocumento = numeroDocumento;
           this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
           this.pagamentoSpontaneo = pagamentoSpontaneo;
           this.importoPagato = importoPagato;
           this.dataPagamento = dataPagamento;
           this.rtXML = rtXML;
    }


    /**
     * Gets the codiceTransazionePagonet value for this NotificaPagamentoRequest.
     * 
     * @return codiceTransazionePagonet   * Codice Transazione Pagonet, indica il codice
     * 						                transazione presente sull'applicazione Pagonet
     */
    public java.lang.String getCodiceTransazionePagonet() {
        return codiceTransazionePagonet;
    }


    /**
     * Sets the codiceTransazionePagonet value for this NotificaPagamentoRequest.
     * 
     * @param codiceTransazionePagonet   * Codice Transazione Pagonet, indica il codice
     * 						               transazione presente sull'applicazione Pagonet
     */
    public void setCodiceTransazionePagonet(java.lang.String codiceTransazionePagonet) {
        this.codiceTransazionePagonet = codiceTransazionePagonet;
    }


    /**
     * Gets the codiceDettaglioTransazionePagonet value for this NotificaPagamentoRequest.
     * 
     * @return codiceDettaglioTransazionePagonet   * Codice Dettaglio Transazione Pagonet, indica il
     * 						codice del dettaglio della transazione presente
     * 						sull'applicazione Pagonet
     */
    public java.lang.String getCodiceDettaglioTransazionePagonet() {
        return codiceDettaglioTransazionePagonet;
    }


    /**
     * Sets the codiceDettaglioTransazionePagonet value for this NotificaPagamentoRequest.
     * 
     * @param codiceDettaglioTransazionePagonet   * Codice Dettaglio Transazione Pagonet, indica il
     * 						codice del dettaglio della transazione presente
     * 						sull'applicazione Pagonet
     */
    public void setCodiceDettaglioTransazionePagonet(java.lang.String codiceDettaglioTransazionePagonet) {
        this.codiceDettaglioTransazionePagonet = codiceDettaglioTransazionePagonet;
    }


    /**
     * Gets the codiceEnte value for this NotificaPagamentoRequest.
     * 
     * @return codiceEnte   * Codice Ente, indica il codice Ente censito su Pagonet
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this NotificaPagamentoRequest.
     * 
     * @param codiceEnte   * Codice Ente, indica il codice Ente censito su Pagonet
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the codiceFiscale value for this NotificaPagamentoRequest.
     * 
     * @return codiceFiscale   * Codice Fiscale, indica il codice fiscale associato al bollettino
     * pagato
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this NotificaPagamentoRequest.
     * 
     * @param codiceFiscale   * Codice Fiscale, indica il codice fiscale associato al bollettino
     * pagato
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the numeroDocumento value for this NotificaPagamentoRequest.
     * 
     * @return numeroDocumento   * Numero Documento, indica il numero documento associato al bollettino
     * pagato
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this NotificaPagamentoRequest.
     * 
     * @param numeroDocumento   * Numero Documento, indica il numero documento associato al bollettino
     * pagato
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the numeroAvvisoPagoPA value for this NotificaPagamentoRequest.
     * 
     * @return numeroAvvisoPagoPA   * Numero Avviso PagoPA, indica il bollettino
     * 						pagato. Nel database della Sanità corrisponde al
     * 						campo IUV
     */
    public java.lang.String getNumeroAvvisoPagoPA() {
        return numeroAvvisoPagoPA;
    }


    /**
     * Sets the numeroAvvisoPagoPA value for this NotificaPagamentoRequest.
     * 
     * @param numeroAvvisoPagoPA   * Numero Avviso PagoPA, indica il bollettino
     * 						pagato. Nel database della Sanità corrisponde al
     * 						campo IUV
     */
    public void setNumeroAvvisoPagoPA(java.lang.String numeroAvvisoPagoPA) {
        this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
    }


    /**
     * Gets the pagamentoSpontaneo value for this NotificaPagamentoRequest.
     * 
     * @return pagamentoSpontaneo
     */
    public com.seda.payer.integraente.webservice.dati.PagamentoSpontaneo getPagamentoSpontaneo() {
        return pagamentoSpontaneo;
    }


    /**
     * Sets the pagamentoSpontaneo value for this NotificaPagamentoRequest.
     * 
     * @param pagamentoSpontaneo
     */
    public void setPagamentoSpontaneo(com.seda.payer.integraente.webservice.dati.PagamentoSpontaneo pagamentoSpontaneo) {
        this.pagamentoSpontaneo = pagamentoSpontaneo;
    }


    /**
     * Gets the importoPagato value for this NotificaPagamentoRequest.
     * 
     * @return importoPagato   * Importo Pagato, in centesimi di Euro
     */
    public long getImportoPagato() {
        return importoPagato;
    }


    /**
     * Sets the importoPagato value for this NotificaPagamentoRequest.
     * 
     * @param importoPagato   * Importo Pagato, in centesimi di Euro
     */
    public void setImportoPagato(long importoPagato) {
        this.importoPagato = importoPagato;
    }


    /**
     * Gets the dataPagamento value for this NotificaPagamentoRequest.
     * 
     * @return dataPagamento   * Data Pagamento, data in cui è stato effettuato
     * 						il pagamento, in formato YYYYMMDDHHMMSS
     */
    public java.lang.String getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this NotificaPagamentoRequest.
     * 
     * @param dataPagamento   * Data Pagamento, data in cui è stato effettuato
     * 						il pagamento, in formato YYYYMMDDHHMMSS
     */
    public void setDataPagamento(java.lang.String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the rtXML value for this NotificaPagamentoRequest.
     * 
     * @return rtXML   * Rt XML, XML della ricevuta telematica nel caso
     * 						in cui il pagamento sia stato effettuato con il
     * 						Nodo Nazionale dei Pagamenti PagoPA
     */
    public java.lang.String getRtXML() {
        return rtXML;
    }


    /**
     * Sets the rtXML value for this NotificaPagamentoRequest.
     * 
     * @param rtXML   * Rt XML, XML della ricevuta telematica nel caso
     * 						in cui il pagamento sia stato effettuato con il
     * 						Nodo Nazionale dei Pagamenti PagoPA
     */
    public void setRtXML(java.lang.String rtXML) {
        this.rtXML = rtXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaPagamentoRequest)) return false;
        NotificaPagamentoRequest other = (NotificaPagamentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceTransazionePagonet==null && other.getCodiceTransazionePagonet()==null) || 
             (this.codiceTransazionePagonet!=null &&
              this.codiceTransazionePagonet.equals(other.getCodiceTransazionePagonet()))) &&
            ((this.codiceDettaglioTransazionePagonet==null && other.getCodiceDettaglioTransazionePagonet()==null) || 
             (this.codiceDettaglioTransazionePagonet!=null &&
              this.codiceDettaglioTransazionePagonet.equals(other.getCodiceDettaglioTransazionePagonet()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.numeroAvvisoPagoPA==null && other.getNumeroAvvisoPagoPA()==null) || 
             (this.numeroAvvisoPagoPA!=null &&
              this.numeroAvvisoPagoPA.equals(other.getNumeroAvvisoPagoPA()))) &&
            ((this.pagamentoSpontaneo==null && other.getPagamentoSpontaneo()==null) || 
             (this.pagamentoSpontaneo!=null &&
              this.pagamentoSpontaneo.equals(other.getPagamentoSpontaneo()))) &&
            this.importoPagato == other.getImportoPagato() &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.rtXML==null && other.getRtXML()==null) || 
             (this.rtXML!=null &&
              this.rtXML.equals(other.getRtXML())));
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
        if (getCodiceTransazionePagonet() != null) {
            _hashCode += getCodiceTransazionePagonet().hashCode();
        }
        if (getCodiceDettaglioTransazionePagonet() != null) {
            _hashCode += getCodiceDettaglioTransazionePagonet().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getNumeroAvvisoPagoPA() != null) {
            _hashCode += getNumeroAvvisoPagoPA().hashCode();
        }
        if (getPagamentoSpontaneo() != null) {
            _hashCode += getPagamentoSpontaneo().hashCode();
        }
        _hashCode += new Long(getImportoPagato()).hashCode();
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getRtXML() != null) {
            _hashCode += getRtXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaPagamentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "NotificaPagamentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTransazionePagonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceTransazionePagonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceDettaglioTransazionePagonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceDettaglioTransazionePagonet"));
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
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAvvisoPagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroAvvisoPagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagamentoSpontaneo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "pagamentoSpontaneo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "PagamentoSpontaneo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "importoPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "rtXML"));
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
