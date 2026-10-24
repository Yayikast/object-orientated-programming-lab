import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ProjectileMotion extends JPanel implements ActionListener {

	// CONSTANT

	static final double G = 9.81; // gravitational acceleration (m/s^2)

	// JComponent

	JLabel velocity = new JLabel("Initial Velocity in m/s");
	JLabel deg = new JLabel("Angle in deg");

	JTextField velocityTf = new JTextField("");
	JTextField degTf = new JTextField("");

	JButton calculateBt = new JButton("Calculate");
	JLabel range = new JLabel("Range = " + String.format("%.2f", 0.0) + " m.");

	ProjectileMotion() {
		setLayout(new GridLayout(3, 2, 5, 5));
		add(velocity);
		add(velocityTf);
		add(deg);
		add(degTf);
		add(calculateBt);
		add(range);

		// REGISTER

		velocityTf.addActionListener(this);
		degTf.addActionListener(this);
		calculateBt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double v = Double.parseDouble(velocityTf.getText().trim());
			double angle = Math.toRadians(Double.parseDouble(degTf.getText().trim()));

			// Range on level ground: R = v^2 * sin(2*theta) / g
			double r = v * v * Math.sin(2 * angle) / G;
			range.setText("Range = " + String.format("%.2f", r) + " m.");
		} catch (NumberFormatException ex) {
			range.setText("Please enter numbers only");
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Projectile Motion");

		ProjectileMotion x = new ProjectileMotion();
		frame.add(x);

		frame.setSize(400, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
