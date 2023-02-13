/**
 * RecuperaDettDocRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDettDocRequest  extends com.seda.payer.integraente.webservice.dati.Request_ResponseBase  implements java.io.Serializable {
    public RecuperaDettDocRequest() {
    }

    public RecuperaDettDocRequest(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String codiceFiscale,
           java.lang.String tipoServizio,
           java.lang.String tipoRichiesta,
           java.lang.String documento,
           java.lang.String annoEmissione,
           java.lang.String tipoIntegrazione,
           java.lang.String idDocumento,
           java.math.BigDecimal numeroBollettino,
           java.lang.String numeroRaccomandata,
           java.lang.String numeroCronologico,
           java.lang.String idBarCode,
           java.lang.String idProcedura,
           java.math.BigDecimal progCoobbligato,
           java.lang.String esitoRichiesta,
           java.lang.String messaggioEsito,
           java.lang.String tipologiaServizio) {
        super(
            codiceUtente,
            codiceEnte,
            tipoUfficio,
            codiceUfficio,
            codiceFiscale,
            tipoServizio,
            tipoRichiesta,
            documento,
            annoEmissione,
            tipoIntegrazione,
            idDocumento,
            numeroBollettino,
            numeroRaccomandata,
            numeroCronologico,
            idBarCode,
            idProcedura,
            progCoobbligato,
            esitoRichiesta,
            messaggioEsito,
            tipologiaServizio);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettDocRequest)) return false;
        RecuperaDettDocRequest other = (RecuperaDettDocRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDettDocRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDettDocRequest"));
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
