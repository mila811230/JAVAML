package ch08.sec06;

public interface RemoteControl {
	
	//상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드
	default void setMute (boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다");
			//추상메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제합니다");
			
		}
		
	//정적메소드
		
//	static void changeBattery() {
//		System.out.println("리모콘 건전지를 교체해야 합니다");
//	}
		
	}

}
