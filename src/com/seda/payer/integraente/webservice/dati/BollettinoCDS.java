/**
 * BollettinoCDS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class BollettinoCDS  implements java.io.Serializable {
    /* Denominazione del Soggetto Pagante. */
    private java.lang.String denominazioneSoggettoPagante;

    /* Identificativo Verbale */
    private java.lang.String identificativoVerbale;

    /* Targa Veicolo */
    private java.lang.String targaVeicolo;

    /* Data Verbale */
    private java.lang.String dataVerbale;

    public BollettinoCDS() {
    }

    public BollettinoCDS(
           java.lang.String denominazioneSoggettoPagante,
           java.lang.String identificativoVerbale,
           java.lang.String targaVeicolo,
           java.lang.String dataVerbale) {
           this.denominazioneSoggettoPagante = denominazioneSoggettoPagante;
           this.identificativoVerbale = identificativoVerbale;
           this.targaVeicolo = targaVeicolo;
           this.dataVerbale = dataVerbale;
    }


    /**
     * Gets the denominazioneSoggettoPagante value for this BollettinoCDS.
     * 
     * @return denominazioneSoggettoPagante   * Denominazione del Soggetto Pagante.
     */
    public java.lang.String getDenominazioneSoggettoPagante() {
        return denominazioneSoggettoPagante;
    }


    /**
     * Sets the denominazioneSoggettoPagante value for this BollettinoCDS.
     * 
     * @param denominazioneSoggettoPagante   * Denominazione del Soggetto Pagante.
     */
    public void setDenominazioneSoggettoPagante(java.lang.String denominazioneSoggettoPagante) {
        this.denominazioneSoggettoPagante = denominazioneSoggettoPagante;
    }


    /**
     * Gets the identificativoVerbale value for this BollettinoCDS.
     * 
     * @return identificativoVerbale   * Identificativo Verbale
     */
    public java.lang.String getIdentificativoVerbale() {
        return identificativoVerbale;
    }


    /**
     * Sets the identificativoVerbale value for this BollettinoCDS.
     * 
     * @param identificativoVerbale   * Identificativo Verbale
     */
    public void setIdentificativoVerbale(java.lang.String identificativoVerbale) {
        this.identificativoVerbale = identificativoVerbale;
    }


    /**
     * Gets the targaVeicolo value for this BollettinoCDS.
     * 
     * @return targaVeicolo   * Targa Veicolo
     */
    public java.lang.String getTargaVeicolo() {
        return targaVeicolo;
    }


    /**
     * Sets the targaVeicolo value for this BollettinoCDS.
     * 
     * @param targaVeicolo   * Targa Veicolo
     */
    public void setTargaVeicolo(java.lang.String targaVeicolo) {
        this.targaVeicolo = targaVeicolo;
    }


    /**
     * Gets the dataVerbale value for this BollettinoCDS.
     * 
     * @return dataVerbale   * Data Verbale
     */
    public java.lang.String getDataVerbale() {
        return dataVerbale;
    }


    /**
     * Sets the dataVerbale value for this BollettinoCDS.
     * 
     * @param dataVerbale   * Data Verbale
     */
    public void setDataVerbale(java.lang.String dataVerbale) {
        this.dataVerbale = dataVerbale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BollettinoCDS)) return false;
        BollettinoCDS other = (BollettinoCDS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denominazioneSoggettoPagante==null && other.getDenominazioneSoggettoPagante()==null) || 
             (this.denominazioneSoggettoPagante!=null &&
              this.denominazioneSoggettoPagante.equals(other.getDenominazioneSoggettoPagante()))) &&
            ((this.identificativoVerbale==null && other.getIdentificativoVerbale()==null) || 
             (this.identificativoVerbale!=null &&
              this.identificativoVerbale.equals(other.getIdentificativoVerbale()))) &&
            ((this.targaVeicolo==null && other.getTargaVeicolo()==null) || 
             (this.targaVeicolo!=null &&
              this.targaVeicolo.equals(other.getTargaVeicolo()))) &&
            ((this.dataVerbale==null && other.getDataVerbale()==null) || 
             (this.dataVerbale!=null &&
              this.dataVerbale.equals(other.getDataVerbale())));
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
        if (getDenominazioneSoggettoPagante() != null) {
            _hashCode += getDenominazioneSoggettoPagante().hashCode();
        }
        if (getIdentificativoVerbale() != null) {
            _hashCode += getIdentificativoVerbale().hashCode();
        }
        if (getTargaVeicolo() != null) {
            _hashCode += getTargaVeicolo().hashCode();
        }
        if (getDataVerbale() != null) {
            _hashCode += getDataVerbale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BollettinoCDS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "BollettinoCDS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazioneSoggettoPagante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "denominazioneSoggettoPagante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoVerbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targaVeicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "targaVeicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataVerbale"));
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
