/**
 * RecuperaListPagResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaListPagResponse  implements java.io.Serializable {
    /* parametri ricevuti nella request e rimessi in response */
    private com.seda.payer.integraente.webservice.dati.Request_ResponsePag resp;

    private com.seda.payer.integraente.webservice.dati.SinglePagamento[] listPag;

    public RecuperaListPagResponse() {
    }

    public RecuperaListPagResponse(
           com.seda.payer.integraente.webservice.dati.Request_ResponsePag resp,
           com.seda.payer.integraente.webservice.dati.SinglePagamento[] listPag) {
           this.resp = resp;
           this.listPag = listPag;
    }


    /**
     * Gets the resp value for this RecuperaListPagResponse.
     * 
     * @return resp   * parametri ricevuti nella request e rimessi in response
     */
    public com.seda.payer.integraente.webservice.dati.Request_ResponsePag getResp() {
        return resp;
    }


    /**
     * Sets the resp value for this RecuperaListPagResponse.
     * 
     * @param resp   * parametri ricevuti nella request e rimessi in response
     */
    public void setResp(com.seda.payer.integraente.webservice.dati.Request_ResponsePag resp) {
        this.resp = resp;
    }


    /**
     * Gets the listPag value for this RecuperaListPagResponse.
     * 
     * @return listPag
     */
    public com.seda.payer.integraente.webservice.dati.SinglePagamento[] getListPag() {
        return listPag;
    }


    /**
     * Sets the listPag value for this RecuperaListPagResponse.
     * 
     * @param listPag
     */
    public void setListPag(com.seda.payer.integraente.webservice.dati.SinglePagamento[] listPag) {
        this.listPag = listPag;
    }

    public com.seda.payer.integraente.webservice.dati.SinglePagamento getListPag(int i) {
        return this.listPag[i];
    }

    public void setListPag(int i, com.seda.payer.integraente.webservice.dati.SinglePagamento _value) {
        this.listPag[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListPagResponse)) return false;
        RecuperaListPagResponse other = (RecuperaListPagResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resp==null && other.getResp()==null) || 
             (this.resp!=null &&
              this.resp.equals(other.getResp()))) &&
            ((this.listPag==null && other.getListPag()==null) || 
             (this.listPag!=null &&
              java.util.Arrays.equals(this.listPag, other.getListPag())));
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
        if (getResp() != null) {
            _hashCode += getResp().hashCode();
        }
        if (getListPag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListPag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListPag(), i);
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
        new org.apache.axis.description.TypeDesc(RecuperaListPagResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaListPagResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "resp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "Request_ResponsePag"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "SinglePagamento"));
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
