import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class dda extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2,t3,t4;
	public void init()
	{
		t1=new TextField(8);
		t2=new TextField(8);
		t3=new TextField(8);
		t4=new TextField(8);
		b= new Button("Draw");
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
		int xa,xb,ya,yb,dx,dy,steps,k;
		
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		s4=t4.getText();
		xa=Integer.parseInt(s1);
		ya=Integer.parseInt(s2);
		xb=Integer.parseInt(s3);
		yb=Integer.parseInt(s4);
		float xinc,yinc,x=xa,y=ya;
		dx=xb-xa;
		dy=yb-ya;
		if(Math.abs(dx)>Math.abs(dy))
		{	steps=Math.abs(dx);}
		else
		{	steps=Math.abs(dy);}
		
		xinc=dx/(float)steps;  
		yinc=dy/(float)steps;
		g.setColor(Color.blue);
		g.drawString(".",Math.round(x),Math.round(y));
		for(k=0;k<steps;k++)
		{
			x+=xinc;
			y+=yinc;
			g.drawString(".",Math.round(x),Math.round(y));
		}
	}
	public void actionPerformed(ActionEvent me)
	{
		repaint();
	}
}
/*<applet code="dda.class"
width=800
height=600>
</applet>
*/