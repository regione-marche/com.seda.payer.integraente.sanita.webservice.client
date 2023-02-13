/**
 * RecuperaListEntiResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaListEntiResponse  implements java.io.Serializable {
    /* parametri ricevuti nella request e rimessi in response */
    private com.seda.payer.integraente.webservice.dati.RecuperaListEntiRequest resp;

    /* lista degli enti */
    private com.seda.payer.integraente.webservice.dati.SingleEnte[] listEnti;

    public RecuperaListEntiResponse() {
    }

    public RecuperaListEntiResponse(
           com.seda.payer.integraente.webservice.dati.RecuperaListEntiRequest resp,
           com.seda.payer.integraente.webservice.dati.SingleEnte[] listEnti) {
           this.resp = resp;
           this.listEnti = listEnti;
    }


    /**
     * Gets the resp value for this RecuperaListEntiResponse.
     * 
     * @return resp   * parametri ricevuti nella request e rimessi in response
     */
    public com.seda.payer.integraente.webservice.dati.RecuperaListEntiRequest getResp() {
        return resp;
    }


    /**
     * Sets the resp value for this RecuperaListEntiResponse.
     * 
     * @param resp   * parametri ricevuti nella request e rimessi in response
     */
    public void setResp(com.seda.payer.integraente.webservice.dati.RecuperaListEntiRequest resp) {
        this.resp = resp;
    }


    /**
     * Gets the listEnti value for this RecuperaListEntiResponse.
     * 
     * @return listEnti   * lista degli enti
     */
    public com.seda.payer.integraente.webservice.dati.SingleEnte[] getListEnti() {
        return listEnti;
    }


    /**
     * Sets the listEnti value for this RecuperaListEntiResponse.
     * 
     * @param listEnti   * lista degli enti
     */
    public void setListEnti(com.seda.payer.integraente.webservice.dati.SingleEnte[] listEnti) {
        this.listEnti = listEnti;
    }

    public com.seda.payer.integraente.webservice.dati.SingleEnte getListEnti(int i) {
        return this.listEnti[i];
    }

    public void setListEnti(int i, com.seda.payer.integraente.webservice.dati.SingleEnte _value) {
        this.listEnti[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListEntiResponse)) return false;
        RecuperaListEntiResponse other = (RecuperaListEntiResponse) obj;
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
            ((this.listEnti==null && other.getListEnti()==null) || 
             (this.listEnti!=null &&
              java.util.Arrays.equals(this.listEnti, other.getListEnti())));
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
        if (getListEnti() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListEnti());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListEnti(), i);
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
        new org.apache.axis.description.TypeDesc(RecuperaListEntiResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaListEntiResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "resp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaListEntiRequest"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listEnti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listEnti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "SingleEnte"));
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
