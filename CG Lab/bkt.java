import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;

public class bkt extends Applet
{

	Thread t;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		g.drawLine(300,300,300,500);
		g.drawLine(450,300,450,500);
		g.drawLine(300,500,450,500);
		g.drawLine(200,180,375,180);
		g.drawLine(200,200,375,200);
		g.drawRect(350,135,70,20);
		g.drawLine(375,155,375,230);
		g.drawLine(390,155,390,230);
		g.drawLine(375,230,390,230);
		
		int i;

		for(i=0;i<270;i++)
		{
			g.setColor(Color.cyan);
			g.drawLine(380,230+i,385,230+i);

			try
			{
				t.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}
		if(i==270)
		{
			for(int j=0;j<130;j++)
			{
				g.drawLine(300,500-j,450,500-j);
				try
				{
					t.sleep(10);
				}
				catch(InterruptedException e)
				{}
			}
		}
	}
}
/*<applet code="bkt.class"
     Height=900
Width=900>
</applet>
*/