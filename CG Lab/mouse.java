import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class mouse extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
	TextField t1,t2;
	public void init()
	{
		t1=new TextField(8);
		t2=new TextField(8);
		add(t1);
		add(t2);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		String s1,s2;
		s1=String.valueOf(x);
		s2=String.valueOf(y);
		t1.setText(s1);
		t2.setText(s2);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
		setBackground(Color.black);
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		setBackground(Color.blue);
	}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.green);
	}
	public void mouseReleased(MouseEvent me)
	{
		setBackground(Color.gray);
	}
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.red);
	}
}
/*<applet code="mouse.class"
width=800
height=600>
</applet>
*/