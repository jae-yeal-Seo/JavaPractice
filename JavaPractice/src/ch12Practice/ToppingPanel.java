package ch12Practice;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class ToppingPanel extends JPanel implements ItemListener {
	private boolean[] topping = new boolean[4];
	private JCheckBox pepper;
	private JCheckBox cheese;
	private JCheckBox peperoni; 
	private JCheckBox bacon;
	
	public ToppingPanel() {
		this.setLayout(new GridLayout(4, 1));
		
		pepper = new JCheckBox("�Ǹ�");
		pepper.addItemListener(this);
		cheese = new JCheckBox("ġ��");
		cheese.addItemListener(this);
		peperoni = new JCheckBox("����δ�");
		peperoni.addItemListener(this);
		bacon = new JCheckBox("������");
		bacon.addItemListener(this);
		
		this.add(pepper);
		this.add(cheese);
		this.add(peperoni);
		this.add(bacon);
		
		this.setBorder(BorderFactory.createTitledBorder("�߰�����"));
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		if(source == pepper) {
			topping[0] = e.getStateChange() == ItemEvent.SELECTED;
		} else if(source == cheese) {
			topping[1] = e.getStateChange() == ItemEvent.SELECTED;
		} else if(source == peperoni) {
			topping[2] = e.getStateChange() == ItemEvent.SELECTED;
		} else if(source == bacon) {
			topping[3] = e.getStateChange() == ItemEvent.SELECTED;
		}
	}
	
	public boolean[] getTopping() {
		return Arrays.copyOf(topping, topping.length);
	}
}
