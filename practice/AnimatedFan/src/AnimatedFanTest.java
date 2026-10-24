import javax.swing.*;

public class AnimatedFanTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Animated Fan");

		AnimatedFan x = new AnimatedFan();
		frame.add(x);

		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
