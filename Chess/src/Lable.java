import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Lable extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage board;
	
	public Lable(){
		try {
			board=ImageIO.read(new File("rsc/Board.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	protected  void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(board, 0, 0,600,600, null);
		g.drawImage(Main.ttest.get(0).bild,0,0,40,40,null);
		
		repaint();
	}
}
