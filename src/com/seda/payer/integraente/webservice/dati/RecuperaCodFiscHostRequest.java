/**
 * RecuperaCodFiscHostRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaCodFiscHostRequest  implements java.io.Serializable {
    /* Codice Utente */
    private java.lang.String codiceUtente;

    /* Id Documento */
    private java.lang.String idDocumento;

    /* Numero Bollettino */
    private java.math.BigDecimal numeroBollettino;

    /* Numero Raccomandata */
    private java.lang.String numeroRaccomandata;

    /* Numero Cronologico */
    private java.lang.String numeroCronologico;

    /* Id BarCode */
    private java.lang.String idBarCode;

    /* Id Procedura */
    private java.lang.String idProcedura;

    /* Progressivo Coobbligato */
    private java.math.BigDecimal progCoobbligato;

    public RecuperaCodFiscHostRequest() {
    }

    public RecuperaCodFiscHostRequest(
           java.lang.String codiceUtente,
           java.lang.String idDocumento,
           java.math.BigDecimal numeroBollettino,
           java.lang.String numeroRaccomandata,
           java.lang.String numeroCronologico,
           java.lang.String idBarCode,
           java.lang.String idProcedura,
           java.math.BigDecimal progCoobbligato) {
           this.codiceUtente = codiceUtente;
           this.idDocumento = idDocumento;
           this.numeroBollettino = numeroBollettino;
           this.numeroRaccomandata = numeroRaccomandata;
           this.numeroCronologico = numeroCronologico;
           this.idBarCode = idBarCode;
           this.idProcedura = idProcedura;
           this.progCoobbligato = progCoobbligato;
    }


    /**
     * Gets the codiceUtente value for this RecuperaCodFiscHostRequest.
     * 
     * @return codiceUtente   * Codice Utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaCodFiscHostRequest.
     * 
     * @param codiceUtente   * Codice Utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the idDocumento value for this RecuperaCodFiscHostRequest.
     * 
     * @return idDocumento   * Id Documento
     */
    public java.lang.String getIdDocumento() {
        return idDocumento;
    }


    /**
     * Sets the idDocumento value for this RecuperaCodFiscHostRequest.
     * 
     * @param idDocumento   * Id Documento
     */
    public void setIdDocumento(java.lang.String idDocumento) {
        this.idDocumento = idDocumento;
    }


    /**
     * Gets the numeroBollettino value for this RecuperaCodFiscHostRequest.
     * 
     * @return numeroBollettino   * Numero Bollettino
     */
    public java.math.BigDecimal getNumeroBollettino() {
        return numeroBollettino;
    }


    /**
     * Sets the numeroBollettino value for this RecuperaCodFiscHostRequest.
     * 
     * @param numeroBollettino   * Numero Bollettino
     */
    public void setNumeroBollettino(java.math.BigDecimal numeroBollettino) {
        this.numeroBollettino = numeroBollettino;
    }


    /**
     * Gets the numeroRaccomandata value for this RecuperaCodFiscHostRequest.
     * 
     * @return numeroRaccomandata   * Numero Raccomandata
     */
    public java.lang.String getNumeroRaccomandata() {
        return numeroRaccomandata;
    }


    /**
     * Sets the numeroRaccomandata value for this RecuperaCodFiscHostRequest.
     * 
     * @param numeroRaccomandata   * Numero Raccomandata
     */
    public void setNumeroRaccomandata(java.lang.String numeroRaccomandata) {
        this.numeroRaccomandata = numeroRaccomandata;
    }


    /**
     * Gets the numeroCronologico value for this RecuperaCodFiscHostRequest.
     * 
     * @return numeroCronologico   * Numero Cronologico
     */
    public java.lang.String getNumeroCronologico() {
        return numeroCronologico;
    }


    /**
     * Sets the numeroCronologico value for this RecuperaCodFiscHostRequest.
     * 
     * @param numeroCronologico   * Numero Cronologico
     */
    public void setNumeroCronologico(java.lang.String numeroCronologico) {
        this.numeroCronologico = numeroCronologico;
    }


    /**
     * Gets the idBarCode value for this RecuperaCodFiscHostRequest.
     * 
     * @return idBarCode   * Id BarCode
     */
    public java.lang.String getIdBarCode() {
        return idBarCode;
    }


    /**
     * Sets the idBarCode value for this RecuperaCodFiscHostRequest.
     * 
     * @param idBarCode   * Id BarCode
     */
    public void setIdBarCode(java.lang.String idBarCode) {
        this.idBarCode = idBarCode;
    }


    /**
     * Gets the idProcedura value for this RecuperaCodFiscHostRequest.
     * 
     * @return idProcedura   * Id Procedura
     */
    public java.lang.String getIdProcedura() {
        return idProcedura;
    }


    /**
     * Sets the idProcedura value for this RecuperaCodFiscHostRequest.
     * 
     * @param idProcedura   * Id Procedura
     */
    public void setIdProcedura(java.lang.String idProcedura) {
        this.idProcedura = idProcedura;
    }


    /**
     * Gets the progCoobbligato value for this RecuperaCodFiscHostRequest.
     * 
     * @return progCoobbligato   * Progressivo Coobbligato
     */
    public java.math.BigDecimal getProgCoobbligato() {
        return progCoobbligato;
    }


    /**
     * Sets the progCoobbligato value for this RecuperaCodFiscHostRequest.
     * 
     * @param progCoobbligato   * Progressivo Coobbligato
     */
    public void setProgCoobbligato(java.math.BigDecimal progCoobbligato) {
        this.progCoobbligato = progCoobbligato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaCodFiscHostRequest)) return false;
        RecuperaCodFiscHostRequest other = (RecuperaCodFiscHostRequest) obj;
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
            ((this.idDocumento==null && other.getIdDocumento()==null) || 
             (this.idDocumento!=null &&
              this.idDocumento.equals(other.getIdDocumento()))) &&
            ((this.numeroBollettino==null && other.getNumeroBollettino()==null) || 
             (this.numeroBollettino!=null &&
              this.numeroBollettino.equals(other.getNumeroBollettino()))) &&
            ((this.numeroRaccomandata==null && other.getNumeroRaccomandata()==null) || 
             (this.numeroRaccomandata!=null &&
              this.numeroRaccomandata.equals(other.getNumeroRaccomandata()))) &&
            ((this.numeroCronologico==null && other.getNumeroCronologico()==null) || 
             (this.numeroCronologico!=null &&
              this.numeroCronologico.equals(other.getNumeroCronologico()))) &&
            ((this.idBarCode==null && other.getIdBarCode()==null) || 
             (this.idBarCode!=null &&
              this.idBarCode.equals(other.getIdBarCode()))) &&
            ((this.idProcedura==null && other.getIdProcedura()==null) || 
             (this.idProcedura!=null &&
              this.idProcedura.equals(other.getIdProcedura()))) &&
            ((this.progCoobbligato==null && other.getProgCoobbligato()==null) || 
             (this.progCoobbligato!=null &&
              this.progCoobbligato.equals(other.getProgCoobbligato())));
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
        if (getIdDocumento() != null) {
            _hashCode += getIdDocumento().hashCode();
        }
        if (getNumeroBollettino() != null) {
            _hashCode += getNumeroBollettino().hashCode();
        }
        if (getNumeroRaccomandata() != null) {
            _hashCode += getNumeroRaccomandata().hashCode();
        }
        if (getNumeroCronologico() != null) {
            _hashCode += getNumeroCronologico().hashCode();
        }
        if (getIdBarCode() != null) {
            _hashCode += getIdBarCode().hashCode();
        }
        if (getIdProcedura() != null) {
            _hashCode += getIdProcedura().hashCode();
        }
        if (getProgCoobbligato() != null) {
            _hashCode += getProgCoobbligato().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaCodFiscHostRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaCodFiscHostRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "idDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRaccomandata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroRaccomandata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCronologico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroCronologico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBarCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "idBarCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProcedura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "idProcedura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progCoobbligato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "progCoobbligato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
