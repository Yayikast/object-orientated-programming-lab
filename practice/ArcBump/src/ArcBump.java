import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ArcBump extends JPanel implements ActionListener {

	int r1 = 60;
	int r2 = 60;

	int x1 = 100;
	int x2 = 300;

	int y = 100;

	Color c = Color.GREEN;

	JButton computeBt = new JButton("Compute");
	JLabel computeLabel = new JLabel();

	JButton startBt = new JButton("Start");

	JLabel r1Label = new JLabel("Radius1:");
	JLabel r2Label = new JLabel("Radius2:");

	JTextField rad1 = new JTextField("", 10);
	JTextField rad2 = new JTextField("", 10);

	Timer timer = new Timer(500, this);

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();

	ArcBump() {

		setBackground(Color.BLACK);

		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);

		p1.setLayout(new GridLayout(1, 2));
		p1.add(computeBt);
		p1.add(computeLabel);

		p2.setLayout(new GridLayout(2, 1));
		p2.add(startBt);
		p2.add(p3);

		p3.setLayout(new FlowLayout());
		p3.add(r1Label);
		p3.add(rad1);
		p3.add(r2Label);
		p3.add(rad2);

		computeBt.addActionListener(this);
		startBt.addActionListener(this);

		rad1.addActionListener(this);
		rad2.addActionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(c);

		g.fillArc(x1-r1, y-r1, 2*r1, 2*r1, 150, 60);
		g.fillArc(x2-r2, y-r2, 2*r2, 2*r2, -30, 60);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((x1) >= (x2)) {
			timer.stop();
			c = Color.BLACK;
		}

		if (e.getSource() == startBt) {
			timer.start();
		}

		if (e.getSource() == timer) {
			x1 += 5;
			x2 -= 5;
		}

		try {
			if (e.getSource() == rad1) {
				r1 = Integer.parseInt(rad1.getText().trim());
			}

			if (e.getSource() == rad2) {
				r2 = Integer.parseInt(rad2.getText().trim());
			}
		} catch (NumberFormatException ex) {
			computeLabel.setText("Radius must be a whole number");
		}

		if (e.getSource() == computeBt) {
			// Total arc length of the two 60-degree arcs
			double arcLength = 2*Math.PI*r1*60/360 + 2*Math.PI*r2*60/360;
			computeLabel.setText(String.format("Arc length = %.2f", arcLength));
		}

		repaint();

	}
}
