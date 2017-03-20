import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Math.*;

public class volcano extends Applet
{
	Thread t;
	int x[]={300,400,450,500,600,300};
	int y[]={500,200,230,200,500,500};
	int  n=6;
	int i,j;
	public void init()
	{
		t=new Thread();
		setBackground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.black);
			g.fillPolygon(x,y,n);
			
		for(i=0;i<270;i++)
		{	
			
			//g.clearRect(1+i,1,800,800);

			//g.setColor(Color.black);
			//g.fillPolygon(x,y,n);
			g.setColor(Color.red);
			g.drawLine(448,500-i,452,500-i);
			
			//g.setColor(Color.red);
			try
			{
				t.sleep(10);
			}
			
			catch(InterruptedException e)
			{
			}
		}
		
		if(i==270)
		{
			for(i=0;i<40;i++)
			{
				g.setColor(Color.red);
				g.drawLine(430-i,230-i,470+i,230-i);
				//
				try
			{
				t.sleep(10);
			}
			
			catch(InterruptedException e)
			{
			}
		}}
		
		
		for(j=0;j<300;j++)
		{
			g.setColor(Color.red);
			g.drawLine(500,200+j,504+j,193+j);
			g.setColor(Color.red);
			g.drawLine(400,200+j,396-j,193+j);
			/*try
			{
				t.sleep(10);
			}
			
			catch(InterruptedException e)
			{
			}*/
			try
			{
				t.sleep(10);
			}
			
			catch(InterruptedException e)
			{
			}
		}
		
		/*for(j=0;j<300;j++)
		{
			
		}*/
	}
}
/* <applet code="volcano.class"
	height=900
	width=900>
	</applet>
*/