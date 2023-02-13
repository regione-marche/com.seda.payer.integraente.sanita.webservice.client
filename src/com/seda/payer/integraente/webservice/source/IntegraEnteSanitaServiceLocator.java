/**
 * IntegraEnteSanitaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.integraente.webservice.source;

public class IntegraEnteSanitaServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.integraente.webservice.source.IntegraEnteSanitaService {

    public IntegraEnteSanitaServiceLocator() {
    }


    public IntegraEnteSanitaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IntegraEnteSanitaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IntegraEnteSanitaPort
    private java.lang.String IntegraEnteSanitaPort_address = "http://localhost:8080/IntegraenteService/integraentesanita";

    public java.lang.String getIntegraEnteSanitaPortAddress() {
        return IntegraEnteSanitaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IntegraEnteSanitaPortWSDDServiceName = "IntegraEnteSanitaPort";

    public java.lang.String getIntegraEnteSanitaPortWSDDServiceName() {
        return IntegraEnteSanitaPortWSDDServiceName;
    }

    public void setIntegraEnteSanitaPortWSDDServiceName(java.lang.String name) {
        IntegraEnteSanitaPortWSDDServiceName = name;
    }

    public com.seda.payer.integraente.webservice.source.IntegraEnteSanitaInterface getIntegraEnteSanitaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IntegraEnteSanitaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIntegraEnteSanitaPort(endpoint);
    }

    public com.seda.payer.integraente.webservice.source.IntegraEnteSanitaInterface getIntegraEnteSanitaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.integraente.webservice.source.IntegraEnteSanitaSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEnteSanitaSOAPBindingStub(portAddress, this);
            _stub.setPortName(getIntegraEnteSanitaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public com.seda.payer.integraente.webservice.source.IntegraEnteSanitaInterface getIntegraEnteSanitaPort(java.net.URL portAddress, String httpUserName, String httpPassword) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.integraente.webservice.source.IntegraEnteSanitaSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEnteSanitaSOAPBindingStub(portAddress, this);
            _stub.setPortName(getIntegraEnteSanitaPortWSDDServiceName());
            _stub.setHttpUserName(httpUserName);
            _stub.setHttpPassword(httpPassword);
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIntegraEnteSanitaPortEndpointAddress(java.lang.String address) {
        IntegraEnteSanitaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.integraente.webservice.source.IntegraEnteSanitaInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.integraente.webservice.source.IntegraEnteSanitaSOAPBindingStub _stub = new com.seda.payer.integraente.webservice.source.IntegraEnteSanitaSOAPBindingStub(new java.net.URL(IntegraEnteSanitaPort_address), this);
                _stub.setPortName(getIntegraEnteSanitaPortWSDDServiceName());
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
        if ("IntegraEnteSanitaPort".equals(inputPortName)) {
            return getIntegraEnteSanitaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.integraente.payer.seda.com", "IntegraEnteSanitaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.integraente.payer.seda.com", "IntegraEnteSanitaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IntegraEnteSanitaPort".equals(portName)) {
            setIntegraEnteSanitaPortEndpointAddress(address);
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
