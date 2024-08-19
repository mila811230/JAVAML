package ch08.sec01;

public class TV implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다");

	}
	
	int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			RemoteControl.super.setMute(mute);
		} else {
			this.volume = this.memoryVolume;
			RemoteControl.super.setMute(mute);
			
		}
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
		System.out.println("TV 볼륨 : " + volume);
		}

}







