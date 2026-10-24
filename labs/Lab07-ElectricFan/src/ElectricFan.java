
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class ElectricFan extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Gray background
        g.setColor(Color.GRAY);
        g.fillOval(295, 95, 210, 210);
        
        // White background
        g.setColor(Color.WHITE);
        g.fillOval(300, 100, 200, 200);
        
        // Fan blade
        g.setColor(Color.ORANGE);
        for (int i=0; i<=8; i=i+2) {
        	g.fillArc(310, 110, 180, 180, i*36, 36);
        }
        
        // Fan neck
        g.setColor(Color.GRAY);
        g.fillRect(380, 300, 45, 150);
        
        // Fan base
        g.setColor(Color.BLUE);
        int[] x = {350, 450, 500, 300};
        int[] y = {450, 450, 550, 550};
        g.fillPolygon(x, y, 4);
        
        // Buttons
        for (int i=0; i<=3; i++) {
        	g.setColor(Color.RED);
        	g.fillRoundRect(360+20*i, 500, 17, 20, 20, 20);
        	g.setColor(Color.WHITE);
        	g.drawString(i+"", 366+20*i, 514);
        }
    }
}
