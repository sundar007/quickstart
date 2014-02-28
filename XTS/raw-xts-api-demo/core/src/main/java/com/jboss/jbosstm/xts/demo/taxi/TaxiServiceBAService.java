
package com.jboss.jbosstm.xts.demo.taxi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-182-RC1
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "TaxiServiceBAService", targetNamespace = "http://www.jboss.com/jbosstm/xts/demo/Taxi", wsdlLocation = "/WEB-INF/wsdl/TaxiServiceBA.wsdl")
public class TaxiServiceBAService
    extends Service
{

    private final static URL TAXISERVICEBASERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.jboss.jbosstm.xts.demo.taxi.TaxiServiceBAService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.jboss.jbosstm.xts.demo.taxi.TaxiServiceBAService.class.getResource(".");
            url = new URL(baseUrl, "/WEB-INF/wsdl/TaxiServiceBA.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '/WEB-INF/wsdl/TaxiServiceBA.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TAXISERVICEBASERVICE_WSDL_LOCATION = url;
    }

    public TaxiServiceBAService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaxiServiceBAService() {
        super(TAXISERVICEBASERVICE_WSDL_LOCATION, new QName("http://www.jboss.com/jbosstm/xts/demo/Taxi", "TaxiServiceBAService"));
    }

    /**
     * 
     * @return
     *     returns ITaxiServiceBA
     */
    @WebEndpoint(name = "TaxiServiceBA")
    public ITaxiServiceBA getTaxiServiceBA() {
        return super.getPort(new QName("http://www.jboss.com/jbosstm/xts/demo/Taxi", "TaxiServiceBA"), ITaxiServiceBA.class);
    }

}