import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class bresenelipse extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2,t3,t4;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		b=new Button("DRAW ELIPSE");
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
		int xc,yc,rx,ry,px,py,y1,y2,rx2,ry2,trx2,try2,y,x;
		long p;
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		s4=t4.getText();
		xc=Integer.parseInt(s1);
		yc=Integer.parseInt(s2);
		rx=Integer.parseInt(s3);
		ry=Integer.parseInt(s4);
		rx2=rx*rx;
		ry2=ry*ry;
		trx2=2*rx2;
		try2=2*ry2;
		x=0;
		y=ry;
		px=0;
		py=(trx2*trx2)*y;
		ElipsePlotPoints(xc,yc,x,y,g);
		p=Math.round(ry2-(rx2*ry)+(0.25*rx2));
		while(px<py)
		{
			x++;
			px=px+try2;
			if(p<0)
			p+=ry2+px;
			else
			{
				y--;
				px+=try2;
				p+=rx2-py+px;
			}
			ElipsePlotPoints(xc,yc,x,y,g);
		}
	}
	public void ElipsePlotPoints(int xc,int yc,int x,int y,Graphics g)
	{
		g.drawString(".",Math.round(xc+x),Math.round(yc+y));
		g.drawString(".",Math.round(xc+x),Math.round(yc-y));
		g.drawString(".",Math.round(xc-x),Math.round(yc+y));
		g.drawString(".",Math.round(xc-x),Math.round(yc-y));
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
}
/*<applet code="bresenelipse.class"
	Height=800
	Width=900>
</applet>
*/
			

			
		