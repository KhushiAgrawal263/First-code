import java.awt.*;
import java.awt.event.*;
// Event handling by within the class. 
class EventH1 extends Frame implements ActionListener
{
    TextField tf;
     EventH1(){
        tf=new TextField();
        Button b = new Button("Click Me");
        tf.setBounds(100,50,100,20);
        b.setBounds(100,80,100,20);
        add(tf);
        add(b);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Khushi Agrawal");
    }
    public static void main(String args[])
    {
        EventH1 e = new EventH1();
    }
}