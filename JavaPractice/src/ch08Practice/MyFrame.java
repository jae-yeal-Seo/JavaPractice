package ch08Practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		JPanel panel=new JPanel();
		JPanel panelA=new JPanel();
		JLabel label=new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label);
		panel.add(panelA);
		JPanel panelB=new JPanel();
		JButton button1=new JButton("�޺�����");
		panelB.add(button1);
		JButton button2=new JButton("������������");
		panelB.add(button2);
		JButton button3=new JButton("�Ұ������");
		panelB.add(button3);
		JLabel count=new JLabel("����");
		panelB.add(count);
		JTextField textField=new JTextField(10);
		panelB.add(textField);
		panel.add(panelB);
		this.add(panel);
		this.setTitle("MyFrame");
		this.setSize(500, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame myFrame=new MyFrame();
	}
}
