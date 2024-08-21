package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		
		//운영체계 정보
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.Home");
		
		
		System.out.println("운영체계 : " + osName);
		System.out.println("사용자 : " + userName);
		System.out.println("userHome : " + userHome);
		
		//전체 키와 값을 출력
		System.out.println("---------------------------------------------");
		System.out.println("ket : value");
		System.out.println("---------------------------------------------");
		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s : %s \n", key, value);
			
		}
	}

}
