import java.awt.image.BufferedImage;

abstract class Figure {
int[] position=new int[2];
int Farbe;
static BufferedImage[] bild=new BufferedImage[2];

public abstract boolean ValidMove(int[] a);
public abstract boolean Check(int[] KingsPos);

public void Move(int[] a) {
	if (ValidMove(a)) {
		position[0]=a[0];
		position[1]=a[1];
	}
}
public void geschlagen() {
	bild[0]=null;
	bild[1]=null;
	position[0]=99;
	position[1]=99;
}

}
