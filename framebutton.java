import java.awt.*;

class framebutton 
{
    framebutton()
    {
        Frame f=new Frame();
        Button b=new Button("click me");
        b.setBounds(30,50,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args [])
    {
        framebutton frm=new framebutton();
    }
}