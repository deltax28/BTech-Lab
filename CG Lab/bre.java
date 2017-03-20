import java.awt.*;
import java.applet.*;
import java.lang.Math.*;
import java.awt.event.*;
public class bre extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2,t3,t4;
	public void init()
	{
   
		t1=new TextField(8);
		t2=new TextField(8);
		t3=new TextField(8);
		t4=new TextField(8);
		b=new Button("Execute");
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b);
		b.addActionListener(this);
	}
    public void paint(Graphics g)
    {
		String s1,s2,s3,s4;
		int xa,xb,ya,yb,xend,x,y;
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		s4=t4.getText();
		xa=Integer.parseInt(s1);
		ya=Integer.parseInt(s2);
		xb=Integer.parseInt(s3);
		yb=Integer.parseInt(s4);
		int dx=Math.abs(xb-xa);
		int dy=Math.abs(yb-ya);
		int p=(2*dy-dx);
		g.setColor(Color.blue);
		if(xa<=xb)
		{  
			x=xa;
			y=ya;
			xend=xb;
		}
		else
		{
			x=xb;
			y=yb;
			xend=xa;
		}
		g.drawString(".",Math.round(x),Math.round(y));
		while(x<xend)
		{
			x++;
			if(p<0)
			p=p+(2*dy); 
			else
			{ 
				y++; 
				p=p+2*(dy-dx);
			} 
			g.setColor(Color.blue);
			g.drawString(".",Math.round(x),Math.round(y));
		}
     
	}
	public void actionPerformed(ActionEvent me)
	{
		repaint();
	}
}
/*<applet code="bre.class"
width=800
height=600>
</applet>
*/

/*
import java.awt.*;
import java.applet.*;
import java.lang.Math.*;
import java.awt.event.*;
public class bres extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2,t3,t4;
	public void init()
	{
   
		t1=new TextField(8);
		t2=new TextField(8);
		t3=new TextField(8);
		t4=new TextField(8);
		b=new Button("Execute");
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b);
		b.addActionListener(this);
	}
    public void paint(Graphics g)
    {
		String s1,s2,s3,s4;
		int xa,xb,ya,yb,xend,x,y;
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		s4=t4.getText();
		xa=Integer.parseInt(s1);
		ya=Integer.parseInt(s2);
		xb=Integer.parseInt(s3);
		yb=Integer.parseInt(s4);
		int dx=Math.abs(xb-xa);
		int dy=Math.abs(yb-ya);
		int p=(2*dy-dx);
		g.setColor(Color.blue);
		if(xa<=xb)
		{  
			x=xa;
			y=ya;
			xend=xb;
		}
		else
		{
			x=xb;
			y=yb;
			xend=xa;
		}
		g.drawString(".",Math.round(x),Math.round(y));
		for(int i=0;i<=dx;i++)
		{
			x++;
			if(p<0)
			p=p+(2*dy); 
			else
			{ 
				y++; 
				p=p+2*(dy-dx);
			} 
			g.drawString(".",Math.round(x),Math.round(y));
		}
     
	}
	public void actionPerformed(ActionEvent me)
	{
		repaint();
	}
}
/*<applet code="bres.class"
width=800
height=600>
</applet>
*/
    
   
   
  
              
   
   
  
          