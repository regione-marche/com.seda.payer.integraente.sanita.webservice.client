/**
 * ListaPagamenti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class ListaPagamenti  implements java.io.Serializable {
    /* data pagamento */
    private java.lang.String dataPagamento;

    /* luogo movimento */
    private java.lang.String luogoMovimento;

    /* anno emissione AAAA */
    private java.lang.String annoEmissione;

    /* identificativo documento */
    private java.lang.String identificativoDocumento;

    /* imposta servizio */
    private java.lang.String impostaServizio;

    /* descrizione imposta servizio */
    private java.lang.String descImpostaServizio;

    /* descrizione ente */
    private java.lang.String descEnte;

    /* data notifica */
    private java.lang.String dataNotifica;

    /* importo movimento */
    private java.math.BigDecimal impMovimento;

    public ListaPagamenti() {
    }

    public ListaPagamenti(
           java.lang.String dataPagamento,
           java.lang.String luogoMovimento,
           java.lang.String annoEmissione,
           java.lang.String identificativoDocumento,
           java.lang.String impostaServizio,
           java.lang.String descImpostaServizio,
           java.lang.String descEnte,
           java.lang.String dataNotifica,
           java.math.BigDecimal impMovimento) {
           this.dataPagamento = dataPagamento;
           this.luogoMovimento = luogoMovimento;
           this.annoEmissione = annoEmissione;
           this.identificativoDocumento = identificativoDocumento;
           this.impostaServizio = impostaServizio;
           this.descImpostaServizio = descImpostaServizio;
           this.descEnte = descEnte;
           this.dataNotifica = dataNotifica;
           this.impMovimento = impMovimento;
    }


    /**
     * Gets the dataPagamento value for this ListaPagamenti.
     * 
     * @return dataPagamento   * data pagamento
     */
    public java.lang.String getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this ListaPagamenti.
     * 
     * @param dataPagamento   * data pagamento
     */
    public void setDataPagamento(java.lang.String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the luogoMovimento value for this ListaPagamenti.
     * 
     * @return luogoMovimento   * luogo movimento
     */
    public java.lang.String getLuogoMovimento() {
        return luogoMovimento;
    }


    /**
     * Sets the luogoMovimento value for this ListaPagamenti.
     * 
     * @param luogoMovimento   * luogo movimento
     */
    public void setLuogoMovimento(java.lang.String luogoMovimento) {
        this.luogoMovimento = luogoMovimento;
    }


    /**
     * Gets the annoEmissione value for this ListaPagamenti.
     * 
     * @return annoEmissione   * anno emissione AAAA
     */
    public java.lang.String getAnnoEmissione() {
        return annoEmissione;
    }


    /**
     * Sets the annoEmissione value for this ListaPagamenti.
     * 
     * @param annoEmissione   * anno emissione AAAA
     */
    public void setAnnoEmissione(java.lang.String annoEmissione) {
        this.annoEmissione = annoEmissione;
    }


    /**
     * Gets the identificativoDocumento value for this ListaPagamenti.
     * 
     * @return identificativoDocumento   * identificativo documento
     */
    public java.lang.String getIdentificativoDocumento() {
        return identificativoDocumento;
    }


    /**
     * Sets the identificativoDocumento value for this ListaPagamenti.
     * 
     * @param identificativoDocumento   * identificativo documento
     */
    public void setIdentificativoDocumento(java.lang.String identificativoDocumento) {
        this.identificativoDocumento = identificativoDocumento;
    }


    /**
     * Gets the impostaServizio value for this ListaPagamenti.
     * 
     * @return impostaServizio   * imposta servizio
     */
    public java.lang.String getImpostaServizio() {
        return impostaServizio;
    }


    /**
     * Sets the impostaServizio value for this ListaPagamenti.
     * 
     * @param impostaServizio   * imposta servizio
     */
    public void setImpostaServizio(java.lang.String impostaServizio) {
        this.impostaServizio = impostaServizio;
    }


    /**
     * Gets the descImpostaServizio value for this ListaPagamenti.
     * 
     * @return descImpostaServizio   * descrizione imposta servizio
     */
    public java.lang.String getDescImpostaServizio() {
        return descImpostaServizio;
    }


    /**
     * Sets the descImpostaServizio value for this ListaPagamenti.
     * 
     * @param descImpostaServizio   * descrizione imposta servizio
     */
    public void setDescImpostaServizio(java.lang.String descImpostaServizio) {
        this.descImpostaServizio = descImpostaServizio;
    }


    /**
     * Gets the descEnte value for this ListaPagamenti.
     * 
     * @return descEnte   * descrizione ente
     */
    public java.lang.String getDescEnte() {
        return descEnte;
    }


    /**
     * Sets the descEnte value for this ListaPagamenti.
     * 
     * @param descEnte   * descrizione ente
     */
    public void setDescEnte(java.lang.String descEnte) {
        this.descEnte = descEnte;
    }


    /**
     * Gets the dataNotifica value for this ListaPagamenti.
     * 
     * @return dataNotifica   * data notifica
     */
    public java.lang.String getDataNotifica() {
        return dataNotifica;
    }


    /**
     * Sets the dataNotifica value for this ListaPagamenti.
     * 
     * @param dataNotifica   * data notifica
     */
    public void setDataNotifica(java.lang.String dataNotifica) {
        this.dataNotifica = dataNotifica;
    }


    /**
     * Gets the impMovimento value for this ListaPagamenti.
     * 
     * @return impMovimento   * importo movimento
     */
    public java.math.BigDecimal getImpMovimento() {
        return impMovimento;
    }


    /**
     * Sets the impMovimento value for this ListaPagamenti.
     * 
     * @param impMovimento   * importo movimento
     */
    public void setImpMovimento(java.math.BigDecimal impMovimento) {
        this.impMovimento = impMovimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaPagamenti)) return false;
        ListaPagamenti other = (ListaPagamenti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.luogoMovimento==null && other.getLuogoMovimento()==null) || 
             (this.luogoMovimento!=null &&
              this.luogoMovimento.equals(other.getLuogoMovimento()))) &&
            ((this.annoEmissione==null && other.getAnnoEmissione()==null) || 
             (this.annoEmissione!=null &&
              this.annoEmissione.equals(other.getAnnoEmissione()))) &&
            ((this.identificativoDocumento==null && other.getIdentificativoDocumento()==null) || 
             (this.identificativoDocumento!=null &&
              this.identificativoDocumento.equals(other.getIdentificativoDocumento()))) &&
            ((this.impostaServizio==null && other.getImpostaServizio()==null) || 
             (this.impostaServizio!=null &&
              this.impostaServizio.equals(other.getImpostaServizio()))) &&
            ((this.descImpostaServizio==null && other.getDescImpostaServizio()==null) || 
             (this.descImpostaServizio!=null &&
              this.descImpostaServizio.equals(other.getDescImpostaServizio()))) &&
            ((this.descEnte==null && other.getDescEnte()==null) || 
             (this.descEnte!=null &&
              this.descEnte.equals(other.getDescEnte()))) &&
            ((this.dataNotifica==null && other.getDataNotifica()==null) || 
             (this.dataNotifica!=null &&
              this.dataNotifica.equals(other.getDataNotifica()))) &&
            ((this.impMovimento==null && other.getImpMovimento()==null) || 
             (this.impMovimento!=null &&
              this.impMovimento.equals(other.getImpMovimento())));
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
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getLuogoMovimento() != null) {
            _hashCode += getLuogoMovimento().hashCode();
        }
        if (getAnnoEmissione() != null) {
            _hashCode += getAnnoEmissione().hashCode();
        }
        if (getIdentificativoDocumento() != null) {
            _hashCode += getIdentificativoDocumento().hashCode();
        }
        if (getImpostaServizio() != null) {
            _hashCode += getImpostaServizio().hashCode();
        }
        if (getDescImpostaServizio() != null) {
            _hashCode += getDescImpostaServizio().hashCode();
        }
        if (getDescEnte() != null) {
            _hashCode += getDescEnte().hashCode();
        }
        if (getDataNotifica() != null) {
            _hashCode += getDataNotifica().hashCode();
        }
        if (getImpMovimento() != null) {
            _hashCode += getImpMovimento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaPagamenti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaPagamenti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "luogoMovimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoEmissione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoEmissione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descImpostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "descImpostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "descEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNotifica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataNotifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impMovimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
