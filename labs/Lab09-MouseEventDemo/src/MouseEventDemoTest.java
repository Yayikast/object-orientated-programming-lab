import java.awt.*;
import javax.swing.*;

public class MouseEventDemoTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mouse Event Demo - Drag to Draw Rectangles");
		
		MouseEventDemo x = new MouseEventDemo();
		frame.add(x);
		
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
