import java.awt.*;
import javax.swing.*;

public class BMICalculatorTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My BMI Calculator");
		
		BMICalculator x = new BMICalculator();
		frame.add(x);
		
		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

}
