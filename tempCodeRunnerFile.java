import java.awt.*;
import javax.swing.*;
class MainFrame extends JFrame
{
    JLabel l1,l2,l3,l4,l5;
   // public MainFrame()
    //{
        void callme(){
        FlowLayout Layout = new FlowLayout((FlowLayout.RIGHT));
        this.setLayout(Layout);
        l1=new JLabel("label1");
        l2=new JLabel("label2");
        l3=new JLabel("label3");
        l4=new JLabel("label4");
        l5=new JLabel("label5");
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        }
   // }
}
class FlowLayoutdemo
{
    public static void main(String[] args)
    {

        MainFrame fl=new MainFrame();
        fl.callme();
        fl.setTitle("example of flowLayout");
        fl.setBounds(200,100,600,400);
        fl.setVisible(true);
        
    }
}