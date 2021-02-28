
public class Springer extends Figure{

	public Springer(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/PferdW.jpg";
		FileName[1]="rsc/PferdS.jpg";
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
