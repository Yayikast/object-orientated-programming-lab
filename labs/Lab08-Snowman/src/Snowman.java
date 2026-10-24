import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Snowman extends JPanel implements ActionListener, MouseMotionListener {
	
	int x = 100;
	int y = 400;
	
	JButton left = new JButton("Left");
	JButton right = new JButton("Right");
	JButton up = new JButton("Up");
	JButton down = new JButton("Down");
	
	JRadioButton hat = new JRadioButton("Hat");
	JRadioButton button = new JRadioButton("Buttons");
	JRadioButton arm = new JRadioButton("Arms");
	
	JRadioButton mouse = new JRadioButton("Use Mouse");
	
	JPanel main = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	Snowman() {
		setLayout(new BorderLayout());
		setBackground(new Color(20, 100, 20));
		
		main.setOpaque(false);
		p1.setOpaque(false);
		p2.setOpaque(false);
		
		main.add(mouse);
		main.add(p1);
		main.add(p2);
		
		add(main, BorderLayout.NORTH);
		
		p1.add(left);
		p1.add(right);
		p1.add(up);
		p1.add(down);
		
		p2.add(hat);
		p2.add(button);
		p2.add(arm);
		
		hat.addActionListener(this);
		button.addActionListener(this);
		arm.addActionListener(this);
		
		addMouseMotionListener(this);
		
		left.addActionListener(this);
		right.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval(-100, -100, 200, 200);
		
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 80, 80);
		g.fillOval(x+10, y-50, 60, 60);
		g.fillOval(x+20, y-80, 40, 40);
		
		g.setColor(Color.BLACK);
		g.fillOval(x+33, y-70, 4, 4);
		g.fillOval(x+43, y-70, 4, 4);
		
		if (hat.isSelected()) {
			g.setColor(Color.BLACK);
			g.fillRect(x+20, y-75, 40, 3);
			g.fillRect(x+24, y-95, 32, 20);
		}
		
		if (button.isSelected()) {
			g.setColor(new Color(200, 200, 200));
			g.fillOval(x+38, y-40, 4, 4);
			g.fillOval(x+38, y-30, 4, 4);
			g.fillOval(x+38, y-20, 4, 4);
		}
		
		if (arm.isSelected()) {
			g.setColor(new Color(250, 200, 200));
			g.drawLine(x+5, y-50, x+10, y-20);
			g.drawLine(x+75, y-50, x+70, y-20);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == left) {
			x = x-10;
		}
		if (e.getSource() == right) {
			x = x+10;
		}
		if (e.getSource() == up) {
			y = y-10;
		}
		if (e.getSource() == down) {
			y = y+10;
		}
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (mouse.isSelected()) {
			x = e.getX();
			y = e.getY();
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
}
