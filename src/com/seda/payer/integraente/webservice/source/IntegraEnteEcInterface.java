/**
 * IntegraEnteEcInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.source;

public interface IntegraEnteEcInterface extends java.rmi.Remote {
    public com.seda.payer.integraente.webservice.dati.RecuperaListDocResponse recuperaListDoc(com.seda.payer.integraente.webservice.dati.RecuperaListDocRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaDettDocResponse recuperaDettDoc(com.seda.payer.integraente.webservice.dati.RecuperaDettDocRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaDettDocBollettinoResp recuperaDettDocBollettino(com.seda.payer.integraente.webservice.dati.RecuperaDettDocBollettinoRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaDettDocAttiContenziosoResponse recuperaDettDocAttiContenzioso(com.seda.payer.integraente.webservice.dati.RecuperaDettDocAttiContenziosoRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaListPagResponse recuperaListPag(com.seda.payer.integraente.webservice.dati.RecuperaListPagRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
    public com.seda.payer.integraente.webservice.dati.RecuperaListEntiResponse recuperaListEnti(com.seda.payer.integraente.webservice.dati.RecuperaListEntiRequest in) throws java.rmi.RemoteException, com.seda.payer.integraente.webservice.srv.FaultType;
}
