package ch09Practice;

import javax.swing.Timer;

public class CallbackTestLambda {
	public static void main(String[] args) {
		Timer t=new Timer(1000,(e)->{System.out.println("beep");});
		t.start();
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}
