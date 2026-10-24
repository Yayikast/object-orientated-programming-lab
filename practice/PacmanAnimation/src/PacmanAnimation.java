import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PacmanAnimation extends JPanel implements ActionListener {

	Color pacmanColor = Color.GREEN;
	Color pizzaColor = Color.GREEN;

	int x = 50;
	int y = 100;
	int xPizza = 200;

	Timer timer = new Timer(100, this);

	PacmanAnimation() {
		setBackground(Color.BLACK);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(pizzaColor);
		g.fillArc(xPizza, y, 100, 100, -30, 60);

		g.setColor(pacmanColor);
		g.fillArc(x, y, 100, 100, 30, 300);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x += 5;

		// Pac-Man has eaten the pizza slice
		if (x >= xPizza) {
			timer.stop();
			pacmanColor = Color.YELLOW;
			pizzaColor = Color.BLACK;
		}
		repaint();
	}

}
