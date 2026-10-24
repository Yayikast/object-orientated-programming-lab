import java.awt.*;
import javax.swing.*;

public class CatchingFlashBallTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Catching Flash Ball");
		
		CatchingFlashBall x = new CatchingFlashBall();
		frame.add(x);
		
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
