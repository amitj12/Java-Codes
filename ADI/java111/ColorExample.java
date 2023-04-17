import java.awt.*;
import java.awt.event.*;

class ColorExample extends Frame implements ItemListener
{
		Choice ch;
		
		ColorExample()
		{
				Font f = new Font("Arial black",Font.BOLD,27);
				ch = new Choice();
				ch.add("red");
				ch.add("green");
				ch.add("yellow");
				ch.add("blue");
				setLayout(new FlowLayout());
				add(ch);
				ch.setFont(f);
				ch.addItemListener(this);
		}	
			
		public void itemStateChanged(ItemEvent e)
		{
				String s = ch.getSelectedItem().toString();
				if(s.equals("red"))
				{
						this.setBackground(Color.red);
				}
				else if(s.equals("green"))
				{
						this.setBackground(Color.green);
				}
				else if(s.equals("yellow"))
				{
						this.setBackground(Color.yellow);
				}
				else 
				{
						this.setBackground(Color.blue);
				}

	
}
			
		public static void main(String ar[])
		{
				ColorExample x =new ColorExample();
				x.setVisible(true);
				x.setSize(600,600);
		}
}