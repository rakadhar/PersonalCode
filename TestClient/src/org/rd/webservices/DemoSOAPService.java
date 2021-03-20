/**
 * DemoSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.rd.webservices;

public interface DemoSOAPService extends javax.xml.rpc.Service {
    public java.lang.String getDemoSOAPAddress();

    public org.rd.webservices.DemoSOAP getDemoSOAP() throws javax.xml.rpc.ServiceException;

    public org.rd.webservices.DemoSOAP getDemoSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
