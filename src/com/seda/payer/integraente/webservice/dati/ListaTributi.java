/**
 * ListaTributi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class ListaTributi  implements java.io.Serializable {
    /* codice tributo */
    private java.lang.String codiceTributo;

    /* anno tributo AAAA */
    private java.lang.String annoTributo;

    /* progressivo tributo */
    private java.lang.String progressivoTributo;

    /* tipo tributo */
    private java.lang.String tipoTributo;

    /* importo tributo */
    private java.math.BigDecimal impTributo;

    /* importo pagato compresi gli sgravi */
    private java.math.BigDecimal impPagatoCompresiSgravi;

    /* note tributo */
    private java.lang.String noteTributo;

    public ListaTributi() {
    }

    public ListaTributi(
           java.lang.String codiceTributo,
           java.lang.String annoTributo,
           java.lang.String progressivoTributo,
           java.lang.String tipoTributo,
           java.math.BigDecimal impTributo,
           java.math.BigDecimal impPagatoCompresiSgravi,
           java.lang.String noteTributo) {
           this.codiceTributo = codiceTributo;
           this.annoTributo = annoTributo;
           this.progressivoTributo = progressivoTributo;
           this.tipoTributo = tipoTributo;
           this.impTributo = impTributo;
           this.impPagatoCompresiSgravi = impPagatoCompresiSgravi;
           this.noteTributo = noteTributo;
    }


    /**
     * Gets the codiceTributo value for this ListaTributi.
     * 
     * @return codiceTributo   * codice tributo
     */
    public java.lang.String getCodiceTributo() {
        return codiceTributo;
    }


    /**
     * Sets the codiceTributo value for this ListaTributi.
     * 
     * @param codiceTributo   * codice tributo
     */
    public void setCodiceTributo(java.lang.String codiceTributo) {
        this.codiceTributo = codiceTributo;
    }


    /**
     * Gets the annoTributo value for this ListaTributi.
     * 
     * @return annoTributo   * anno tributo AAAA
     */
    public java.lang.String getAnnoTributo() {
        return annoTributo;
    }


    /**
     * Sets the annoTributo value for this ListaTributi.
     * 
     * @param annoTributo   * anno tributo AAAA
     */
    public void setAnnoTributo(java.lang.String annoTributo) {
        this.annoTributo = annoTributo;
    }


    /**
     * Gets the progressivoTributo value for this ListaTributi.
     * 
     * @return progressivoTributo   * progressivo tributo
     */
    public java.lang.String getProgressivoTributo() {
        return progressivoTributo;
    }


    /**
     * Sets the progressivoTributo value for this ListaTributi.
     * 
     * @param progressivoTributo   * progressivo tributo
     */
    public void setProgressivoTributo(java.lang.String progressivoTributo) {
        this.progressivoTributo = progressivoTributo;
    }


    /**
     * Gets the tipoTributo value for this ListaTributi.
     * 
     * @return tipoTributo   * tipo tributo
     */
    public java.lang.String getTipoTributo() {
        return tipoTributo;
    }


    /**
     * Sets the tipoTributo value for this ListaTributi.
     * 
     * @param tipoTributo   * tipo tributo
     */
    public void setTipoTributo(java.lang.String tipoTributo) {
        this.tipoTributo = tipoTributo;
    }


    /**
     * Gets the impTributo value for this ListaTributi.
     * 
     * @return impTributo   * importo tributo
     */
    public java.math.BigDecimal getImpTributo() {
        return impTributo;
    }


    /**
     * Sets the impTributo value for this ListaTributi.
     * 
     * @param impTributo   * importo tributo
     */
    public void setImpTributo(java.math.BigDecimal impTributo) {
        this.impTributo = impTributo;
    }


    /**
     * Gets the impPagatoCompresiSgravi value for this ListaTributi.
     * 
     * @return impPagatoCompresiSgravi   * importo pagato compresi gli sgravi
     */
    public java.math.BigDecimal getImpPagatoCompresiSgravi() {
        return impPagatoCompresiSgravi;
    }


    /**
     * Sets the impPagatoCompresiSgravi value for this ListaTributi.
     * 
     * @param impPagatoCompresiSgravi   * importo pagato compresi gli sgravi
     */
    public void setImpPagatoCompresiSgravi(java.math.BigDecimal impPagatoCompresiSgravi) {
        this.impPagatoCompresiSgravi = impPagatoCompresiSgravi;
    }


    /**
     * Gets the noteTributo value for this ListaTributi.
     * 
     * @return noteTributo   * note tributo
     */
    public java.lang.String getNoteTributo() {
        return noteTributo;
    }


    /**
     * Sets the noteTributo value for this ListaTributi.
     * 
     * @param noteTributo   * note tributo
     */
    public void setNoteTributo(java.lang.String noteTributo) {
        this.noteTributo = noteTributo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaTributi)) return false;
        ListaTributi other = (ListaTributi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceTributo==null && other.getCodiceTributo()==null) || 
             (this.codiceTributo!=null &&
              this.codiceTributo.equals(other.getCodiceTributo()))) &&
            ((this.annoTributo==null && other.getAnnoTributo()==null) || 
             (this.annoTributo!=null &&
              this.annoTributo.equals(other.getAnnoTributo()))) &&
            ((this.progressivoTributo==null && other.getProgressivoTributo()==null) || 
             (this.progressivoTributo!=null &&
              this.progressivoTributo.equals(other.getProgressivoTributo()))) &&
            ((this.tipoTributo==null && other.getTipoTributo()==null) || 
             (this.tipoTributo!=null &&
              this.tipoTributo.equals(other.getTipoTributo()))) &&
            ((this.impTributo==null && other.getImpTributo()==null) || 
             (this.impTributo!=null &&
              this.impTributo.equals(other.getImpTributo()))) &&
            ((this.impPagatoCompresiSgravi==null && other.getImpPagatoCompresiSgravi()==null) || 
             (this.impPagatoCompresiSgravi!=null &&
              this.impPagatoCompresiSgravi.equals(other.getImpPagatoCompresiSgravi()))) &&
            ((this.noteTributo==null && other.getNoteTributo()==null) || 
             (this.noteTributo!=null &&
              this.noteTributo.equals(other.getNoteTributo())));
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
        if (getCodiceTributo() != null) {
            _hashCode += getCodiceTributo().hashCode();
        }
        if (getAnnoTributo() != null) {
            _hashCode += getAnnoTributo().hashCode();
        }
        if (getProgressivoTributo() != null) {
            _hashCode += getProgressivoTributo().hashCode();
        }
        if (getTipoTributo() != null) {
            _hashCode += getTipoTributo().hashCode();
        }
        if (getImpTributo() != null) {
            _hashCode += getImpTributo().hashCode();
        }
        if (getImpPagatoCompresiSgravi() != null) {
            _hashCode += getImpPagatoCompresiSgravi().hashCode();
        }
        if (getNoteTributo() != null) {
            _hashCode += getNoteTributo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaTributi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaTributi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "progressivoTributo"));
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
        elemField.setFieldName("impTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impTributo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impPagatoCompresiSgravi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impPagatoCompresiSgravi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteTributo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "noteTributo"));
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
