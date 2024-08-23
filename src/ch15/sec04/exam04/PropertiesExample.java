package ch15.sec04.exam04;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		
		Properties prop = new Properties();
		prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		//
		String driver = prop.getProperty("driver");
		System.out.println("driver:"+ driver);
		
		String url = prop.getProperty("url");
		System.out.println("url:"+ url);
		
		String username = prop.getProperty("username");
		System.out.println("username:"+ username);
		
		String password = prop.getProperty("password");
		System.out.println("password:"+ password);
		
		String admin = prop.getProperty("admin");
		System.out.println("admin:"+ admin);

	}

}
