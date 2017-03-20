import java.awt.*;
import java.applet.*;

public class house extends Applet{
	int x[]={50,100,750,800,50};
	int y[]={200,100,100,200,200};
	int n=5;
	public void init()
	{
		setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		//Filling Part
		g.setColor(new Color(255,255,153));
		g.fillRect(320,200,470,350);
		g.fillPolygon(x,y,n);
		g.fillRect(55,200,20,400);		//Pillar
		g.setColor(new Color(204,51,0));
		g.fillRect(505,400,100,150);		//Door
		g.fillRect(405,400,80,100);		//Window	1
		g.fillRect(625,400,80,100);		//Window	2	
		g.setColor(Color.yellow);		// Door Knob
		g.fillOval(505,470,15,15);			
		// Outline
		g.setColor(Color.black);
		g.drawRect(320,200,470,350);
		g.drawPolygon(x,y,n);
		g.drawRect(55,200,20,400);
		g.drawRect(505,400,100,150);
		g.drawOval(505,470,15,15);
		g.drawRect(405,400,80,100);		//Window 1 Outline
		g.drawRect(405,400,40,100);
		g.drawRect(405,400,80,50);
		g.drawRect(625,400,80,100);		//Window 2 Outline
		g.drawRect(625,400,40,100);
		g.drawRect(625,400,80,50);
		g.fillRect(320,550,470,50);		//Foundation
		g.setColor(Color.white);		//Starts Lower Foundations Designs
		
		for(int i=0;i<10;i++)
		{g.drawArc(270+(i*50),550,100,100,0,180);}
		
		g.drawLine(320,575,790,575);
			
	}
}
/*
g.fillRect(250,250,80,80);
g.setColor(Color.yellow);
g.fillOval(350,420,10,10);
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

g.drawArc(270,550,100,100,0,180);
g.drawArc(320,550,100,100,0,180);
g.drawArc(370,550,100,100,0,180);
g.drawArc(420,550,100,100,0,180);
g.drawArc(470,550,100,100,0,180);
g.drawArc(520,550,100,100,0,180);
g.drawArc(570,550,100,100,0,180);
g.drawArc(620,550,100,100,0,180);
g.drawArc(670,550,100,100,0,180);
g.drawArc(720,550,100,100,0,180);
g.drawArc(770,550,100,100,0,180);
*/
/*<applet code="house.class"
Height =800
Width=800>
</applet>
*/