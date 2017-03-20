import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
import java.lang.Math.*;

public class ball extends Applet
{	
	int i;
	Thread t;
	public void init()
	{
		t=new Thread();
		setBackground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		for(i=0;i<200;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,500-i,30,30);
			try
			{
				t.sleep(5);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<200;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,301+i,30,30);
			try
			{
				t.sleep(5);
			}
			catch(InterruptedException e)
			{}
		}	
	
		for(i=0;i<100;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,500-i,30,30);
			try
			{
				t.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<100;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,401+i,30,30);
			try
			{
				t.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<50;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,500-i,30,30);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<50;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,450+i,30,30);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}
		}	

		for(i=0;i<20;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,500-i,30,30);
			try
			{
				t.sleep(20);
			}
			catch(InterruptedException e)
			{}
		}	

		for(i=0;i<20;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,480+i,30,30);
			try
			{
				t.sleep(20);
			}
			catch(InterruptedException e)
			{}
		}

		
		for(i=0;i<10;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,500-i,30,30);
			try
			{
				t.sleep(20);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<10;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,490+i,30,30);
			try
			{
				t.sleep(20);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<4;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,500-i,30,30);
			try
			{
				t.sleep(20);
			}
			catch(InterruptedException e)
			{}
		}

		for(i=0;i<4;i++)
		{
			g.clearRect(1,1+i,800,800);
			g.drawLine(100,530,200,530);
			g.fillOval(100,496+i,30,30);
			try
			{
				t.sleep(20);
			}
			catch(InterruptedException e)
			{}
		}										
				


	}
}
/* <applet code="ball.class"
	height=900
	width=900>
</applet>
*/ 