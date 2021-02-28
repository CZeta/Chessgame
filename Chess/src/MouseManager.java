import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseManager implements MouseListener{
	boolean figurgewaelt=false;

	@Override
	public void mouseClicked(MouseEvent e) {
		if(!figurgewaelt) {
			// erkenne wo geklickt wurde
			// suche die dazugehörige Figut
			// wenn sie nicht gefunden wurde mach nichts weiter
			//wenn doch figurgewaelt=true
		}
		else {
			//erkenne wo geklicht wurde
			//bewege nach validieren
			//setze figurgew. wieder zurück
		}
		System.out.println("("+ e.getX()+","+e.getY()+")");
		
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

}
