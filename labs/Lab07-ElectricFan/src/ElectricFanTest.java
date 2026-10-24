import javax.swing.JFrame;

public class ElectricFanTest {
	public static void main(String[] args) {

		JFrame frame = new JFrame("My Electric Fan");

		ElectricFan myElectricFan = new ElectricFan();
		frame.add(myElectricFan);

		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
