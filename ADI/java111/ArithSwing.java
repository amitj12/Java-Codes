import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ArithSwing extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton b1,b2;
		
		ArithSwing()
		{
				Font f = new Font("verdana",Font.BOLD,25);
				l1 = new JLabel("No1 : ");
				l2 = new JLabel("No2 : ");
				l3 = new JLabel("Ans : ");
				t1 = new JTextField(20);
				t2 = new JTextField(20);
				t3 = new JTextField(20);
				b1 = new JButton("Add");
				b2 = new JButton("Mul");
				setLayout(new GridLayout(4,2));
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(l3);
				add(t3);
				add(b1);
				add(b2);
				l1.setFont(f);
				l2.setFont(f);
				l3.setFont(f);
				t1.setFont(f);
				t2.setFont(f);
				t3.setFont(f);
				b1.setFont(f);
				b2.setFont(f);
				b1.addActionListener(this);
				b2.addActionListener(this);
		}

		public void actionPerformed(ActionEvent e)
		{
				int a,b,c;
				if(e.getSource() == b1)
				{
						a =Integer.parseInt(t1.getText());
						b =Integer.parseInt(t2.getText());
						c = a +b;
						t3.setText(c+"");
				}
				else
				{
						a =Integer.parseInt(t1.getText());
						b =Integer.parseInt(t2.getText());
						c = a * b;
						t3.setText(c+"");			
				}
		}
		
		public static void main(String at[])
		{
				ArithSwing x = new ArithSwing();
				x.setVisible(true);
				x.setSize(600,600);
		}
}