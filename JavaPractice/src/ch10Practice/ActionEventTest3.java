package ch10Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventTest3 extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	public ActionEventTest3() {
		this.setSize(200,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�.");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
		public static void main(String[] args) {
		ActionEventTest3 t=new ActionEventTest3();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
		
	}

}
