
public class Bauer extends Figure{

	public Bauer(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/BauerW.png";
		FileName[1]="rsc/BauerS.png";
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
