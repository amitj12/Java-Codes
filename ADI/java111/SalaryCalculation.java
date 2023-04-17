import java.awt.*;
import java.awt.event.*;

class SalaryCalculation extends Frame implements TextListener
{
		Label l1,l2,l3,l4,l5;
		TextField t1,t2,t3,t4,t5;
		
		SalaryCalculation()
		{
				Font f = new Font("verdana",Font.BOLD,27);
				l1 = new Label("Basic Salary");
				l2 = new Label("HRA");
				l3 = new Label("DA");
				l4 = new Label("TAX");
				l5 = new Label("Net Salary");
				t1 = new TextField();
				t2 = new TextField();
				t3 = new TextField();
				t4 = new TextField();
				t5 = new TextField();
				setLayout(new GridLayout(5,2));
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(l3);
				add(t3);
				add(l4);
				add(t4);
				add(l5);
				add(t5);
				l1.setFont(f);
				l2.setFont(f);
				l3.setFont(f);
				l4.setFont(f);
				l5.setFont(f);
				t1.setFont(f);
				t2.setFont(f);
				t3.setFont(f);
				t4.setFont(f);
				t5.setFont(f);
				t1.addTextListener(this);
		}
		
		public void textValueChanged(TextEvent e)
		{
				String s = t1.getText();
				if(s.equals(""))
				{
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
				}
				else
				{
						float sal,hra,da,tax,net;
				
						sal = Float.parseFloat(t1.getText());
						hra = sal * 0.08f;
						da = sal * 0.04f;
						tax = sal * 0.03f;
						net = sal + hra + da - tax;
				
						t2.setText(hra+"");	
						t3.setText(da+"");
						t4.setText(tax+"");
						t5.setText(net+"");
				}

		}
		
		public static void main(String r[])
		{
				SalaryCalculation  x  =new SalaryCalculation();
				x.setVisible(true);
				x.setSize(300,300);
				
		}
}