import java.awt.*;
import java.applet.*;

public class house2 extends Applet{
	int x[]={200,240,560,600,200};
	int y[]={200,120,120,200,200};
	int n=5;
	public void init()
	{
		setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillRect(200,200,400,300);
		g.setColor(Color.green);
		g.fillPolygon(x,y,n);
		g.setColor(Color.red);
		g.fillRect(350,340,100,160);
		g.fillRect(250,250,80,80);
		g.setColor(Color.yellow);
		g.fillOval(350,420,10,10);
		g.setColor(Color.black);
		g.drawRect(200,200,400,300);
		g.drawPolygon(x,y,n);
		g.drawLine(240,120,560,120);		
		g.drawLine(200,200,240,120);		
		g.drawLine(560,120,600,200);
		g.drawRect(350,340,100,160);
		g.drawOval(350,420,10,10);
		g.drawRect(250,250,80,80);
		g.drawLine(290,250,290,330);
		g.drawLine(250,290,330,290);
		

	}
}

/*<applet code="house2.class"
Height =800
Width=800>
</applet>
*/