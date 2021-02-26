import java.awt.*;
import java.awt.event.*;

class textfield extends Frame implements ActionListener{
    TextField tf1;
    TextField tf2;
    TextField tf3;
    Button b1,b2;
    textfield(){
        tf1=new TextField();
        tf2=new TextField();
        tf3=new TextField();
         b1=new Button("+");
         b2=new Button("-");
        tf1.setBounds(100,100,100,20);
        tf2.setBounds(100,150,100,20);
        tf3.setBounds(150,300,100,20);
        b1.setBounds(100,200,100,20);
        b2.setBounds(200,200,100,20);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);
        add(tf2);
        add(b1);
        add(b2);
        add(tf3);
        // b1.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e){
        //            String s1=tf1.getText();
        //            String s2=tf2.getText();
        //            int a = Integer.parseInt(s1);
        //            int b = Integer.parseInt(s2);
        //            int c=0;
        //            c=a+b;
        //            String result=String.valueOf(c);
        //            tf3.setText(result);
        //     }
        // });

        // b2.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e){
        //            String s1=tf1.getText();
        //            String s2=tf2.getText();
        //            int a = Integer.parseInt(s1);
        //            int b = Integer.parseInt(s2);
        //            int c=0;
        //            c=a-b;
        //            String result=String.valueOf(c);
        //            tf3.setText(result);
        //     }
        // });   ------------------->>   This is the one way.

        
    }
    public void actionPerformed(ActionEvent e){
        String s1= tf1.getText();
        String s2= tf2.getText();
        int a=Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }

        String result=String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String args[]){
        textfield f = new textfield();
    }
}