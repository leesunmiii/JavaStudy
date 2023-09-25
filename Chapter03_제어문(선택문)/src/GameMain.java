import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame {
	GameView gv=new GameView();
	public GameMain()
	{
		add("Center",gv);
		setSize(1920, 1080);
		setVisible(true);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
	}

}
