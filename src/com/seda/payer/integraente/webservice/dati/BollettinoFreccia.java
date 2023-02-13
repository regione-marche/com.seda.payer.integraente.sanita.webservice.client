/**
 * BollettinoFreccia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class BollettinoFreccia  implements java.io.Serializable {
    /* Coordinate bancarie creditore */
    private java.lang.String coordinateBancarieCreditore;

    /* Cod.Identificativo Pagamento (cod. SIA + id Bollettino) */
    private java.lang.String codIdentificativoPagamento;

    /* Intestazione Creditore */
    private java.lang.String intestazioneCreditore;

    /* Intestazione Debitore */
    private java.lang.String intestazioneDebitore;

    /* CodiceFiscale – PIVA Debitore */
    private java.lang.String codiceFiscalePIVADebitore;

    /* Indirizzo Debitore */
    private java.lang.String indirizzoDebitore;

    /* Città Debitore */
    private java.lang.String cittaDebitore;

    /* Motivo del pagamento */
    private java.lang.String motivoPagamento;

    /* Cin Importo */
    private java.lang.String cinImporto;

    /* Cin Intermedio */
    private java.lang.String cinIntermedio;

    /* Cin Complessivo */
    private java.lang.String cinComplessivo;

    /* Cod. Esenzione */
    private java.lang.String codEsenzione;

    /* Cod. Divisa */
    private java.lang.String codDivisa;

    /* Codice Freccia */
    private java.lang.String codiceFreccia;

    public BollettinoFreccia() {
    }

    public BollettinoFreccia(
           java.lang.String coordinateBancarieCreditore,
           java.lang.String codIdentificativoPagamento,
           java.lang.String intestazioneCreditore,
           java.lang.String intestazioneDebitore,
           java.lang.String codiceFiscalePIVADebitore,
           java.lang.String indirizzoDebitore,
           java.lang.String cittaDebitore,
           java.lang.String motivoPagamento,
           java.lang.String cinImporto,
           java.lang.String cinIntermedio,
           java.lang.String cinComplessivo,
           java.lang.String codEsenzione,
           java.lang.String codDivisa,
           java.lang.String codiceFreccia) {
           this.coordinateBancarieCreditore = coordinateBancarieCreditore;
           this.codIdentificativoPagamento = codIdentificativoPagamento;
           this.intestazioneCreditore = intestazioneCreditore;
           this.intestazioneDebitore = intestazioneDebitore;
           this.codiceFiscalePIVADebitore = codiceFiscalePIVADebitore;
           this.indirizzoDebitore = indirizzoDebitore;
           this.cittaDebitore = cittaDebitore;
           this.motivoPagamento = motivoPagamento;
           this.cinImporto = cinImporto;
           this.cinIntermedio = cinIntermedio;
           this.cinComplessivo = cinComplessivo;
           this.codEsenzione = codEsenzione;
           this.codDivisa = codDivisa;
           this.codiceFreccia = codiceFreccia;
    }


    /**
     * Gets the coordinateBancarieCreditore value for this BollettinoFreccia.
     * 
     * @return coordinateBancarieCreditore   * Coordinate bancarie creditore
     */
    public java.lang.String getCoordinateBancarieCreditore() {
        return coordinateBancarieCreditore;
    }


    /**
     * Sets the coordinateBancarieCreditore value for this BollettinoFreccia.
     * 
     * @param coordinateBancarieCreditore   * Coordinate bancarie creditore
     */
    public void setCoordinateBancarieCreditore(java.lang.String coordinateBancarieCreditore) {
        this.coordinateBancarieCreditore = coordinateBancarieCreditore;
    }


    /**
     * Gets the codIdentificativoPagamento value for this BollettinoFreccia.
     * 
     * @return codIdentificativoPagamento   * Cod.Identificativo Pagamento (cod. SIA + id Bollettino)
     */
    public java.lang.String getCodIdentificativoPagamento() {
        return codIdentificativoPagamento;
    }


    /**
     * Sets the codIdentificativoPagamento value for this BollettinoFreccia.
     * 
     * @param codIdentificativoPagamento   * Cod.Identificativo Pagamento (cod. SIA + id Bollettino)
     */
    public void setCodIdentificativoPagamento(java.lang.String codIdentificativoPagamento) {
        this.codIdentificativoPagamento = codIdentificativoPagamento;
    }


    /**
     * Gets the intestazioneCreditore value for this BollettinoFreccia.
     * 
     * @return intestazioneCreditore   * Intestazione Creditore
     */
    public java.lang.String getIntestazioneCreditore() {
        return intestazioneCreditore;
    }


    /**
     * Sets the intestazioneCreditore value for this BollettinoFreccia.
     * 
     * @param intestazioneCreditore   * Intestazione Creditore
     */
    public void setIntestazioneCreditore(java.lang.String intestazioneCreditore) {
        this.intestazioneCreditore = intestazioneCreditore;
    }


    /**
     * Gets the intestazioneDebitore value for this BollettinoFreccia.
     * 
     * @return intestazioneDebitore   * Intestazione Debitore
     */
    public java.lang.String getIntestazioneDebitore() {
        return intestazioneDebitore;
    }


    /**
     * Sets the intestazioneDebitore value for this BollettinoFreccia.
     * 
     * @param intestazioneDebitore   * Intestazione Debitore
     */
    public void setIntestazioneDebitore(java.lang.String intestazioneDebitore) {
        this.intestazioneDebitore = intestazioneDebitore;
    }


    /**
     * Gets the codiceFiscalePIVADebitore value for this BollettinoFreccia.
     * 
     * @return codiceFiscalePIVADebitore   * CodiceFiscale – PIVA Debitore
     */
    public java.lang.String getCodiceFiscalePIVADebitore() {
        return codiceFiscalePIVADebitore;
    }


    /**
     * Sets the codiceFiscalePIVADebitore value for this BollettinoFreccia.
     * 
     * @param codiceFiscalePIVADebitore   * CodiceFiscale – PIVA Debitore
     */
    public void setCodiceFiscalePIVADebitore(java.lang.String codiceFiscalePIVADebitore) {
        this.codiceFiscalePIVADebitore = codiceFiscalePIVADebitore;
    }


    /**
     * Gets the indirizzoDebitore value for this BollettinoFreccia.
     * 
     * @return indirizzoDebitore   * Indirizzo Debitore
     */
    public java.lang.String getIndirizzoDebitore() {
        return indirizzoDebitore;
    }


    /**
     * Sets the indirizzoDebitore value for this BollettinoFreccia.
     * 
     * @param indirizzoDebitore   * Indirizzo Debitore
     */
    public void setIndirizzoDebitore(java.lang.String indirizzoDebitore) {
        this.indirizzoDebitore = indirizzoDebitore;
    }


    /**
     * Gets the cittaDebitore value for this BollettinoFreccia.
     * 
     * @return cittaDebitore   * Città Debitore
     */
    public java.lang.String getCittaDebitore() {
        return cittaDebitore;
    }


    /**
     * Sets the cittaDebitore value for this BollettinoFreccia.
     * 
     * @param cittaDebitore   * Città Debitore
     */
    public void setCittaDebitore(java.lang.String cittaDebitore) {
        this.cittaDebitore = cittaDebitore;
    }


    /**
     * Gets the motivoPagamento value for this BollettinoFreccia.
     * 
     * @return motivoPagamento   * Motivo del pagamento
     */
    public java.lang.String getMotivoPagamento() {
        return motivoPagamento;
    }


    /**
     * Sets the motivoPagamento value for this BollettinoFreccia.
     * 
     * @param motivoPagamento   * Motivo del pagamento
     */
    public void setMotivoPagamento(java.lang.String motivoPagamento) {
        this.motivoPagamento = motivoPagamento;
    }


    /**
     * Gets the cinImporto value for this BollettinoFreccia.
     * 
     * @return cinImporto   * Cin Importo
     */
    public java.lang.String getCinImporto() {
        return cinImporto;
    }


    /**
     * Sets the cinImporto value for this BollettinoFreccia.
     * 
     * @param cinImporto   * Cin Importo
     */
    public void setCinImporto(java.lang.String cinImporto) {
        this.cinImporto = cinImporto;
    }


    /**
     * Gets the cinIntermedio value for this BollettinoFreccia.
     * 
     * @return cinIntermedio   * Cin Intermedio
     */
    public java.lang.String getCinIntermedio() {
        return cinIntermedio;
    }


    /**
     * Sets the cinIntermedio value for this BollettinoFreccia.
     * 
     * @param cinIntermedio   * Cin Intermedio
     */
    public void setCinIntermedio(java.lang.String cinIntermedio) {
        this.cinIntermedio = cinIntermedio;
    }


    /**
     * Gets the cinComplessivo value for this BollettinoFreccia.
     * 
     * @return cinComplessivo   * Cin Complessivo
     */
    public java.lang.String getCinComplessivo() {
        return cinComplessivo;
    }


    /**
     * Sets the cinComplessivo value for this BollettinoFreccia.
     * 
     * @param cinComplessivo   * Cin Complessivo
     */
    public void setCinComplessivo(java.lang.String cinComplessivo) {
        this.cinComplessivo = cinComplessivo;
    }


    /**
     * Gets the codEsenzione value for this BollettinoFreccia.
     * 
     * @return codEsenzione   * Cod. Esenzione
     */
    public java.lang.String getCodEsenzione() {
        return codEsenzione;
    }


    /**
     * Sets the codEsenzione value for this BollettinoFreccia.
     * 
     * @param codEsenzione   * Cod. Esenzione
     */
    public void setCodEsenzione(java.lang.String codEsenzione) {
        this.codEsenzione = codEsenzione;
    }


    /**
     * Gets the codDivisa value for this BollettinoFreccia.
     * 
     * @return codDivisa   * Cod. Divisa
     */
    public java.lang.String getCodDivisa() {
        return codDivisa;
    }


    /**
     * Sets the codDivisa value for this BollettinoFreccia.
     * 
     * @param codDivisa   * Cod. Divisa
     */
    public void setCodDivisa(java.lang.String codDivisa) {
        this.codDivisa = codDivisa;
    }


    /**
     * Gets the codiceFreccia value for this BollettinoFreccia.
     * 
     * @return codiceFreccia   * Codice Freccia
     */
    public java.lang.String getCodiceFreccia() {
        return codiceFreccia;
    }


    /**
     * Sets the codiceFreccia value for this BollettinoFreccia.
     * 
     * @param codiceFreccia   * Codice Freccia
     */
    public void setCodiceFreccia(java.lang.String codiceFreccia) {
        this.codiceFreccia = codiceFreccia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BollettinoFreccia)) return false;
        BollettinoFreccia other = (BollettinoFreccia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordinateBancarieCreditore==null && other.getCoordinateBancarieCreditore()==null) || 
             (this.coordinateBancarieCreditore!=null &&
              this.coordinateBancarieCreditore.equals(other.getCoordinateBancarieCreditore()))) &&
            ((this.codIdentificativoPagamento==null && other.getCodIdentificativoPagamento()==null) || 
             (this.codIdentificativoPagamento!=null &&
              this.codIdentificativoPagamento.equals(other.getCodIdentificativoPagamento()))) &&
            ((this.intestazioneCreditore==null && other.getIntestazioneCreditore()==null) || 
             (this.intestazioneCreditore!=null &&
              this.intestazioneCreditore.equals(other.getIntestazioneCreditore()))) &&
            ((this.intestazioneDebitore==null && other.getIntestazioneDebitore()==null) || 
             (this.intestazioneDebitore!=null &&
              this.intestazioneDebitore.equals(other.getIntestazioneDebitore()))) &&
            ((this.codiceFiscalePIVADebitore==null && other.getCodiceFiscalePIVADebitore()==null) || 
             (this.codiceFiscalePIVADebitore!=null &&
              this.codiceFiscalePIVADebitore.equals(other.getCodiceFiscalePIVADebitore()))) &&
            ((this.indirizzoDebitore==null && other.getIndirizzoDebitore()==null) || 
             (this.indirizzoDebitore!=null &&
              this.indirizzoDebitore.equals(other.getIndirizzoDebitore()))) &&
            ((this.cittaDebitore==null && other.getCittaDebitore()==null) || 
             (this.cittaDebitore!=null &&
              this.cittaDebitore.equals(other.getCittaDebitore()))) &&
            ((this.motivoPagamento==null && other.getMotivoPagamento()==null) || 
             (this.motivoPagamento!=null &&
              this.motivoPagamento.equals(other.getMotivoPagamento()))) &&
            ((this.cinImporto==null && other.getCinImporto()==null) || 
             (this.cinImporto!=null &&
              this.cinImporto.equals(other.getCinImporto()))) &&
            ((this.cinIntermedio==null && other.getCinIntermedio()==null) || 
             (this.cinIntermedio!=null &&
              this.cinIntermedio.equals(other.getCinIntermedio()))) &&
            ((this.cinComplessivo==null && other.getCinComplessivo()==null) || 
             (this.cinComplessivo!=null &&
              this.cinComplessivo.equals(other.getCinComplessivo()))) &&
            ((this.codEsenzione==null && other.getCodEsenzione()==null) || 
             (this.codEsenzione!=null &&
              this.codEsenzione.equals(other.getCodEsenzione()))) &&
            ((this.codDivisa==null && other.getCodDivisa()==null) || 
             (this.codDivisa!=null &&
              this.codDivisa.equals(other.getCodDivisa()))) &&
            ((this.codiceFreccia==null && other.getCodiceFreccia()==null) || 
             (this.codiceFreccia!=null &&
              this.codiceFreccia.equals(other.getCodiceFreccia())));
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
        if (getCoordinateBancarieCreditore() != null) {
            _hashCode += getCoordinateBancarieCreditore().hashCode();
        }
        if (getCodIdentificativoPagamento() != null) {
            _hashCode += getCodIdentificativoPagamento().hashCode();
        }
        if (getIntestazioneCreditore() != null) {
            _hashCode += getIntestazioneCreditore().hashCode();
        }
        if (getIntestazioneDebitore() != null) {
            _hashCode += getIntestazioneDebitore().hashCode();
        }
        if (getCodiceFiscalePIVADebitore() != null) {
            _hashCode += getCodiceFiscalePIVADebitore().hashCode();
        }
        if (getIndirizzoDebitore() != null) {
            _hashCode += getIndirizzoDebitore().hashCode();
        }
        if (getCittaDebitore() != null) {
            _hashCode += getCittaDebitore().hashCode();
        }
        if (getMotivoPagamento() != null) {
            _hashCode += getMotivoPagamento().hashCode();
        }
        if (getCinImporto() != null) {
            _hashCode += getCinImporto().hashCode();
        }
        if (getCinIntermedio() != null) {
            _hashCode += getCinIntermedio().hashCode();
        }
        if (getCinComplessivo() != null) {
            _hashCode += getCinComplessivo().hashCode();
        }
        if (getCodEsenzione() != null) {
            _hashCode += getCodEsenzione().hashCode();
        }
        if (getCodDivisa() != null) {
            _hashCode += getCodDivisa().hashCode();
        }
        if (getCodiceFreccia() != null) {
            _hashCode += getCodiceFreccia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BollettinoFreccia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "BollettinoFreccia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinateBancarieCreditore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "coordinateBancarieCreditore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codIdentificativoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codIdentificativoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intestazioneCreditore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "intestazioneCreditore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intestazioneDebitore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "intestazioneDebitore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscalePIVADebitore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscalePIVADebitore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoDebitore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "indirizzoDebitore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cittaDebitore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "cittaDebitore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "motivoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cinImporto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "cinImporto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cinIntermedio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "cinIntermedio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cinComplessivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "cinComplessivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEsenzione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codEsenzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDivisa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codDivisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFreccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFreccia"));
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
