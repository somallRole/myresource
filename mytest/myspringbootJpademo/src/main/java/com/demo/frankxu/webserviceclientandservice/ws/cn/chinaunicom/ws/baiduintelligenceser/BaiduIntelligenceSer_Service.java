
package cn.chinaunicom.ws.baiduintelligenceser;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * 百度智能服务
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BaiduIntelligenceSer", targetNamespace = "http://ws.chinaunicom.cn/BaiduIntelligenceSer/", wsdlLocation = "file:/Users/Caoys/WorkSpace/myresource/mytest/myspringbootJpademo/src/main/resources/webservice/BaiduIntelligenceSer.wsdl")
public class BaiduIntelligenceSer_Service
    extends Service
{

    private final static URL BAIDUINTELLIGENCESER_WSDL_LOCATION;
    private final static WebServiceException BAIDUINTELLIGENCESER_EXCEPTION;
    private final static QName BAIDUINTELLIGENCESER_QNAME = new QName("http://ws.chinaunicom.cn/BaiduIntelligenceSer/", "BaiduIntelligenceSer");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/Caoys/WorkSpace/myresource/mytest/myspringbootJpademo/src/main/resources/webservice/BaiduIntelligenceSer.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BAIDUINTELLIGENCESER_WSDL_LOCATION = url;
        BAIDUINTELLIGENCESER_EXCEPTION = e;
    }

    public BaiduIntelligenceSer_Service() {
        super(__getWsdlLocation(), BAIDUINTELLIGENCESER_QNAME);
    }

    public BaiduIntelligenceSer_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BAIDUINTELLIGENCESER_QNAME, features);
    }

    public BaiduIntelligenceSer_Service(URL wsdlLocation) {
        super(wsdlLocation, BAIDUINTELLIGENCESER_QNAME);
    }

    public BaiduIntelligenceSer_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BAIDUINTELLIGENCESER_QNAME, features);
    }

    public BaiduIntelligenceSer_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BaiduIntelligenceSer_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BaiduIntelligenceSer
     */
    @WebEndpoint(name = "BaiduIntelligenceSerSOAP")
    public BaiduIntelligenceSer getBaiduIntelligenceSerSOAP() {
        return super.getPort(new QName("http://ws.chinaunicom.cn/BaiduIntelligenceSer/", "BaiduIntelligenceSerSOAP"), BaiduIntelligenceSer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BaiduIntelligenceSer
     */
    @WebEndpoint(name = "BaiduIntelligenceSerSOAP")
    public BaiduIntelligenceSer getBaiduIntelligenceSerSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.chinaunicom.cn/BaiduIntelligenceSer/", "BaiduIntelligenceSerSOAP"), BaiduIntelligenceSer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BAIDUINTELLIGENCESER_EXCEPTION!= null) {
            throw BAIDUINTELLIGENCESER_EXCEPTION;
        }
        return BAIDUINTELLIGENCESER_WSDL_LOCATION;
    }

}
