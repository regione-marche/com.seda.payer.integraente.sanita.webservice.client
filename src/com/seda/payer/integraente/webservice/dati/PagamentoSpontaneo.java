/**
 * PagamentoSpontaneo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class PagamentoSpontaneo  implements java.io.Serializable {
    private java.lang.String denominazione;

    private java.lang.String indirizzo;

    private java.lang.String codiceBelfioreComune;

    private java.lang.String siglaProvincia;

    private java.lang.String CAP;

    private com.seda.payer.integraente.webservice.dati.TipoSpontaneo tipoSpontaneo;

    private com.seda.payer.integraente.webservice.dati.TipoCDS tipoCDS;

    public PagamentoSpontaneo() {
    }

    public PagamentoSpontaneo(
           java.lang.String denominazione,
           java.lang.String indirizzo,
           java.lang.String codiceBelfioreComune,
           java.lang.String siglaProvincia,
           java.lang.String CAP,
           com.seda.payer.integraente.webservice.dati.TipoSpontaneo tipoSpontaneo,
           com.seda.payer.integraente.webservice.dati.TipoCDS tipoCDS) {
           this.denominazione = denominazione;
           this.indirizzo = indirizzo;
           this.codiceBelfioreComune = codiceBelfioreComune;
           this.siglaProvincia = siglaProvincia;
           this.CAP = CAP;
           this.tipoSpontaneo = tipoSpontaneo;
           this.tipoCDS = tipoCDS;
    }


    /**
     * Gets the denominazione value for this PagamentoSpontaneo.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this PagamentoSpontaneo.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the indirizzo value for this PagamentoSpontaneo.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this PagamentoSpontaneo.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the codiceBelfioreComune value for this PagamentoSpontaneo.
     * 
     * @return codiceBelfioreComune
     */
    public java.lang.String getCodiceBelfioreComune() {
        return codiceBelfioreComune;
    }


    /**
     * Sets the codiceBelfioreComune value for this PagamentoSpontaneo.
     * 
     * @param codiceBelfioreComune
     */
    public void setCodiceBelfioreComune(java.lang.String codiceBelfioreComune) {
        this.codiceBelfioreComune = codiceBelfioreComune;
    }


    /**
     * Gets the siglaProvincia value for this PagamentoSpontaneo.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this PagamentoSpontaneo.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the CAP value for this PagamentoSpontaneo.
     * 
     * @return CAP
     */
    public java.lang.String getCAP() {
        return CAP;
    }


    /**
     * Sets the CAP value for this PagamentoSpontaneo.
     * 
     * @param CAP
     */
    public void setCAP(java.lang.String CAP) {
        this.CAP = CAP;
    }


    /**
     * Gets the tipoSpontaneo value for this PagamentoSpontaneo.
     * 
     * @return tipoSpontaneo
     */
    public com.seda.payer.integraente.webservice.dati.TipoSpontaneo getTipoSpontaneo() {
        return tipoSpontaneo;
    }


    /**
     * Sets the tipoSpontaneo value for this PagamentoSpontaneo.
     * 
     * @param tipoSpontaneo
     */
    public void setTipoSpontaneo(com.seda.payer.integraente.webservice.dati.TipoSpontaneo tipoSpontaneo) {
        this.tipoSpontaneo = tipoSpontaneo;
    }


    /**
     * Gets the tipoCDS value for this PagamentoSpontaneo.
     * 
     * @return tipoCDS
     */
    public com.seda.payer.integraente.webservice.dati.TipoCDS getTipoCDS() {
        return tipoCDS;
    }


    /**
     * Sets the tipoCDS value for this PagamentoSpontaneo.
     * 
     * @param tipoCDS
     */
    public void setTipoCDS(com.seda.payer.integraente.webservice.dati.TipoCDS tipoCDS) {
        this.tipoCDS = tipoCDS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagamentoSpontaneo)) return false;
        PagamentoSpontaneo other = (PagamentoSpontaneo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.codiceBelfioreComune==null && other.getCodiceBelfioreComune()==null) || 
             (this.codiceBelfioreComune!=null &&
              this.codiceBelfioreComune.equals(other.getCodiceBelfioreComune()))) &&
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia()))) &&
            ((this.CAP==null && other.getCAP()==null) || 
             (this.CAP!=null &&
              this.CAP.equals(other.getCAP()))) &&
            ((this.tipoSpontaneo==null && other.getTipoSpontaneo()==null) || 
             (this.tipoSpontaneo!=null &&
              this.tipoSpontaneo.equals(other.getTipoSpontaneo()))) &&
            ((this.tipoCDS==null && other.getTipoCDS()==null) || 
             (this.tipoCDS!=null &&
              this.tipoCDS.equals(other.getTipoCDS())));
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
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getCodiceBelfioreComune() != null) {
            _hashCode += getCodiceBelfioreComune().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        if (getCAP() != null) {
            _hashCode += getCAP().hashCode();
        }
        if (getTipoSpontaneo() != null) {
            _hashCode += getTipoSpontaneo().hashCode();
        }
        if (getTipoCDS() != null) {
            _hashCode += getTipoCDS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagamentoSpontaneo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "PagamentoSpontaneo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfioreComune");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceBelfioreComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "siglaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "CAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSpontaneo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoSpontaneo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TipoSpontaneo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoCDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TipoCDS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
