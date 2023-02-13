/**
 * TipoBollettino.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class TipoBollettino  implements java.io.Serializable {
    /* Tipologia Documento (674, 896, ......) */
    private java.lang.String tipologiaDocumento;

    /* Numero Documento */
    private java.lang.String numeroDocumento;

    /* Anno Documento */
    private java.lang.String annoDocumento;

    /* Numero Rata */
    private java.lang.String numeroRata;

    /* Data Scadenza */
    private java.lang.String dataScadenza;

    /* Intestatario */
    private java.lang.String intestatario;

    /* CodiceFiscale – PIVA */
    private java.lang.String codiceFiscale_PIVA;

    /* Indirizzo */
    private java.lang.String indirizzo;

    /* Città */
    private java.lang.String citta;

    /* Numero di Conto Corrente di Accredito del Pagamento */
    private java.lang.String numeroCCAccreditoPagamento;

    /* IBAN di Accredito del Pagamento */
    private java.lang.String ibanAccreditoPagamento;

    /* tbVerbaliCDS */
    private com.seda.payer.integraente.webservice.dati.BollettinoCDS verbaliCDS;

    /* tbCodelineFreccia */
    private com.seda.payer.integraente.webservice.dati.BollettinoFreccia freccia;

    public TipoBollettino() {
    }

    public TipoBollettino(
           java.lang.String tipologiaDocumento,
           java.lang.String numeroDocumento,
           java.lang.String annoDocumento,
           java.lang.String numeroRata,
           java.lang.String dataScadenza,
           java.lang.String intestatario,
           java.lang.String codiceFiscale_PIVA,
           java.lang.String indirizzo,
           java.lang.String citta,
           java.lang.String numeroCCAccreditoPagamento,
           java.lang.String ibanAccreditoPagamento,
           com.seda.payer.integraente.webservice.dati.BollettinoCDS verbaliCDS,
           com.seda.payer.integraente.webservice.dati.BollettinoFreccia freccia) {
           this.tipologiaDocumento = tipologiaDocumento;
           this.numeroDocumento = numeroDocumento;
           this.annoDocumento = annoDocumento;
           this.numeroRata = numeroRata;
           this.dataScadenza = dataScadenza;
           this.intestatario = intestatario;
           this.codiceFiscale_PIVA = codiceFiscale_PIVA;
           this.indirizzo = indirizzo;
           this.citta = citta;
           this.numeroCCAccreditoPagamento = numeroCCAccreditoPagamento;
           this.ibanAccreditoPagamento = ibanAccreditoPagamento;
           this.verbaliCDS = verbaliCDS;
           this.freccia = freccia;
    }


    /**
     * Gets the tipologiaDocumento value for this TipoBollettino.
     * 
     * @return tipologiaDocumento   * Tipologia Documento (674, 896, ......)
     */
    public java.lang.String getTipologiaDocumento() {
        return tipologiaDocumento;
    }


    /**
     * Sets the tipologiaDocumento value for this TipoBollettino.
     * 
     * @param tipologiaDocumento   * Tipologia Documento (674, 896, ......)
     */
    public void setTipologiaDocumento(java.lang.String tipologiaDocumento) {
        this.tipologiaDocumento = tipologiaDocumento;
    }


    /**
     * Gets the numeroDocumento value for this TipoBollettino.
     * 
     * @return numeroDocumento   * Numero Documento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this TipoBollettino.
     * 
     * @param numeroDocumento   * Numero Documento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the annoDocumento value for this TipoBollettino.
     * 
     * @return annoDocumento   * Anno Documento
     */
    public java.lang.String getAnnoDocumento() {
        return annoDocumento;
    }


    /**
     * Sets the annoDocumento value for this TipoBollettino.
     * 
     * @param annoDocumento   * Anno Documento
     */
    public void setAnnoDocumento(java.lang.String annoDocumento) {
        this.annoDocumento = annoDocumento;
    }


    /**
     * Gets the numeroRata value for this TipoBollettino.
     * 
     * @return numeroRata   * Numero Rata
     */
    public java.lang.String getNumeroRata() {
        return numeroRata;
    }


    /**
     * Sets the numeroRata value for this TipoBollettino.
     * 
     * @param numeroRata   * Numero Rata
     */
    public void setNumeroRata(java.lang.String numeroRata) {
        this.numeroRata = numeroRata;
    }


    /**
     * Gets the dataScadenza value for this TipoBollettino.
     * 
     * @return dataScadenza   * Data Scadenza
     */
    public java.lang.String getDataScadenza() {
        return dataScadenza;
    }


    /**
     * Sets the dataScadenza value for this TipoBollettino.
     * 
     * @param dataScadenza   * Data Scadenza
     */
    public void setDataScadenza(java.lang.String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }


    /**
     * Gets the intestatario value for this TipoBollettino.
     * 
     * @return intestatario   * Intestatario
     */
    public java.lang.String getIntestatario() {
        return intestatario;
    }


    /**
     * Sets the intestatario value for this TipoBollettino.
     * 
     * @param intestatario   * Intestatario
     */
    public void setIntestatario(java.lang.String intestatario) {
        this.intestatario = intestatario;
    }


    /**
     * Gets the codiceFiscale_PIVA value for this TipoBollettino.
     * 
     * @return codiceFiscale_PIVA   * CodiceFiscale – PIVA
     */
    public java.lang.String getCodiceFiscale_PIVA() {
        return codiceFiscale_PIVA;
    }


    /**
     * Sets the codiceFiscale_PIVA value for this TipoBollettino.
     * 
     * @param codiceFiscale_PIVA   * CodiceFiscale – PIVA
     */
    public void setCodiceFiscale_PIVA(java.lang.String codiceFiscale_PIVA) {
        this.codiceFiscale_PIVA = codiceFiscale_PIVA;
    }


    /**
     * Gets the indirizzo value for this TipoBollettino.
     * 
     * @return indirizzo   * Indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this TipoBollettino.
     * 
     * @param indirizzo   * Indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the citta value for this TipoBollettino.
     * 
     * @return citta   * Città
     */
    public java.lang.String getCitta() {
        return citta;
    }


    /**
     * Sets the citta value for this TipoBollettino.
     * 
     * @param citta   * Città
     */
    public void setCitta(java.lang.String citta) {
        this.citta = citta;
    }


    /**
     * Gets the numeroCCAccreditoPagamento value for this TipoBollettino.
     * 
     * @return numeroCCAccreditoPagamento   * Numero di Conto Corrente di Accredito del Pagamento
     */
    public java.lang.String getNumeroCCAccreditoPagamento() {
        return numeroCCAccreditoPagamento;
    }


    /**
     * Sets the numeroCCAccreditoPagamento value for this TipoBollettino.
     * 
     * @param numeroCCAccreditoPagamento   * Numero di Conto Corrente di Accredito del Pagamento
     */
    public void setNumeroCCAccreditoPagamento(java.lang.String numeroCCAccreditoPagamento) {
        this.numeroCCAccreditoPagamento = numeroCCAccreditoPagamento;
    }


    /**
     * Gets the ibanAccreditoPagamento value for this TipoBollettino.
     * 
     * @return ibanAccreditoPagamento   * IBAN di Accredito del Pagamento
     */
    public java.lang.String getIbanAccreditoPagamento() {
        return ibanAccreditoPagamento;
    }


    /**
     * Sets the ibanAccreditoPagamento value for this TipoBollettino.
     * 
     * @param ibanAccreditoPagamento   * IBAN di Accredito del Pagamento
     */
    public void setIbanAccreditoPagamento(java.lang.String ibanAccreditoPagamento) {
        this.ibanAccreditoPagamento = ibanAccreditoPagamento;
    }


    /**
     * Gets the verbaliCDS value for this TipoBollettino.
     * 
     * @return verbaliCDS   * tbVerbaliCDS
     */
    public com.seda.payer.integraente.webservice.dati.BollettinoCDS getVerbaliCDS() {
        return verbaliCDS;
    }


    /**
     * Sets the verbaliCDS value for this TipoBollettino.
     * 
     * @param verbaliCDS   * tbVerbaliCDS
     */
    public void setVerbaliCDS(com.seda.payer.integraente.webservice.dati.BollettinoCDS verbaliCDS) {
        this.verbaliCDS = verbaliCDS;
    }


    /**
     * Gets the freccia value for this TipoBollettino.
     * 
     * @return freccia   * tbCodelineFreccia
     */
    public com.seda.payer.integraente.webservice.dati.BollettinoFreccia getFreccia() {
        return freccia;
    }


    /**
     * Sets the freccia value for this TipoBollettino.
     * 
     * @param freccia   * tbCodelineFreccia
     */
    public void setFreccia(com.seda.payer.integraente.webservice.dati.BollettinoFreccia freccia) {
        this.freccia = freccia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoBollettino)) return false;
        TipoBollettino other = (TipoBollettino) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipologiaDocumento==null && other.getTipologiaDocumento()==null) || 
             (this.tipologiaDocumento!=null &&
              this.tipologiaDocumento.equals(other.getTipologiaDocumento()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.annoDocumento==null && other.getAnnoDocumento()==null) || 
             (this.annoDocumento!=null &&
              this.annoDocumento.equals(other.getAnnoDocumento()))) &&
            ((this.numeroRata==null && other.getNumeroRata()==null) || 
             (this.numeroRata!=null &&
              this.numeroRata.equals(other.getNumeroRata()))) &&
            ((this.dataScadenza==null && other.getDataScadenza()==null) || 
             (this.dataScadenza!=null &&
              this.dataScadenza.equals(other.getDataScadenza()))) &&
            ((this.intestatario==null && other.getIntestatario()==null) || 
             (this.intestatario!=null &&
              this.intestatario.equals(other.getIntestatario()))) &&
            ((this.codiceFiscale_PIVA==null && other.getCodiceFiscale_PIVA()==null) || 
             (this.codiceFiscale_PIVA!=null &&
              this.codiceFiscale_PIVA.equals(other.getCodiceFiscale_PIVA()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.citta==null && other.getCitta()==null) || 
             (this.citta!=null &&
              this.citta.equals(other.getCitta()))) &&
            ((this.numeroCCAccreditoPagamento==null && other.getNumeroCCAccreditoPagamento()==null) || 
             (this.numeroCCAccreditoPagamento!=null &&
              this.numeroCCAccreditoPagamento.equals(other.getNumeroCCAccreditoPagamento()))) &&
            ((this.ibanAccreditoPagamento==null && other.getIbanAccreditoPagamento()==null) || 
             (this.ibanAccreditoPagamento!=null &&
              this.ibanAccreditoPagamento.equals(other.getIbanAccreditoPagamento()))) &&
            ((this.verbaliCDS==null && other.getVerbaliCDS()==null) || 
             (this.verbaliCDS!=null &&
              this.verbaliCDS.equals(other.getVerbaliCDS()))) &&
            ((this.freccia==null && other.getFreccia()==null) || 
             (this.freccia!=null &&
              this.freccia.equals(other.getFreccia())));
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
        if (getTipologiaDocumento() != null) {
            _hashCode += getTipologiaDocumento().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getAnnoDocumento() != null) {
            _hashCode += getAnnoDocumento().hashCode();
        }
        if (getNumeroRata() != null) {
            _hashCode += getNumeroRata().hashCode();
        }
        if (getDataScadenza() != null) {
            _hashCode += getDataScadenza().hashCode();
        }
        if (getIntestatario() != null) {
            _hashCode += getIntestatario().hashCode();
        }
        if (getCodiceFiscale_PIVA() != null) {
            _hashCode += getCodiceFiscale_PIVA().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getCitta() != null) {
            _hashCode += getCitta().hashCode();
        }
        if (getNumeroCCAccreditoPagamento() != null) {
            _hashCode += getNumeroCCAccreditoPagamento().hashCode();
        }
        if (getIbanAccreditoPagamento() != null) {
            _hashCode += getIbanAccreditoPagamento().hashCode();
        }
        if (getVerbaliCDS() != null) {
            _hashCode += getVerbaliCDS().hashCode();
        }
        if (getFreccia() != null) {
            _hashCode += getFreccia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoBollettino.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TipoBollettino"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataScadenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intestatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "intestatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale_PIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscale_PIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "citta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCCAccreditoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroCCAccreditoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanAccreditoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ibanAccreditoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbaliCDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "verbaliCDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "BollettinoCDS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "freccia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "BollettinoFreccia"));
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
