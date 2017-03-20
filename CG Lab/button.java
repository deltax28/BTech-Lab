import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class button extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2;
	public void init()
	{
		t1=new TextField(8);
		t2=new TextField(8);
		b= new Button("Add");
		add(t1);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		String s1,s2,s3;
		int x,y,z;
		s1=t1.getText();
		s2=t2.getText();
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x+y;
		s3=String.valueOf(z);
		g.drawString(s3,400,300);
	}
	public void actionPerformed(ActionEvent me)
	{
		repaint();
	}
}
/*<applet code="button.class"
width=800
height=600>
</applet>
*/