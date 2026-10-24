import javax.swing.*;

public class PacmanAnimationTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Pac-Man Animation");

		PacmanAnimation x = new PacmanAnimation();
		frame.add(x);

		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
