import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.Math.*;

public class rotation extends Applet 
{
	Thread t;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);	
	}
	public void paint(Graphics g)
	{
		double x,y,xx=150,yy=150;
		int i=0;
		double angle=60*.008722;
		g.setColor(Color.blue);
		while(i<500)
		{
			i++;
			x=xx*Math.cos(angle)-yy*Math.sin(angle);
			y=xx*Math.sin(angle)+yy*Math.cos(angle);
			xx=x;
			yy=y;
			g.fillArc((int)x+250,(int)y+250,50,50,0,360);
			g.drawOval(150,200,200,200);
			try
			{
				t.sleep(80);
			}
			catch(InterruptedException e)
			{}
			g.clearRect(0,0,700,700);
			if(i==400)
			{
				angle=0;
				i=0;
			}
		}
	}
}
/*<applet code="rotation.class"
height=600
width=800>
</applet>*/