
public class Koenig extends Figure{

	public Koenig(int[] position, int farbe) {
		super(position, farbe);
		FileName[0]="rsc/KoenigW.jpg";
		FileName[1]="rsc/KoenigS.jpg";
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
		for(int i=1;i<8;i++) {
			if(position[0]+i==a[0]&position[1]==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0]+i)+","+Integer.toString(position[1]))) {
				break;
			}
		}
		for(int i=1;i<8;i++) {
			if(position[0]-i==a[0]&position[1]==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0]-i)+","+Integer.toString(position[1]))) {
				break;
			}
		}
		for(int i=1;i<8;i++) {
			if(position[0]==a[0]&position[1]+i==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0])+","+Integer.toString(position[1]+i))) {
				break;
			}
		}
		for(int i=1;i<8;i++) {
			if(position[0]==a[0]&position[1]-i==a[1]) {
				valid=true;
			}
			else if(Main.figList.containsKey(Integer.toString(position[0])+","+Integer.toString(position[1]-i))) {
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
