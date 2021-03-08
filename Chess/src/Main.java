import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static ArrayList<Figure> ttest;
	static Map<String,Figure> figList;
	static EnPassPawn[] passedPawn=new EnPassPawn[2];
	public static void main(String[] args) {
		//hashmap anlegen, figuren schlüssel ist die Poition, + object figur 
	System.out.println("HAllo Welt");
	new GUI();
	ttest=new ArrayList<>();
	figList=new HashMap<>();
	initWGame();
	initSGame();
	
	int[] pos= {0,0};
	passedPawn[0]=new EnPassPawn(pos,0);
	passedPawn[1]=new EnPassPawn(pos,1);
	
	
	System.out.println(figList.get("1,1").FileName[0]);
	}
	
	public static void initWGame() {
		int[][] white=new int[16][2];
		for(int i=0;i<8;i++) {
			
			white[i][0]=i+1;
			white[i][1]=8;
		}
		
		
		for(int i=0;i<8;i++) {
			
			white[i+8][0]=i+1;
			white[i+8][1]=7;
			
		}

		Bauer pw1=new Bauer(white[8],0);
		Bauer pw2=new Bauer(white[9],0);
		Bauer pw3=new Bauer(white[10],0);
		Bauer pw4=new Bauer(white[11],0);
		Bauer pw5=new Bauer(white[12],0);
		Bauer pw6=new Bauer(white[13],0);
		Bauer pw7=new Bauer(white[14],0);
		Bauer pw8=new Bauer(white[15],0);
		
		
		
		Turm tw1=new Turm(white[0],0);
		Turm tw2=new Turm(white[7],0);
		Springer sw1=new Springer(white[1],0);
		Springer sw2=new Springer(white[6],0);
		Laeufer lw1=new Laeufer(white[2],0);
		Laeufer lw2=new Laeufer(white[5],0);
		Dame dw=new Dame(white[3],0);
		Koenig kw=new Koenig(white[4],0);
		ttest.add(tw1);
		ttest.add(tw2);
		ttest.add(sw1);
		ttest.add(sw2);
		ttest.add(lw1);
		ttest.add(lw2);
		ttest.add(dw);
		ttest.add(kw);
		ttest.add(pw8);
		ttest.add(pw7);
		ttest.add(pw6);
		ttest.add(pw5);
		ttest.add(pw4);
		ttest.add(pw3);
		ttest.add(pw2);
		ttest.add(pw1);
		
		
		
		
	}
	
	public static void initSGame() {
		int[][] white=new int[16][2];
		for(int i=0;i<8;i++) {
			
			white[i][0]=i+1;
			white[i][1]=1;
		}
		
		
		for(int i=0;i<8;i++) {
			
			white[i+8][0]=i+1;
			white[i+8][1]=2;
			
		}

		Bauer pw1=new Bauer(white[8],1);
		Bauer pw2=new Bauer(white[9],1);
		Bauer pw3=new Bauer(white[10],1);
		Bauer pw4=new Bauer(white[11],1);
		Bauer pw5=new Bauer(white[12],1);
		Bauer pw6=new Bauer(white[13],1);
		Bauer pw7=new Bauer(white[14],1);
		Bauer pw8=new Bauer(white[15],1);
		
		
		
		Turm tw1=new Turm(white[0],1);
		Turm tw2=new Turm(white[7],1);
		Springer sw1=new Springer(white[1],1);
		Springer sw2=new Springer(white[6],1);
		Laeufer lw1=new Laeufer(white[2],1);
		Laeufer lw2=new Laeufer(white[5],1);
		Dame dw=new Dame(white[3],1);
		Koenig kw=new Koenig(white[4],1);
		ttest.add(tw1);
		ttest.add(tw2);
		ttest.add(sw1);
		ttest.add(sw2);
		ttest.add(lw1);
		ttest.add(lw2);
		ttest.add(dw);
		ttest.add(kw);
		ttest.add(pw8);
		ttest.add(pw7);
		ttest.add(pw6);
		ttest.add(pw5);
		ttest.add(pw4);
		ttest.add(pw3);
		ttest.add(pw2);
		ttest.add(pw1);
		
		
	}

}
