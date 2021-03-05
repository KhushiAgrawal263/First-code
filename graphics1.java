import java.awt.*;

class graphics1 extends Frame{
   
    graphics1(){
        // Graphics g = getGraphics();
        // g.setColor(Color.BLUE);
        // g.fillOval(50,70,100,300);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(20,230,250,250);  // big rectangle

        g.setColor(Color.BLACK);
        g.fillRect(100,340,90,140);  // gate

        g.setColor(Color.BLACK);
        g.fillRect(40,250,40,40); // window

        g.setColor(Color.BLACK);
        g.fillRect(210,250,40,40);;  // window
        
        int[] x ={20,145,270};
        int[] y ={230,50,230};
        g.setColor(Color.WHITE);  // for rectangle
        g.fillPolygon(x,y,3);
        
        g.setColor(Color.BLACK);
        g.drawLine(20,230,270,230);  // line
        
        g.setColor(Color.WHITE);
        g.drawString("khushi agrawal",180,50);
        
        g.setColor(Color.WHITE);
        g.drawOval(300,100,100,150);
        
        g.setColor(Color.WHITE);
        g.drawArc(300,300,150,150,0,-180);


    }

    public static void main(String args[]){
            graphics1 gr = new graphics1();
    }
}