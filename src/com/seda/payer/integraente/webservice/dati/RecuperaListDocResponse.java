/**
 * RecuperaListDocResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaListDocResponse  implements java.io.Serializable {
    /* parametri ricevuti nella request e rimessi in response */
    private com.seda.payer.integraente.webservice.dati.Request_ResponseLista resp;

    private com.seda.payer.integraente.webservice.dati.SingleDocumento[] listDoc;

    public RecuperaListDocResponse() {
    }

    public RecuperaListDocResponse(
           com.seda.payer.integraente.webservice.dati.Request_ResponseLista resp,
           com.seda.payer.integraente.webservice.dati.SingleDocumento[] listDoc) {
           this.resp = resp;
           this.listDoc = listDoc;
    }


    /**
     * Gets the resp value for this RecuperaListDocResponse.
     * 
     * @return resp   * parametri ricevuti nella request e rimessi in response
     */
    public com.seda.payer.integraente.webservice.dati.Request_ResponseLista getResp() {
        return resp;
    }


    /**
     * Sets the resp value for this RecuperaListDocResponse.
     * 
     * @param resp   * parametri ricevuti nella request e rimessi in response
     */
    public void setResp(com.seda.payer.integraente.webservice.dati.Request_ResponseLista resp) {
        this.resp = resp;
    }


    /**
     * Gets the listDoc value for this RecuperaListDocResponse.
     * 
     * @return listDoc
     */
    public com.seda.payer.integraente.webservice.dati.SingleDocumento[] getListDoc() {
        return listDoc;
    }


    /**
     * Sets the listDoc value for this RecuperaListDocResponse.
     * 
     * @param listDoc
     */
    public void setListDoc(com.seda.payer.integraente.webservice.dati.SingleDocumento[] listDoc) {
        this.listDoc = listDoc;
    }

    public com.seda.payer.integraente.webservice.dati.SingleDocumento getListDoc(int i) {
        return this.listDoc[i];
    }

    public void setListDoc(int i, com.seda.payer.integraente.webservice.dati.SingleDocumento _value) {
        this.listDoc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListDocResponse)) return false;
        RecuperaListDocResponse other = (RecuperaListDocResponse) obj;
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
            ((this.listDoc==null && other.getListDoc()==null) || 
             (this.listDoc!=null &&
              java.util.Arrays.equals(this.listDoc, other.getListDoc())));
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
        if (getListDoc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDoc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDoc(), i);
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
        new org.apache.axis.description.TypeDesc(RecuperaListDocResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaListDocResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "resp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "Request_ResponseLista"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "SingleDocumento"));
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
