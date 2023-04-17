import java.applet.*;
import java.awt.*;

/* <applet code="ShapeDesign" width="400" height = "900"></applet>*/

public class ShapeDesign extends Applet
{
			public void paint(Graphics g)
			{
					g.setColor(Color.red);
					g.fillOval(100,50,150,150);	
					g.setColor(Color.blue);
					g.drawRect(100,250,150,150);
					g.setColor(Color.yellow);
					g.fillRect(100,450,200,100);
					g.setColor(Color.black);
					g.drawLine(250,580,100,680);
					g.drawArc(100,720,200,100,0,180);
					Font f = new Font("verdana",Font.BOLD,27);
					g.setFont(f);
					g.drawString("Hello World",100,850);
			}
}