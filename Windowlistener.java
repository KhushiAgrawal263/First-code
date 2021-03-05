import java.awt.*;  
import java.awt.event.*;  
public class Windowlistener extends Frame implements WindowListener{  
    Windowlistener(){  
        addWindowListener(this);  
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
      
public static void main(String[] args) {  
    new Windowlistener();  
}  
public void windowActivated(WindowEvent e) {  
    System.out.println("activated");  
}  
public void windowClosed(WindowEvent e) {  
    System.out.println("closed");  
}  
public void windowClosing(WindowEvent e) {  
    System.out.println("closing");  
    dispose();  
}  
public void windowDeactivated(WindowEvent e) {  
    System.out.println("deactivated");  
}  
public void windowDeiconified(WindowEvent e) {  
    System.out.println("deiconified");  
}  
public void windowIconified(WindowEvent e) {  
    System.out.println("iconified");  
}  
public void windowOpened(WindowEvent e) {  
    System.out.println("opened");  
}  
}  