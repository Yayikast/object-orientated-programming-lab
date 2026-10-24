import java.awt.*;
import javax.swing.*;

public class PacmanGameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Pac-Man Game");

		PacmanGame x = new PacmanGame();
		frame.add(x);

		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
