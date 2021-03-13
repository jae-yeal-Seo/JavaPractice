package ch12Practice;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame implements ChangeListener {

	public static final int INIT_VALUE = 15;
	private JButton button;
	
	public SliderFrame() {
		JPanel panel = new JPanel();
		this.setTitle("�����̴� �׽�Ʈ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);
		
		 JSlider slider = new JSlider(0, 30, INIT_VALUE);
		 slider.setMajorTickSpacing(10);  //ū ���� ����
		 slider.setMinorTickSpacing(1);   //���� ���� ����
		 slider.setPaintTicks(true);      //���� �׸���
		 slider.setPaintLabels(true);     //���� �׸���
		 slider.addChangeListener(this);
		 panel.add(slider);
		 
		 button = new JButton();
		 ImageIcon icon = new ImageIcon("lion.gif");
		 button.setIcon(icon);
		 button.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		 panel.add(button);
		 
		 this.add(panel);
		 
		 this.setSize(300, 300);
		 this.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
		if(!source.getValueIsAdjusting()) {
			int value = (int)source.getValue();
			button.setSize(value * 10, value * 10);
		}
	}
	
	public static void main(String[] args) {
		new SliderFrame();
	}
	
}
