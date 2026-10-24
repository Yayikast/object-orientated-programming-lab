import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PacmanGame extends JPanel implements ActionListener, KeyListener {

	int x = 50;
	int y = 50;
	int r = 50;
	int pizzaX = 200;

	boolean check = true;

	Color pacmanColor = Color.GREEN;
	Color pizzaColor = Color.GREEN;

	int time = 50;

	Timer timer = new Timer(1000, this);

	JButton startBt = new JButton("Start");
	JLabel timeLabel = new JLabel(""+time);
	JLabel infoLabel = new JLabel("Press Start, then hold the Right arrow");
	JLabel resultLabel = new JLabel("");

	JPanel p = new JPanel();

	PacmanGame() {
		setFocusable(true);
		setBackground(Color.BLACK);

		setLayout(new BorderLayout());

		add(p, BorderLayout.SOUTH);
		p.setLayout(new GridLayout(2,2, 10,10));

		p.add(startBt);
		p.add(timeLabel);
		p.add(infoLabel);
		p.add(resultLabel);

		// REGISTER

		addKeyListener(this);
		startBt.addActionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(pizzaColor);
		g.fillArc(pizzaX, y, 2*r, 2*r, -30, 60);

		g.setColor(pacmanColor);
		g.fillArc(x, y, 2*r, 2*r, 30, 300);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT && timer.isRunning()) {
			x += 5;
			checkWin();
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBt && check) {
			check = false;
			timer.start();
			requestFocusInWindow();
		}
		if (e.getSource() == timer) {
			time--;
			timeLabel.setText(""+time);

			if (time == 0) {
				timer.stop();
				resultLabel.setText("GAME OVER");
			}
		}
		repaint();
	}

	void checkWin() {
		if (x >= pizzaX) {
			resultLabel.setText("YOU WON!!!");
			timer.stop();
			pacmanColor = Color.YELLOW;
			pizzaColor = Color.BLACK;
		}
	}
}
