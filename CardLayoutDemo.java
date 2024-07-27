import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
    CardLayout card=new CardLayout(20,20);
    demo()
    {
        setLayout(card);
        Button btnf=new Button("first");
        Button btns=new Button("second");
        Button btnt=new Button("third");
        add(btnf,"card1");
        add(btns,"card2");
        add(btnt,"card3");
        btnf.addActionListener(this);
        btns.addActionListener(this);
        btnt.addActionListener(this);

    }
    public void actionPerformed (ActionEvent e)
    {
        card.next(this);
    }
}


public class CardLayoutDemo {
    public static void main(String[] args) {
        demo frame=new demo();
        frame.setTitle("cardlayoutdemo");
        frame.setSize(220,150);
        frame.setResizable(false);
        frame.setVisible(true);
    }  
}
