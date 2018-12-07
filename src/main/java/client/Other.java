package client;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
import com.ws.service.ZZLYWebService; 
public class Other { 
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-client.xml");
		ZZLYWebService client = (ZZLYWebService) ctx.getBean("client");
		Object result = client.showCapacityManagement();
		System.out.println(result); 
	}
}

