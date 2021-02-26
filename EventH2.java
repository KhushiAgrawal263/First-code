import java.awt.*;
import java.awt.event.*;
// Event Handling by outer class.
class EventH2 extends Frame 
{
    TextField tf;
    EventH2(){
        tf=new TextField();
        Button b = new Button("Click");
        tf.setBounds(100,50,100,20);
        b.setBounds(100,80,100,20);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        add(b);
        add(tf);  
        outer o = new outer(this);
        b.addActionListener(o);                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
    
    public static void main(String args[])
    {
        EventH2 obj = new EventH2();
    }
}

class outer implements ActionListener{
    EventH2 obj;
    outer(EventH2 obj){
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e)
    {
        obj.tf.setText("Khushi Agrawal");
    }
}