package ch10Practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventTest5 extends JFrame{
	private JButton button;
	private JLabel label;
	public ActionEventTest5() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�.");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener((e)->{label.setText("��ħ�� ��ư�� ���������ϴ�.");});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ActionEventTest5 t=new ActionEventTest5(); 
	}

}
