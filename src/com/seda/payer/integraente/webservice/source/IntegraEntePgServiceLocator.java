/**
 * IntegraEntePgServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.source;

public class IntegraEntePgServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.integraente.webservice.source.IntegraEntePgService {

    public IntegraEntePgServiceLocator() {
    }


    public IntegraEntePgServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IntegraEntePgServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IntegraentePort
    private java.lang.String IntegraentePort_address = "http://localhost:8080/IntegraenteService/integraente";

    public java.lang.String getIntegraentePortAddress() {
        return IntegraentePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IntegraentePortWSDDServiceName = "IntegraentePort";

    public java.lang.String getIntegraentePortWSDDServiceName() {
        return IntegraentePortWSDDServiceName;
    }

    public void setIntegraentePortWSDDServiceName(java.lang.String name) {
        IntegraentePortWSDDServiceName = name;
    }

    public com.seda.payer.integraente.webservice.source.IntegraEntePgInterface getIntegraentePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IntegraentePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIntegraentePort(endpoint);
    }

    public com.seda.payer.integraente.webservice.source.IntegraEntePgInterface getIntegraentePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.integraente.webservice.source.IntegraEntePgSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEntePgSOAPBindingStub(portAddress, this);
            _stub.setPortName(getIntegraentePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIntegraentePortEndpointAddress(java.lang.String address) {
        IntegraentePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.integraente.webservice.source.IntegraEntePgInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.integraente.webservice.source.IntegraEntePgSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEntePgSOAPBindingStub(new java.net.URL(IntegraentePort_address), this);
                _stub.setPortName(getIntegraentePortWSDDServiceName());
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
        if ("IntegraentePort".equals(inputPortName)) {
            return getIntegraentePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.integraente.payer.seda.com", "IntegraEntePgService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.integraente.payer.seda.com", "IntegraentePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IntegraentePort".equals(portName)) {
            setIntegraentePortEndpointAddress(address);
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
