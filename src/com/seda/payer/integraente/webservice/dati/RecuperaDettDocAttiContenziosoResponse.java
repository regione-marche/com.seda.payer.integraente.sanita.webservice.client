/**
 * RecuperaDettDocAttiContenziosoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDettDocAttiContenziosoResponse  implements java.io.Serializable {
    /* Codice esito operazione, diverso da 00 errore */
    private java.lang.String retCode;

    /* Messaggio dell'esito dell'operazione */
    private java.lang.String retMessage;

    /* Lista degli atti di contenzioso collegati al documento */
    private com.seda.payer.integraente.webservice.dati.ListaAttiContenzioso[] listAttiContenzioso;

    public RecuperaDettDocAttiContenziosoResponse() {
    }

    public RecuperaDettDocAttiContenziosoResponse(
           java.lang.String retCode,
           java.lang.String retMessage,
           com.seda.payer.integraente.webservice.dati.ListaAttiContenzioso[] listAttiContenzioso) {
           this.retCode = retCode;
           this.retMessage = retMessage;
           this.listAttiContenzioso = listAttiContenzioso;
    }


    /**
     * Gets the retCode value for this RecuperaDettDocAttiContenziosoResponse.
     * 
     * @return retCode   * Codice esito operazione, diverso da 00 errore
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaDettDocAttiContenziosoResponse.
     * 
     * @param retCode   * Codice esito operazione, diverso da 00 errore
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaDettDocAttiContenziosoResponse.
     * 
     * @return retMessage   * Messaggio dell'esito dell'operazione
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaDettDocAttiContenziosoResponse.
     * 
     * @param retMessage   * Messaggio dell'esito dell'operazione
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }


    /**
     * Gets the listAttiContenzioso value for this RecuperaDettDocAttiContenziosoResponse.
     * 
     * @return listAttiContenzioso   * Lista degli atti di contenzioso collegati al documento
     */
    public com.seda.payer.integraente.webservice.dati.ListaAttiContenzioso[] getListAttiContenzioso() {
        return listAttiContenzioso;
    }


    /**
     * Sets the listAttiContenzioso value for this RecuperaDettDocAttiContenziosoResponse.
     * 
     * @param listAttiContenzioso   * Lista degli atti di contenzioso collegati al documento
     */
    public void setListAttiContenzioso(com.seda.payer.integraente.webservice.dati.ListaAttiContenzioso[] listAttiContenzioso) {
        this.listAttiContenzioso = listAttiContenzioso;
    }

    public com.seda.payer.integraente.webservice.dati.ListaAttiContenzioso getListAttiContenzioso(int i) {
        return this.listAttiContenzioso[i];
    }

    public void setListAttiContenzioso(int i, com.seda.payer.integraente.webservice.dati.ListaAttiContenzioso _value) {
        this.listAttiContenzioso[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettDocAttiContenziosoResponse)) return false;
        RecuperaDettDocAttiContenziosoResponse other = (RecuperaDettDocAttiContenziosoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retCode==null && other.getRetCode()==null) || 
             (this.retCode!=null &&
              this.retCode.equals(other.getRetCode()))) &&
            ((this.retMessage==null && other.getRetMessage()==null) || 
             (this.retMessage!=null &&
              this.retMessage.equals(other.getRetMessage()))) &&
            ((this.listAttiContenzioso==null && other.getListAttiContenzioso()==null) || 
             (this.listAttiContenzioso!=null &&
              java.util.Arrays.equals(this.listAttiContenzioso, other.getListAttiContenzioso())));
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
        if (getRetCode() != null) {
            _hashCode += getRetCode().hashCode();
        }
        if (getRetMessage() != null) {
            _hashCode += getRetMessage().hashCode();
        }
        if (getListAttiContenzioso() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListAttiContenzioso());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListAttiContenzioso(), i);
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
        new org.apache.axis.description.TypeDesc(RecuperaDettDocAttiContenziosoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDettDocAttiContenziosoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "retCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "retMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listAttiContenzioso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listAttiContenzioso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaAttiContenzioso"));
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
