import java.util.Scanner;

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
		Scanner in=new Scanner(System.in);
		String Eingabe;
		boolean valid=false;
		if(position[0]==a[0]&position[1]+richtung==a[1]) {
			//abfragen ob hier etwas steht, sonst schlägt er frontal
			if(!Main.figList.containsKey(Integer.toString(a[0])+","+Integer.toString(a[1]))) {
				
			
			
				valid=true;
				firstMove=false;
				if(a[1]==7*(Farbe)+1) {
					System.out.println("You get a Queen!");
					Eingabe=in.nextLine();
					verwandlung(Eingabe,a);
				
				}
			}
		}
		if(position[0]==a[0]&position[1]+2*richtung==a[1]&firstMove) {
			if(!Main.figList.containsKey(Integer.toString(a[0])+","+Integer.toString(a[1]))) {
				
				//creating a passed pawn to take
				int[] b= {a[0],position[1]+richtung};
				//String PassPosi=Integer.toString(b[0])+","+Integer.toString(b[1]);
				//EnPassPawn p9=new EnPassPawn(b,Farbe);
				Main.passedPawn[Farbe].position=b;
				
				valid=true;
				firstMove=false;
			}
		}
		if(position[0]+1==a[0]&position[1]+richtung==a[1]) {
			if(Main.figList.containsKey(Integer.toString(a[0])+","+Integer.toString(a[1]))) {
				if(Main.figList.get(Integer.toString(a[0])+","+Integer.toString(a[1])).Farbe!=MouseManager.AmZug) {
					valid=true;
					firstMove=false;
					if(a[1]==7*(Farbe)+1) {
						System.out.println("You get a Queen!");
						Eingabe=in.nextLine();
						verwandlung(Eingabe,a);
						
					}
				}
			}
			else if(Main.passedPawn[(Farbe+1)%2].position[0]==a[0]&Main.passedPawn[(Farbe+1)%2].position[1]==a[1]) {		
				int[] b= {0,0};
				Main.passedPawn[(Farbe+1)%2].position=b;
				valid=true;
				firstMove=false;
				
			}
		}
		if(position[0]-1==a[0]&position[1]+richtung==a[1]) {
			if(Main.figList.containsKey(Integer.toString(a[0])+","+Integer.toString(a[1]))) {
				if(Main.figList.get(Integer.toString(a[0])+","+Integer.toString(a[1])).Farbe!=MouseManager.AmZug) {
					valid=true;
					firstMove=false;
					if(a[1]==7*(Farbe)+1) {
						System.out.println("You get a Queen!");
						Eingabe=in.nextLine();
						verwandlung(Eingabe,a);
						
					}
				}
			}
			
			else if(Main.passedPawn[(Farbe+1)%2].position[0]==a[0]&Main.passedPawn[(Farbe+1)%2].position[1]==a[1]) {		
				int[] b= {0,0};
				Main.passedPawn[(Farbe+1)%2].position=b;
				valid=true;
				firstMove=false;
				
			}
		}
		
		return valid;
	}

	@Override
	public boolean Check(int[] KingsPos) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void verwandlung(String name,int[] a ) {
		if(name.equals("Queen")) {
			//Alten bauern entfernen
			Main.figList.remove(Integer.toString(position[0])+","+Integer.toString(position[1]));
			
			int[] potsDam= {position[0],position[1]};
			position[0]=0;
			position[1]=0;
			
			
			Dame d2=new Dame(potsDam,Farbe);
			Main.ttest.add(d2);
			Main.figList.put(Integer.toString(a[0])+","+Integer.toString(a[1]-richtung),d2);
			System.out.println(MouseManager.AmZug);
		}
		if(name.equals("Rook")) {
			//Alten bauern entfernen
			Main.figList.remove(Integer.toString(position[0])+","+Integer.toString(position[1]));
			int[] potsDam= {position[0],position[1]};
			position[0]=0;
			position[1]=0;
			
			
			Turm d2=new Turm(potsDam,Farbe);
			Main.ttest.add(d2);
			Main.figList.put(Integer.toString(a[0])+","+Integer.toString(a[1]-richtung),d2);
			System.out.println(MouseManager.AmZug);
		}
		if(name.equals("Knight")) {
			//Alten bauern entfernen
			Main.figList.remove(Integer.toString(position[0])+","+Integer.toString(position[1]));
			int[] potsDam= {position[0],position[1]};
			position[0]=0;
			position[1]=0;
			
			
			Springer d2=new Springer(potsDam,Farbe);
			Main.ttest.add(d2);
			Main.figList.put(Integer.toString(a[0])+","+Integer.toString(a[1]-richtung),d2);
			System.out.println(MouseManager.AmZug);
		}
		if(name.equals("Laeufer")) {
			//Alten bauern entfernen
			Main.figList.remove(Integer.toString(position[0])+","+Integer.toString(position[1]));
			int[] potsDam= {position[0],position[1]};
			position[0]=0;
			position[1]=0;
			
			
			Laeufer d2=new Laeufer(potsDam,Farbe);
			Main.ttest.add(d2);
			Main.figList.put(Integer.toString(a[0])+","+Integer.toString(a[1]-richtung),d2);
			System.out.println(MouseManager.AmZug);
		}
	}

}
