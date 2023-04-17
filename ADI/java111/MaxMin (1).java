import java.awt.*;
import java.awt.event.*;

class MaxMin extends Frame implements ItemListener
{
		Label l1,l2,l3;
		TextField t1,t2,t3;
		CheckboxGroup cg;
		Checkbox r1,r2;
				
		MaxMin()
		{
				Font f = new Font("verdana",Font.BOLD,25);
				l1 = new Label("No1 : ");
				l2 = new Label("No2 : ");
				l3 = new Label("Ans : ");
				t1 = new TextField();
				t2 = new TextField();
				t3 = new TextField();
				cg = new CheckboxGroup();
				r1 = new Checkbox("Max",cg,false);
				r2 = new Checkbox("Min",cg,false);
				setLayout(new GridLayout(4,2));
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(l3);
				add(t3);
				add(r1);
				add(r2);
				l1.setFont(f);
				l2.setFont(f);
				l3.setFont(f);
				t1.setFont(f);
				t2.setFont(f);
				t3.setFont(f);
				r1.setFont(f);
				r2.setFont(f);
				r1.addItemListener(this);
				r2.addItemListener(this);
		}
			
		public void itemStateChanged(ItemEvent e)
		{
				int a,b;
				if(e.getSource() == r1)
				{
						a = Integer.parseInt(t1.getText());
						b = Integer.parseInt(t2.getText());
						if(a>b)
						{
								t3.setText(a+"");
						}
						else
						{
								t3.setText(b+"");							
						}
				}
				else
				{
						a = Integer.parseInt(t1.getText());
						b = Integer.parseInt(t2.getText());
						if(a<b)
						{
								t3.setText(a+"");
						}
						else
						{
								t3.setText(b+"");							
						}
				}
		}	
		
		public static void main(String ar[])
		{
				MaxMin x = new MaxMin();
				x.setVisible(true);
				x.setSize(400,400);
				
		}
}