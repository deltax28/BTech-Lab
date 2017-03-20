import java.awt.*;                                          
import java.applet.*;
import java.awt.event.*;
import java.lang.Math.*;
public class mpellipse extends Applet implements ActionListener
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
       String s1,s2,s3,s4;
       int xcentre,ycentre,rx,ry;
       s1=t1.getText();
       s2=t2.getText();
       s3=t3.getText();
       s4=t4.getText(); 
       xcentre=Integer.parseInt(s1);
       ycentre=Integer.parseInt(s2);
       rx=Integer.parseInt(s3);
       ry=Integer.parseInt(s4);
       int rx2=rx*rx;
       int ry2=ry*ry;
       int tworx2=2*rx2;
       int twory2=2*ry2;
       int x=0,y=ry;
       long p;
       int px=0,py=tworx2*y;
            ellipseplotpoints(xcentre,ycentre,rx,ry,g);
      p=Math.round(ry2-(rx2*ry)+(0.25*rx2));
          while(px<py)
          {
             x++;
             px=px+twory2;
                if(p<0)
                   p+=ry2+px;
               else
               {
                   y--;
                   py-=tworx2;
                   p+=ry2+px-py;
               }
    ellipseplotpoints(xcentre,ycentre,x,y,g);
}
    p=Math.round(ry2*(x+0.5)*(x+0.5)+rx2*(y-1)*(y-1)-rx2*ry2);
      while(y>0)
      {
         y--;
         py=py-tworx2;
            if(p>0)
               p+=rx2-py;
           else
          {
               x++;
               px+=twory2;
               p+=rx2-py+px;
           }
    ellipseplotpoints(xcentre,ycentre,x,y,g);
     }
}
public void ellipseplotpoints(int xcentre,int ycentre,int x,int y,Graphics g)
{
    g.drawString(".",Math.round(xcentre+x),Math.round(ycentre+y)); 
   g.drawString(".",Math.round(xcentre+x),Math.round(ycentre-y)); 
  g.drawString(".",Math.round(xcentre-x),Math.round(ycentre+y)); 
  g.drawString(".",Math.round(xcentre-x),Math.round(ycentre-y));  
}
public void actionPerformed(ActionEvent me)
  {
     repaint();
  }
}
/*<applet code="mpellipse.class"
Height=700
Width=800>
</applet>
*/



/*10:54 AM 1/31/2013*/