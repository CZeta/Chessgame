
public class Laeufer extends Figure{
	
	
	
	public Laeufer(int[] position, int Farbe) {
		super( position, Farbe);
		FileName[0]="rsc/laeuferW.jpg";
		FileName[1]="rsc/laeuferS.jpg";
		initPic();
	}

	@Override
	public boolean ValidMove(int[] a) {
		boolean valid=false;
		for(int i=1;i<8;i++) {
			if(position[0]+i==a[0]&position[1]+i==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0]+i)+","+Integer.toString(position[1]+i))) {
				break;
			}
		}
		for(int i=1;i<8;i++) {
			if(position[0]-i==a[0]&position[1]-i==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0]-i)+","+Integer.toString(position[1]-i))) {
				break;
			}
		}
		for(int i=1;i<8;i++) {
			if(position[0]+i==a[0]&position[1]-i==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0]+i)+","+Integer.toString(position[1]-i))) {
				break;
			}
		}
		for(int i=1;i<8;i++) {
			if(position[0]-i==a[0]&position[1]+i==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0]-i)+","+Integer.toString(position[1]+i))) {
				break;
			}
		}
		return valid;
	}

	@Override
	public boolean Check(int[] KingsPos) {
		// TODO Auto-generated method stub
		return false;
	}

}
