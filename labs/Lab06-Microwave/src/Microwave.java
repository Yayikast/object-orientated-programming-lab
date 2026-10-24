import java.awt.*;
import javax.swing.*;

public class Microwave extends JPanel {
	
	JButton foodBt = new JButton("Food to be placed here");
	
	JPanel p1 = new JPanel();
	JTextField timeTf = new JTextField("Microwave Time Display");
	
	JPanel p2 = new JPanel();
	JButton stopBt = new JButton("Stop");
	JButton zeroBt = new JButton("0");
	JButton startBt = new JButton("Start");
	
	Microwave() {
		
		//Layout
		setLayout(new BorderLayout());
		add(foodBt, BorderLayout.CENTER);
		add(p1, BorderLayout.EAST);
		
		p1.setLayout(new BorderLayout());
		p1.add(timeTf, BorderLayout.NORTH);
		p1.add(p2, BorderLayout.CENTER);
		
		p2.setLayout(new GridLayout(4, 3));
		
		for (int i=1; i<=9; i++) {
			p2.add(new JButton(""+i));
		}
		
		p2.add(stopBt);
		p2.add(zeroBt);
		p2.add(startBt);
	}
}
