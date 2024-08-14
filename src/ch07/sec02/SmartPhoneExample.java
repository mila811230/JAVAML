package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "노란색");
		
		//phone 으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("촤이파이 상태 : " + myPhone.wifi);
		
		//Phone으로 부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕 난 홍길동임");
		myPhone.sendVoice("오 반가워");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
		
		
	}

}
