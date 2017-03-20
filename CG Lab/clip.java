import java.awt.*;
import java.applet.*;
import java.lang.Math.*;
import java.awt.event.*;
public class clip extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2,t3,t4;
	public void init()
	{
   
		t1=new TextField(8);
		t2=new TextField(8);
		t3=new TextField(8);
		t4=new TextField(8);
		b=new Button("EXECUTE");
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b);
		b.addActionListener(this);
	}
    public void paint(Graphics g)
    {
		int xa,xb,ya,yb,dx,dy,top,bottom,left,right;
		xa=Integer.parseInt(t1.getText());
		ya=Integer.parseInt(t2.getText());
		xb=Integer.parseInt(t3.getText());
		yb=Integer.parseInt(t4.getText());
		dx=Math.abs(xb-xa);
		dy=Math.abs(yb-ya);
		top=200;
		bottom=600;
		left=100;
		right=500;
		
		g.drawRect(200,100,400,400);	//Clip Window
		if(dx==0)		//Vertical Lines Case
		{
			ya=top;
			yb=bottom;
		}
		else if(dy==0)	//Horizontal Line Case
		{
			xa=left;
			xb=right;
		}
		else
		{
	//		g.drawString("ROFL :P",300,300);
		}
		
		g.setColor(Color.blue);
		g.drawLine(xa,ya,xb,yb);
	}
	public void actionPerformed(ActionEvent me)
	{
		repaint();
	}
}
/*<applet code="clip.class"
width=800
height=600>
</applet>
*/