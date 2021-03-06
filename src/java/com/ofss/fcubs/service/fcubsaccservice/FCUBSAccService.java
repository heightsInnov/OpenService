
package com.ofss.fcubs.service.fcubsaccservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FCUBSAccService", targetNamespace = "http://types.ws.gw.fcubs.ofss.com", wsdlLocation = "http://10.8.0.109:7778/FCUBSAccService/FCUBSAccService?wsdl")
public class FCUBSAccService
    extends Service
{

    private final static URL FCUBSACCSERVICE_WSDL_LOCATION;
    private final static WebServiceException FCUBSACCSERVICE_EXCEPTION;
    private final static QName FCUBSACCSERVICE_QNAME = new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSAccService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.8.0.109:7778/FCUBSAccService/FCUBSAccService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FCUBSACCSERVICE_WSDL_LOCATION = url;
        FCUBSACCSERVICE_EXCEPTION = e;
    }

    public FCUBSAccService() {
        super(__getWsdlLocation(), FCUBSACCSERVICE_QNAME);
    }

    public FCUBSAccService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FCUBSACCSERVICE_QNAME, features);
    }

    public FCUBSAccService(URL wsdlLocation) {
        super(wsdlLocation, FCUBSACCSERVICE_QNAME);
    }

    public FCUBSAccService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FCUBSACCSERVICE_QNAME, features);
    }

    public FCUBSAccService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FCUBSAccService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FCUBSAccServiceSEI
     */
    @WebEndpoint(name = "FCUBSAccServiceSEI")
    public FCUBSAccServiceSEI getFCUBSAccServiceSEI() {
        return super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSAccServiceSEI"), FCUBSAccServiceSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FCUBSAccServiceSEI
     */
    @WebEndpoint(name = "FCUBSAccServiceSEI")
    public FCUBSAccServiceSEI getFCUBSAccServiceSEI(WebServiceFeature... features) {
        return super.getPort(new QName("http://types.ws.gw.fcubs.ofss.com", "FCUBSAccServiceSEI"), FCUBSAccServiceSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FCUBSACCSERVICE_EXCEPTION!= null) {
            throw FCUBSACCSERVICE_EXCEPTION;
        }
        return FCUBSACCSERVICE_WSDL_LOCATION;
    }

}
