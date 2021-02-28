
public class Laeufer extends Figure{
	
	
	
	public Laeufer(int[] position, int Farbe) {
		super( position, Farbe);
		FileName[0]="rsc/laeuferW.png";
		FileName[1]="rsc/laeuferS.png";
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
