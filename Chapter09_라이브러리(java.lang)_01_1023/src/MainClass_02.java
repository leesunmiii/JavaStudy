import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass_02 extends JFrame implements ItemListener {
	JComboBox box=new JComboBox();
	public MainClass_02()
	{
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		
		add("North",box);
		setSize(300,150);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_02();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=box.getSelectedItem().toString(); // 여기서 toString을 왜 썼을까 이런 궁금증을 가져라
			System.out.println(name);
		}
	}

}
