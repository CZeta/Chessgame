
public class Bauer extends Figure{
	boolean firstMove=true;
	int richtung;

	public Bauer(int[] position, int farbe) {
		super(position, farbe);
		richtung=farbe*2-1;
		FileName[0]="rsc/BauerW.jpg";
		FileName[1]="rsc/BauerS.jpg";
		initPic();
	}

	@Override
	public boolean ValidMove(int[] a) {
		boolean valid=false;
		if(position[0]==a[0]&position[1]+richtung==a[1]) {
			valid=true;
			firstMove=false;
		}
		if(position[0]==a[0]&position[1]+2*richtung==a[1]&firstMove) {
			valid=true;
			firstMove=false;
		}
		
		
		return valid;
	}

	@Override
	public boolean Check(int[] KingsPos) {
		// TODO Auto-generated method stub
		return false;
	}

}
