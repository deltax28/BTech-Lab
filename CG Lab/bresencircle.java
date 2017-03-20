import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class bresencircle extends Applet implements ActionListener
{
	Button b;	
	TextField t1,t2,t3;
	public void init()
	{	
		t1=new TextField(8);
		t2=new TextField(8);
		t3=new TextField(8);
		b=new Button("DRAW CIRCLE");
		add(t1);
		add(t2);
		add(t3);
		add(b);
		b.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		String s1,s2,s3;
		int xc,yc,r,x,y,rad,p;
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		xc=Integer.parseInt(s1);
		yc=Integer.parseInt(s2);
		rad=Integer.parseInt(s3);
		x=0;
		r=rad;
		p=1-r;
		CirclePlotPoints(xc,yc,x,r,g);
		while(x<r)
		{
			x++;
			if(p<0)
			p=p+(2*x)+1;
			else
			{
				r--;
				p=p+(2*(x-r))+1;
			}
			CirclePlotPoints(xc,yc,x,r,g);
		}
	}
	public void CirclePlotPoints(int xc,int yc,int x,int r,Graphics g)
	{
		g.drawString(".",Math.round(xc+x),Math.round(yc+r));
		g.drawString(".",Math.round(xc+x),Math.round(yc-r));
		g.drawString(".",Math.round(xc-x),Math.round(yc+r));
		g.drawString(".",Math.round(xc-x),Math.round(yc-r));
		g.drawString(".",Math.round(xc+r),Math.round(yc+x));
		g.drawString(".",Math.round(xc+r),Math.round(yc-x));
		g.drawString(".",Math.round(xc-r),Math.round(yc+x));
		g.drawString(".",Math.round(xc-r),Math.round(yc-x));
	} 
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
}
/*<applet code="bresencircle.class"
	Height=600
	Width=800>
</applet>
*/