import java.awt.*;
import java.awt.event.*;

class choice extends Frame{
    choice(){
        final Label label = new Label();
        // label.setAlignment(Label.CENTER);
        // label.setSize(400,100);
        label.setBounds(80,50,400,40);
        Button b = new Button("Show");
        b.setBounds(100,450,80,20);
        Choice C = new Choice();
        C.setBounds(100,200,300,40);
        C.add("Java");
        C.add("C");
        C.add("C++");
        C.add("Python");
        C.add("Ad Java");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        add(b);
        add(label);
        add(C);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data= "Programming Language Selected : "+C.getItem(C.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String args[]){
        choice c = new choice();
    }
}