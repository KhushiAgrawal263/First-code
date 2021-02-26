import java.awt.*;
import java.awt.event.*;
// Event handling by anonymous class
class EventH3 extends Frame 
{
    TextField tf;
    EventH3(){
        tf=new TextField();
        Button b=new Button("Click Here");
        tf.setBounds(100,50,100,20);
        b.setBounds(100,80,100,20);
        add(tf);
        add(b);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Khushi Agrawal");
            }
        });
    }

    public static void main(String args[])
    {
        EventH3 d = new EventH3();
    }
}