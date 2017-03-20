import java.applet.*;
import java.awt.*;

public class napp extends Applet 
{
	Thread t;
	public void init() 
	{
		t=new Thread();
		setBackground(Color.white);	
	}
	public void paint(Graphics g) 
	{	
		int the,r,i;
		Color[] c = {Color.cyan,Color.magenta,Color.yellow};
		g.setColor(Color.black);
		r=100;
		i=0; 
		while(true) {
		for(the=0;the<=360;the+=5)
		{	g.setColor(c[0]);
			drawCircles(300,200,r,the,g);
			
			g.setColor(c[1]);
			drawCircles(300,200,r,the+120,g);
			
			g.setColor(c[2]);
			drawCircles(300,200,r,the+240,g);
			
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)		{}
		}		
		}
	}
	public void drawCircles(int x,int y,int R,double t,Graphics g)
	{	int r=30;
		t=t*Math.PI/180;
		double a,b;
		a=x+R*(Math.cos(t));
		b=y+R*(Math.sin(t));
		int c=(int)a;
		int d=(int)b;
		g.fillOval(c-r,d-r,2*r,2*r);
//		g.drawString(".",c,d);
	}
}


/* <applet code="napp.class" height=600 width=800>
	</applet>
*/	

/*

//		g.setColor(Color.magenta);
//		g.fillOval(300,200,200,200);
		int the,r,i;
		Color[] c = {Color.cyan,Color.magenta,Color.yellow};
		g.setColor(Color.black);
		r=100;
		while(true)
		{
			for(the=0,i=0;the<=360;the+=5,i++)
			{	if(i==3)	i=0;
				g.setColor(c[i]);
				drawCircles(300,200,r,the,g);
				try
				{
					t.sleep(10);
				}
				catch(InterruptedException e)
				{}
				r++;
				
			}	
		}
*/		