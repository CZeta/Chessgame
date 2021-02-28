import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GUI  {
	public GUI() {
	JFrame myframe=new JFrame();
	myframe.setVisible(true);
	myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	myframe.setSize(615, 640);
	
	Lable lbl1=new Lable();
	lbl1.setVisible(true);
	lbl1.setBounds(0,0,640,640);
	
	myframe.add(lbl1);
	}
}
