/**
 * SingleDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class SingleDocumento  implements java.io.Serializable {
    /* lista dei pagamenti spontanei */
    private com.seda.payer.integraente.webservice.dati.ListaDocumenti listDoc;

    /* dettaglio documento come importi */
    private com.seda.payer.integraente.webservice.dati.DettaglioDocumento dettDoc;

    public SingleDocumento() {
    }

    public SingleDocumento(
           com.seda.payer.integraente.webservice.dati.ListaDocumenti listDoc,
           com.seda.payer.integraente.webservice.dati.DettaglioDocumento dettDoc) {
           this.listDoc = listDoc;
           this.dettDoc = dettDoc;
    }


    /**
     * Gets the listDoc value for this SingleDocumento.
     * 
     * @return listDoc   * lista dei pagamenti spontanei
     */
    public com.seda.payer.integraente.webservice.dati.ListaDocumenti getListDoc() {
        return listDoc;
    }


    /**
     * Sets the listDoc value for this SingleDocumento.
     * 
     * @param listDoc   * lista dei pagamenti spontanei
     */
    public void setListDoc(com.seda.payer.integraente.webservice.dati.ListaDocumenti listDoc) {
        this.listDoc = listDoc;
    }


    /**
     * Gets the dettDoc value for this SingleDocumento.
     * 
     * @return dettDoc   * dettaglio documento come importi
     */
    public com.seda.payer.integraente.webservice.dati.DettaglioDocumento getDettDoc() {
        return dettDoc;
    }


    /**
     * Sets the dettDoc value for this SingleDocumento.
     * 
     * @param dettDoc   * dettaglio documento come importi
     */
    public void setDettDoc(com.seda.payer.integraente.webservice.dati.DettaglioDocumento dettDoc) {
        this.dettDoc = dettDoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SingleDocumento)) return false;
        SingleDocumento other = (SingleDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listDoc==null && other.getListDoc()==null) || 
             (this.listDoc!=null &&
              this.listDoc.equals(other.getListDoc()))) &&
            ((this.dettDoc==null && other.getDettDoc()==null) || 
             (this.dettDoc!=null &&
              this.dettDoc.equals(other.getDettDoc())));
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
        if (getListDoc() != null) {
            _hashCode += getListDoc().hashCode();
        }
        if (getDettDoc() != null) {
            _hashCode += getDettDoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SingleDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "SingleDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaDocumenti"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dettDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dettDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "DettaglioDocumento"));
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
