import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;

public class KeyboardGame extends JPanel implements ActionListener, KeyListener {
	
	char letter = 'A';
	char typed = '?';
	int score = 0;
	boolean scored = false;

	Timer timer = new Timer(1000, this);

	KeyboardGame() {
		timer.start();
		setFocusable(true);
		this.addKeyListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("SansSerif", Font.BOLD, 30));
		
		g.setColor(Color.DARK_GRAY);
		g.drawString("Letter: " + letter, 50, 75);
		g.drawString("You Typed", 50, 150);
		
		g.setColor(Color.BLUE);
		g.drawString(""+typed, 250, 150);
		
		g.setColor(Color.BLACK);
		g.drawString("Your Score = " + score, 50, 225);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		typed = Character.toUpperCase(e.getKeyChar());
		// Only one point per letter, so holding the key down doesn't farm points
		if (typed == letter && !scored) {
			score++;
			scored = true;
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
	
	public char getRandomChar() {
		Random random = new Random();
		return (char) (65+random.nextInt(26));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		letter = getRandomChar();
		scored = false;
		repaint();
	}
}
