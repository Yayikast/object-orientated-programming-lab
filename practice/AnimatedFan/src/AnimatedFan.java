import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AnimatedFan extends JPanel implements MouseListener, ActionListener {

	int x = 0;
	int y = 0;
	int shift = 18;

	Timer timer = new Timer(500, this);

	AnimatedFan() {
		setFocusable(true);
		addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		g.fillOval(295, 95, 210, 210);

		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 200, 200);

		g.setColor(Color.ORANGE);
		for (int i=0; i<360; i=i+72) {
			g.fillArc(310, 110, 180, 180, i-18+shift, 36);
		}

		g.setColor(Color.GRAY);
		g.fillRect(380, 300, 45, 150);

		g.setColor(new Color(30, 30, 200));
		int[] x = {350, 450, 500, 300};
		int[] y = {450, 450, 550, 550};
		g.fillPolygon(x, y, 4);


		for (int i=360; i<=420; i=i+20) {
			g.setColor(Color.RED);
			g.fillRoundRect(i, 500, 17, 20, 20, 20);

			g.setColor(Color.WHITE);
			g.drawString(""+((i-360)/20), i+6, 514);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();

		// Button 0 turns the fan off; buttons 1-3 set the speed
		if (500 <= y && y <= 520) {
			if (360 <= x && x <= 377) {
				timer.stop();
			} else if (380 <= x && x <= 397) {
				setSpeed(500);
			} else if (400 <= x && x <= 417) {
				setSpeed(250);
			} else if (420 <= x && x <= 437) {
				setSpeed(100);
			}
		}
		repaint();
	}

	void setSpeed(int delay) {
		timer.setDelay(delay);
		timer.start();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		shift = shift + 18;
		repaint();
	}
}
