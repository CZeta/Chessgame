
public class Turm extends Figure{

	public Turm(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/TurmW.jpg";
		FileName[1]="rsc/TurmS.jpg";
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
