/**
 * RecuperaDettDocAttiContenziosoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDettDocAttiContenziosoRequest  implements java.io.Serializable {
    /* Codice utente */
    private java.lang.String codiceUtente;

    /* Codice ente */
    private java.lang.String codiceEnte;

    /* Codice fiscale */
    private java.lang.String codiceFiscale;

    /* Tipo servizio EP=entrate */
    private java.lang.String tipoServizio;

    /* Tipo richiesta I=Insoluti e S=Storico */
    private java.lang.String tipoRichiesta;

    /* Numero documento */
    private java.lang.String numeroDocumento;

    /* Flag accesso 'M'=EC Manager e 'C'=Cittadino */
    private java.lang.String flagAccesso;

    /* Integrazione immediata seda o differita */
    private java.lang.String tipoIntegrazione;

    /* Url di integrazione */
    private java.lang.String urlIntegrazione;

    /* Progressivo Coobbligato */
    private java.math.BigDecimal progCoobbligato;

    public RecuperaDettDocAttiContenziosoRequest() {
    }

    public RecuperaDettDocAttiContenziosoRequest(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String codiceFiscale,
           java.lang.String tipoServizio,
           java.lang.String tipoRichiesta,
           java.lang.String numeroDocumento,
           java.lang.String flagAccesso,
           java.lang.String tipoIntegrazione,
           java.lang.String urlIntegrazione,
           java.math.BigDecimal progCoobbligato) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.codiceFiscale = codiceFiscale;
           this.tipoServizio = tipoServizio;
           this.tipoRichiesta = tipoRichiesta;
           this.numeroDocumento = numeroDocumento;
           this.flagAccesso = flagAccesso;
           this.tipoIntegrazione = tipoIntegrazione;
           this.urlIntegrazione = urlIntegrazione;
           this.progCoobbligato = progCoobbligato;
    }


    /**
     * Gets the codiceUtente value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return codiceUtente   * Codice utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param codiceUtente   * Codice utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return codiceEnte   * Codice ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param codiceEnte   * Codice ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the codiceFiscale value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return codiceFiscale   * Codice fiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param codiceFiscale   * Codice fiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the tipoServizio value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return tipoServizio   * Tipo servizio EP=entrate
     */
    public java.lang.String getTipoServizio() {
        return tipoServizio;
    }


    /**
     * Sets the tipoServizio value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param tipoServizio   * Tipo servizio EP=entrate
     */
    public void setTipoServizio(java.lang.String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }


    /**
     * Gets the tipoRichiesta value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return tipoRichiesta   * Tipo richiesta I=Insoluti e S=Storico
     */
    public java.lang.String getTipoRichiesta() {
        return tipoRichiesta;
    }


    /**
     * Sets the tipoRichiesta value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param tipoRichiesta   * Tipo richiesta I=Insoluti e S=Storico
     */
    public void setTipoRichiesta(java.lang.String tipoRichiesta) {
        this.tipoRichiesta = tipoRichiesta;
    }


    /**
     * Gets the numeroDocumento value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return numeroDocumento   * Numero documento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param numeroDocumento   * Numero documento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the flagAccesso value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return flagAccesso   * Flag accesso 'M'=EC Manager e 'C'=Cittadino
     */
    public java.lang.String getFlagAccesso() {
        return flagAccesso;
    }


    /**
     * Sets the flagAccesso value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param flagAccesso   * Flag accesso 'M'=EC Manager e 'C'=Cittadino
     */
    public void setFlagAccesso(java.lang.String flagAccesso) {
        this.flagAccesso = flagAccesso;
    }


    /**
     * Gets the tipoIntegrazione value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return tipoIntegrazione   * Integrazione immediata seda o differita
     */
    public java.lang.String getTipoIntegrazione() {
        return tipoIntegrazione;
    }


    /**
     * Sets the tipoIntegrazione value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param tipoIntegrazione   * Integrazione immediata seda o differita
     */
    public void setTipoIntegrazione(java.lang.String tipoIntegrazione) {
        this.tipoIntegrazione = tipoIntegrazione;
    }


    /**
     * Gets the urlIntegrazione value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return urlIntegrazione   * Url di integrazione
     */
    public java.lang.String getUrlIntegrazione() {
        return urlIntegrazione;
    }


    /**
     * Sets the urlIntegrazione value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param urlIntegrazione   * Url di integrazione
     */
    public void setUrlIntegrazione(java.lang.String urlIntegrazione) {
        this.urlIntegrazione = urlIntegrazione;
    }


    /**
     * Gets the progCoobbligato value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @return progCoobbligato   * Progressivo Coobbligato
     */
    public java.math.BigDecimal getProgCoobbligato() {
        return progCoobbligato;
    }


    /**
     * Sets the progCoobbligato value for this RecuperaDettDocAttiContenziosoRequest.
     * 
     * @param progCoobbligato   * Progressivo Coobbligato
     */
    public void setProgCoobbligato(java.math.BigDecimal progCoobbligato) {
        this.progCoobbligato = progCoobbligato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettDocAttiContenziosoRequest)) return false;
        RecuperaDettDocAttiContenziosoRequest other = (RecuperaDettDocAttiContenziosoRequest) obj;
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
            ((this.tipoRichiesta==null && other.getTipoRichiesta()==null) || 
             (this.tipoRichiesta!=null &&
              this.tipoRichiesta.equals(other.getTipoRichiesta()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.flagAccesso==null && other.getFlagAccesso()==null) || 
             (this.flagAccesso!=null &&
              this.flagAccesso.equals(other.getFlagAccesso()))) &&
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
        if (getTipoRichiesta() != null) {
            _hashCode += getTipoRichiesta().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getFlagAccesso() != null) {
            _hashCode += getFlagAccesso().hashCode();
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
        new org.apache.axis.description.TypeDesc(RecuperaDettDocAttiContenziosoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDettDocAttiContenziosoRequest"));
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
        elemField.setFieldName("tipoRichiesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoRichiesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAccesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "flagAccesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
