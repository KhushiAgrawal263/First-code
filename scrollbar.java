import java.awt.*;
import java.awt.event.*;

class scrollbar extends Frame{
    scrollbar(){
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        final Scrollbar s = new Scrollbar();
        add(s);
        add(label);
        s.setBounds(100,100,50,100);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        s.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e){
                label.setText("vertical scrollbar value is : "+s.getValue());
            }
        });  
    }

    public static void main (String args[]){
        scrollbar sb = new scrollbar();
    }
}