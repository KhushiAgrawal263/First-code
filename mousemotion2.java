import java.awt.*;
import java.awt.event.*;
class mousemotion2 extends Frame implements MouseMotionListener{
    Label l;
    Color c = Color.RED;
    mousemotion2(){
        l= new Label();
        l.setBounds(50,50,100,100);
        add(l);
        setVisible(true);
        setLayout(null);
        setSize(500,500);
       addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e){
        l.setText("X = "+e.getX()+"Y = "+e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    
    public void mouseMoved(MouseEvent e){l.setText("X = "+e.getX()+"Y = "+e.getY());}
    public static void main(String args[]){
        mousemotion2 m = new mousemotion2();
    }
}