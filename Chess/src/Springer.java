
public class Springer extends Figure{

	public Springer(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/PferdW.jpg";
		FileName[1]="rsc/PferdS.jpg";
		initPic();
	}

	@Override
	public boolean ValidMove(int[] a) {
		boolean valid=false;
		if(position[0]+2==a[0]&position[1]+1==a[1]) {
			valid=true;
		}
		if(position[0]+2==a[0]&position[1]-1==a[1]) {
			valid=true;
		}
		if(position[0]+1==a[0]&position[1]+2==a[1]) {
			valid=true;
		}
		if(position[0]-1==a[0]&position[1]+2==a[1]) {
			valid=true;
		}
		if(position[0]-2==a[0]&position[1]+1==a[1]) {
			valid=true;
		}
		if(position[0]-2==a[0]&position[1]-1==a[1]) {
			valid=true;
		}
		if(position[0]+1==a[0]&position[1]-2==a[1]) {
			valid=true;
		}
		if(position[0]-1==a[0]&position[1]-2==a[1]) {
			valid=true;
		}
		return valid;
	}

	@Override
	public boolean Check(int[] KingsPos) {
		// TODO Auto-generated method stub
		return false;
	}

}
