import java.io.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class bcac extends Applet
{
	TextArea ta;
	Socket s;
	BufferedReader br;
	String st;
	
	public void init()
	{	
		try{
			setLayout(new FlowLayout(FlowLayout.LEFT));
		}
		catch(Exception e){}
		ta = new TextArea(25,25);
		add(ta);
		setVisible(true);
	
	}

	public void paint(Graphics g)
	{
		try{
			s=new Socket("localhost",3000);
			BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
			do{
				st=br.readLine();
				ta.append("\n"+st);
			}while(!st.equals("exit"));
		}
		catch(Exception e){
		}
		
	}
	
}

/*	<applet code="bcac.class" 
	height=400 
	width=400>
  	</applet>
*/	