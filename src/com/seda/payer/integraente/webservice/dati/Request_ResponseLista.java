/**
 * Request_ResponseLista.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class Request_ResponseLista  extends com.seda.payer.integraente.webservice.dati.Request_ResponseBase  implements java.io.Serializable {
    /* imposta servizio optional */
    private java.lang.String impostaServizio;

    /* codice ente di pertinenza */
    private java.lang.String entePertinenza;

    /* tipologia di utenza ('U' = ufficiale giudiziario) */
    private java.lang.String tipologiaUtenza;

    public Request_ResponseLista() {
    }

    public Request_ResponseLista(
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
           java.lang.String tipologiaServizio,
           java.lang.String impostaServizio,
           java.lang.String entePertinenza,
           java.lang.String tipologiaUtenza) {
        super(
            codiceUtente,
            codiceEnte,
            tipoUfficio,
            codiceUfficio,
            codiceFiscale,
            tipoServizio,
            tipoRichiesta,
            documento,
            annoEmissione,
            tipoIntegrazione,
            idDocumento,
            numeroBollettino,
            numeroRaccomandata,
            numeroCronologico,
            idBarCode,
            idProcedura,
            progCoobbligato,
            esitoRichiesta,
            messaggioEsito,
            tipologiaServizio);
        this.impostaServizio = impostaServizio;
        this.entePertinenza = entePertinenza;
        this.tipologiaUtenza = tipologiaUtenza;
    }


    /**
     * Gets the impostaServizio value for this Request_ResponseLista.
     * 
     * @return impostaServizio   * imposta servizio optional
     */
    public java.lang.String getImpostaServizio() {
        return impostaServizio;
    }


    /**
     * Sets the impostaServizio value for this Request_ResponseLista.
     * 
     * @param impostaServizio   * imposta servizio optional
     */
    public void setImpostaServizio(java.lang.String impostaServizio) {
        this.impostaServizio = impostaServizio;
    }


    /**
     * Gets the entePertinenza value for this Request_ResponseLista.
     * 
     * @return entePertinenza   * codice ente di pertinenza
     */
    public java.lang.String getEntePertinenza() {
        return entePertinenza;
    }


    /**
     * Sets the entePertinenza value for this Request_ResponseLista.
     * 
     * @param entePertinenza   * codice ente di pertinenza
     */
    public void setEntePertinenza(java.lang.String entePertinenza) {
        this.entePertinenza = entePertinenza;
    }


    /**
     * Gets the tipologiaUtenza value for this Request_ResponseLista.
     * 
     * @return tipologiaUtenza   * tipologia di utenza ('U' = ufficiale giudiziario)
     */
    public java.lang.String getTipologiaUtenza() {
        return tipologiaUtenza;
    }


    /**
     * Sets the tipologiaUtenza value for this Request_ResponseLista.
     * 
     * @param tipologiaUtenza   * tipologia di utenza ('U' = ufficiale giudiziario)
     */
    public void setTipologiaUtenza(java.lang.String tipologiaUtenza) {
        this.tipologiaUtenza = tipologiaUtenza;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request_ResponseLista)) return false;
        Request_ResponseLista other = (Request_ResponseLista) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.impostaServizio==null && other.getImpostaServizio()==null) || 
             (this.impostaServizio!=null &&
              this.impostaServizio.equals(other.getImpostaServizio()))) &&
            ((this.entePertinenza==null && other.getEntePertinenza()==null) || 
             (this.entePertinenza!=null &&
              this.entePertinenza.equals(other.getEntePertinenza()))) &&
            ((this.tipologiaUtenza==null && other.getTipologiaUtenza()==null) || 
             (this.tipologiaUtenza!=null &&
              this.tipologiaUtenza.equals(other.getTipologiaUtenza())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getImpostaServizio() != null) {
            _hashCode += getImpostaServizio().hashCode();
        }
        if (getEntePertinenza() != null) {
            _hashCode += getEntePertinenza().hashCode();
        }
        if (getTipologiaUtenza() != null) {
            _hashCode += getTipologiaUtenza().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request_ResponseLista.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "Request_ResponseLista"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impostaServizio"));
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
        elemField.setFieldName("tipologiaUtenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaUtenza"));
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
