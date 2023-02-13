/**
 * RecuperaDettDocBollettinoResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class RecuperaDettDocBollettinoResp  implements java.io.Serializable {
    /* NOME */
    private java.lang.String nome;

    /* Cognome */
    private java.lang.String cognome;

    /* conto Corrente */
    private java.lang.String contoCorrente;

    /* numero Bollettino N RAV */
    private java.lang.String numeroBollettino;

    /* autorizzazione CCP */
    private java.lang.String autorizzazioneCCP;

    /* data nascita */
    private java.lang.String datanascita;

    /* sesso */
    private java.lang.String sesso;

    /* comune Nascita */
    private java.lang.String comuneNascita;

    /* provincia Nascita */
    private java.lang.String provinciaNascita;

    /* lista dei tributi per F24 */
    private com.seda.payer.integraente.webservice.dati.TributoF24[] listaTributif24;

    /* diverso da 00 errore */
    private java.lang.String retCode;

    /* messaggio dell'esito dell'operazione */
    private java.lang.String retMessage;

    public RecuperaDettDocBollettinoResp() {
    }

    public RecuperaDettDocBollettinoResp(
           java.lang.String nome,
           java.lang.String cognome,
           java.lang.String contoCorrente,
           java.lang.String numeroBollettino,
           java.lang.String autorizzazioneCCP,
           java.lang.String datanascita,
           java.lang.String sesso,
           java.lang.String comuneNascita,
           java.lang.String provinciaNascita,
           com.seda.payer.integraente.webservice.dati.TributoF24[] listaTributif24,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.nome = nome;
           this.cognome = cognome;
           this.contoCorrente = contoCorrente;
           this.numeroBollettino = numeroBollettino;
           this.autorizzazioneCCP = autorizzazioneCCP;
           this.datanascita = datanascita;
           this.sesso = sesso;
           this.comuneNascita = comuneNascita;
           this.provinciaNascita = provinciaNascita;
           this.listaTributif24 = listaTributif24;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the nome value for this RecuperaDettDocBollettinoResp.
     * 
     * @return nome   * NOME
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this RecuperaDettDocBollettinoResp.
     * 
     * @param nome   * NOME
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cognome value for this RecuperaDettDocBollettinoResp.
     * 
     * @return cognome   * Cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this RecuperaDettDocBollettinoResp.
     * 
     * @param cognome   * Cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the contoCorrente value for this RecuperaDettDocBollettinoResp.
     * 
     * @return contoCorrente   * conto Corrente
     */
    public java.lang.String getContoCorrente() {
        return contoCorrente;
    }


    /**
     * Sets the contoCorrente value for this RecuperaDettDocBollettinoResp.
     * 
     * @param contoCorrente   * conto Corrente
     */
    public void setContoCorrente(java.lang.String contoCorrente) {
        this.contoCorrente = contoCorrente;
    }


    /**
     * Gets the numeroBollettino value for this RecuperaDettDocBollettinoResp.
     * 
     * @return numeroBollettino   * numero Bollettino N RAV
     */
    public java.lang.String getNumeroBollettino() {
        return numeroBollettino;
    }


    /**
     * Sets the numeroBollettino value for this RecuperaDettDocBollettinoResp.
     * 
     * @param numeroBollettino   * numero Bollettino N RAV
     */
    public void setNumeroBollettino(java.lang.String numeroBollettino) {
        this.numeroBollettino = numeroBollettino;
    }


    /**
     * Gets the autorizzazioneCCP value for this RecuperaDettDocBollettinoResp.
     * 
     * @return autorizzazioneCCP   * autorizzazione CCP
     */
    public java.lang.String getAutorizzazioneCCP() {
        return autorizzazioneCCP;
    }


    /**
     * Sets the autorizzazioneCCP value for this RecuperaDettDocBollettinoResp.
     * 
     * @param autorizzazioneCCP   * autorizzazione CCP
     */
    public void setAutorizzazioneCCP(java.lang.String autorizzazioneCCP) {
        this.autorizzazioneCCP = autorizzazioneCCP;
    }


    /**
     * Gets the datanascita value for this RecuperaDettDocBollettinoResp.
     * 
     * @return datanascita   * data nascita
     */
    public java.lang.String getDatanascita() {
        return datanascita;
    }


    /**
     * Sets the datanascita value for this RecuperaDettDocBollettinoResp.
     * 
     * @param datanascita   * data nascita
     */
    public void setDatanascita(java.lang.String datanascita) {
        this.datanascita = datanascita;
    }


    /**
     * Gets the sesso value for this RecuperaDettDocBollettinoResp.
     * 
     * @return sesso   * sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this RecuperaDettDocBollettinoResp.
     * 
     * @param sesso   * sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }


    /**
     * Gets the comuneNascita value for this RecuperaDettDocBollettinoResp.
     * 
     * @return comuneNascita   * comune Nascita
     */
    public java.lang.String getComuneNascita() {
        return comuneNascita;
    }


    /**
     * Sets the comuneNascita value for this RecuperaDettDocBollettinoResp.
     * 
     * @param comuneNascita   * comune Nascita
     */
    public void setComuneNascita(java.lang.String comuneNascita) {
        this.comuneNascita = comuneNascita;
    }


    /**
     * Gets the provinciaNascita value for this RecuperaDettDocBollettinoResp.
     * 
     * @return provinciaNascita   * provincia Nascita
     */
    public java.lang.String getProvinciaNascita() {
        return provinciaNascita;
    }


    /**
     * Sets the provinciaNascita value for this RecuperaDettDocBollettinoResp.
     * 
     * @param provinciaNascita   * provincia Nascita
     */
    public void setProvinciaNascita(java.lang.String provinciaNascita) {
        this.provinciaNascita = provinciaNascita;
    }


    /**
     * Gets the listaTributif24 value for this RecuperaDettDocBollettinoResp.
     * 
     * @return listaTributif24   * lista dei tributi per F24
     */
    public com.seda.payer.integraente.webservice.dati.TributoF24[] getListaTributif24() {
        return listaTributif24;
    }


    /**
     * Sets the listaTributif24 value for this RecuperaDettDocBollettinoResp.
     * 
     * @param listaTributif24   * lista dei tributi per F24
     */
    public void setListaTributif24(com.seda.payer.integraente.webservice.dati.TributoF24[] listaTributif24) {
        this.listaTributif24 = listaTributif24;
    }

    public com.seda.payer.integraente.webservice.dati.TributoF24 getListaTributif24(int i) {
        return this.listaTributif24[i];
    }

    public void setListaTributif24(int i, com.seda.payer.integraente.webservice.dati.TributoF24 _value) {
        this.listaTributif24[i] = _value;
    }


    /**
     * Gets the retCode value for this RecuperaDettDocBollettinoResp.
     * 
     * @return retCode   * diverso da 00 errore
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaDettDocBollettinoResp.
     * 
     * @param retCode   * diverso da 00 errore
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaDettDocBollettinoResp.
     * 
     * @return retMessage   * messaggio dell'esito dell'operazione
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaDettDocBollettinoResp.
     * 
     * @param retMessage   * messaggio dell'esito dell'operazione
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettDocBollettinoResp)) return false;
        RecuperaDettDocBollettinoResp other = (RecuperaDettDocBollettinoResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.cognome==null && other.getCognome()==null) || 
             (this.cognome!=null &&
              this.cognome.equals(other.getCognome()))) &&
            ((this.contoCorrente==null && other.getContoCorrente()==null) || 
             (this.contoCorrente!=null &&
              this.contoCorrente.equals(other.getContoCorrente()))) &&
            ((this.numeroBollettino==null && other.getNumeroBollettino()==null) || 
             (this.numeroBollettino!=null &&
              this.numeroBollettino.equals(other.getNumeroBollettino()))) &&
            ((this.autorizzazioneCCP==null && other.getAutorizzazioneCCP()==null) || 
             (this.autorizzazioneCCP!=null &&
              this.autorizzazioneCCP.equals(other.getAutorizzazioneCCP()))) &&
            ((this.datanascita==null && other.getDatanascita()==null) || 
             (this.datanascita!=null &&
              this.datanascita.equals(other.getDatanascita()))) &&
            ((this.sesso==null && other.getSesso()==null) || 
             (this.sesso!=null &&
              this.sesso.equals(other.getSesso()))) &&
            ((this.comuneNascita==null && other.getComuneNascita()==null) || 
             (this.comuneNascita!=null &&
              this.comuneNascita.equals(other.getComuneNascita()))) &&
            ((this.provinciaNascita==null && other.getProvinciaNascita()==null) || 
             (this.provinciaNascita!=null &&
              this.provinciaNascita.equals(other.getProvinciaNascita()))) &&
            ((this.listaTributif24==null && other.getListaTributif24()==null) || 
             (this.listaTributif24!=null &&
              java.util.Arrays.equals(this.listaTributif24, other.getListaTributif24()))) &&
            ((this.retCode==null && other.getRetCode()==null) || 
             (this.retCode!=null &&
              this.retCode.equals(other.getRetCode()))) &&
            ((this.retMessage==null && other.getRetMessage()==null) || 
             (this.retMessage!=null &&
              this.retMessage.equals(other.getRetMessage())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCognome() != null) {
            _hashCode += getCognome().hashCode();
        }
        if (getContoCorrente() != null) {
            _hashCode += getContoCorrente().hashCode();
        }
        if (getNumeroBollettino() != null) {
            _hashCode += getNumeroBollettino().hashCode();
        }
        if (getAutorizzazioneCCP() != null) {
            _hashCode += getAutorizzazioneCCP().hashCode();
        }
        if (getDatanascita() != null) {
            _hashCode += getDatanascita().hashCode();
        }
        if (getSesso() != null) {
            _hashCode += getSesso().hashCode();
        }
        if (getComuneNascita() != null) {
            _hashCode += getComuneNascita().hashCode();
        }
        if (getProvinciaNascita() != null) {
            _hashCode += getProvinciaNascita().hashCode();
        }
        if (getListaTributif24() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaTributif24());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaTributif24(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetCode() != null) {
            _hashCode += getRetCode().hashCode();
        }
        if (getRetMessage() != null) {
            _hashCode += getRetMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDettDocBollettinoResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "RecuperaDettDocBollettinoResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "cognome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contoCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "contoCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "numeroBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizzazioneCCP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "autorizzazioneCCP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datanascita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "datanascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "sesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuneNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "comuneNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "provinciaNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTributif24");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "listaTributif24"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "TributoF24"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "retCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "retMessage"));
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
