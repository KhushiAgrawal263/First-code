import java.awt.*;
import java.awt.event.*;

class popupmenu extends Frame{
    popupmenu(){
        Frame f = new Frame();
        final PopupMenu popupmenu = new PopupMenu();
        MenuItem cut = new MenuItem("Cut");
        cut.setActionCommand("Cut");
        MenuItem copy = new MenuItem("Copy");
        copy.setActionCommand("Copy");
        MenuItem paste = new MenuItem("paste");
        paste.setActionCommand("paste");
        f.add(popupmenu);
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popupmenu.show(f,e.getX(),e.getY());
            }
        });
    }
    public static void main(String args[]){
        popupmenu p = new popupmenu();
    }
}