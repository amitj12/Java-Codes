import java.awt.*;
import java.awt.event.*;

class MouseExample extends Frame implements MouseListener,MouseMotionListener
{
		Label l1,l2;
		MouseExample()
		{
				Font f = new Font("Arial" ,Font.BOLD,27);
				l1 = new Label("Mouse Event Show     ");
				l2 = new Label("Mouse Position show    ");
				setLayout(new FlowLayout());
				add(l1);
				add(l2);
				l1.setFont(f);
				l2.setFont(f);
				this.addMouseListener(this);

				this.addMouseMotionListener(this);
		}
	
		public void mousePressed(MouseEvent e)
		{
				l1.setText("You Pressed Mouse!!");
		}
		public void mouseReleased(MouseEvent e)
		{
				l1.setText("You Released Mouse!!");			
		}
		public void mouseClicked(MouseEvent e)
		{
				int x,y;
				x = e.getX();
				y = e.getY();
				l2.setText(x + "  , " + y);
		}
		public void mouseEntered(MouseEvent e)
		{
				l1.setVisible(true);
				l2.setVisible(true);
		}
		public void mouseExited(MouseEvent e)
		{
				l1.setVisible(false);
				l2.setVisible(false);
		}
		public void mouseDragged(MouseEvent e)
		{
				l1.setText("You Dragged Mouse!!");
		}
		public void mouseMoved(MouseEvent e)
		{
				int x,y;
				x = e.getX();
				y = e.getY();
				l2.setText(x + "  , " + y);
		}	
		public static void main(String ar[])
		{
			MouseExample x = new MouseExample();
			x.setVisible(true);
			x.setSize(800,800);
		}
}