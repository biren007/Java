import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo extends Frame
{
    Button Buttons[];
    public BoxLayoutDemo()
    {
        Buttons=new Button[5];
        for(int i=0;i<5;i++)
        {
            Buttons[i]=new Button("Button"+(i+1));
            add(Buttons[i]);
        }
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[]args)
    {
        BoxLayoutDemo b=new BoxLayoutDemo();
    }
}