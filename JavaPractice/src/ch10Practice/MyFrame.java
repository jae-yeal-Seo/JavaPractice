package ch10Practice;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		JButton button=new JButton("����");
		button.addActionListener((e)->{System.out.println("��ư�� Ŭ���ƽ��ϴ�.");});
		this.add(button);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame myFrame=new MyFrame();
	}
}
