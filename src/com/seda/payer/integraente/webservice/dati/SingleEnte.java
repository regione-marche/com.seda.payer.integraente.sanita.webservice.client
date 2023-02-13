/**
 * SingleEnte.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class SingleEnte  implements java.io.Serializable {
    /* codice utente */
    private java.lang.String codiceUtente;

    /* codice ente */
    private java.lang.String codiceEnte;

    /* tipo ufficio */
    private java.lang.String tipoUfficio;

    /* codice ufficio */
    private java.lang.String codiceUfficio;

    public SingleEnte() {
    }

    public SingleEnte(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the codiceUtente value for this SingleEnte.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this SingleEnte.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this SingleEnte.
     * 
     * @return codiceEnte   * codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this SingleEnte.
     * 
     * @param codiceEnte   * codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this SingleEnte.
     * 
     * @return tipoUfficio   * tipo ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this SingleEnte.
     * 
     * @param tipoUfficio   * tipo ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this SingleEnte.
     * 
     * @return codiceUfficio   * codice ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this SingleEnte.
     * 
     * @param codiceUfficio   * codice ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SingleEnte)) return false;
        SingleEnte other = (SingleEnte) obj;
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
              this.codiceUfficio.equals(other.getCodiceUfficio())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SingleEnte.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "SingleEnte"));
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
