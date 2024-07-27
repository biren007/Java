
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testdemo extends JFrame implements ActionListener{
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JLabel lb = new JLabel();
    JButton sum = new JButton("sum");
    JButton sub = new JButton("sub");
    JButton mul = new JButton("mul");
    JButton div = new JButton("div");

    public testdemo() {

        t1.setBounds(50, 50, 180, 20);
        t2.setBounds(50, 100, 180, 20);
        sum.setBounds(50, 130, 60, 30);
        sub.setBounds(150, 130, 60, 30);
        mul.setBounds(50, 180, 60, 30);
        div.setBounds(150, 180, 60, 30);
        lb.setBounds(50, 300, 200, 20);
        add(t1);
        add(t2);
        add(sum);
        add(sub);
        add(mul);
        add(div);
        add(lb);
        sum.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e) {
        if(e.getSource()==sum)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            lb.setText("sum=" + String.valueOf(x + y));
        }
        else if(e.getSource()==sub)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            lb.setText("sub=" + String.valueOf(x - y));
        }
        else if(e.getSource()==mul)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            lb.setText("mul=" + String.valueOf(x * y));
        }
        else if(e.getSource()==div)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            lb.setText("div=" + String.valueOf(x / y));
        }
    }

    public static void main(String[] args) {
        new testdemo();
    }

}
