/**
 * PagamentoHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class PagamentoHost  implements java.io.Serializable {
    private java.lang.String codiceUtente;

    private java.lang.String codiceEnte;

    private java.lang.String numBorsellino;

    private java.lang.String dataScadenzaRata;

    private java.math.BigDecimal importo;

    private java.lang.String canale;

    private java.lang.String flagAcquisizione;

    public PagamentoHost() {
    }

    public PagamentoHost(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String numBorsellino,
           java.lang.String dataScadenzaRata,
           java.math.BigDecimal importo,
           java.lang.String canale,
           java.lang.String flagAcquisizione) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.numBorsellino = numBorsellino;
           this.dataScadenzaRata = dataScadenzaRata;
           this.importo = importo;
           this.canale = canale;
           this.flagAcquisizione = flagAcquisizione;
    }


    /**
     * Gets the codiceUtente value for this PagamentoHost.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this PagamentoHost.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this PagamentoHost.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this PagamentoHost.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the numBorsellino value for this PagamentoHost.
     * 
     * @return numBorsellino
     */
    public java.lang.String getNumBorsellino() {
        return numBorsellino;
    }


    /**
     * Sets the numBorsellino value for this PagamentoHost.
     * 
     * @param numBorsellino
     */
    public void setNumBorsellino(java.lang.String numBorsellino) {
        this.numBorsellino = numBorsellino;
    }


    /**
     * Gets the dataScadenzaRata value for this PagamentoHost.
     * 
     * @return dataScadenzaRata
     */
    public java.lang.String getDataScadenzaRata() {
        return dataScadenzaRata;
    }


    /**
     * Sets the dataScadenzaRata value for this PagamentoHost.
     * 
     * @param dataScadenzaRata
     */
    public void setDataScadenzaRata(java.lang.String dataScadenzaRata) {
        this.dataScadenzaRata = dataScadenzaRata;
    }


    /**
     * Gets the importo value for this PagamentoHost.
     * 
     * @return importo
     */
    public java.math.BigDecimal getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this PagamentoHost.
     * 
     * @param importo
     */
    public void setImporto(java.math.BigDecimal importo) {
        this.importo = importo;
    }


    /**
     * Gets the canale value for this PagamentoHost.
     * 
     * @return canale
     */
    public java.lang.String getCanale() {
        return canale;
    }


    /**
     * Sets the canale value for this PagamentoHost.
     * 
     * @param canale
     */
    public void setCanale(java.lang.String canale) {
        this.canale = canale;
    }


    /**
     * Gets the flagAcquisizione value for this PagamentoHost.
     * 
     * @return flagAcquisizione
     */
    public java.lang.String getFlagAcquisizione() {
        return flagAcquisizione;
    }


    /**
     * Sets the flagAcquisizione value for this PagamentoHost.
     * 
     * @param flagAcquisizione
     */
    public void setFlagAcquisizione(java.lang.String flagAcquisizione) {
        this.flagAcquisizione = flagAcquisizione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagamentoHost)) return false;
        PagamentoHost other = (PagamentoHost) obj;
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
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.numBorsellino==null && other.getNumBorsellino()==null) || 
             (this.numBorsellino!=null &&
              this.numBorsellino.equals(other.getNumBorsellino()))) &&
            ((this.dataScadenzaRata==null && other.getDataScadenzaRata()==null) || 
             (this.dataScadenzaRata!=null &&
              this.dataScadenzaRata.equals(other.getDataScadenzaRata()))) &&
            ((this.importo==null && other.getImporto()==null) || 
             (this.importo!=null &&
              this.importo.equals(other.getImporto()))) &&
            ((this.canale==null && other.getCanale()==null) || 
             (this.canale!=null &&
              this.canale.equals(other.getCanale()))) &&
            ((this.flagAcquisizione==null && other.getFlagAcquisizione()==null) || 
             (this.flagAcquisizione!=null &&
              this.flagAcquisizione.equals(other.getFlagAcquisizione())));
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
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getNumBorsellino() != null) {
            _hashCode += getNumBorsellino().hashCode();
        }
        if (getDataScadenzaRata() != null) {
            _hashCode += getDataScadenzaRata().hashCode();
        }
        if (getImporto() != null) {
            _hashCode += getImporto().hashCode();
        }
        if (getCanale() != null) {
            _hashCode += getCanale().hashCode();
        }
        if (getFlagAcquisizione() != null) {
            _hashCode += getFlagAcquisizione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagamentoHost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "PagamentoHost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numBorsellino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numBorsellino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScadenzaRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataScadenzaRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "importo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "canale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAcquisizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagAcquisizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
