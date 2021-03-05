import java.awt.*;
import java.awt.event.*;

class panel extends Frame{
    panel(){
        Panel pan = new Panel();
        pan.setBounds(50,50,300,300);
        pan.setBackground(Color.GRAY);
        Button b1 = new Button("Button1");
        b1.setBounds(50,50,100,100);
        Button b2 = new Button("Button2");
        b1.setBounds(180,50,100,100);
        add(pan);
        pan.add(b1);
        pan.add(b2);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){
        panel p = new panel();
    }
}