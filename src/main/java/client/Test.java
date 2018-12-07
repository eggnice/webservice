package client;

import java.text.DecimalFormat;
import client.Other;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;
import java.util.List;



public class Test {
	public static void main(String args[]) {
		int a = 8;
		//JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		//Client client = dcf.createClient("http://192.168.224.182:8088/sapPushExpenseWebservice?wsdl");
		//List<String> list = new ArrayList<>();
	    //list.add("测试");
		 // Object[] objects = client.invoke("pushExpense", list);
		 // System.out.println(JSON.toJSONString(objects[0]));
		List L = Arrays.asList(1,2,3);
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		Calendar c = Calendar.getInstance();
		for (int i = 0; i<L.size(); i++) {
			System.out.println(L.size());
			//c.setTime(new Date());
			//c.add(Calendar.YEAR, -(int)L.get(i));
			//Date y = c.getTime();
			// year = format.format(y);
			//System.out.println("过去一年："+year);
		}
	}

	public static String tranStr(Integer arg, String company) {
		String s=String.valueOf(arg);
		return s + company;
		
	}
}