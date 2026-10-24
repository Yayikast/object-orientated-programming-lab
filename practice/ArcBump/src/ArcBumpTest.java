import java.awt.*;
import javax.swing.*;

public class ArcBumpTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Arc Game");

		ArcBump x = new ArcBump();
		frame.add(x);

		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
