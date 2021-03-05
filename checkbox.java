import java.awt.*;
import java.awt.event.*;

class checkbox extends Frame {
    checkbox(){
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(200,200);
        Checkbox checkbox1=new Checkbox("C++");
        checkbox1.setBounds(200,250,100,20);
        Checkbox checkbox2=new Checkbox("Java");
        checkbox2.setBounds(200,400,100,20);
        add(checkbox1);
        add(checkbox2);
        add(label);
        setLayout(null);
        setSize(700,700);
        setVisible(true);
        checkbox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("C++ checkbox :" +(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("Java checkbox :" +(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
    }

    public static void main(String args[]){
        checkbox c=new checkbox();
    }
}