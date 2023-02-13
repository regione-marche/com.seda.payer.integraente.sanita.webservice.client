/**
 * ListaMovimenti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class ListaMovimenti  implements java.io.Serializable {
    /* progressivo rata */
    private java.lang.String progressivoRata;

    /* data pagamento GG/MM/AAAA */
    private java.lang.String dataPagamento;

    /* causale movimento */
    private java.lang.String causaleMovimento;

    /* luogo movimento */
    private java.lang.String luogoMovimento;

    /* tributo pagato */
    private java.math.BigDecimal impTributoPagato;

    /* dir notifica pagato */
    private java.math.BigDecimal impDirNotificaPagato;

    /* compenso pagato */
    private java.math.BigDecimal impCompensoPagato;

    /* interessi mora pagato */
    private java.math.BigDecimal impIntMoraPagato;

    /* altre spese pagato */
    private java.math.BigDecimal impAltreSpesePagato;

    /* eccedenza */
    private java.math.BigDecimal impEccedenza;

    /* codice fiscale soggetto pagante */
    private java.lang.String codiceFiscalePagante;

    /* denominazione soggetto pagante */
    private java.lang.String denominazionePagante;

    /* chiave transazione */
    private java.lang.String chiaveTransazione;

    /* richiesta pagamento telematico */
    private java.lang.String richiestaPagamentoTelematico;

    /* ricevuta telematica */
    private java.lang.String ricevutaTelematica;

    /* identificativo univoco versamento */
    private java.lang.String identificativoUnivocoVersamento;

    public ListaMovimenti() {
    }

    public ListaMovimenti(
           java.lang.String progressivoRata,
           java.lang.String dataPagamento,
           java.lang.String causaleMovimento,
           java.lang.String luogoMovimento,
           java.math.BigDecimal impTributoPagato,
           java.math.BigDecimal impDirNotificaPagato,
           java.math.BigDecimal impCompensoPagato,
           java.math.BigDecimal impIntMoraPagato,
           java.math.BigDecimal impAltreSpesePagato,
           java.math.BigDecimal impEccedenza,
           java.lang.String codiceFiscalePagante,
           java.lang.String denominazionePagante,
           java.lang.String chiaveTransazione,
           java.lang.String richiestaPagamentoTelematico,
           java.lang.String ricevutaTelematica,
           java.lang.String identificativoUnivocoVersamento) {
           this.progressivoRata = progressivoRata;
           this.dataPagamento = dataPagamento;
           this.causaleMovimento = causaleMovimento;
           this.luogoMovimento = luogoMovimento;
           this.impTributoPagato = impTributoPagato;
           this.impDirNotificaPagato = impDirNotificaPagato;
           this.impCompensoPagato = impCompensoPagato;
           this.impIntMoraPagato = impIntMoraPagato;
           this.impAltreSpesePagato = impAltreSpesePagato;
           this.impEccedenza = impEccedenza;
           this.codiceFiscalePagante = codiceFiscalePagante;
           this.denominazionePagante = denominazionePagante;
           this.chiaveTransazione = chiaveTransazione;
           this.richiestaPagamentoTelematico = richiestaPagamentoTelematico;
           this.ricevutaTelematica = ricevutaTelematica;
           this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }


    /**
     * Gets the progressivoRata value for this ListaMovimenti.
     * 
     * @return progressivoRata   * progressivo rata
     */
    public java.lang.String getProgressivoRata() {
        return progressivoRata;
    }


    /**
     * Sets the progressivoRata value for this ListaMovimenti.
     * 
     * @param progressivoRata   * progressivo rata
     */
    public void setProgressivoRata(java.lang.String progressivoRata) {
        this.progressivoRata = progressivoRata;
    }


    /**
     * Gets the dataPagamento value for this ListaMovimenti.
     * 
     * @return dataPagamento   * data pagamento GG/MM/AAAA
     */
    public java.lang.String getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this ListaMovimenti.
     * 
     * @param dataPagamento   * data pagamento GG/MM/AAAA
     */
    public void setDataPagamento(java.lang.String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the causaleMovimento value for this ListaMovimenti.
     * 
     * @return causaleMovimento   * causale movimento
     */
    public java.lang.String getCausaleMovimento() {
        return causaleMovimento;
    }


    /**
     * Sets the causaleMovimento value for this ListaMovimenti.
     * 
     * @param causaleMovimento   * causale movimento
     */
    public void setCausaleMovimento(java.lang.String causaleMovimento) {
        this.causaleMovimento = causaleMovimento;
    }


    /**
     * Gets the luogoMovimento value for this ListaMovimenti.
     * 
     * @return luogoMovimento   * luogo movimento
     */
    public java.lang.String getLuogoMovimento() {
        return luogoMovimento;
    }


    /**
     * Sets the luogoMovimento value for this ListaMovimenti.
     * 
     * @param luogoMovimento   * luogo movimento
     */
    public void setLuogoMovimento(java.lang.String luogoMovimento) {
        this.luogoMovimento = luogoMovimento;
    }


    /**
     * Gets the impTributoPagato value for this ListaMovimenti.
     * 
     * @return impTributoPagato   * tributo pagato
     */
    public java.math.BigDecimal getImpTributoPagato() {
        return impTributoPagato;
    }


    /**
     * Sets the impTributoPagato value for this ListaMovimenti.
     * 
     * @param impTributoPagato   * tributo pagato
     */
    public void setImpTributoPagato(java.math.BigDecimal impTributoPagato) {
        this.impTributoPagato = impTributoPagato;
    }


    /**
     * Gets the impDirNotificaPagato value for this ListaMovimenti.
     * 
     * @return impDirNotificaPagato   * dir notifica pagato
     */
    public java.math.BigDecimal getImpDirNotificaPagato() {
        return impDirNotificaPagato;
    }


    /**
     * Sets the impDirNotificaPagato value for this ListaMovimenti.
     * 
     * @param impDirNotificaPagato   * dir notifica pagato
     */
    public void setImpDirNotificaPagato(java.math.BigDecimal impDirNotificaPagato) {
        this.impDirNotificaPagato = impDirNotificaPagato;
    }


    /**
     * Gets the impCompensoPagato value for this ListaMovimenti.
     * 
     * @return impCompensoPagato   * compenso pagato
     */
    public java.math.BigDecimal getImpCompensoPagato() {
        return impCompensoPagato;
    }


    /**
     * Sets the impCompensoPagato value for this ListaMovimenti.
     * 
     * @param impCompensoPagato   * compenso pagato
     */
    public void setImpCompensoPagato(java.math.BigDecimal impCompensoPagato) {
        this.impCompensoPagato = impCompensoPagato;
    }


    /**
     * Gets the impIntMoraPagato value for this ListaMovimenti.
     * 
     * @return impIntMoraPagato   * interessi mora pagato
     */
    public java.math.BigDecimal getImpIntMoraPagato() {
        return impIntMoraPagato;
    }


    /**
     * Sets the impIntMoraPagato value for this ListaMovimenti.
     * 
     * @param impIntMoraPagato   * interessi mora pagato
     */
    public void setImpIntMoraPagato(java.math.BigDecimal impIntMoraPagato) {
        this.impIntMoraPagato = impIntMoraPagato;
    }


    /**
     * Gets the impAltreSpesePagato value for this ListaMovimenti.
     * 
     * @return impAltreSpesePagato   * altre spese pagato
     */
    public java.math.BigDecimal getImpAltreSpesePagato() {
        return impAltreSpesePagato;
    }


    /**
     * Sets the impAltreSpesePagato value for this ListaMovimenti.
     * 
     * @param impAltreSpesePagato   * altre spese pagato
     */
    public void setImpAltreSpesePagato(java.math.BigDecimal impAltreSpesePagato) {
        this.impAltreSpesePagato = impAltreSpesePagato;
    }


    /**
     * Gets the impEccedenza value for this ListaMovimenti.
     * 
     * @return impEccedenza   * eccedenza
     */
    public java.math.BigDecimal getImpEccedenza() {
        return impEccedenza;
    }


    /**
     * Sets the impEccedenza value for this ListaMovimenti.
     * 
     * @param impEccedenza   * eccedenza
     */
    public void setImpEccedenza(java.math.BigDecimal impEccedenza) {
        this.impEccedenza = impEccedenza;
    }


    /**
     * Gets the codiceFiscalePagante value for this ListaMovimenti.
     * 
     * @return codiceFiscalePagante   * codice fiscale soggetto pagante
     */
    public java.lang.String getCodiceFiscalePagante() {
        return codiceFiscalePagante;
    }


    /**
     * Sets the codiceFiscalePagante value for this ListaMovimenti.
     * 
     * @param codiceFiscalePagante   * codice fiscale soggetto pagante
     */
    public void setCodiceFiscalePagante(java.lang.String codiceFiscalePagante) {
        this.codiceFiscalePagante = codiceFiscalePagante;
    }


    /**
     * Gets the denominazionePagante value for this ListaMovimenti.
     * 
     * @return denominazionePagante   * denominazione soggetto pagante
     */
    public java.lang.String getDenominazionePagante() {
        return denominazionePagante;
    }


    /**
     * Sets the denominazionePagante value for this ListaMovimenti.
     * 
     * @param denominazionePagante   * denominazione soggetto pagante
     */
    public void setDenominazionePagante(java.lang.String denominazionePagante) {
        this.denominazionePagante = denominazionePagante;
    }


    /**
     * Gets the chiaveTransazione value for this ListaMovimenti.
     * 
     * @return chiaveTransazione   * chiave transazione
     */
    public java.lang.String getChiaveTransazione() {
        return chiaveTransazione;
    }


    /**
     * Sets the chiaveTransazione value for this ListaMovimenti.
     * 
     * @param chiaveTransazione   * chiave transazione
     */
    public void setChiaveTransazione(java.lang.String chiaveTransazione) {
        this.chiaveTransazione = chiaveTransazione;
    }


    /**
     * Gets the richiestaPagamentoTelematico value for this ListaMovimenti.
     * 
     * @return richiestaPagamentoTelematico   * richiesta pagamento telematico
     */
    public java.lang.String getRichiestaPagamentoTelematico() {
        return richiestaPagamentoTelematico;
    }


    /**
     * Sets the richiestaPagamentoTelematico value for this ListaMovimenti.
     * 
     * @param richiestaPagamentoTelematico   * richiesta pagamento telematico
     */
    public void setRichiestaPagamentoTelematico(java.lang.String richiestaPagamentoTelematico) {
        this.richiestaPagamentoTelematico = richiestaPagamentoTelematico;
    }


    /**
     * Gets the ricevutaTelematica value for this ListaMovimenti.
     * 
     * @return ricevutaTelematica   * ricevuta telematica
     */
    public java.lang.String getRicevutaTelematica() {
        return ricevutaTelematica;
    }


    /**
     * Sets the ricevutaTelematica value for this ListaMovimenti.
     * 
     * @param ricevutaTelematica   * ricevuta telematica
     */
    public void setRicevutaTelematica(java.lang.String ricevutaTelematica) {
        this.ricevutaTelematica = ricevutaTelematica;
    }


    /**
     * Gets the identificativoUnivocoVersamento value for this ListaMovimenti.
     * 
     * @return identificativoUnivocoVersamento   * identificativo univoco versamento
     */
    public java.lang.String getIdentificativoUnivocoVersamento() {
        return identificativoUnivocoVersamento;
    }


    /**
     * Sets the identificativoUnivocoVersamento value for this ListaMovimenti.
     * 
     * @param identificativoUnivocoVersamento   * identificativo univoco versamento
     */
    public void setIdentificativoUnivocoVersamento(java.lang.String identificativoUnivocoVersamento) {
        this.identificativoUnivocoVersamento = identificativoUnivocoVersamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaMovimenti)) return false;
        ListaMovimenti other = (ListaMovimenti) obj;
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
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.causaleMovimento==null && other.getCausaleMovimento()==null) || 
             (this.causaleMovimento!=null &&
              this.causaleMovimento.equals(other.getCausaleMovimento()))) &&
            ((this.luogoMovimento==null && other.getLuogoMovimento()==null) || 
             (this.luogoMovimento!=null &&
              this.luogoMovimento.equals(other.getLuogoMovimento()))) &&
            ((this.impTributoPagato==null && other.getImpTributoPagato()==null) || 
             (this.impTributoPagato!=null &&
              this.impTributoPagato.equals(other.getImpTributoPagato()))) &&
            ((this.impDirNotificaPagato==null && other.getImpDirNotificaPagato()==null) || 
             (this.impDirNotificaPagato!=null &&
              this.impDirNotificaPagato.equals(other.getImpDirNotificaPagato()))) &&
            ((this.impCompensoPagato==null && other.getImpCompensoPagato()==null) || 
             (this.impCompensoPagato!=null &&
              this.impCompensoPagato.equals(other.getImpCompensoPagato()))) &&
            ((this.impIntMoraPagato==null && other.getImpIntMoraPagato()==null) || 
             (this.impIntMoraPagato!=null &&
              this.impIntMoraPagato.equals(other.getImpIntMoraPagato()))) &&
            ((this.impAltreSpesePagato==null && other.getImpAltreSpesePagato()==null) || 
             (this.impAltreSpesePagato!=null &&
              this.impAltreSpesePagato.equals(other.getImpAltreSpesePagato()))) &&
            ((this.impEccedenza==null && other.getImpEccedenza()==null) || 
             (this.impEccedenza!=null &&
              this.impEccedenza.equals(other.getImpEccedenza()))) &&
            ((this.codiceFiscalePagante==null && other.getCodiceFiscalePagante()==null) || 
             (this.codiceFiscalePagante!=null &&
              this.codiceFiscalePagante.equals(other.getCodiceFiscalePagante()))) &&
            ((this.denominazionePagante==null && other.getDenominazionePagante()==null) || 
             (this.denominazionePagante!=null &&
              this.denominazionePagante.equals(other.getDenominazionePagante()))) &&
            ((this.chiaveTransazione==null && other.getChiaveTransazione()==null) || 
             (this.chiaveTransazione!=null &&
              this.chiaveTransazione.equals(other.getChiaveTransazione()))) &&
            ((this.richiestaPagamentoTelematico==null && other.getRichiestaPagamentoTelematico()==null) || 
             (this.richiestaPagamentoTelematico!=null &&
              this.richiestaPagamentoTelematico.equals(other.getRichiestaPagamentoTelematico()))) &&
            ((this.ricevutaTelematica==null && other.getRicevutaTelematica()==null) || 
             (this.ricevutaTelematica!=null &&
              this.ricevutaTelematica.equals(other.getRicevutaTelematica()))) &&
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
        if (getProgressivoRata() != null) {
            _hashCode += getProgressivoRata().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getCausaleMovimento() != null) {
            _hashCode += getCausaleMovimento().hashCode();
        }
        if (getLuogoMovimento() != null) {
            _hashCode += getLuogoMovimento().hashCode();
        }
        if (getImpTributoPagato() != null) {
            _hashCode += getImpTributoPagato().hashCode();
        }
        if (getImpDirNotificaPagato() != null) {
            _hashCode += getImpDirNotificaPagato().hashCode();
        }
        if (getImpCompensoPagato() != null) {
            _hashCode += getImpCompensoPagato().hashCode();
        }
        if (getImpIntMoraPagato() != null) {
            _hashCode += getImpIntMoraPagato().hashCode();
        }
        if (getImpAltreSpesePagato() != null) {
            _hashCode += getImpAltreSpesePagato().hashCode();
        }
        if (getImpEccedenza() != null) {
            _hashCode += getImpEccedenza().hashCode();
        }
        if (getCodiceFiscalePagante() != null) {
            _hashCode += getCodiceFiscalePagante().hashCode();
        }
        if (getDenominazionePagante() != null) {
            _hashCode += getDenominazionePagante().hashCode();
        }
        if (getChiaveTransazione() != null) {
            _hashCode += getChiaveTransazione().hashCode();
        }
        if (getRichiestaPagamentoTelematico() != null) {
            _hashCode += getRichiestaPagamentoTelematico().hashCode();
        }
        if (getRicevutaTelematica() != null) {
            _hashCode += getRicevutaTelematica().hashCode();
        }
        if (getIdentificativoUnivocoVersamento() != null) {
            _hashCode += getIdentificativoUnivocoVersamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaMovimenti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaMovimenti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "progressivoRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "causaleMovimento"));
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
        elemField.setFieldName("impTributoPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impTributoPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impDirNotificaPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impDirNotificaPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impCompensoPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impCompensoPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impIntMoraPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impIntMoraPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impAltreSpesePagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impAltreSpesePagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impEccedenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "impEccedenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscalePagante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "codiceFiscalePagante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazionePagante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "denominazionePagante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "chiaveTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richiestaPagamentoTelematico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "richiestaPagamentoTelematico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricevutaTelematica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ricevutaTelematica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificativoUnivocoVersamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "identificativoUnivocoVersamento"));
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
