import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class clipping extends Applet implements ActionListener
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
int x1,y1,x2,y2;
s1=t1.getText();
s2=t2.getText();
s3=t3.getText();
s4=t4.getText();
x1=Integer.parseInt(s1);
y1=Integer.parseInt(s2);
x2=Integer.parseInt(s3);
y2=Integer.parseInt(s4);
g.drawRect(100,100,400,400);
int top,bottem;
if(x1=x2)
{
if(y1<top)
y1=top;


}
public void actionPerformed(ActionEvent me)
{
repaint();
}
}
/*<applet code="clipping.class"
            Height=700
            Width=800>
            </applet>
             */
