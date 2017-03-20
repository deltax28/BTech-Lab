import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class App extends Applet implements ActionListener
{
	TextField t;
	Button b;
	public void init()
	{
		t=new TextField(8);
		b=new Button("OK");
		add(t);
		add(b);
		b.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		String s; 
		s=t.getText();
		g.drawString(s,300,400);
	}
	public void actionPerformed(ActionEvent e)
	{
  		repaint();
	}
}
		
/*	<applet code="App.class" 
	height=600 
	width=800>
  	</applet>
*/    	
		