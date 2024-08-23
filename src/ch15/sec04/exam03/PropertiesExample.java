package ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {
	
	public static void maim(String[] args) throws Exception {
		
		Properties properites = new Properties();
		properites.load(PropertiesExample.class.getResourceAsStream("dataBase.properites"));
		
		
		String driver = properites.getProperty("driver");
		String url = properites.getProperty("url");
		String usename = properites.getProperty("usename");
		String password = properites.getProperty("password");
		String admin = properites.getProperty("admin");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("usename : " + usename);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
		
	}

}
