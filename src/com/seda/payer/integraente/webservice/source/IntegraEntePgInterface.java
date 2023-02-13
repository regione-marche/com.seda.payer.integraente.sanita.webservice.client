/**
 * IntegraEntePgInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.source;

public interface IntegraEntePgInterface extends java.rmi.Remote {
    public com.seda.payer.integraente.webservice.dati.RecuperaDatiBollettinoResponse recuperaDatiBollettino(com.seda.payer.integraente.webservice.dati.RecuperaDatiBollettinoRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaPagamentiHostResponse recuperaPagamentiHost(com.seda.payer.integraente.webservice.dati.RecuperaPagamentiHostRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaCodFiscHostResponse recuperaCodFiscHost(com.seda.payer.integraente.webservice.dati.RecuperaCodFiscHostRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
}
