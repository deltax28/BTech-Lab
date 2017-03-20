import java.awt.*;                                          
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class mpcircle extends Applet implements ActionListener
{
 Button b;
 TextField t1,t2,t3;
public void init()
{
    t1=new TextField(8);
    t2=new TextField(8);
    t3=new TextField(8);
    b=new Button("EXECUTE");
         add(t1);
         add(t2);
         add(t3);
         add(b);
  b.addActionListener(this);
}
public void paint(Graphics g)
{
       String s1,s2,s3;
       int xcentre,ycentre,radius,x,r,p;
       s1=t1.getText();
       s2=t2.getText();
       s3=t3.getText();
       xcentre=Integer.parseInt(s1);
       ycentre=Integer.parseInt(s2);
       radius=Integer.parseInt(s3);
       x=0;
       r=radius;
       p=1-r;
       circleplotpoints(xcentre,ycentre,x,r,g);
       while(x<r)
{
x++;
if(p<0)
p=p+2*x+1;
else
{
r--;
p=p+2*x-2*r+1;
}
circleplotpoints(xcentre,ycentre,x,r,g);
}
}

public void circleplotpoints(int xcentre,int ycentre,int x,int r,Graphics g)
{
g.drawString(".",Math.round(xcentre+x),Math.round(ycentre+r)); 
g.drawString(".",Math.round(xcentre+x),Math.round(ycentre-r)); 
g.drawString(".",Math.round(xcentre-x),Math.round(ycentre+r)); 
g.drawString(".",Math.round(xcentre-x),Math.round(ycentre-r)); 
g.drawString(".",Math.round(xcentre+r),Math.round(ycentre+x)); 
g.drawString(".",Math.round(xcentre+r),Math.round(ycentre-x)); 
g.drawString(".",Math.round(xcentre-r),Math.round(ycentre+x)); 
g.drawString(".",Math.round(xcentre-r),Math.round(ycentre-x)); 
}
public void actionPerformed(ActionEvent me)
  {
     repaint();
  }
}
/*<applet code="mpcircle.class"
Height=700
Width=800>
</applet>
*/