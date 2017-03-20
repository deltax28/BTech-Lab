import java.io.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class bcas extends Applet implements ActionListener
{
	TextArea ta;
	TextField tf;
	Button b;
	String st;
	
	ServerSocket ss;
	Socket s[]=new Socket[10];
	PrintWriter pw; 
	
	public void init()
	{	try{
			setLayout(new FlowLayout(FlowLayout.LEFT));
		}
		catch(Exception e){}
		tf=new TextField(8);
		ta = new TextArea(25,25);
		b=new Button("Send");
		add(tf);
		add(b);
		b.addActionListener(this);
		add(ta);
		setVisible(true);
		
		try{
		ss=new ServerSocket(3000);
		for (int i=0;i<4;i++)
			s[i]=ss.accept();
		}
		catch (Exception e){
		}
		
	}
	public void paint(Graphics g)
	{
		
	}
	public void actionPerformed(ActionEvent ex)
	{		st=tf.getText();
			ta.append("\nServer::"+st);
			try{
			
			for (int i=0;i<4;i++)
			{
				pw=new PrintWriter(s[i].getOutputStream(),true);
				pw.println(st);
			}
		}
		catch (Exception e) {
		}
	}
}

/*	<applet code="bcas.class" 
	height=600 
	width=800>
  	</applet>
*/	