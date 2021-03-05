package ch11Practice;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BazierCurve extends JFrame implements MouseListener, MouseMotionListener {
	private int[] xs = {50, 150, 400, 450};
	private int[] ys = {200, 50, 300, 200};
	
	private int dragIndex = -1;
	
	class BezierPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		/*
		 * ���õ� ���� �ִ��� ���� ���õ� ���� x, y ��ǥ�� �����Ѵ�.
		 */
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		/*
		 *  �� ���� �� �߿��� � ���� ���õǾ������� üũ
		 *  dragIndex = 0 1 2 3
		 */
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		dragIndex = -1;
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
