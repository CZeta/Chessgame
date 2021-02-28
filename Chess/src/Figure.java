import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Figure {
	
	int[] position=new int[2];
	int Farbe;
	BufferedImage bild;
	String[] FileName=new String[2];
	
	
	public Figure(int[] position, int farbe) {
		this.position=position;
		this.Farbe=farbe;
		
	}
	
	public void initPic() {
		try {
			bild=ImageIO.read(new File(FileName[Farbe]));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract boolean ValidMove(int[] a);
	
	public void Move(int[]a) {
		if(ValidMove(a)) {
			position[0]=a[0];
			position[1]=a[1];
		}
	}
	
	public void geschlagen() {
		
	}
	
	public abstract boolean Check(int[] KingsPos);
	
}
