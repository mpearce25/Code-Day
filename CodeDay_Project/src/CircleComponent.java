import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CircleComponent extends JPanel
{
       Ellipse2D.Double circle;
       private static Color color = new Color(21,153,219);
       public CircleComponent(int radius)
       {
           circle = new Ellipse2D.Double(0, 0, radius, radius);
           
           setOpaque(false);
       }

       public Dimension getPreferredSize()
       {
            Rectangle bounds = circle.getBounds();
           return new Dimension(bounds.width, bounds.height);
       }

       public void setColor(Color color){
    	   this.color = color;
       }
       
       public void paintComponent(Graphics g)
       {
           super.paintComponent(g);
           Graphics2D g2 = (Graphics2D) g;
           g2.setColor(color);
           g2.fill(circle);

       }
}