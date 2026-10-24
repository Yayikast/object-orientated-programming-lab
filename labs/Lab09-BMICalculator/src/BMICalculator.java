import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BMICalculator extends JPanel implements ActionListener {
	
	// COMPONENTS
	
	JLabel info = new JLabel("Enter your information");
	
	JLabel height = new JLabel("Your height (cm):");
	JLabel weight = new JLabel("Your weight (kg):");
	JTextField heightTf = new JTextField("");
	JTextField weightTf = new JTextField("");
	
	JButton computeBt = new JButton("Compute BMI");
	JLabel results = new JLabel("BMI = ");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	BMICalculator() {
		
		setLayout(new GridLayout(3, 1));
		add(p1);
		add(p2);
		add(p3);
		
		p1.setLayout(new GridLayout());
		info.setHorizontalAlignment(SwingConstants.LEFT);
		info.setVerticalAlignment(SwingConstants.TOP);
		p1.add(info);
		
		p2.setLayout(new GridLayout(2, 2));
		p2.add(height);
		p2.add(heightTf);
		p2.add(weight);
		p2.add(weightTf);
		
		p3.setLayout(new GridLayout(2,1));
		p3.add(computeBt);
		p3.add(results);
		
		// REGISTER
		
		heightTf.addActionListener(this);
		weightTf.addActionListener(this);
		computeBt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Compute on button click or Enter in either text field
		try {
			double h = Double.parseDouble(heightTf.getText().trim());
			double w = Double.parseDouble(weightTf.getText().trim());
			if (h <= 0 || w <= 0) {
				results.setText("Height and weight must be positive");
				return;
			}
			double bmi = (w/h/h*10000);
			results.setText("BMI = " + String.format("%.2f", bmi));
		} catch (NumberFormatException ex) {
			results.setText("Please enter numbers only");
		}
	}
}
