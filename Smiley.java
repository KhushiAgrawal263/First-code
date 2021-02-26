import java.awt.*;
import java.awt.event.*;
public class Smiley extends Frame{
Smiley(){
	
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}

public void paint(Graphics g){
	g.setColor(Color.blue);
	g.fillRect(40,40,200,200);
	
	g.setColor(Color.yellow);
	g.fillOval(90,70,80,80);
	
	g.setColor(Color.black);
	g.fillOval(110,95,5,5);
	g.fillOval(145,95,5,5);
	
	g.setColor(Color.red);
	g.drawArc(113,115,35,20,0,-180);
}
public static void main(String[] args) {
	Smiley d=new Smiley();
	d.setTitle("Smiley");
	d.setSize(400,400);
	d.setVisible(true);
}
}