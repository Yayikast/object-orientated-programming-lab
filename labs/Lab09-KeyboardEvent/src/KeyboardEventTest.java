import javax.swing.*;

public class KeyboardEventTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Keyboard Event");

		KeyboardEvent x = new KeyboardEvent();
		frame.add(x);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
