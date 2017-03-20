import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class bresenhams extends Applet implements ActionListener
{
	Button b;	
	TextField t1,t2,t3,t4;
	public void init()
	{	
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		b=new Button("DRAW LINE");
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
		int dx,dy,xend,yend,p,xa,xb,ya,yb,x,y,z;
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		s4=t4.getText();
		xa=Integer.parseInt(s1);
		xb=Integer.parseInt(s3);
		ya=Integer.parseInt(s2);
		yb=Integer.parseInt(s4);
		dx=Math.abs(xb-xa);
		dy=Math.abs(yb-ya);
		p=(2*dy)-dx;
		if(xa>xb)
		{       
			x=xb;
			y=yb;
			xend=xa;
			yend=ya;
		}
		else
		{         
			x=xa;
			y=ya;
			xend=xb;
			yend=yb;
		}
		g.drawString(".",Math.round(x),Math.round(y));
		if(dx==0)
               	{
                		while(y<yb)
			{	
				y++;
				g.drawString(".",Math.round(x),Math.round(y));
			}
                    }
		if(yend>=y)
                	{
                		while(x<xend)
                 		{
               			 x++;
                			if(p<0)
                  			p=p+2*dy;
                  			else
                			{
                   				y++;
              			 	p=p+2*(dy-dx);
               			} 
              			g.drawString(".",Math.round(x),Math.round(y));
	     		}
               	 }
                	else
                	while(yend<y)
                	{
               		x++;
               		if(p<0)
               		p=p+2*dy;
                 		else
            		{
            			y--;
         				p=p+2*(dy-dx);
              			g.drawString(".",Math.round(x),Math.round(y));
           		}
           	}
     	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
}
/*<applet code="bresenhams.class"
	Height=800
	Width=900>
</applet>
*/