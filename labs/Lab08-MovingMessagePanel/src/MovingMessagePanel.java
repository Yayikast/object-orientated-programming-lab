import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener {
	
	JLabel messageLabel = new JLabel("Message to be displayed");
	JTextField messageTf = new JTextField("", 30);
	
	JRadioButton mouseRb = new JRadioButton("Use Mouse");
	
	JButton leftBt = new JButton("Left");
	JButton rightBt = new JButton("Right");
	JButton upBt = new JButton("Up");
	JButton downBt = new JButton("Down");
	
	JLabel bgColorLabel = new JLabel("Background Color ");
	JRadioButton whiteRb = new JRadioButton("white");
	JRadioButton blackRb = new JRadioButton("black");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	// VARIABLES
	
	String text = "";
	int x = 150;
	int y = 150;
	Color textColor = Color.BLACK;
	
	ButtonGroup group = new ButtonGroup();	
	
	
	MovingMessagePanel() {
		setLayout(new BorderLayout());
		add(p2, BorderLayout.EAST);
		add(p4, BorderLayout.WEST);
		add(p1, BorderLayout.NORTH);
		add(p3, BorderLayout.SOUTH);
		
		p1.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout());
		p3.setLayout(new FlowLayout());
		p4.setLayout(new GridLayout(3, 1));
		
		p1.add(messageLabel);
		p1.add(messageTf);
		
		p2.add(mouseRb);
		
		p3.add(leftBt);
		p3.add(rightBt);
		p3.add(upBt);
		p3.add(downBt);
		
		p4.add(bgColorLabel);
		p4.add(whiteRb);
		p4.add(blackRb);
		
		// BUTTON GROUP
		
		group.add(whiteRb);
		group.add(blackRb);
		
		// REGISTER
		
		messageTf.addActionListener(this);
		
		whiteRb.addItemListener(this);
		blackRb.addItemListener(this);
				
		leftBt.addActionListener(this);
		rightBt.addActionListener(this);
		upBt.addActionListener(this);
		downBt.addActionListener(this);
		
		this.addMouseMotionListener(this);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("SansSerif", Font.BOLD, 80));
		g.setColor(textColor);
		g.drawString(text, x, y);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == messageTf) {
			text = e.getActionCommand();
		}
		if (e.getSource() == leftBt) {
			x = x-5;
		}
		if (e.getSource() == rightBt) {
			x = x+5;
		}
		if (e.getSource() == upBt) {
			y = y-5;
		}
		if (e.getSource() == downBt) {
			y = y+5;
		}
		repaint();
	}

	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == whiteRb) {
			textColor = Color.BLACK;
			this.setBackground(Color.WHITE);
		}
		if (e.getSource() == blackRb) {
			textColor = Color.PINK;
			this.setBackground(Color.BLACK);
		}
		repaint();
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		if (mouseRb.isSelected()) {
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
