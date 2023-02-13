/**
 * RecuperaListEntiRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaListEntiRequest  implements java.io.Serializable {
    /* codice utente */
    private java.lang.String codiceUtente;

    /* codice fiscale */
    private java.lang.String codiceFiscale;

    /* tipo servizio EP = entrate */
    private java.lang.String tipoServizio;

    /* tipo richiesta I=Insoluti e S=Storico */
    private java.lang.String tipoRichiesta;

    public RecuperaListEntiRequest() {
    }

    public RecuperaListEntiRequest(
           java.lang.String codiceUtente,
           java.lang.String codiceFiscale,
           java.lang.String tipoServizio,
           java.lang.String tipoRichiesta) {
           this.codiceUtente = codiceUtente;
           this.codiceFiscale = codiceFiscale;
           this.tipoServizio = tipoServizio;
           this.tipoRichiesta = tipoRichiesta;
    }


    /**
     * Gets the codiceUtente value for this RecuperaListEntiRequest.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaListEntiRequest.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceFiscale value for this RecuperaListEntiRequest.
     * 
     * @return codiceFiscale   * codice fiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this RecuperaListEntiRequest.
     * 
     * @param codiceFiscale   * codice fiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoServizio value for this RecuperaListEntiRequest.
     * 
     * @return tipoServizio   * tipo servizio EP = entrate
     */
    public java.lang.String getTipoServizio() {
        return tipoServizio;
    }


    /**
     * Sets the tipoServizio value for this RecuperaListEntiRequest.
     * 
     * @param tipoServizio   * tipo servizio EP = entrate
     */
    public void setTipoServizio(java.lang.String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }


    /**
     * Gets the tipoRichiesta value for this RecuperaListEntiRequest.
     * 
     * @return tipoRichiesta   * tipo richiesta I=Insoluti e S=Storico
     */
    public java.lang.String getTipoRichiesta() {
        return tipoRichiesta;
    }


    /**
     * Sets the tipoRichiesta value for this RecuperaListEntiRequest.
     * 
     * @param tipoRichiesta   * tipo richiesta I=Insoluti e S=Storico
     */
    public void setTipoRichiesta(java.lang.String tipoRichiesta) {
        this.tipoRichiesta = tipoRichiesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListEntiRequest)) return false;
        RecuperaListEntiRequest other = (RecuperaListEntiRequest) obj;
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
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.tipoServizio==null && other.getTipoServizio()==null) || 
             (this.tipoServizio!=null &&
              this.tipoServizio.equals(other.getTipoServizio()))) &&
            ((this.tipoRichiesta==null && other.getTipoRichiesta()==null) || 
             (this.tipoRichiesta!=null &&
              this.tipoRichiesta.equals(other.getTipoRichiesta())));
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
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getTipoServizio() != null) {
            _hashCode += getTipoServizio().hashCode();
        }
        if (getTipoRichiesta() != null) {
            _hashCode += getTipoRichiesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListEntiRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaListEntiRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
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
