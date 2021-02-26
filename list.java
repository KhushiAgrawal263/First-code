import java.awt.*;
import java.awt.event.*;

class list extends Frame{
    list(){
        final Label label = new Label();
        // label.setAlignment(Label.CENTER);
        // label.setSize(400,100);
        label.setBounds(80,50,400,40);
        Button b = new Button("Show");
        b.setBounds(100,450,80,20);
        final List l1 = new List();
        l1.setBounds(100,200,70,70);
        l1.add("Java");
        l1.add("C");
        l1.add("C++");
        l1.add("Python");
        l1.add("Ad Java");
        final List l2 = new List();
        l2.add("A");
        l2.setBounds(100,300,70,70);
        l2.add("N");
        l2.add("C");
        l2.add("P");
        l2.add("J");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        add(b);
        add(label);
        add(l1);
        add(l2);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data= "Programming Language Selected : "+l1.getItem(l1.getSelectedIndex());
                data += ", Framework Selected:";  
                for(String frame:l2.getSelectedItems()){  
                   data += frame + " ";  
                label.setText(data);
            }}
        });
    }

    public static void main(String args[]){
        list l = new  list();
    }
}