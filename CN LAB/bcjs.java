import java.io.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class bcjs extends JFrame implements ActionListener
{
	ServerSocket ss;
	Socket s[]=new Socket[10];
	PrintWriter pw ;
	JTextArea ta;
	JTextField tf;
	JButton b;
	String st;

	public bcjs() throws Exception
	{
		try{
			setLayout(new FlowLayout(FlowLayout.LEFT));
			ta = new JTextArea(25,25);
			ta.setEditable(false);
			add(ta);
			tf=new JTextField(25);
			add(tf);
			b=new JButton("Send");
			add(b);
			b.addActionListener(this);
			setVisible (true);
			setSize(300,500);
			setTitle("Server");
			ss=new ServerSocket(8000);

			for (int i=0;i<4;i++)
				s[i]=ss.accept();
			
		}
		catch (Exception e){
		}
	}
	public void actionPerformed(ActionEvent ex)
	{
		if(ex.getSource()==b)
		{
			try{
				st=tf.getText();
				ta.append("\nServer::"+st);
				for (int i=0;i<4;i++)
				{
					PrintWriter pw=new PrintWriter(s[i].getOutputStream(),true);
					pw.println(st);
				}
			}
			catch (Exception e) {
			}
		}
	}
	public static void main(String arg[]) throws Exception
	{
		try{
			bcjs bs=new bcjs();
		}
		catch(Exception e) { }
		
	}
}

