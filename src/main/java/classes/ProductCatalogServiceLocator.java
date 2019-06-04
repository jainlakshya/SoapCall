/**
 * ProductCatalogServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package classes;

public class ProductCatalogServiceLocator extends org.apache.axis.client.Service implements classes.ProductCatalogService {

    public ProductCatalogServiceLocator() {
    }


    public ProductCatalogServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductCatalogServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductCatalogPort
    private java.lang.String ProductCatalogPort_address = "http://soapweb.net:80/hello";

    public java.lang.String getProductCatalogPortAddress() {
        return ProductCatalogPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductCatalogPortWSDDServiceName = "ProductCatalogPort";

    public java.lang.String getProductCatalogPortWSDDServiceName() {
        return ProductCatalogPortWSDDServiceName;
    }

    public void setProductCatalogPortWSDDServiceName(java.lang.String name) {
        ProductCatalogPortWSDDServiceName = name;
    }

    public classes.ProductCatalog getProductCatalogPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductCatalogPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductCatalogPort(endpoint);
    }

    public classes.ProductCatalog getProductCatalogPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            classes.ProductCatalogPortBindingStub _stub = new classes.ProductCatalogPortBindingStub(portAddress, this);
            _stub.setPortName(getProductCatalogPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductCatalogPortEndpointAddress(java.lang.String address) {
        ProductCatalogPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (classes.ProductCatalog.class.isAssignableFrom(serviceEndpointInterface)) {
                classes.ProductCatalogPortBindingStub _stub = new classes.ProductCatalogPortBindingStub(new java.net.URL(ProductCatalogPort_address), this);
                _stub.setPortName(getProductCatalogPortWSDDServiceName());
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
        if ("ProductCatalogPort".equals(inputPortName)) {
            return getProductCatalogPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://classes/", "ProductCatalogService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://classes/", "ProductCatalogPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductCatalogPort".equals(portName)) {
            setProductCatalogPortEndpointAddress(address);
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
