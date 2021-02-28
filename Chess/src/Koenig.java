
public class Koenig extends Figure{

	public Koenig(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/KoenigW.jpg";
		FileName[1]="rsc/KoenigS.jpg";
		initPic();
	}

	@Override
	public boolean ValidMove(int[] a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Check(int[] KingsPos) {
		// TODO Auto-generated method stub
		return false;
	}

}
