/**
 * RecuperaDatiBollettinoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDatiBollettinoRequest  implements java.io.Serializable {
    /* Codice Utente */
    private java.lang.String codiceUtente;

    /* Codice Ente */
    private java.lang.String codiceEnte;

    /* Tipo Ufficio */
    private java.lang.String tipoUfficio;

    /* Codice Ufficio */
    private java.lang.String codiceUfficio;

    /* Tipologia di Operazione 
     * 						("01" - PAGAMENTO CON BOLLETTINO) */
    private java.lang.String tipologiaOperazione;

    /* Identificativo Bollettino */
    private java.lang.String identificativoBollettino;

    /* Tipologia Servizio da pagare (deve essere proposto il codice
     * rappresentativo:
     * 						ICI --> ICI
     * 						ISC --> ISCOP
     * 						BOL --> BOLLO
     * 						SPO --> SPONTANEO
     * 						PRM --> Premarcato
     * 						MAV --> MAV
     * 						CDS --> CDS
     * 						FRE --> FRECCIA */
    private java.lang.String tipologiaServizio;

    /* Identificativo Verbale */
    private java.lang.String identificativoVerbale;

    /* Targa Veicolo */
    private java.lang.String targaVeicolo;

    /* Data Verbale */
    private java.lang.String dataVerbale;

    /* Identificativo Univoco Versamento */
    private java.lang.String identificativoUnivocoVersamento;

    public RecuperaDatiBollettinoRequest() {
    }

    public RecuperaDatiBollettinoRequest(
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoUfficio,
           java.lang.String codiceUfficio,
           java.lang.String tipologiaOperazione,
           java.lang.String identificativoBollettino,
           java.lang.String tipologiaServizio,
           java.lang.String identificativoVerbale,
           java.lang.String targaVeicolo,
           java.lang.String dataVerbale,
           java.lang.String identificativoUnivocoVersamento) {
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoUfficio = tipoUfficio;
           this.codiceUfficio = codiceUfficio;
           this.tipologiaOperazione = tipologiaOperazione;
           this.identificativoBollettino = identificativoBollettino;
           this.tipologiaServizio = tipologiaServizio;
           this.identificativoVerbale = identificativoVerbale;
           this.targaVeicolo = targaVeicolo;
           this.dataVerbale = dataVerbale;
           this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }


    /**
     * Gets the codiceUtente value for this RecuperaDatiBollettinoRequest.
     * 
     * @return codiceUtente   * Codice Utente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RecuperaDatiBollettinoRequest.
     * 
     * @param codiceUtente   * Codice Utente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this RecuperaDatiBollettinoRequest.
     * 
     * @return codiceEnte   * Codice Ente
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this RecuperaDatiBollettinoRequest.
     * 
     * @param codiceEnte   * Codice Ente
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoUfficio value for this RecuperaDatiBollettinoRequest.
     * 
     * @return tipoUfficio   * Tipo Ufficio
     */
    public java.lang.String getTipoUfficio() {
        return tipoUfficio;
    }


    /**
     * Sets the tipoUfficio value for this RecuperaDatiBollettinoRequest.
     * 
     * @param tipoUfficio   * Tipo Ufficio
     */
    public void setTipoUfficio(java.lang.String tipoUfficio) {
        this.tipoUfficio = tipoUfficio;
    }


    /**
     * Gets the codiceUfficio value for this RecuperaDatiBollettinoRequest.
     * 
     * @return codiceUfficio   * Codice Ufficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this RecuperaDatiBollettinoRequest.
     * 
     * @param codiceUfficio   * Codice Ufficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the tipologiaOperazione value for this RecuperaDatiBollettinoRequest.
     * 
     * @return tipologiaOperazione   * Tipologia di Operazione 
     * 						("01" - PAGAMENTO CON BOLLETTINO)
     */
    public java.lang.String getTipologiaOperazione() {
        return tipologiaOperazione;
    }


    /**
     * Sets the tipologiaOperazione value for this RecuperaDatiBollettinoRequest.
     * 
     * @param tipologiaOperazione   * Tipologia di Operazione 
     * 						("01" - PAGAMENTO CON BOLLETTINO)
     */
    public void setTipologiaOperazione(java.lang.String tipologiaOperazione) {
        this.tipologiaOperazione = tipologiaOperazione;
    }


    /**
     * Gets the identificativoBollettino value for this RecuperaDatiBollettinoRequest.
     * 
     * @return identificativoBollettino   * Identificativo Bollettino
     */
    public java.lang.String getIdentificativoBollettino() {
        return identificativoBollettino;
    }


    /**
     * Sets the identificativoBollettino value for this RecuperaDatiBollettinoRequest.
     * 
     * @param identificativoBollettino   * Identificativo Bollettino
     */
    public void setIdentificativoBollettino(java.lang.String identificativoBollettino) {
        this.identificativoBollettino = identificativoBollettino;
    }


    /**
     * Gets the tipologiaServizio value for this RecuperaDatiBollettinoRequest.
     * 
     * @return tipologiaServizio   * Tipologia Servizio da pagare (deve essere proposto il codice
     * rappresentativo:
     * 						ICI --> ICI
     * 						ISC --> ISCOP
     * 						BOL --> BOLLO
     * 						SPO --> SPONTANEO
     * 						PRM --> Premarcato
     * 						MAV --> MAV
     * 						CDS --> CDS
     * 						FRE --> FRECCIA
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this RecuperaDatiBollettinoRequest.
     * 
     * @param tipologiaServizio   * Tipologia Servizio da pagare (deve essere proposto il codice
     * rappresentativo:
     * 						ICI --> ICI
     * 						ISC --> ISCOP
     * 						BOL --> BOLLO
     * 						SPO --> SPONTANEO
     * 						PRM --> Premarcato
     * 						MAV --> MAV
     * 						CDS --> CDS
     * 						FRE --> FRECCIA
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the identificativoVerbale value for this RecuperaDatiBollettinoRequest.
     * 
     * @return identificativoVerbale   * Identificativo Verbale
     */
    public java.lang.String getIdentificativoVerbale() {
        return identificativoVerbale;
    }


    /**
     * Sets the identificativoVerbale value for this RecuperaDatiBollettinoRequest.
     * 
     * @param identificativoVerbale   * Identificativo Verbale
     */
    public void setIdentificativoVerbale(java.lang.String identificativoVerbale) {
        this.identificativoVerbale = identificativoVerbale;
    }


    /**
     * Gets the targaVeicolo value for this RecuperaDatiBollettinoRequest.
     * 
     * @return targaVeicolo   * Targa Veicolo
     */
    public java.lang.String getTargaVeicolo() {
        return targaVeicolo;
    }


    /**
     * Sets the targaVeicolo value for this RecuperaDatiBollettinoRequest.
     * 
     * @param targaVeicolo   * Targa Veicolo
     */
    public void setTargaVeicolo(java.lang.String targaVeicolo) {
        this.targaVeicolo = targaVeicolo;
    }


    /**
     * Gets the dataVerbale value for this RecuperaDatiBollettinoRequest.
     * 
     * @return dataVerbale   * Data Verbale
     */
    public java.lang.String getDataVerbale() {
        return dataVerbale;
    }


    /**
     * Sets the dataVerbale value for this RecuperaDatiBollettinoRequest.
     * 
     * @param dataVerbale   * Data Verbale
     */
    public void setDataVerbale(java.lang.String dataVerbale) {
        this.dataVerbale = dataVerbale;
    }


    /**
     * Gets the identificativoUnivocoVersamento value for this RecuperaDatiBollettinoRequest.
     * 
     * @return identificativoUnivocoVersamento   * Identificativo Univoco Versamento
     */
    public java.lang.String getIdentificativoUnivocoVersamento() {
        return identificativoUnivocoVersamento;
    }


    /**
     * Sets the identificativoUnivocoVersamento value for this RecuperaDatiBollettinoRequest.
     * 
     * @param identificativoUnivocoVersamento   * Identificativo Univoco Versamento
     */
    public void setIdentificativoUnivocoVersamento(java.lang.String identificativoUnivocoVersamento) {
        this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDatiBollettinoRequest)) return false;
        RecuperaDatiBollettinoRequest other = (RecuperaDatiBollettinoRequest) obj;
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
            ((this.tipoUfficio==null && other.getTipoUfficio()==null) || 
             (this.tipoUfficio!=null &&
              this.tipoUfficio.equals(other.getTipoUfficio()))) &&
            ((this.codiceUfficio==null && other.getCodiceUfficio()==null) || 
             (this.codiceUfficio!=null &&
              this.codiceUfficio.equals(other.getCodiceUfficio()))) &&
            ((this.tipologiaOperazione==null && other.getTipologiaOperazione()==null) || 
             (this.tipologiaOperazione!=null &&
              this.tipologiaOperazione.equals(other.getTipologiaOperazione()))) &&
            ((this.identificativoBollettino==null && other.getIdentificativoBollettino()==null) || 
             (this.identificativoBollettino!=null &&
              this.identificativoBollettino.equals(other.getIdentificativoBollettino()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.identificativoVerbale==null && other.getIdentificativoVerbale()==null) || 
             (this.identificativoVerbale!=null &&
              this.identificativoVerbale.equals(other.getIdentificativoVerbale()))) &&
            ((this.targaVeicolo==null && other.getTargaVeicolo()==null) || 
             (this.targaVeicolo!=null &&
              this.targaVeicolo.equals(other.getTargaVeicolo()))) &&
            ((this.dataVerbale==null && other.getDataVerbale()==null) || 
             (this.dataVerbale!=null &&
              this.dataVerbale.equals(other.getDataVerbale()))) &&
            ((this.identificativoUnivocoVersamento==null && other.getIdentificativoUnivocoVersamento()==null) || 
             (this.identificativoUnivocoVersamento!=null &&
              this.identificativoUnivocoVersamento.equals(other.getIdentificativoUnivocoVersamento())));
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
        if (getTipoUfficio() != null) {
            _hashCode += getTipoUfficio().hashCode();
        }
        if (getCodiceUfficio() != null) {
            _hashCode += getCodiceUfficio().hashCode();
        }
        if (getTipologiaOperazione() != null) {
            _hashCode += getTipologiaOperazione().hashCode();
        }
        if (getIdentificativoBollettino() != null) {
            _hashCode += getIdentificativoBollettino().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
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
        if (getIdentificativoUnivocoVersamento() != null) {
            _hashCode += getIdentificativoUnivocoVersamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDatiBollettinoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDatiBollettinoRequest"));
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
        elemField.setFieldName("tipoUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaOperazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaOperazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoVerbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targaVeicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "targaVeicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataVerbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoUnivocoVersamento"));
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
