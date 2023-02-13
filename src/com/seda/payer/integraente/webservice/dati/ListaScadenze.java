/**
 * ListaScadenze.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class ListaScadenze  implements java.io.Serializable {
    /* progressivo rata */
    private java.lang.String progressivoRata;

    /* data scadenza GG/MM/AAAA */
    private java.lang.String dataScadenza;

    /* codice Bollettino */
    private java.lang.String codiceBollettino;

    /* codice Bollettino Freccia */
    private java.lang.String codiceBollettinoFreccia;

    /* rata Iniziali */
    private java.math.BigDecimal impRataIniziali;

    /* rata Residuo */
    private java.math.BigDecimal impRataResiduo;

    /* rata ResiduoNotifica */
    private java.math.BigDecimal impRataResiduoNotifica;

    /* rata ResiduoComp */
    private java.math.BigDecimal impRataResiduoComp;

    /* rata interessi mora */
    private java.math.BigDecimal impRataInteressiMora;

    /* totale Residuo */
    private java.math.BigDecimal impTotaleResiduo;

    /* tipo rata P=PAGATA e I=INSOLUTA */
    private java.lang.String tipoRata;

    /* presenza pagamento in acquisizione Y/N */
    private java.lang.String pagamentoAcquisizione;

    /* tipologia servizio */
    private java.lang.String tipologiaServizio;

    public ListaScadenze() {
    }

    public ListaScadenze(
           java.lang.String progressivoRata,
           java.lang.String dataScadenza,
           java.lang.String codiceBollettino,
           java.lang.String codiceBollettinoFreccia,
           java.math.BigDecimal impRataIniziali,
           java.math.BigDecimal impRataResiduo,
           java.math.BigDecimal impRataResiduoNotifica,
           java.math.BigDecimal impRataResiduoComp,
           java.math.BigDecimal impRataInteressiMora,
           java.math.BigDecimal impTotaleResiduo,
           java.lang.String tipoRata,
           java.lang.String pagamentoAcquisizione,
           java.lang.String tipologiaServizio) {
           this.progressivoRata = progressivoRata;
           this.dataScadenza = dataScadenza;
           this.codiceBollettino = codiceBollettino;
           this.codiceBollettinoFreccia = codiceBollettinoFreccia;
           this.impRataIniziali = impRataIniziali;
           this.impRataResiduo = impRataResiduo;
           this.impRataResiduoNotifica = impRataResiduoNotifica;
           this.impRataResiduoComp = impRataResiduoComp;
           this.impRataInteressiMora = impRataInteressiMora;
           this.impTotaleResiduo = impTotaleResiduo;
           this.tipoRata = tipoRata;
           this.pagamentoAcquisizione = pagamentoAcquisizione;
           this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the progressivoRata value for this ListaScadenze.
     * 
     * @return progressivoRata   * progressivo rata
     */
    public java.lang.String getProgressivoRata() {
        return progressivoRata;
    }


    /**
     * Sets the progressivoRata value for this ListaScadenze.
     * 
     * @param progressivoRata   * progressivo rata
     */
    public void setProgressivoRata(java.lang.String progressivoRata) {
        this.progressivoRata = progressivoRata;
    }


    /**
     * Gets the dataScadenza value for this ListaScadenze.
     * 
     * @return dataScadenza   * data scadenza GG/MM/AAAA
     */
    public java.lang.String getDataScadenza() {
        return dataScadenza;
    }


    /**
     * Sets the dataScadenza value for this ListaScadenze.
     * 
     * @param dataScadenza   * data scadenza GG/MM/AAAA
     */
    public void setDataScadenza(java.lang.String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }


    /**
     * Gets the codiceBollettino value for this ListaScadenze.
     * 
     * @return codiceBollettino   * codice Bollettino
     */
    public java.lang.String getCodiceBollettino() {
        return codiceBollettino;
    }


    /**
     * Sets the codiceBollettino value for this ListaScadenze.
     * 
     * @param codiceBollettino   * codice Bollettino
     */
    public void setCodiceBollettino(java.lang.String codiceBollettino) {
        this.codiceBollettino = codiceBollettino;
    }


    /**
     * Gets the codiceBollettinoFreccia value for this ListaScadenze.
     * 
     * @return codiceBollettinoFreccia   * codice Bollettino Freccia
     */
    public java.lang.String getCodiceBollettinoFreccia() {
        return codiceBollettinoFreccia;
    }


    /**
     * Sets the codiceBollettinoFreccia value for this ListaScadenze.
     * 
     * @param codiceBollettinoFreccia   * codice Bollettino Freccia
     */
    public void setCodiceBollettinoFreccia(java.lang.String codiceBollettinoFreccia) {
        this.codiceBollettinoFreccia = codiceBollettinoFreccia;
    }


    /**
     * Gets the impRataIniziali value for this ListaScadenze.
     * 
     * @return impRataIniziali   * rata Iniziali
     */
    public java.math.BigDecimal getImpRataIniziali() {
        return impRataIniziali;
    }


    /**
     * Sets the impRataIniziali value for this ListaScadenze.
     * 
     * @param impRataIniziali   * rata Iniziali
     */
    public void setImpRataIniziali(java.math.BigDecimal impRataIniziali) {
        this.impRataIniziali = impRataIniziali;
    }


    /**
     * Gets the impRataResiduo value for this ListaScadenze.
     * 
     * @return impRataResiduo   * rata Residuo
     */
    public java.math.BigDecimal getImpRataResiduo() {
        return impRataResiduo;
    }


    /**
     * Sets the impRataResiduo value for this ListaScadenze.
     * 
     * @param impRataResiduo   * rata Residuo
     */
    public void setImpRataResiduo(java.math.BigDecimal impRataResiduo) {
        this.impRataResiduo = impRataResiduo;
    }


    /**
     * Gets the impRataResiduoNotifica value for this ListaScadenze.
     * 
     * @return impRataResiduoNotifica   * rata ResiduoNotifica
     */
    public java.math.BigDecimal getImpRataResiduoNotifica() {
        return impRataResiduoNotifica;
    }


    /**
     * Sets the impRataResiduoNotifica value for this ListaScadenze.
     * 
     * @param impRataResiduoNotifica   * rata ResiduoNotifica
     */
    public void setImpRataResiduoNotifica(java.math.BigDecimal impRataResiduoNotifica) {
        this.impRataResiduoNotifica = impRataResiduoNotifica;
    }


    /**
     * Gets the impRataResiduoComp value for this ListaScadenze.
     * 
     * @return impRataResiduoComp   * rata ResiduoComp
     */
    public java.math.BigDecimal getImpRataResiduoComp() {
        return impRataResiduoComp;
    }


    /**
     * Sets the impRataResiduoComp value for this ListaScadenze.
     * 
     * @param impRataResiduoComp   * rata ResiduoComp
     */
    public void setImpRataResiduoComp(java.math.BigDecimal impRataResiduoComp) {
        this.impRataResiduoComp = impRataResiduoComp;
    }


    /**
     * Gets the impRataInteressiMora value for this ListaScadenze.
     * 
     * @return impRataInteressiMora   * rata interessi mora
     */
    public java.math.BigDecimal getImpRataInteressiMora() {
        return impRataInteressiMora;
    }


    /**
     * Sets the impRataInteressiMora value for this ListaScadenze.
     * 
     * @param impRataInteressiMora   * rata interessi mora
     */
    public void setImpRataInteressiMora(java.math.BigDecimal impRataInteressiMora) {
        this.impRataInteressiMora = impRataInteressiMora;
    }


    /**
     * Gets the impTotaleResiduo value for this ListaScadenze.
     * 
     * @return impTotaleResiduo   * totale Residuo
     */
    public java.math.BigDecimal getImpTotaleResiduo() {
        return impTotaleResiduo;
    }


    /**
     * Sets the impTotaleResiduo value for this ListaScadenze.
     * 
     * @param impTotaleResiduo   * totale Residuo
     */
    public void setImpTotaleResiduo(java.math.BigDecimal impTotaleResiduo) {
        this.impTotaleResiduo = impTotaleResiduo;
    }


    /**
     * Gets the tipoRata value for this ListaScadenze.
     * 
     * @return tipoRata   * tipo rata P=PAGATA e I=INSOLUTA
     */
    public java.lang.String getTipoRata() {
        return tipoRata;
    }


    /**
     * Sets the tipoRata value for this ListaScadenze.
     * 
     * @param tipoRata   * tipo rata P=PAGATA e I=INSOLUTA
     */
    public void setTipoRata(java.lang.String tipoRata) {
        this.tipoRata = tipoRata;
    }


    /**
     * Gets the pagamentoAcquisizione value for this ListaScadenze.
     * 
     * @return pagamentoAcquisizione   * presenza pagamento in acquisizione Y/N
     */
    public java.lang.String getPagamentoAcquisizione() {
        return pagamentoAcquisizione;
    }


    /**
     * Sets the pagamentoAcquisizione value for this ListaScadenze.
     * 
     * @param pagamentoAcquisizione   * presenza pagamento in acquisizione Y/N
     */
    public void setPagamentoAcquisizione(java.lang.String pagamentoAcquisizione) {
        this.pagamentoAcquisizione = pagamentoAcquisizione;
    }


    /**
     * Gets the tipologiaServizio value for this ListaScadenze.
     * 
     * @return tipologiaServizio   * tipologia servizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this ListaScadenze.
     * 
     * @param tipologiaServizio   * tipologia servizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaScadenze)) return false;
        ListaScadenze other = (ListaScadenze) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.progressivoRata==null && other.getProgressivoRata()==null) || 
             (this.progressivoRata!=null &&
              this.progressivoRata.equals(other.getProgressivoRata()))) &&
            ((this.dataScadenza==null && other.getDataScadenza()==null) || 
             (this.dataScadenza!=null &&
              this.dataScadenza.equals(other.getDataScadenza()))) &&
            ((this.codiceBollettino==null && other.getCodiceBollettino()==null) || 
             (this.codiceBollettino!=null &&
              this.codiceBollettino.equals(other.getCodiceBollettino()))) &&
            ((this.codiceBollettinoFreccia==null && other.getCodiceBollettinoFreccia()==null) || 
             (this.codiceBollettinoFreccia!=null &&
              this.codiceBollettinoFreccia.equals(other.getCodiceBollettinoFreccia()))) &&
            ((this.impRataIniziali==null && other.getImpRataIniziali()==null) || 
             (this.impRataIniziali!=null &&
              this.impRataIniziali.equals(other.getImpRataIniziali()))) &&
            ((this.impRataResiduo==null && other.getImpRataResiduo()==null) || 
             (this.impRataResiduo!=null &&
              this.impRataResiduo.equals(other.getImpRataResiduo()))) &&
            ((this.impRataResiduoNotifica==null && other.getImpRataResiduoNotifica()==null) || 
             (this.impRataResiduoNotifica!=null &&
              this.impRataResiduoNotifica.equals(other.getImpRataResiduoNotifica()))) &&
            ((this.impRataResiduoComp==null && other.getImpRataResiduoComp()==null) || 
             (this.impRataResiduoComp!=null &&
              this.impRataResiduoComp.equals(other.getImpRataResiduoComp()))) &&
            ((this.impRataInteressiMora==null && other.getImpRataInteressiMora()==null) || 
             (this.impRataInteressiMora!=null &&
              this.impRataInteressiMora.equals(other.getImpRataInteressiMora()))) &&
            ((this.impTotaleResiduo==null && other.getImpTotaleResiduo()==null) || 
             (this.impTotaleResiduo!=null &&
              this.impTotaleResiduo.equals(other.getImpTotaleResiduo()))) &&
            ((this.tipoRata==null && other.getTipoRata()==null) || 
             (this.tipoRata!=null &&
              this.tipoRata.equals(other.getTipoRata()))) &&
            ((this.pagamentoAcquisizione==null && other.getPagamentoAcquisizione()==null) || 
             (this.pagamentoAcquisizione!=null &&
              this.pagamentoAcquisizione.equals(other.getPagamentoAcquisizione()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio())));
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
        if (getProgressivoRata() != null) {
            _hashCode += getProgressivoRata().hashCode();
        }
        if (getDataScadenza() != null) {
            _hashCode += getDataScadenza().hashCode();
        }
        if (getCodiceBollettino() != null) {
            _hashCode += getCodiceBollettino().hashCode();
        }
        if (getCodiceBollettinoFreccia() != null) {
            _hashCode += getCodiceBollettinoFreccia().hashCode();
        }
        if (getImpRataIniziali() != null) {
            _hashCode += getImpRataIniziali().hashCode();
        }
        if (getImpRataResiduo() != null) {
            _hashCode += getImpRataResiduo().hashCode();
        }
        if (getImpRataResiduoNotifica() != null) {
            _hashCode += getImpRataResiduoNotifica().hashCode();
        }
        if (getImpRataResiduoComp() != null) {
            _hashCode += getImpRataResiduoComp().hashCode();
        }
        if (getImpRataInteressiMora() != null) {
            _hashCode += getImpRataInteressiMora().hashCode();
        }
        if (getImpTotaleResiduo() != null) {
            _hashCode += getImpTotaleResiduo().hashCode();
        }
        if (getTipoRata() != null) {
            _hashCode += getTipoRata().hashCode();
        }
        if (getPagamentoAcquisizione() != null) {
            _hashCode += getPagamentoAcquisizione().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaScadenze.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaScadenze"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "progressivoRata"));
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
        elemField.setFieldName("codiceBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBollettinoFreccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceBollettinoFreccia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impRataIniziali");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impRataIniziali"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impRataResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impRataResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impRataResiduoNotifica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impRataResiduoNotifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impRataResiduoComp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impRataResiduoComp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impRataInteressiMora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impRataInteressiMora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTotaleResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impTotaleResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagamentoAcquisizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "pagamentoAcquisizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipologiaServizio"));
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
