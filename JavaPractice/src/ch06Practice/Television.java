package ch06Practice;
public class Television {
	int channel;
	int volume;
	boolean onOff;
	public Television() {
	}
	public Television(int channel, int volume, boolean onOff) {
		this.channel=channel;
		this.volume=volume;
		this.onOff=onOff;
	}
	void print() {
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel=ch;
	}
}
