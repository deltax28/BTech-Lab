import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class car extends Applet 
{

	Thread t;
	public void init()
	{
		t=new Thread();
		setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		int i=0;
		while(i<=700)
		{
		i++;
		g.clearRect(10+i,10,700,700);
		g.setColor(Color.black);
		g.fillRect(200+i,40,50,40); 
		g.fillRect(450+i,40,50,40); 
		g.setColor(Color.red);
		g.drawLine(150+i,100,180+i,20);
		g.drawLine(180+i,20,520+i,20);
		g.drawLine(520+i,20,550+i,100);
		g.drawRect(100+i,100,500,100);
		g.fillOval(150+i,200,65,65);
		g.fillOval(520+i,200,65,65);
		try
		{
			t.sleep(10);
		}
		catch(InterruptedException e)
		{}
		if(i==700)
			i=0;
		}
	}
}
/*<applet code="car.class"
       Height=700
       Width=800>
       </applet>
         */

