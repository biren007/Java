import java.applet.Applet;
import java.awt.*;
public class appletdemo extends Applet
{
    public void paint ( Graphics g )
    {
        g.drawString("welcome",150,150);
    }
}
/*
<applet code="appletdemo.class" width="600" height="600">
</applet>
*/