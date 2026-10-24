import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyboardEvent extends JPanel implements KeyListener, MouseMotionListener {
	
	// VARIABLES
	
	String text = "";
	int x = 100;
	int y = 150;
	
	KeyboardEvent() {
		setFocusable(true);
		addKeyListener(this);
		addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(new Font("SansSerif", Font.BOLD, 30));
		g.setColor(Color.BLUE);
		g.drawString(text, x, y);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (c == '\b') {
			if (text.length() > 0) {
				text = text.substring(0, text.length() - 1);
			}
		} else if (!Character.isISOControl(c)) {
			text = text + c;
		}
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
