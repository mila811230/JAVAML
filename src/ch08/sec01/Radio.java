package ch08.sec01;

public class Radio implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("라디오가 켜졌습니다");

	}

	@Override
	public void turnOff() {
		System.out.println("라디오가 꺼졌습니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
	
		
	}
	public void printVolume() {
	System.out.println("라디오볼륨 : " + volume);
	}

}



