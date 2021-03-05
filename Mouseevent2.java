import java.awt.*;
import java.awt.event.*;

class Mouseevent2 extends Frame implements MouseListener{
    Label l;
    Mouseevent2(){
     addMouseListener(this);
     l= new Label();
     l.setBounds(30,50,100,100);
     setLayout(null);
     setSize(300,300);
     setVisible(true);
     add(l);
    }

    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillCircle(e.getX(),e.getY(),5);
    }
    public void mouseEntered(MouseEvent e ){}
    public void mouseExited(MouseEvent e ){}
    public void mousePressed(MouseEvent e ){}
    public void mouseReleased(MouseEvent e ){}

    public static void main(String args[]){
        Mouseevent2 m = new Mouseevent2();
    }
}