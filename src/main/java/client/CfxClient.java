package client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import com.ws.service.ZZLYWebService;
import javax.xml.namespace.QName;

public class CfxClient {
	public static void main(String args[]) {
        JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();  
        jwpfb.setServiceClass(ZZLYWebService.class);  
        jwpfb.setAddress("http://localhost:8080/webservice2/webservice2");
        ZZLYWebService zz = (ZZLYWebService) jwpfb.create();
        zz.showProvince();
	}
}
