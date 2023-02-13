/**
 * RecuperaPagamentiHostResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaPagamentiHostResponse  implements java.io.Serializable {
    /* Codice Utente */
    private java.lang.String codiceUtente;

    private com.seda.payer.integraente.webservice.dati.PagamentoHost[] listaPagamenti;

    public RecuperaPagamentiHostResponse() {
    }

    public RecuperaPagamentiHostResponse(
           java.lang.String codiceUtente,
           com.seda.payer.integraente.webservice.dati.PagamentoHost[] listaPagamenti) {
           this.codiceUtente = codiceUtente;
           this.listaPagamenti = listaPagamenti;
    }


    /**
     * Gets the codiceUtente value for this RecuperaPagamentiHostResponse.
     * 
     * @return codiceUtente   * Codice Utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaPagamentiHostResponse.
     * 
     * @param codiceUtente   * Codice Utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the listaPagamenti value for this RecuperaPagamentiHostResponse.
     * 
     * @return listaPagamenti
     */
    public com.seda.payer.integraente.webservice.dati.PagamentoHost[] getListaPagamenti() {
        return listaPagamenti;
    }


    /**
     * Sets the listaPagamenti value for this RecuperaPagamentiHostResponse.
     * 
     * @param listaPagamenti
     */
    public void setListaPagamenti(com.seda.payer.integraente.webservice.dati.PagamentoHost[] listaPagamenti) {
        this.listaPagamenti = listaPagamenti;
    }

    public com.seda.payer.integraente.webservice.dati.PagamentoHost getListaPagamenti(int i) {
        return this.listaPagamenti[i];
    }

    public void setListaPagamenti(int i, com.seda.payer.integraente.webservice.dati.PagamentoHost _value) {
        this.listaPagamenti[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaPagamentiHostResponse)) return false;
        RecuperaPagamentiHostResponse other = (RecuperaPagamentiHostResponse) obj;
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
            ((this.listaPagamenti==null && other.getListaPagamenti()==null) || 
             (this.listaPagamenti!=null &&
              java.util.Arrays.equals(this.listaPagamenti, other.getListaPagamenti())));
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
        if (getListaPagamenti() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaPagamenti());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaPagamenti(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaPagamentiHostResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaPagamentiHostResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaPagamenti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listaPagamenti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "PagamentoHost"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
