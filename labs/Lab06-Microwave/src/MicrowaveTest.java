import java.awt.*;
import javax.swing.*;

public class MicrowaveTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("The Front View of a Microwave Oven");
		
		Microwave x = new Microwave();
		frame.add(x);
		
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
