import java.awt.*;
import java.awt.event.*;

class canvas extends Frame{
    canvas(){
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        add(new canvas1());
    }

    public static void main(String args[]){
        canvas c = new canvas();
    }
}

class canvas1 extends Canvas{
    public canvas1(){
        setBackground(Color.GRAY);
        setSize(300,200);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillCircle(75,75,150,75 );
    }
}