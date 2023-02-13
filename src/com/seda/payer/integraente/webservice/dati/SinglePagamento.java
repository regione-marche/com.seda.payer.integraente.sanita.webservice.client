/**
 * SinglePagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class SinglePagamento  implements java.io.Serializable {
    /* lista dei pagamenti */
    private com.seda.payer.integraente.webservice.dati.ListaPagamenti listPag;

    public SinglePagamento() {
    }

    public SinglePagamento(
           com.seda.payer.integraente.webservice.dati.ListaPagamenti listPag) {
           this.listPag = listPag;
    }


    /**
     * Gets the listPag value for this SinglePagamento.
     * 
     * @return listPag   * lista dei pagamenti
     */
    public com.seda.payer.integraente.webservice.dati.ListaPagamenti getListPag() {
        return listPag;
    }


    /**
     * Sets the listPag value for this SinglePagamento.
     * 
     * @param listPag   * lista dei pagamenti
     */
    public void setListPag(com.seda.payer.integraente.webservice.dati.ListaPagamenti listPag) {
        this.listPag = listPag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SinglePagamento)) return false;
        SinglePagamento other = (SinglePagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listPag==null && other.getListPag()==null) || 
             (this.listPag!=null &&
              this.listPag.equals(other.getListPag())));
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
        if (getListPag() != null) {
            _hashCode += getListPag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SinglePagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "SinglePagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaPagamenti"));
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
