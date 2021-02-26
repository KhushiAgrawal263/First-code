import java.awt.*;
import java.awt.event.*;

class checkbgroup extends Frame {
    checkbgroup(){
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(200,200);
        CheckboxGroup cbg = new CheckboxGroup(); 
        Checkbox checkbox1=new Checkbox("C++",cbg,true );
        checkbox1.setBounds(200,250,100,20);
        Checkbox checkbox2=new Checkbox("Java",cbg,false);
        checkbox2.setBounds(200,400,100,20);
        add(checkbox1);
        add(checkbox2);
        add(label);
        setLayout(null);
        setSize(700,700);
        setVisible(true);
        checkbox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("C++ checkbox :Checked");
            }
        });
        checkbox2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("Java checkbox : Checked");
            }
        });
    }

    public static void main(String args[]){
        checkbgroup c=new checkbgroup();
    }
}