package classes;

public class ProductCatalogProxy implements classes.ProductCatalog {
  private String _endpoint = null;
  private classes.ProductCatalog productCatalog = null;
  
  public ProductCatalogProxy() {
    _initProductCatalogProxy();
  }
  
  public ProductCatalogProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductCatalogProxy();
  }
  
  private void _initProductCatalogProxy() {
    try {
      productCatalog = (new classes.ProductCatalogServiceLocator()).getProductCatalogPort();
      if (productCatalog != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productCatalog)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productCatalog != null)
      ((javax.xml.rpc.Stub)productCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public classes.ProductCatalog getProductCatalog() {
    if (productCatalog == null)
      _initProductCatalogProxy();
    return productCatalog;
  }
  
  public java.lang.String[] addProducts(java.lang.String arg0) throws java.rmi.RemoteException{
    if (productCatalog == null)
      _initProductCatalogProxy();
    return productCatalog.addProducts(arg0);
  }
  
  public java.lang.String[] fetchProducts() throws java.rmi.RemoteException{
    if (productCatalog == null)
      _initProductCatalogProxy();
    return productCatalog.fetchProducts();
  }
  
  
}