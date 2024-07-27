//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalcDemo
{
    public static void main(String[] args) 
    {
        JFrame f=new JFrame("calculator");
        JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);
        JLabel lb=new JLabel();
        JButton sum=new JButton("sum");
        t1.setBounds(50,50,200,20);
        t2.setBounds(50,100,200,20);
        sum.setBounds(50,130,80,40);
        lb.setBounds(50, 300, 200, 20);
        f.add(t1);
        f.add(t2);
        f.add(sum);
        f.add(lb);
        sum.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                lb.setText("sum="+ String.valueOf(x+y));
                
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
       
}
