import java.awt.*;
import java.awt.event.*;

class Keylistener2 extends Frame implements KeyListener{
    Label l;
    TextArea t;
    Keylistener2(){
       l = new Label();
       l.setBounds(50,80,200,100);
       t= new TextArea();
       t.setBounds(50,200,100,100);
       setSize(500,500);
       setVisible(true);
       setLayout(null);
       add(l);
       add(t);
       t.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){}
       
    public void keyReleased(KeyEvent e){
        String text=t.getText();  
        String words[]=text.split("\\s");  
        l.setText("Words: "+words.length+" Characters:"+text.length());
    }
    public void keyTyped(KeyEvent e){
        
    }
    public static void main(String args[]){
        Keylistener2 k = new Keylistener2();
    }
}
    