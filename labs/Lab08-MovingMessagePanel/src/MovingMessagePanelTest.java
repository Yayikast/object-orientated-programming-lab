import java.awt.*;
import javax.swing.*;

public class MovingMessagePanelTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Moving Message Panel");
		
		MovingMessagePanel x = new MovingMessagePanel();
		frame.add(x);
		
		frame.setSize(600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

}
