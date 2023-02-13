/**
 * TributoF24.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class TributoF24  implements java.io.Serializable {
    /* codice utente */
    private java.lang.String codiceUtente;

    /* Codice tributo */
    private java.lang.String codiceTributo;

    /* Tipo tributo */
    private java.lang.String tipoTributo;

    /* codice Belfiore */
    private java.lang.String codiceBelfiore;

    /* rateazione */
    private java.lang.String rateMeseRif;

    /* Anno riferimento per f24 */
    private java.lang.String annoRiferimento;

    /* rImporto tributo */
    private java.math.BigDecimal impTributo;

    public TributoF24() {
    }

    public TributoF24(
           java.lang.String codiceUtente,
           java.lang.String codiceTributo,
           java.lang.String tipoTributo,
           java.lang.String codiceBelfiore,
           java.lang.String rateMeseRif,
           java.lang.String annoRiferimento,
           java.math.BigDecimal impTributo) {
           this.codiceUtente = codiceUtente;
           this.codiceTributo = codiceTributo;
           this.tipoTributo = tipoTributo;
           this.codiceBelfiore = codiceBelfiore;
           this.rateMeseRif = rateMeseRif;
           this.annoRiferimento = annoRiferimento;
           this.impTributo = impTributo;
    }


    /**
     * Gets the codiceUtente value for this TributoF24.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this TributoF24.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceTributo value for this TributoF24.
     * 
     * @return codiceTributo   * Codice tributo
     */
    public java.lang.String getCodiceTributo() {
        return codiceTributo;
    }


    /**
     * Sets the codiceTributo value for this TributoF24.
     * 
     * @param codiceTributo   * Codice tributo
     */
    public void setCodiceTributo(java.lang.String codiceTributo) {
        this.codiceTributo = codiceTributo;
    }


    /**
     * Gets the tipoTributo value for this TributoF24.
     * 
     * @return tipoTributo   * Tipo tributo
     */
    public java.lang.String getTipoTributo() {
        return tipoTributo;
    }


    /**
     * Sets the tipoTributo value for this TributoF24.
     * 
     * @param tipoTributo   * Tipo tributo
     */
    public void setTipoTributo(java.lang.String tipoTributo) {
        this.tipoTributo = tipoTributo;
    }


    /**
     * Gets the codiceBelfiore value for this TributoF24.
     * 
     * @return codiceBelfiore   * codice Belfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this TributoF24.
     * 
     * @param codiceBelfiore   * codice Belfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the rateMeseRif value for this TributoF24.
     * 
     * @return rateMeseRif   * rateazione
     */
    public java.lang.String getRateMeseRif() {
        return rateMeseRif;
    }


    /**
     * Sets the rateMeseRif value for this TributoF24.
     * 
     * @param rateMeseRif   * rateazione
     */
    public void setRateMeseRif(java.lang.String rateMeseRif) {
        this.rateMeseRif = rateMeseRif;
    }


    /**
     * Gets the annoRiferimento value for this TributoF24.
     * 
     * @return annoRiferimento   * Anno riferimento per f24
     */
    public java.lang.String getAnnoRiferimento() {
        return annoRiferimento;
    }


    /**
     * Sets the annoRiferimento value for this TributoF24.
     * 
     * @param annoRiferimento   * Anno riferimento per f24
     */
    public void setAnnoRiferimento(java.lang.String annoRiferimento) {
        this.annoRiferimento = annoRiferimento;
    }


    /**
     * Gets the impTributo value for this TributoF24.
     * 
     * @return impTributo   * rImporto tributo
     */
    public java.math.BigDecimal getImpTributo() {
        return impTributo;
    }


    /**
     * Sets the impTributo value for this TributoF24.
     * 
     * @param impTributo   * rImporto tributo
     */
    public void setImpTributo(java.math.BigDecimal impTributo) {
        this.impTributo = impTributo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TributoF24)) return false;
        TributoF24 other = (TributoF24) obj;
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
            ((this.codiceTributo==null && other.getCodiceTributo()==null) || 
             (this.codiceTributo!=null &&
              this.codiceTributo.equals(other.getCodiceTributo()))) &&
            ((this.tipoTributo==null && other.getTipoTributo()==null) || 
             (this.tipoTributo!=null &&
              this.tipoTributo.equals(other.getTipoTributo()))) &&
            ((this.codiceBelfiore==null && other.getCodiceBelfiore()==null) || 
             (this.codiceBelfiore!=null &&
              this.codiceBelfiore.equals(other.getCodiceBelfiore()))) &&
            ((this.rateMeseRif==null && other.getRateMeseRif()==null) || 
             (this.rateMeseRif!=null &&
              this.rateMeseRif.equals(other.getRateMeseRif()))) &&
            ((this.annoRiferimento==null && other.getAnnoRiferimento()==null) || 
             (this.annoRiferimento!=null &&
              this.annoRiferimento.equals(other.getAnnoRiferimento()))) &&
            ((this.impTributo==null && other.getImpTributo()==null) || 
             (this.impTributo!=null &&
              this.impTributo.equals(other.getImpTributo())));
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
        if (getCodiceTributo() != null) {
            _hashCode += getCodiceTributo().hashCode();
        }
        if (getTipoTributo() != null) {
            _hashCode += getTipoTributo().hashCode();
        }
        if (getCodiceBelfiore() != null) {
            _hashCode += getCodiceBelfiore().hashCode();
        }
        if (getRateMeseRif() != null) {
            _hashCode += getRateMeseRif().hashCode();
        }
        if (getAnnoRiferimento() != null) {
            _hashCode += getAnnoRiferimento().hashCode();
        }
        if (getImpTributo() != null) {
            _hashCode += getImpTributo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TributoF24.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TributoF24"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfiore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceBelfiore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateMeseRif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "rateMeseRif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
