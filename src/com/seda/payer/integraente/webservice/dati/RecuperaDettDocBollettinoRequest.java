/**
 * RecuperaDettDocBollettinoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDettDocBollettinoRequest  implements java.io.Serializable {
    /* codice utente */
    private java.lang.String codiceUtente;

    /* codice ente */
    private java.lang.String codiceEnte;

    /* codice fiscale */
    private java.lang.String codiceFiscale;

    /* tipo servizio EP = entrate */
    private java.lang.String tipoServizio;

    /* documento obbligatorio */
    private java.lang.String documento;

    /* tipo richiesta R=Bollettino e 4=F24 */
    private java.lang.String tipoDocumento;

    /* numero rata su saldo doc sempre '00' */
    private java.lang.String numRata;

    /* generazione id bollettino valori (S/N) */
    private java.lang.String flgLimit;

    /* importo */
    private java.math.BigDecimal importo;

    /* impOneri */
    private java.math.BigDecimal impOneri;

    /* Integrazione immediata seda o differita */
    private java.lang.String tipoIntegrazione;

    /* Url di integrazione */
    private java.lang.String urlIntegrazione;

    /* Progressivo Coobbligato */
    private java.math.BigDecimal progCoobbligato;

    public RecuperaDettDocBollettinoRequest() {
    }

    public RecuperaDettDocBollettinoRequest(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String codiceFiscale,
           java.lang.String tipoServizio,
           java.lang.String documento,
           java.lang.String tipoDocumento,
           java.lang.String numRata,
           java.lang.String flgLimit,
           java.math.BigDecimal importo,
           java.math.BigDecimal impOneri,
           java.lang.String tipoIntegrazione,
           java.lang.String urlIntegrazione,
           java.math.BigDecimal progCoobbligato) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.codiceFiscale = codiceFiscale;
           this.tipoServizio = tipoServizio;
           this.documento = documento;
           this.tipoDocumento = tipoDocumento;
           this.numRata = numRata;
           this.flgLimit = flgLimit;
           this.importo = importo;
           this.impOneri = impOneri;
           this.tipoIntegrazione = tipoIntegrazione;
           this.urlIntegrazione = urlIntegrazione;
           this.progCoobbligato = progCoobbligato;
    }


    /**
     * Gets the codiceUtente value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return codiceUtente   * codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param codiceUtente   * codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return codiceEnte   * codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param codiceEnte   * codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the codiceFiscale value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return codiceFiscale   * codice fiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param codiceFiscale   * codice fiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoServizio value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return tipoServizio   * tipo servizio EP = entrate
     */
    public java.lang.String getTipoServizio() {
        return tipoServizio;
    }


    /**
     * Sets the tipoServizio value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param tipoServizio   * tipo servizio EP = entrate
     */
    public void setTipoServizio(java.lang.String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }


    /**
     * Gets the documento value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return documento   * documento obbligatorio
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param documento   * documento obbligatorio
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the tipoDocumento value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return tipoDocumento   * tipo richiesta R=Bollettino e 4=F24
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param tipoDocumento   * tipo richiesta R=Bollettino e 4=F24
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numRata value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return numRata   * numero rata su saldo doc sempre '00'
     */
    public java.lang.String getNumRata() {
        return numRata;
    }


    /**
     * Sets the numRata value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param numRata   * numero rata su saldo doc sempre '00'
     */
    public void setNumRata(java.lang.String numRata) {
        this.numRata = numRata;
    }


    /**
     * Gets the flgLimit value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return flgLimit   * generazione id bollettino valori (S/N)
     */
    public java.lang.String getFlgLimit() {
        return flgLimit;
    }


    /**
     * Sets the flgLimit value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param flgLimit   * generazione id bollettino valori (S/N)
     */
    public void setFlgLimit(java.lang.String flgLimit) {
        this.flgLimit = flgLimit;
    }


    /**
     * Gets the importo value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return importo   * importo
     */
    public java.math.BigDecimal getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param importo   * importo
     */
    public void setImporto(java.math.BigDecimal importo) {
        this.importo = importo;
    }


    /**
     * Gets the impOneri value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return impOneri   * impOneri
     */
    public java.math.BigDecimal getImpOneri() {
        return impOneri;
    }


    /**
     * Sets the impOneri value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param impOneri   * impOneri
     */
    public void setImpOneri(java.math.BigDecimal impOneri) {
        this.impOneri = impOneri;
    }


    /**
     * Gets the tipoIntegrazione value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return tipoIntegrazione   * Integrazione immediata seda o differita
     */
    public java.lang.String getTipoIntegrazione() {
        return tipoIntegrazione;
    }


    /**
     * Sets the tipoIntegrazione value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param tipoIntegrazione   * Integrazione immediata seda o differita
     */
    public void setTipoIntegrazione(java.lang.String tipoIntegrazione) {
        this.tipoIntegrazione = tipoIntegrazione;
    }


    /**
     * Gets the urlIntegrazione value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return urlIntegrazione   * Url di integrazione
     */
    public java.lang.String getUrlIntegrazione() {
        return urlIntegrazione;
    }


    /**
     * Sets the urlIntegrazione value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param urlIntegrazione   * Url di integrazione
     */
    public void setUrlIntegrazione(java.lang.String urlIntegrazione) {
        this.urlIntegrazione = urlIntegrazione;
    }


    /**
     * Gets the progCoobbligato value for this RecuperaDettDocBollettinoRequest.
     * 
     * @return progCoobbligato   * Progressivo Coobbligato
     */
    public java.math.BigDecimal getProgCoobbligato() {
        return progCoobbligato;
    }


    /**
     * Sets the progCoobbligato value for this RecuperaDettDocBollettinoRequest.
     * 
     * @param progCoobbligato   * Progressivo Coobbligato
     */
    public void setProgCoobbligato(java.math.BigDecimal progCoobbligato) {
        this.progCoobbligato = progCoobbligato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettDocBollettinoRequest)) return false;
        RecuperaDettDocBollettinoRequest other = (RecuperaDettDocBollettinoRequest) obj;
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
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.tipoServizio==null && other.getTipoServizio()==null) || 
             (this.tipoServizio!=null &&
              this.tipoServizio.equals(other.getTipoServizio()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numRata==null && other.getNumRata()==null) || 
             (this.numRata!=null &&
              this.numRata.equals(other.getNumRata()))) &&
            ((this.flgLimit==null && other.getFlgLimit()==null) || 
             (this.flgLimit!=null &&
              this.flgLimit.equals(other.getFlgLimit()))) &&
            ((this.importo==null && other.getImporto()==null) || 
             (this.importo!=null &&
              this.importo.equals(other.getImporto()))) &&
            ((this.impOneri==null && other.getImpOneri()==null) || 
             (this.impOneri!=null &&
              this.impOneri.equals(other.getImpOneri()))) &&
            ((this.tipoIntegrazione==null && other.getTipoIntegrazione()==null) || 
             (this.tipoIntegrazione!=null &&
              this.tipoIntegrazione.equals(other.getTipoIntegrazione()))) &&
            ((this.urlIntegrazione==null && other.getUrlIntegrazione()==null) || 
             (this.urlIntegrazione!=null &&
              this.urlIntegrazione.equals(other.getUrlIntegrazione()))) &&
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
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getTipoServizio() != null) {
            _hashCode += getTipoServizio().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getNumRata() != null) {
            _hashCode += getNumRata().hashCode();
        }
        if (getFlgLimit() != null) {
            _hashCode += getFlgLimit().hashCode();
        }
        if (getImporto() != null) {
            _hashCode += getImporto().hashCode();
        }
        if (getImpOneri() != null) {
            _hashCode += getImpOneri().hashCode();
        }
        if (getTipoIntegrazione() != null) {
            _hashCode += getTipoIntegrazione().hashCode();
        }
        if (getUrlIntegrazione() != null) {
            _hashCode += getUrlIntegrazione().hashCode();
        }
        if (getProgCoobbligato() != null) {
            _hashCode += getProgCoobbligato().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDettDocBollettinoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDettDocBollettinoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flgLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flgLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "importo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impOneri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impOneri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIntegrazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoIntegrazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlIntegrazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "urlIntegrazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
