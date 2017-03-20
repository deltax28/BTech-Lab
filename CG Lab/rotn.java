import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;

public class rotn extends Applet 
{
	Thread t;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);	
	}
	public void paint(Graphics g)
	{
			int xc,yc,x=250,y=250,r=60,the;
			xc=x+r;
			yc=y+r;
			for(the=0;the<=360;the++)	
			{	
				g.clearRect(0,0,800,600);
				g.setColor(Color.black);
				g.fillOval(x,y,2*r,2*r);	//Center Object
				drawCircles(xc,yc,150,the,g);
				if(the==360)
					the=0;
				try
				{
					t.sleep(10);
				}
				catch(Exception e)
				{}
				
			}
	}
	public void drawCircles(int x,int y,int R,double t,Graphics g)
	{	int r=20;
		t=t*0.01744;
		double a,b;
		a=x+R*(Math.cos(t));
		b=y+R*(Math.sin(t));
		int c=(int)a;
		int d=(int)b;
		g.drawOval(c-r,d-r,2*r,2*r);
	}
}	

/*<applet code="rotn.class"height=600 width=800>
</applet>*/