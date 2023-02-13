/**
 * RecuperaPagamentiHostRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaPagamentiHostRequest  implements java.io.Serializable {
    /* Codice Utente */
    private java.lang.String codiceUtente;

    /* Codice Ente */
    private java.lang.String codiceEnte;

    /* Numero Borsellino */
    private java.lang.String numeroBorsellino;

    public RecuperaPagamentiHostRequest() {
    }

    public RecuperaPagamentiHostRequest(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String numeroBorsellino) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.numeroBorsellino = numeroBorsellino;
    }


    /**
     * Gets the codiceUtente value for this RecuperaPagamentiHostRequest.
     * 
     * @return codiceUtente   * Codice Utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaPagamentiHostRequest.
     * 
     * @param codiceUtente   * Codice Utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this RecuperaPagamentiHostRequest.
     * 
     * @return codiceEnte   * Codice Ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this RecuperaPagamentiHostRequest.
     * 
     * @param codiceEnte   * Codice Ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the numeroBorsellino value for this RecuperaPagamentiHostRequest.
     * 
     * @return numeroBorsellino   * Numero Borsellino
     */
    public java.lang.String getNumeroBorsellino() {
        return numeroBorsellino;
    }


    /**
     * Sets the numeroBorsellino value for this RecuperaPagamentiHostRequest.
     * 
     * @param numeroBorsellino   * Numero Borsellino
     */
    public void setNumeroBorsellino(java.lang.String numeroBorsellino) {
        this.numeroBorsellino = numeroBorsellino;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaPagamentiHostRequest)) return false;
        RecuperaPagamentiHostRequest other = (RecuperaPagamentiHostRequest) obj;
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
            ((this.numeroBorsellino==null && other.getNumeroBorsellino()==null) || 
             (this.numeroBorsellino!=null &&
              this.numeroBorsellino.equals(other.getNumeroBorsellino())));
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
        if (getNumeroBorsellino() != null) {
            _hashCode += getNumeroBorsellino().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaPagamentiHostRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaPagamentiHostRequest"));
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
        elemField.setFieldName("numeroBorsellino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroBorsellino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
