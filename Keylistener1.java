import java.awt.*;
import java.awt.event.*;

class Keylistener1 extends Frame implements KeyListener{
    Label l;
    TextArea t;
    Keylistener1(){
       l = new Label();
       l.setBounds(50,80,100,100);
       t= new TextArea();
       t.setBounds(50,200,100,100);
       setSize(500,500);
       setVisible(true);
       setLayout(null);
       add(l);
       add(t);
       t.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }
    public static void main(String args[]){
        Keylistener1 k = new Keylistener1();
    }
}