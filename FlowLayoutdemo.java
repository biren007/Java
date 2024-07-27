import java.awt.*;
import javax.swing.*;
class MFrame extends JFrame
{
    JLabel l1,l2,l3,l4,l5;
    public MFrame()
    {
        BorderLayout Layout = new BorderLayout();
        setLayout(Layout);
        l1=new JLabel("label1");
        l2=new JLabel("label2");
        l3=new JLabel("label3");
        l4=new JLabel("label4");
        l5=new JLabel("label5");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
    }
}
class FlowLayoutdemo
{
    public static void main(String[] args)
    {
        MFrame fl=new MFrame();
        fl.setTitle("example of flowLayout");
        fl.setBounds(200,100,600,400);
        fl.setVisible(true);
    }
}