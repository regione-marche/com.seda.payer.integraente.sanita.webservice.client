/**
 * DettaglioDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class DettaglioDocumento  implements java.io.Serializable {
    /* Tributi Iniziali */
    private java.math.BigDecimal tributiIniziali;

    /* Tributi pagato */
    private java.math.BigDecimal tributiPagato;

    /* Tributi residuo */
    private java.math.BigDecimal tributiResiduo;

    /* Dir Notifica  Iniziale */
    private java.math.BigDecimal dirNotificaIniziale;

    /* Dir Notifica Pagatp */
    private java.math.BigDecimal dirNotificaPagato;

    /* Dir Notifica  Residuo */
    private java.math.BigDecimal dirNotificaResiduo;

    /* Comp Risc Iniziale */
    private java.math.BigDecimal compRiscIniziale;

    /* Comp Risc Pagato */
    private java.math.BigDecimal compRiscPagato;

    /* Comp Risc Residuo */
    private java.math.BigDecimal compRiscResiduo;

    /* Interessi Mora Iniziale */
    private java.math.BigDecimal intMoraIniziale;

    /* Interessi Mora  Pagato */
    private java.math.BigDecimal intMoraPagato;

    /* Interessi Mora  Residuo */
    private java.math.BigDecimal intMoraResiduo;

    /* Altre spese Iniziale */
    private java.math.BigDecimal altreSpeseIniziale;

    /* Altre spese Pagato */
    private java.math.BigDecimal altreSpesePagato;

    /* Altre spese Residuo */
    private java.math.BigDecimal altreSpeseResiduo;

    /* Totale Documento Iniziale */
    private java.math.BigDecimal totaleDocIniziale;

    /* Totale Documento Pagato */
    private java.math.BigDecimal totaleDocPagato;

    /* Totale Documento Residuo */
    private java.math.BigDecimal totaleDocResiduo;

    public DettaglioDocumento() {
    }

    public DettaglioDocumento(
           java.math.BigDecimal tributiIniziali,
           java.math.BigDecimal tributiPagato,
           java.math.BigDecimal tributiResiduo,
           java.math.BigDecimal dirNotificaIniziale,
           java.math.BigDecimal dirNotificaPagato,
           java.math.BigDecimal dirNotificaResiduo,
           java.math.BigDecimal compRiscIniziale,
           java.math.BigDecimal compRiscPagato,
           java.math.BigDecimal compRiscResiduo,
           java.math.BigDecimal intMoraIniziale,
           java.math.BigDecimal intMoraPagato,
           java.math.BigDecimal intMoraResiduo,
           java.math.BigDecimal altreSpeseIniziale,
           java.math.BigDecimal altreSpesePagato,
           java.math.BigDecimal altreSpeseResiduo,
           java.math.BigDecimal totaleDocIniziale,
           java.math.BigDecimal totaleDocPagato,
           java.math.BigDecimal totaleDocResiduo) {
           this.tributiIniziali = tributiIniziali;
           this.tributiPagato = tributiPagato;
           this.tributiResiduo = tributiResiduo;
           this.dirNotificaIniziale = dirNotificaIniziale;
           this.dirNotificaPagato = dirNotificaPagato;
           this.dirNotificaResiduo = dirNotificaResiduo;
           this.compRiscIniziale = compRiscIniziale;
           this.compRiscPagato = compRiscPagato;
           this.compRiscResiduo = compRiscResiduo;
           this.intMoraIniziale = intMoraIniziale;
           this.intMoraPagato = intMoraPagato;
           this.intMoraResiduo = intMoraResiduo;
           this.altreSpeseIniziale = altreSpeseIniziale;
           this.altreSpesePagato = altreSpesePagato;
           this.altreSpeseResiduo = altreSpeseResiduo;
           this.totaleDocIniziale = totaleDocIniziale;
           this.totaleDocPagato = totaleDocPagato;
           this.totaleDocResiduo = totaleDocResiduo;
    }


    /**
     * Gets the tributiIniziali value for this DettaglioDocumento.
     * 
     * @return tributiIniziali   * Tributi Iniziali
     */
    public java.math.BigDecimal getTributiIniziali() {
        return tributiIniziali;
    }


    /**
     * Sets the tributiIniziali value for this DettaglioDocumento.
     * 
     * @param tributiIniziali   * Tributi Iniziali
     */
    public void setTributiIniziali(java.math.BigDecimal tributiIniziali) {
        this.tributiIniziali = tributiIniziali;
    }


    /**
     * Gets the tributiPagato value for this DettaglioDocumento.
     * 
     * @return tributiPagato   * Tributi pagato
     */
    public java.math.BigDecimal getTributiPagato() {
        return tributiPagato;
    }


    /**
     * Sets the tributiPagato value for this DettaglioDocumento.
     * 
     * @param tributiPagato   * Tributi pagato
     */
    public void setTributiPagato(java.math.BigDecimal tributiPagato) {
        this.tributiPagato = tributiPagato;
    }


    /**
     * Gets the tributiResiduo value for this DettaglioDocumento.
     * 
     * @return tributiResiduo   * Tributi residuo
     */
    public java.math.BigDecimal getTributiResiduo() {
        return tributiResiduo;
    }


    /**
     * Sets the tributiResiduo value for this DettaglioDocumento.
     * 
     * @param tributiResiduo   * Tributi residuo
     */
    public void setTributiResiduo(java.math.BigDecimal tributiResiduo) {
        this.tributiResiduo = tributiResiduo;
    }


    /**
     * Gets the dirNotificaIniziale value for this DettaglioDocumento.
     * 
     * @return dirNotificaIniziale   * Dir Notifica  Iniziale
     */
    public java.math.BigDecimal getDirNotificaIniziale() {
        return dirNotificaIniziale;
    }


    /**
     * Sets the dirNotificaIniziale value for this DettaglioDocumento.
     * 
     * @param dirNotificaIniziale   * Dir Notifica  Iniziale
     */
    public void setDirNotificaIniziale(java.math.BigDecimal dirNotificaIniziale) {
        this.dirNotificaIniziale = dirNotificaIniziale;
    }


    /**
     * Gets the dirNotificaPagato value for this DettaglioDocumento.
     * 
     * @return dirNotificaPagato   * Dir Notifica Pagatp
     */
    public java.math.BigDecimal getDirNotificaPagato() {
        return dirNotificaPagato;
    }


    /**
     * Sets the dirNotificaPagato value for this DettaglioDocumento.
     * 
     * @param dirNotificaPagato   * Dir Notifica Pagatp
     */
    public void setDirNotificaPagato(java.math.BigDecimal dirNotificaPagato) {
        this.dirNotificaPagato = dirNotificaPagato;
    }


    /**
     * Gets the dirNotificaResiduo value for this DettaglioDocumento.
     * 
     * @return dirNotificaResiduo   * Dir Notifica  Residuo
     */
    public java.math.BigDecimal getDirNotificaResiduo() {
        return dirNotificaResiduo;
    }


    /**
     * Sets the dirNotificaResiduo value for this DettaglioDocumento.
     * 
     * @param dirNotificaResiduo   * Dir Notifica  Residuo
     */
    public void setDirNotificaResiduo(java.math.BigDecimal dirNotificaResiduo) {
        this.dirNotificaResiduo = dirNotificaResiduo;
    }


    /**
     * Gets the compRiscIniziale value for this DettaglioDocumento.
     * 
     * @return compRiscIniziale   * Comp Risc Iniziale
     */
    public java.math.BigDecimal getCompRiscIniziale() {
        return compRiscIniziale;
    }


    /**
     * Sets the compRiscIniziale value for this DettaglioDocumento.
     * 
     * @param compRiscIniziale   * Comp Risc Iniziale
     */
    public void setCompRiscIniziale(java.math.BigDecimal compRiscIniziale) {
        this.compRiscIniziale = compRiscIniziale;
    }


    /**
     * Gets the compRiscPagato value for this DettaglioDocumento.
     * 
     * @return compRiscPagato   * Comp Risc Pagato
     */
    public java.math.BigDecimal getCompRiscPagato() {
        return compRiscPagato;
    }


    /**
     * Sets the compRiscPagato value for this DettaglioDocumento.
     * 
     * @param compRiscPagato   * Comp Risc Pagato
     */
    public void setCompRiscPagato(java.math.BigDecimal compRiscPagato) {
        this.compRiscPagato = compRiscPagato;
    }


    /**
     * Gets the compRiscResiduo value for this DettaglioDocumento.
     * 
     * @return compRiscResiduo   * Comp Risc Residuo
     */
    public java.math.BigDecimal getCompRiscResiduo() {
        return compRiscResiduo;
    }


    /**
     * Sets the compRiscResiduo value for this DettaglioDocumento.
     * 
     * @param compRiscResiduo   * Comp Risc Residuo
     */
    public void setCompRiscResiduo(java.math.BigDecimal compRiscResiduo) {
        this.compRiscResiduo = compRiscResiduo;
    }


    /**
     * Gets the intMoraIniziale value for this DettaglioDocumento.
     * 
     * @return intMoraIniziale   * Interessi Mora Iniziale
     */
    public java.math.BigDecimal getIntMoraIniziale() {
        return intMoraIniziale;
    }


    /**
     * Sets the intMoraIniziale value for this DettaglioDocumento.
     * 
     * @param intMoraIniziale   * Interessi Mora Iniziale
     */
    public void setIntMoraIniziale(java.math.BigDecimal intMoraIniziale) {
        this.intMoraIniziale = intMoraIniziale;
    }


    /**
     * Gets the intMoraPagato value for this DettaglioDocumento.
     * 
     * @return intMoraPagato   * Interessi Mora  Pagato
     */
    public java.math.BigDecimal getIntMoraPagato() {
        return intMoraPagato;
    }


    /**
     * Sets the intMoraPagato value for this DettaglioDocumento.
     * 
     * @param intMoraPagato   * Interessi Mora  Pagato
     */
    public void setIntMoraPagato(java.math.BigDecimal intMoraPagato) {
        this.intMoraPagato = intMoraPagato;
    }


    /**
     * Gets the intMoraResiduo value for this DettaglioDocumento.
     * 
     * @return intMoraResiduo   * Interessi Mora  Residuo
     */
    public java.math.BigDecimal getIntMoraResiduo() {
        return intMoraResiduo;
    }


    /**
     * Sets the intMoraResiduo value for this DettaglioDocumento.
     * 
     * @param intMoraResiduo   * Interessi Mora  Residuo
     */
    public void setIntMoraResiduo(java.math.BigDecimal intMoraResiduo) {
        this.intMoraResiduo = intMoraResiduo;
    }


    /**
     * Gets the altreSpeseIniziale value for this DettaglioDocumento.
     * 
     * @return altreSpeseIniziale   * Altre spese Iniziale
     */
    public java.math.BigDecimal getAltreSpeseIniziale() {
        return altreSpeseIniziale;
    }


    /**
     * Sets the altreSpeseIniziale value for this DettaglioDocumento.
     * 
     * @param altreSpeseIniziale   * Altre spese Iniziale
     */
    public void setAltreSpeseIniziale(java.math.BigDecimal altreSpeseIniziale) {
        this.altreSpeseIniziale = altreSpeseIniziale;
    }


    /**
     * Gets the altreSpesePagato value for this DettaglioDocumento.
     * 
     * @return altreSpesePagato   * Altre spese Pagato
     */
    public java.math.BigDecimal getAltreSpesePagato() {
        return altreSpesePagato;
    }


    /**
     * Sets the altreSpesePagato value for this DettaglioDocumento.
     * 
     * @param altreSpesePagato   * Altre spese Pagato
     */
    public void setAltreSpesePagato(java.math.BigDecimal altreSpesePagato) {
        this.altreSpesePagato = altreSpesePagato;
    }


    /**
     * Gets the altreSpeseResiduo value for this DettaglioDocumento.
     * 
     * @return altreSpeseResiduo   * Altre spese Residuo
     */
    public java.math.BigDecimal getAltreSpeseResiduo() {
        return altreSpeseResiduo;
    }


    /**
     * Sets the altreSpeseResiduo value for this DettaglioDocumento.
     * 
     * @param altreSpeseResiduo   * Altre spese Residuo
     */
    public void setAltreSpeseResiduo(java.math.BigDecimal altreSpeseResiduo) {
        this.altreSpeseResiduo = altreSpeseResiduo;
    }


    /**
     * Gets the totaleDocIniziale value for this DettaglioDocumento.
     * 
     * @return totaleDocIniziale   * Totale Documento Iniziale
     */
    public java.math.BigDecimal getTotaleDocIniziale() {
        return totaleDocIniziale;
    }


    /**
     * Sets the totaleDocIniziale value for this DettaglioDocumento.
     * 
     * @param totaleDocIniziale   * Totale Documento Iniziale
     */
    public void setTotaleDocIniziale(java.math.BigDecimal totaleDocIniziale) {
        this.totaleDocIniziale = totaleDocIniziale;
    }


    /**
     * Gets the totaleDocPagato value for this DettaglioDocumento.
     * 
     * @return totaleDocPagato   * Totale Documento Pagato
     */
    public java.math.BigDecimal getTotaleDocPagato() {
        return totaleDocPagato;
    }


    /**
     * Sets the totaleDocPagato value for this DettaglioDocumento.
     * 
     * @param totaleDocPagato   * Totale Documento Pagato
     */
    public void setTotaleDocPagato(java.math.BigDecimal totaleDocPagato) {
        this.totaleDocPagato = totaleDocPagato;
    }


    /**
     * Gets the totaleDocResiduo value for this DettaglioDocumento.
     * 
     * @return totaleDocResiduo   * Totale Documento Residuo
     */
    public java.math.BigDecimal getTotaleDocResiduo() {
        return totaleDocResiduo;
    }


    /**
     * Sets the totaleDocResiduo value for this DettaglioDocumento.
     * 
     * @param totaleDocResiduo   * Totale Documento Residuo
     */
    public void setTotaleDocResiduo(java.math.BigDecimal totaleDocResiduo) {
        this.totaleDocResiduo = totaleDocResiduo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioDocumento)) return false;
        DettaglioDocumento other = (DettaglioDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tributiIniziali==null && other.getTributiIniziali()==null) || 
             (this.tributiIniziali!=null &&
              this.tributiIniziali.equals(other.getTributiIniziali()))) &&
            ((this.tributiPagato==null && other.getTributiPagato()==null) || 
             (this.tributiPagato!=null &&
              this.tributiPagato.equals(other.getTributiPagato()))) &&
            ((this.tributiResiduo==null && other.getTributiResiduo()==null) || 
             (this.tributiResiduo!=null &&
              this.tributiResiduo.equals(other.getTributiResiduo()))) &&
            ((this.dirNotificaIniziale==null && other.getDirNotificaIniziale()==null) || 
             (this.dirNotificaIniziale!=null &&
              this.dirNotificaIniziale.equals(other.getDirNotificaIniziale()))) &&
            ((this.dirNotificaPagato==null && other.getDirNotificaPagato()==null) || 
             (this.dirNotificaPagato!=null &&
              this.dirNotificaPagato.equals(other.getDirNotificaPagato()))) &&
            ((this.dirNotificaResiduo==null && other.getDirNotificaResiduo()==null) || 
             (this.dirNotificaResiduo!=null &&
              this.dirNotificaResiduo.equals(other.getDirNotificaResiduo()))) &&
            ((this.compRiscIniziale==null && other.getCompRiscIniziale()==null) || 
             (this.compRiscIniziale!=null &&
              this.compRiscIniziale.equals(other.getCompRiscIniziale()))) &&
            ((this.compRiscPagato==null && other.getCompRiscPagato()==null) || 
             (this.compRiscPagato!=null &&
              this.compRiscPagato.equals(other.getCompRiscPagato()))) &&
            ((this.compRiscResiduo==null && other.getCompRiscResiduo()==null) || 
             (this.compRiscResiduo!=null &&
              this.compRiscResiduo.equals(other.getCompRiscResiduo()))) &&
            ((this.intMoraIniziale==null && other.getIntMoraIniziale()==null) || 
             (this.intMoraIniziale!=null &&
              this.intMoraIniziale.equals(other.getIntMoraIniziale()))) &&
            ((this.intMoraPagato==null && other.getIntMoraPagato()==null) || 
             (this.intMoraPagato!=null &&
              this.intMoraPagato.equals(other.getIntMoraPagato()))) &&
            ((this.intMoraResiduo==null && other.getIntMoraResiduo()==null) || 
             (this.intMoraResiduo!=null &&
              this.intMoraResiduo.equals(other.getIntMoraResiduo()))) &&
            ((this.altreSpeseIniziale==null && other.getAltreSpeseIniziale()==null) || 
             (this.altreSpeseIniziale!=null &&
              this.altreSpeseIniziale.equals(other.getAltreSpeseIniziale()))) &&
            ((this.altreSpesePagato==null && other.getAltreSpesePagato()==null) || 
             (this.altreSpesePagato!=null &&
              this.altreSpesePagato.equals(other.getAltreSpesePagato()))) &&
            ((this.altreSpeseResiduo==null && other.getAltreSpeseResiduo()==null) || 
             (this.altreSpeseResiduo!=null &&
              this.altreSpeseResiduo.equals(other.getAltreSpeseResiduo()))) &&
            ((this.totaleDocIniziale==null && other.getTotaleDocIniziale()==null) || 
             (this.totaleDocIniziale!=null &&
              this.totaleDocIniziale.equals(other.getTotaleDocIniziale()))) &&
            ((this.totaleDocPagato==null && other.getTotaleDocPagato()==null) || 
             (this.totaleDocPagato!=null &&
              this.totaleDocPagato.equals(other.getTotaleDocPagato()))) &&
            ((this.totaleDocResiduo==null && other.getTotaleDocResiduo()==null) || 
             (this.totaleDocResiduo!=null &&
              this.totaleDocResiduo.equals(other.getTotaleDocResiduo())));
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
        if (getTributiIniziali() != null) {
            _hashCode += getTributiIniziali().hashCode();
        }
        if (getTributiPagato() != null) {
            _hashCode += getTributiPagato().hashCode();
        }
        if (getTributiResiduo() != null) {
            _hashCode += getTributiResiduo().hashCode();
        }
        if (getDirNotificaIniziale() != null) {
            _hashCode += getDirNotificaIniziale().hashCode();
        }
        if (getDirNotificaPagato() != null) {
            _hashCode += getDirNotificaPagato().hashCode();
        }
        if (getDirNotificaResiduo() != null) {
            _hashCode += getDirNotificaResiduo().hashCode();
        }
        if (getCompRiscIniziale() != null) {
            _hashCode += getCompRiscIniziale().hashCode();
        }
        if (getCompRiscPagato() != null) {
            _hashCode += getCompRiscPagato().hashCode();
        }
        if (getCompRiscResiduo() != null) {
            _hashCode += getCompRiscResiduo().hashCode();
        }
        if (getIntMoraIniziale() != null) {
            _hashCode += getIntMoraIniziale().hashCode();
        }
        if (getIntMoraPagato() != null) {
            _hashCode += getIntMoraPagato().hashCode();
        }
        if (getIntMoraResiduo() != null) {
            _hashCode += getIntMoraResiduo().hashCode();
        }
        if (getAltreSpeseIniziale() != null) {
            _hashCode += getAltreSpeseIniziale().hashCode();
        }
        if (getAltreSpesePagato() != null) {
            _hashCode += getAltreSpesePagato().hashCode();
        }
        if (getAltreSpeseResiduo() != null) {
            _hashCode += getAltreSpeseResiduo().hashCode();
        }
        if (getTotaleDocIniziale() != null) {
            _hashCode += getTotaleDocIniziale().hashCode();
        }
        if (getTotaleDocPagato() != null) {
            _hashCode += getTotaleDocPagato().hashCode();
        }
        if (getTotaleDocResiduo() != null) {
            _hashCode += getTotaleDocResiduo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DettaglioDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "DettaglioDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributiIniziali");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tributiIniziali"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributiPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tributiPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributiResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tributiResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirNotificaIniziale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "DirNotificaIniziale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirNotificaPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "DirNotificaPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirNotificaResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "DirNotificaResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compRiscIniziale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "CompRiscIniziale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compRiscPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "CompRiscPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compRiscResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "CompRiscResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intMoraIniziale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "IntMoraIniziale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intMoraPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "IntMoraPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intMoraResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "IntMoraResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altreSpeseIniziale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "AltreSpeseIniziale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altreSpesePagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "AltreSpesePagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altreSpeseResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "AltreSpeseResiduo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDocIniziale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TotaleDocIniziale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDocPagato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TotaleDocPagato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleDocResiduo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TotaleDocResiduo"));
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
