package ch10Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton)e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
	}

}
