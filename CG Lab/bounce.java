import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.Math;
import java.applet.*;
public class bounce extends Applet
{
	int i;
	Thread t;
	public void init()
	{
		t=new Thread();
	}

	public void paint(Graphics g)
	{	
		for(i=0;i<28;i++)
		{
		g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);
		/*g.drawLine(300,350,300,400);

		g.drawLine(300,400,350,400);
		g.drawLine(350,400,350,450);*/
		//g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawOval(105+i,180,20,20);
			try
			{
				t.sleep(25);
			}
			catch(InterruptedException e)
			{}
		}

		
		for(i=0;i<50;i++)
		{
		g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);


			g.drawOval(153,180+i,20,20);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}

		}

		for(i=0;i<30;i++)
		{
		g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);
		
		
		g.drawOval(170+i,230,20,20);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}

	}

		for(i=0;i<30;i++)
		{
			g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);


			g.drawOval(208,250+i,20,20);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}

}

		for(i=0;i<30;i++)
		{
			g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);


			g.drawOval(220+i,280,20,20);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}
}


		
		for(i=0;i<30;i++)
		{
			g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);


			g.drawOval(250,300+i,20,20);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}
	}


		for(i=0;i<300;i++)
		{
			g.clearRect(1+i,1,800,900);
		g.setColor(Color.blue);
		g.drawLine(100,200,150,200);
		g.drawLine(150,200,150,250);
	
		g.drawLine(150,250,200,250);
		g.drawLine(200,250,200,300);

		g.drawLine(200,300,250,300);
		g.drawLine(250,300,250,350);

		g.drawLine(250,350,700,350);


			g.drawOval(250+i,330,20,20);
			try
			{
				t.sleep(15);
			}
			catch(InterruptedException e)
			{}
	}
}
}
/*<applet code="bounce.class"
 	height=900
	width=900>
	</applet>
*/