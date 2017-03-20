import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Math.*;
public class tennis extends Applet
{	int i;
	Thread t;
	public void init()
	{
		t=new Thread();
	}

	public void paint(Graphics g)
	{
		for(i=0;i<150;i++)
		{
			g.clearRect(100+i,100,700,700);
			g.drawOval(100+i,450-i,20,20);
			try
			{
				t.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}
		
		for(i=0;i<50;i++)
		{
			g.clearRect(100+i,100,700,700);
			g.drawOval(250+i,300,20,20);
			try
			{
				t.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}
		for(i=0;i<100;i++)
		{
			g.clearRect(100+i,100,700,700);
			g.drawOval(450+i,300+i,20,20);
			try
			{
				t.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
/*<applet code="tennis.class"
 	height=900
	width=900>
	</applet>
*/