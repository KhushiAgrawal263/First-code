import java.awt.*;
import java.awt.event.*;
class mousemotion1 extends Frame implements MouseMotionListener{
    mousemotion1(){
        setVisible(true);
        setLayout(null);
        setSize(500,500);
       addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e){}
    public static void main(String args[]){
        mousemotion1 m = new mousemotion1();
    }
}