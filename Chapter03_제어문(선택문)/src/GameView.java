import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
	Image back,bird;
	int x=20, y=560;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.jpg");
		bird=Toolkit.getDefaultToolkit().getImage("c;\\javaDev\\bird.gif");
		
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(bird,x,y,150,getHeight(),this);
	}
}
