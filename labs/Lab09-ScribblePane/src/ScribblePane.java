import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScribblePane extends JPanel implements MouseListener, MouseMotionListener {
	int x;
	int y;
	int r = 20;
	
	ScribblePane(){
		setFocusable(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if (SwingUtilities.isLeftMouseButton(e)) {
			g.setColor(Color.black);
			g.drawLine(x, y, e.getX(), e.getY());
		}

		if (SwingUtilities.isRightMouseButton(e)) {
			g.setColor(getBackground());
			g.fillOval(x-r, y-r, r*2, r*2);
		}
		g.dispose();
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Clicking without dragging clears the pane
		repaint();
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
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Scribble Pane");
		
		ScribblePane x = new ScribblePane();
		frame.add(x);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}