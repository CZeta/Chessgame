import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseManager implements MouseListener{
	boolean figurgewaelt=false;
	String recentKey;
	static int AmZug=0;

	@Override
	public void mouseClicked(MouseEvent e) {
		if(!figurgewaelt) {
			// erkenne wo geklickt wurde
			recentKey=getKey(e);
			// suche die dazugehörige Figut
			if(Main.figList.containsKey(recentKey)) {
				if(Main.figList.get(recentKey).Farbe==AmZug) {
			// wenn sie nicht gefunden wurde mach nichts weiter
			//wenn doch figurgewaelt=true
					figurgewaelt=true;
				}
				else {
					System.out.println("Du bist nicht am Zug!");
				}
			}
		}
		else {
			//erkenne wo geklicht wurde
			//bewege nach validieren
			if(Main.figList.get(recentKey).ValidMove(getKoordinates(e))) {
				System.out.println("Hat er erkannt");
			
			//setze figurgew. wieder zurück
				if(Main.figList.containsKey(getKey(e))) {
					if(AmZug==Main.figList.get(getKey(e)).Farbe){
						figurgewaelt=false;
					}
					else{
					//hit
						int[] ext={0,0};
						Main.figList.get(getKey(e)).position= ext;
						Main.figList.remove(getKey(e));
					// muss auch aus ArryList entfernt werden...
						Main.figList.get(recentKey).position=getKoordinates(e);
					
						Main.figList.put(getKey(e), Main.figList.get(recentKey));
						Main.figList.remove(recentKey);
						AmZug=(AmZug+1)%2;
						figurgewaelt=false;	
					}
				}
		
				else {
					Main.figList.get(recentKey).position=getKoordinates(e);
			
					Main.figList.put(getKey(e), Main.figList.get(recentKey));
					Main.figList.remove(recentKey);
					AmZug=(AmZug+1)%2;
					figurgewaelt=false;
				}
			}
			else {
				figurgewaelt=false;
				System.out.println("Dieser Zug ist ungültig");
			}
		}
		System.out.println("("+ e.getX()+","+e.getY()+")");
		System.out.println("("+getKoordinates(e)[0]+","+getKoordinates(e)[1]);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public int[] getKoordinates(MouseEvent e) {
		int[] newK=new int[2]; 
		newK[0]= (int) ( ((e.getX()-8)-(e.getX()-8)%75)/75.0)+1;
		newK[1]=(int) (((e.getY()-30)-(e.getY()-30)%75)/75.0)+1;
		return newK;
	}
	public String getKey(MouseEvent e) {
		return Integer.toString(getKoordinates(e)[0])+","+Integer.toString(getKoordinates(e)[1]);
	}
}
