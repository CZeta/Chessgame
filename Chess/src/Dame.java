
public class Dame  extends Figure{

	public Dame(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/DameW.jpg";
		FileName[1]="rsc/DameS.jpg";
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
