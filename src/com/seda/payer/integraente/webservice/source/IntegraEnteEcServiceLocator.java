/**
 * IntegraEnteEcServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.source;

public class IntegraEnteEcServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.integraente.webservice.source.IntegraEnteEcService {

    public IntegraEnteEcServiceLocator() {
    }


    public IntegraEnteEcServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IntegraEnteEcServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IntegraenteEcPort
    private java.lang.String IntegraenteEcPort_address = "http://localhost:8080/IntegraenteService/integraenteec";

    public java.lang.String getIntegraenteEcPortAddress() {
        return IntegraenteEcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IntegraenteEcPortWSDDServiceName = "IntegraenteEcPort";

    public java.lang.String getIntegraenteEcPortWSDDServiceName() {
        return IntegraenteEcPortWSDDServiceName;
    }

    public void setIntegraenteEcPortWSDDServiceName(java.lang.String name) {
        IntegraenteEcPortWSDDServiceName = name;
    }

    public com.seda.payer.integraente.webservice.source.IntegraEnteEcInterface getIntegraenteEcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IntegraenteEcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIntegraenteEcPort(endpoint);
    }

    public com.seda.payer.integraente.webservice.source.IntegraEnteEcInterface getIntegraenteEcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.integraente.webservice.source.IntegraEnteEcSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEnteEcSOAPBindingStub(portAddress, this);
            _stub.setPortName(getIntegraenteEcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIntegraenteEcPortEndpointAddress(java.lang.String address) {
        IntegraenteEcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.integraente.webservice.source.IntegraEnteEcInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.integraente.webservice.source.IntegraEnteEcSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEnteEcSOAPBindingStub(new java.net.URL(IntegraenteEcPort_address), this);
                _stub.setPortName(getIntegraenteEcPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IntegraenteEcPort".equals(inputPortName)) {
            return getIntegraenteEcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.integraente.payer.seda.com", "IntegraEnteEcService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.integraente.payer.seda.com", "IntegraenteEcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IntegraenteEcPort".equals(portName)) {
            setIntegraenteEcPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
