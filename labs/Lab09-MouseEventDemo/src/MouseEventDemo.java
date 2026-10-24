import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo extends JPanel implements MouseListener, MouseMotionListener {
	
	int x;
	int y;
	int d = 20;
	
	MouseEventDemo(){
		setFocusable(true);
		addMouseMotionListener(this);
		addMouseListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Normalise so the rectangle works when dragging in any direction
		int left = Math.min(x, e.getX());
		int top = Math.min(y, e.getY());
		int w = Math.abs(e.getX()-x);
		int h = Math.abs(e.getY()-y);

		Graphics g = getGraphics();
		if (SwingUtilities.isLeftMouseButton(e)) {
			g.setColor(Color.BLACK);
			g.fillRect(left, top, w, h);
		}
		if (SwingUtilities.isRightMouseButton(e)) {
			g.setColor(getBackground());
			g.fillRect(left, top, w, h);
		}
		g.dispose();
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
