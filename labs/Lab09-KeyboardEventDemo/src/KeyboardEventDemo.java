import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyboardEventDemo extends JPanel implements KeyListener {
	
	String text = "+";
	
	KeyboardEventDemo() {
		setFocusable(true);
		addKeyListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setBackground(Color.BLACK);
		g.setColor(Color.GREEN);
		g.setFont(new Font("SansSerif", Font.BOLD, 50));
		g.drawString("Type something: "+text, 20, 50);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		text = ""+e.getKeyChar();
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
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Keyboard Event Demo");
		
		KeyboardEventDemo x = new KeyboardEventDemo();
		frame.add(x);
		
		frame.setSize(505,110);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
