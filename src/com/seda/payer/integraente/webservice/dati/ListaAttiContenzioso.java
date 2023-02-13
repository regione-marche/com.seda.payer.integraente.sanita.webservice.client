/**
 * ListaAttiContenzioso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.dati;

public class ListaAttiContenzioso  implements java.io.Serializable {
    /* anno emissione */
    private java.lang.String annoEmissione;

    /* data documento GG/MM/AAAA */
    private java.lang.String dataDocumento;

    /* numero documento */
    private java.lang.String numeroDocumento;

    /* descrizione tipologia documento */
    private java.lang.String tipoDocumento;

    /* visibilita 'ALL' - sia Cittadino sia EC Manager / 'CIT' - Cittadino
     * / 'SOR' - EC Manager */
    private java.lang.String visibilita;

    public ListaAttiContenzioso() {
    }

    public ListaAttiContenzioso(
           java.lang.String annoEmissione,
           java.lang.String dataDocumento,
           java.lang.String numeroDocumento,
           java.lang.String tipoDocumento,
           java.lang.String visibilita) {
           this.annoEmissione = annoEmissione;
           this.dataDocumento = dataDocumento;
           this.numeroDocumento = numeroDocumento;
           this.tipoDocumento = tipoDocumento;
           this.visibilita = visibilita;
    }


    /**
     * Gets the annoEmissione value for this ListaAttiContenzioso.
     * 
     * @return annoEmissione   * anno emissione
     */
    public java.lang.String getAnnoEmissione() {
        return annoEmissione;
    }


    /**
     * Sets the annoEmissione value for this ListaAttiContenzioso.
     * 
     * @param annoEmissione   * anno emissione
     */
    public void setAnnoEmissione(java.lang.String annoEmissione) {
        this.annoEmissione = annoEmissione;
    }


    /**
     * Gets the dataDocumento value for this ListaAttiContenzioso.
     * 
     * @return dataDocumento   * data documento GG/MM/AAAA
     */
    public java.lang.String getDataDocumento() {
        return dataDocumento;
    }


    /**
     * Sets the dataDocumento value for this ListaAttiContenzioso.
     * 
     * @param dataDocumento   * data documento GG/MM/AAAA
     */
    public void setDataDocumento(java.lang.String dataDocumento) {
        this.dataDocumento = dataDocumento;
    }


    /**
     * Gets the numeroDocumento value for this ListaAttiContenzioso.
     * 
     * @return numeroDocumento   * numero documento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this ListaAttiContenzioso.
     * 
     * @param numeroDocumento   * numero documento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the tipoDocumento value for this ListaAttiContenzioso.
     * 
     * @return tipoDocumento   * descrizione tipologia documento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ListaAttiContenzioso.
     * 
     * @param tipoDocumento   * descrizione tipologia documento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the visibilita value for this ListaAttiContenzioso.
     * 
     * @return visibilita   * visibilita 'ALL' - sia Cittadino sia EC Manager / 'CIT' - Cittadino
     * / 'SOR' - EC Manager
     */
    public java.lang.String getVisibilita() {
        return visibilita;
    }


    /**
     * Sets the visibilita value for this ListaAttiContenzioso.
     * 
     * @param visibilita   * visibilita 'ALL' - sia Cittadino sia EC Manager / 'CIT' - Cittadino
     * / 'SOR' - EC Manager
     */
    public void setVisibilita(java.lang.String visibilita) {
        this.visibilita = visibilita;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaAttiContenzioso)) return false;
        ListaAttiContenzioso other = (ListaAttiContenzioso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annoEmissione==null && other.getAnnoEmissione()==null) || 
             (this.annoEmissione!=null &&
              this.annoEmissione.equals(other.getAnnoEmissione()))) &&
            ((this.dataDocumento==null && other.getDataDocumento()==null) || 
             (this.dataDocumento!=null &&
              this.dataDocumento.equals(other.getDataDocumento()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.visibilita==null && other.getVisibilita()==null) || 
             (this.visibilita!=null &&
              this.visibilita.equals(other.getVisibilita())));
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
        if (getAnnoEmissione() != null) {
            _hashCode += getAnnoEmissione().hashCode();
        }
        if (getDataDocumento() != null) {
            _hashCode += getDataDocumento().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getVisibilita() != null) {
            _hashCode += getVisibilita().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaAttiContenzioso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "ListaAttiContenzioso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoEmissione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "annoEmissione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "dataDocumento"));
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
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibilita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.integraente.payer.seda.com", "visibilita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
