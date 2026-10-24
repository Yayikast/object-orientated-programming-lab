import java.awt.*;
import javax.swing.*;

public class SnowmanTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snowman");
		
		Snowman x = new Snowman();
		frame.add(x);
		
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

}
