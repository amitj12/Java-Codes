import java.applet.*;
import java.awt.*;

/* <applet code="MoveString" width="700" height="500"></applet>*/

public class MoveString extends Applet implements Runnable
{
		int x;
		public void init()
		{
				x=0;
				
		}
			
		public void start()
		{
				Thread t = new Thread(this);
				t.start();
		}
		
		public void run()
		{
				while(true)
				{
						if(x>700)
						{	
							
							x=0;
						}
						else
						{
							x = x + 20;
						}
						try
						{
								Thread.sleep(100);
						}
						catch(InterruptedException e)
						{
							System.out.println(e);
						}
						repaint();
				}
		}
			
		public void paint(Graphics g)
		{
				Font f = new Font("Arial",Font.BOLD,30);
				g.setFont(f);
				g.drawString("Hello",x,100);
		}
}