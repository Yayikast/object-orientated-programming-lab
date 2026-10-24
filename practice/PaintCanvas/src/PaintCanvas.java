import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PaintCanvas extends JPanel implements ActionListener, ItemListener {
	
	Color c = Color.BLACK;
	
	int x; int y; int rad = 20;
	int size = 1;
	
	int rVar; int bVar; int gVar;
	
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	JButton clear = new JButton("Clear");
	
	Draw draw = new Draw();
	
	// COLOR
	
	JRadioButton red = new JRadioButton("Red");
	JRadioButton yellow = new JRadioButton("Yellow");
	JRadioButton green = new JRadioButton("Green");
	JRadioButton blue = new JRadioButton("Blue");
	JRadioButton black = new JRadioButton("Black");
	JRadioButton custom = new JRadioButton("Custom");
	
	JLabel rLabel = new JLabel("R:");
	JLabel gLabel = new JLabel("G:");
	JLabel bLabel = new JLabel("B:");
	
	JTextField rTf = new JTextField("", 5);
	JTextField gTf = new JTextField("", 5);
	JTextField bTf = new JTextField("", 5);
	
	// SIZE
	
	JRadioButton s1 = new JRadioButton("1");
	JRadioButton s2 = new JRadioButton("2");
	JRadioButton s3 = new JRadioButton("3");
	JRadioButton s4 = new JRadioButton("4");
	JRadioButton s5 = new JRadioButton("5");
	JRadioButton sCustom = new JRadioButton("Custom");
	
	JLabel sizeLabel = new JLabel("Size:");
	JTextField sizeTf = new JTextField("", 5);
	
	ButtonGroup group1 = new ButtonGroup();
	ButtonGroup group2 = new ButtonGroup();
	
	PaintCanvas() {
		setFocusable(true);
		
		setBackground(Color.WHITE);
		
		// REGISTER LISTENER
		
		clear.addActionListener(this);
		
		red.addItemListener(this);
		yellow.addItemListener(this);
		green.addItemListener(this);
		blue.addItemListener(this);
		black.addItemListener(this);
		custom.addItemListener(this);
		
		rTf.addActionListener(this);
		gTf.addActionListener(this);
		bTf.addActionListener(this);
		
		s1.addItemListener(this);
		s2.addItemListener(this);
		s3.addItemListener(this);
		s4.addItemListener(this);
		s5.addItemListener(this);
		sCustom.addItemListener(this);
		
		sizeTf.addActionListener(this);
		
		// BUTTON GROUP
		
		group1.add(red);
		group1.add(yellow);
		group1.add(green);
		group1.add(blue);
		group1.add(black);
		group1.add(custom);
		
		group2.add(s1);
		group2.add(s2);
		group2.add(s3);
		group2.add(s4);
		group2.add(s5);
		group2.add(sCustom);
		
		// LAYOUT
		
		setLayout(new BorderLayout());
		add(clear, BorderLayout.NORTH);
		add(p3, BorderLayout.SOUTH);
		add(p2, BorderLayout.WEST);
		add(p4, BorderLayout.EAST);
		add(draw, BorderLayout.CENTER);
		
		
		p2.setLayout(new GridLayout(6, 1));
		p2.add(red);
		p2.add(yellow);
		p2.add(green);
		p2.add(blue);
		p2.add(black);
		p2.add(custom);
		
		p4.setLayout(new GridLayout(6, 1));
		p4.add(s1);
		p4.add(s2);
		p4.add(s3);
		p4.add(s4);
		p4.add(s5);
		p4.add(sCustom);
		
		p3.setLayout(new FlowLayout());
		p3.add(rLabel);
		p3.add(rTf);
		p3.add(gLabel);
		p3.add(gTf);
		p3.add(bLabel);
		p3.add(bTf);
		p3.add(sizeLabel);
		p3.add(sizeTf);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == red) {
			c = Color.RED;
		}
		if (e.getSource() == yellow) {
			c = Color.YELLOW;
		}
		if (e.getSource() == green) {
			c = Color.GREEN;
		}
		if (e.getSource() == blue) {
			c = Color.BLUE;
		}
		if (e.getSource() == black) {
			c = Color.BLACK;
		}
		
		if (e.getSource() == s1) {
			size = 1;
		}
		if (e.getSource() == s2) {
			size = 2;
		}
		if (e.getSource() == s3) {
			size = 3;
		}
		if (e.getSource() == s4) {
			size = 4;
		}
		if (e.getSource() == s5) {
			size = 5;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (custom.isSelected()) {
				rVar = Integer.parseInt(rTf.getText().trim());
				gVar = Integer.parseInt(gTf.getText().trim());
				bVar = Integer.parseInt(bTf.getText().trim());
				c = new Color(rVar, gVar, bVar);
			}
			if (sCustom.isSelected()) {
				size = Math.max(1, Integer.parseInt(sizeTf.getText().trim()));
			}
		} catch (IllegalArgumentException ex) {
			// Covers non-numeric input and RGB values outside 0-255
			JOptionPane.showMessageDialog(this, "Enter whole numbers (RGB values 0-255).");
		}
		if (e.getSource() == clear) {
			repaint();
		}
	}
	
	public class Draw extends JPanel implements MouseMotionListener {
	
		Draw() {
			setFocusable(true);
			
			addMouseMotionListener(this);
			
			setBackground(Color.WHITE);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			if (SwingUtilities.isRightMouseButton(e)) {
				g.setColor(getBackground());
				g.fillOval(x-rad, y-rad, rad*2, rad*2);
			}
			if (SwingUtilities.isLeftMouseButton(e)) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(size));
				g2.setColor(c);
				g2.drawLine(x, y, e.getX(), e.getY());
			}
			g.dispose();
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}
	}
}
