import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;

public class wheel extends Applet 
{
	Thread t;
	double the;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);	
	}
	public void paint(Graphics g)
	{
			int xc,yc,x1,y1;
			the=0;
			int i;
			for(i=0;i<900;i++)	
			{
				x1=200+i;
				y1=200;
				xc=x1+50;
				yc=y1+50;
				g.clearRect(0,0,900,900);
				g.drawOval(x1,y1,100,100);
				drawLines(xc,yc,50,the,g);
				drawLines(xc,yc,50,the+45,g);	//D
				drawLines(xc,yc,50,the+90,g);
				drawLines(xc,yc,50,the+135,g);	//N
				drawLines(xc,yc,50,the+180,g);
				drawLines(xc,yc,50,the+225,g);	//N
				drawLines(xc,yc,50,the+270,g);
				drawLines(xc,yc,50,the+315,g);	//D
				drawLines(xc,yc,50,the+360,g);
				the++;
				try
				{
					t.sleep(10);
				}
				catch(Exception e)
				{}
				if(i==600)
					i=0;
			}
	}
	public void drawLines(int x1,int y1,int r,double t,Graphics g)
	{
		t=t*0.01744;
		double a,b;
		int c,d;
		a=x1+r*(Math.cos(t));
		b=y1+r*(Math.sin(t));
		c=(int)a;
		d=(int)b;
		g.drawLine(x1,y1,c,d);
	}
}	

/*<applet code="wheel.class"height=600 width=800>
</applet>*/