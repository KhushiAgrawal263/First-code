import java.awt.*;
import java.awt.event.*;
class Dialog2 {
    private static Dialog d;
    Dialog2(){
        Frame f = new Frame();
        d = new Dialog(f,"Dialog Example",false);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        Button b1 = new Button("Click");
        b1.setBounds(50,50,100,100);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Dialog2.d.setVisible(false);
            }
        });
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Dialog2.d.setVisible(true);
            }
        });
        
        d.add(new Label("Click button to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(false);
        f.add(b1);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        
    }
    public static void main(String args[]){
        new Dialog2();
    }
}