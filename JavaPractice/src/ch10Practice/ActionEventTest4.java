package ch10Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventTest4 extends JFrame{
	private JButton button;
	private JLabel label;
	public ActionEventTest4() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					label.setText("��ħ�� ��ư�� ���������ϴ�.");
				}
			}
			
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ActionEventTest4 t=new ActionEventTest4();

	}

}