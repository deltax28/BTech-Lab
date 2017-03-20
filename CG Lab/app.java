import java.awt.*;
import java.applet.*;

public class app extends Applet{
	public void init()
	{
		setBackground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.drawLine(100,50,120,150);
	}
}

/*<applet code="app.class"
Height =700
Width=800>
</applet>
*/