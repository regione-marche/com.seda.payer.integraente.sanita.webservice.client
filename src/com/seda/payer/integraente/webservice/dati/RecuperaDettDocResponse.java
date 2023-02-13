/**
 * RecuperaDettDocResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDettDocResponse  implements java.io.Serializable {
    /* parametri ricevuti nella request e rimessi in response */
    private com.seda.payer.integraente.webservice.dati.Request_ResponseBase resp;

    /* lista dei pagamenti scadenze */
    private com.seda.payer.integraente.webservice.dati.ListaScadenze[] listScadenza;

    /* dettaglio documento come importi */
    private com.seda.payer.integraente.webservice.dati.ListaMovimenti[] listMovimenti;

    /* dettaglio documento come importi */
    private com.seda.payer.integraente.webservice.dati.ListaTributi[] listTributi;

    public RecuperaDettDocResponse() {
    }

    public RecuperaDettDocResponse(
           com.seda.payer.integraente.webservice.dati.Request_ResponseBase resp,
           com.seda.payer.integraente.webservice.dati.ListaScadenze[] listScadenza,
           com.seda.payer.integraente.webservice.dati.ListaMovimenti[] listMovimenti,
           com.seda.payer.integraente.webservice.dati.ListaTributi[] listTributi) {
           this.resp = resp;
           this.listScadenza = listScadenza;
           this.listMovimenti = listMovimenti;
           this.listTributi = listTributi;
    }


    /**
     * Gets the resp value for this RecuperaDettDocResponse.
     * 
     * @return resp   * parametri ricevuti nella request e rimessi in response
     */
    public com.seda.payer.integraente.webservice.dati.Request_ResponseBase getResp() {
        return resp;
    }


    /**
     * Sets the resp value for this RecuperaDettDocResponse.
     * 
     * @param resp   * parametri ricevuti nella request e rimessi in response
     */
    public void setResp(com.seda.payer.integraente.webservice.dati.Request_ResponseBase resp) {
        this.resp = resp;
    }


    /**
     * Gets the listScadenza value for this RecuperaDettDocResponse.
     * 
     * @return listScadenza   * lista dei pagamenti scadenze
     */
    public com.seda.payer.integraente.webservice.dati.ListaScadenze[] getListScadenza() {
        return listScadenza;
    }


    /**
     * Sets the listScadenza value for this RecuperaDettDocResponse.
     * 
     * @param listScadenza   * lista dei pagamenti scadenze
     */
    public void setListScadenza(com.seda.payer.integraente.webservice.dati.ListaScadenze[] listScadenza) {
        this.listScadenza = listScadenza;
    }

    public com.seda.payer.integraente.webservice.dati.ListaScadenze getListScadenza(int i) {
        return this.listScadenza[i];
    }

    public void setListScadenza(int i, com.seda.payer.integraente.webservice.dati.ListaScadenze _value) {
        this.listScadenza[i] = _value;
    }


    /**
     * Gets the listMovimenti value for this RecuperaDettDocResponse.
     * 
     * @return listMovimenti   * dettaglio documento come importi
     */
    public com.seda.payer.integraente.webservice.dati.ListaMovimenti[] getListMovimenti() {
        return listMovimenti;
    }


    /**
     * Sets the listMovimenti value for this RecuperaDettDocResponse.
     * 
     * @param listMovimenti   * dettaglio documento come importi
     */
    public void setListMovimenti(com.seda.payer.integraente.webservice.dati.ListaMovimenti[] listMovimenti) {
        this.listMovimenti = listMovimenti;
    }

    public com.seda.payer.integraente.webservice.dati.ListaMovimenti getListMovimenti(int i) {
        return this.listMovimenti[i];
    }

    public void setListMovimenti(int i, com.seda.payer.integraente.webservice.dati.ListaMovimenti _value) {
        this.listMovimenti[i] = _value;
    }


    /**
     * Gets the listTributi value for this RecuperaDettDocResponse.
     * 
     * @return listTributi   * dettaglio documento come importi
     */
    public com.seda.payer.integraente.webservice.dati.ListaTributi[] getListTributi() {
        return listTributi;
    }


    /**
     * Sets the listTributi value for this RecuperaDettDocResponse.
     * 
     * @param listTributi   * dettaglio documento come importi
     */
    public void setListTributi(com.seda.payer.integraente.webservice.dati.ListaTributi[] listTributi) {
        this.listTributi = listTributi;
    }

    public com.seda.payer.integraente.webservice.dati.ListaTributi getListTributi(int i) {
        return this.listTributi[i];
    }

    public void setListTributi(int i, com.seda.payer.integraente.webservice.dati.ListaTributi _value) {
        this.listTributi[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettDocResponse)) return false;
        RecuperaDettDocResponse other = (RecuperaDettDocResponse) obj;
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
            ((this.listScadenza==null && other.getListScadenza()==null) || 
             (this.listScadenza!=null &&
              java.util.Arrays.equals(this.listScadenza, other.getListScadenza()))) &&
            ((this.listMovimenti==null && other.getListMovimenti()==null) || 
             (this.listMovimenti!=null &&
              java.util.Arrays.equals(this.listMovimenti, other.getListMovimenti()))) &&
            ((this.listTributi==null && other.getListTributi()==null) || 
             (this.listTributi!=null &&
              java.util.Arrays.equals(this.listTributi, other.getListTributi())));
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
        if (getListScadenza() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListScadenza());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListScadenza(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListMovimenti() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListMovimenti());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListMovimenti(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListTributi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListTributi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListTributi(), i);
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
        new org.apache.axis.description.TypeDesc(RecuperaDettDocResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDettDocResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "resp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "Request_ResponseBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listScadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listScadenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaScadenze"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listMovimenti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listMovimenti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaMovimenti"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listTributi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listTributi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaTributi"));
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
