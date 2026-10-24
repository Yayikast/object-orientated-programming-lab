import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class CatchingFlashBall extends JPanel {
	
	int r = 10;
	int x = 100;
	int y = 150;
	
	Timer timer = new Timer(1000, new TimerListener());
	
	CatchingFlashBall() {
		setBackground(Color.BLACK);
		timer.start();
		this.addMouseListener(new Catcher());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.ORANGE);
		g.fillOval(x-r, y-r, r*2, r*2);
	}
	
	public void getRandom() {
		// Panel has no size until it is shown; nextInt() would throw
		if (getWidth() <= 2*r || getHeight() <= 2*r) {
			return;
		}
		Random random = new Random();
		x = r+random.nextInt(getWidth()-2*r);
		y = r+random.nextInt(getHeight()-2*r);
	}
	
	public class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			getRandom();
			repaint();
		}
	}
	
	double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
	
	public class Catcher implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (distance(x, y, e.getX(), e.getY()) <= r) {
				timer.stop();
				System.out.println("FINISHED");
			}
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
		
	}
}
