import java.awt.*;
import java.awt.event.*;

class KeyExample extends Frame implements KeyListener,WindowListener
{
		Label l1,l2;
		TextField t1,t2;
		
		KeyExample()
		{
				Font f = new Font("verdana",Font.BOLD,27);
				l1 = new Label("No : ");
				l2 = new Label("Name : ");
				t1 = new TextField();
				t2 = new TextField();
				setLayout(new GridLayout(2,2));
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				l1.setFont(f);
				t1.setFont(f);
				l2.setFont(f);
				t2.setFont(f);
				t1.addKeyListener(this);
				t2.addKeyListener(this);
				this.addWindowListener(this);
		}
		
		public void keyPressed(KeyEvent e)
		{
		
		}

		public void keyReleased(KeyEvent e)
		{
		
		}
		
		public void keyTyped(KeyEvent e)
		{
				if(e.getSource() == t1)
				{
						char c = e.getKeyChar();
						if(!(c >= '0' && c <= '9'))
						{
								e.consume();
						}
				}
				else
				{
						char c = e.getKeyChar();
						if(!((c >= 'A' && c <= 'Z') || (c>='a' && c<='z')))
						{
								e.consume();
						}
				}
		}
		
		public void windowOpened(WindowEvent e)
		{
		}
		public void windowClosed(WindowEvent e)
		{
		}
		public void windowClosing(WindowEvent e)
		{
				System.exit(0);
		}
		public void windowIconified(WindowEvent e)
		{
		}
		public void windowDeiconified(WindowEvent e)
		{
		}
		public void windowActivated(WindowEvent e)
		{
		}
		public void windowDeactivated(WindowEvent e)
		{
		}
		
		public static void main(String ar[])
		{
				KeyExample x = new KeyExample();
				x.setVisible(true);
				x.setSize(300,300);
		}

}
