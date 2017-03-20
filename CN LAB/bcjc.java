import java.io.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class bcjc extends JFrame
{
	JTextArea ta;
	Socket s;
	BufferedReader br;
	String st;
	
	public bcjc() throws Exception
	{
		try{
			setLayout(new FlowLayout(FlowLayout.LEFT));
			ta = new JTextArea(25,25);
			ta.setEditable(false);
			add(ta);
			setVisible (true);
			setSize(300,500);
			s=new Socket("localhost",8000);
			br= new BufferedReader(new InputStreamReader(s.getInputStream()));
			do{
				st=br.readLine();
				ta.append("\n"+st);
			}while(!st.equals("exit"));
		}
		catch (Exception e) {
		}
	}
	public static void main(String arg[]) throws Exception
	{
		try{
			bcjc bcc=new bcjc();
		}
		catch(Exception e) { }
	}
}

	
	
//getContentPane().	