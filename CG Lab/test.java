import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class test extends Applet
{
	Thread t;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);	
	}
	public void paint(Graphics g)
	{	Color a=new Color(0,153,255);
		g.setColor(Color.black);
		 int xBase   = 10;
        int top     = 10;
        int yScale  = 100;
        int xAxis   = 360;

        int yBase   = top + yScale;
        int x, y;

        // first draw the axis
        g.drawLine( xBase, top, xBase, top + 2*yScale );
        g.drawLine( xBase, yBase, xBase + xAxis, yBase );

        // now plot the graph
        g.setColor( Color.red );

        for( int i=0; i < xAxis; i++ )
        {   x = xBase + i;
            y = (int)( yBase - Math.sin( Math.toRadians(i) ) * yScale );
            // there's no drawPoint in java so draw a VERY short line
            g.drawLine( x, y, x, y );
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
		g.drawOval(c-r,d-r,2*r,2*r);
//		g.drawString(".",c,d);		
	}
}

/* <applet code="test.class" Height=600 Width=800>
	</applet>
*/

/* CIRCLE AND ITS POINTS
g.drawOval(200,200,200,200);
		g.setColor(Color.blue);
		g.drawString(".(200,200)",200,200);	//x,y
		g.drawString(".(300,200)",300,200);	//x+r,y
		g.drawString(".(200,300)",200,300);	//x,y+r
		g.drawString(".(300,300)",300,300); //x+r,y+r
		g.drawString(".(300,400)",300,400);	//x+r,y+2r
		g.drawString(".(400,300)",400,300);	//x+r,y+2r
		g.drawString(".(400,200)",400,200);	//x+2r,y;
		g.drawString(".(200,400)",200,400);	//x,y+2r;
		g.drawString(".(400,400)",400,400); //x+2r,y+2r;
*/		
/*
HYPNO WHEEL
		int the,r;
		g.setColor(Color.green);
		r=40;
		while(true)
		{
			for(the=0;the<=360;the+=5)
			{	drawCircles(400,300,r,the,g);
				try
				{
					t.sleep(10);
				}
				catch(InterruptedException e)
				{}
			}	
			r+=20;
		}
*/
/*		
PENDULUM
public void paint (Graphics g)
{
	int xc,yc,r=50,the;
	xc=x+r;
	yc=y+r;
	int val=1;
	for(the=0;the<=60;the+=val)	
	{	
		g.clearRect(0,0,800,600);
		g.setColor(Color.black);
		g.fillOval(x,y,2*r,2*r);	//Pivot Object 
		Pendulum(xc,yc,300,the,g);	//Draw bob and string
		if(the==60)
			val=-1;
		else if(the==-60)
			val=1;
		try
		{
			t.sleep(10);
		}
		catch(Exception e)
		{}
	}
}
public void Pendulum(int x,int y,int R,double t,Graphics g)
{	int r=30;
	t*=Math.PI/180;
	double a,b;
	a=x+R*(Math.sin(t));
	b=y+R*(Math.cos(t));
	int c=(int)a;
	int d=(int)b;
	g.drawLine(x,y,c,d);			//Pendulums String
	g.drawOval(c-r,d-r,2*r,2*r);	//Pendulums Bob
}	
*/
/*
CODE TO START ANIMATION WHEN MOUSE CLICKED
public class test extends Applet implements MouseListener
{
	int x,y;
	boolean mouseclick=false;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		mouseclick=true;
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{	}
	public void mouseEntered(MouseEvent me)
	{	}
	public void mouseReleased(MouseEvent me)
	{	}
	public void mouseExited(MouseEvent me)
	{	}
	public void paint (Graphics g)
	{	if(mouseclick){
				//PUT ANIMATION CODE INSIDE THIS 
		}
		
	}
}	
*/