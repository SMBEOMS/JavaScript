package week06;

public class Television implements RemoteControl{
	 int channel; //채널번호
	 int volume; //볼륨
	 boolean onOff; //전원 상태
	public static int count = 0;

	public Television(int c, int v) {
		this(c,v,true);
	}
	public Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
		count ++;
	}
	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은"+volume + "입니다.");
	}
	
	int getChannel() {
		
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
	
	public String toString() {
		return "채널은" + channel + "이고 볼륨은"+volume + "입니다.";
	}
	@Override
	public void turnOn() {
		this.onOff = true;
	}
	@Override
	public void turnOff() {
		this.onOff = false;
	}
}
