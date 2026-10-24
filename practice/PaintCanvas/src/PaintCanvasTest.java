import javax.swing.*;

public class PaintCanvasTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Paint Canvas");
		
		PaintCanvas x = new PaintCanvas();
		frame.add(x);
		
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
