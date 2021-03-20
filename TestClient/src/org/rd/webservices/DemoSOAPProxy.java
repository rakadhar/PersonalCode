package org.rd.webservices;

public class DemoSOAPProxy implements org.rd.webservices.DemoSOAP {
  private String _endpoint = null;
  private org.rd.webservices.DemoSOAP demoSOAP = null;
  
  public DemoSOAPProxy() {
    _initDemoSOAPProxy();
  }
  
  public DemoSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoSOAPProxy();
  }
  
  private void _initDemoSOAPProxy() {
    try {
      demoSOAP = (new org.rd.webservices.DemoSOAPServiceLocator()).getDemoSOAP();
      if (demoSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demoSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demoSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demoSOAP != null)
      ((javax.xml.rpc.Stub)demoSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.rd.webservices.DemoSOAP getDemoSOAP() {
    if (demoSOAP == null)
      _initDemoSOAPProxy();
    return demoSOAP;
  }
  
  public java.lang.String sayHelloWorld(java.lang.String name) throws java.rmi.RemoteException{
    if (demoSOAP == null)
      _initDemoSOAPProxy();
    return demoSOAP.sayHelloWorld(name);
  }
  
  
}