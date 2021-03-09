
public class Koenig extends Figure{

	public Koenig(int[] position, int farbe) {
		super(position, farbe);
		isKing=true;
		Main.kingList[Farbe]=this;
		FileName[0]="rsc/KoenigW.jpg";
		FileName[1]="rsc/KoenigS.jpg";
		initPic();
	}

	@Override
	public boolean ValidMove(int[] a) {
		boolean valid=false;
		int i=1;
		//if(!InCheck(a)) {
			if(position[0]+i==a[0]&position[1]+i==a[1]) {
				valid=true;
			}
			
			if(position[0]-i==a[0]&position[1]-i==a[1]) {
				valid=true;
			}
			
			if(position[0]+i==a[0]&position[1]-i==a[1]) {
				valid=true;
			}
			
			if(position[0]-i==a[0]&position[1]+i==a[1]) {
				valid=true;
			}
			
			if(position[0]+i==a[0]&position[1]==a[1]) {
				valid=true;
			}
			if(position[0]-i==a[0]&position[1]==a[1]) {
				valid=true;
			}
			
			if(position[0]==a[0]&position[1]+i==a[1]) {
				valid=true;
			}
			
			if(position[0]==a[0]&position[1]-i==a[1]) {
				valid=true;
			}
			
		//}
		return valid;
	}

	
	public boolean InCheck(int[] a) {
		boolean InCheck=false;
		for(Figure next: Main.ttest) {
			if(next.Farbe!=Farbe) {
				//König darf sich nicht selbst aufrufen!
				if(!next.isKing) {
					if(next.ValidMove(a)) {
						System.out.println(next.FileName[next.Farbe]);
						InCheck=true;
						System.out.println("Du darfst nicht ins Schach ziehen!");
				
					}
				}
			}
		}
		return InCheck;
	}

	@Override
	public boolean Check(int[] KingsPos) {
		// TODO Auto-generated method stub
		return false;
	}

}
