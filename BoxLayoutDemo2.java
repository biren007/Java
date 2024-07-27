import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo2 extends Frame
{
    Button Buttons[];
    public BoxLayoutDemo2()
    {
        Buttons=new Button[5];
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        for(int i=0;i<5;i++)
        {
            Buttons[i]=new Button("Button"+(i+1));
            add(Buttons[i]);
        }
        setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[]args)
    {
        BoxLayoutDemo2 b=new BoxLayoutDemo2();
    }
}