import java.awt.*;
import javax.swing.*;

public class KeyboardGameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Keyboard Game");
		
		KeyboardGame x = new KeyboardGame();
		frame.add(x);
		
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
