import java.util.ArrayList;

public class Main {
	static ArrayList<Figure> ttest;
	public static void main(String[] args) {
		//hashmap anlegen, figuren schlüssel ist die Poition, + object figur 
	System.out.println("HAllo Welt");
	new GUI();
	ttest=new ArrayList<>();
	int[] test= {1,1};
	int[] test2= {2,2};
	int[] test3= {3,3};
	int[] test4= {4,4};
	int[] test5= {5,5};
	int[] test6= {6,6};
	
	Turm t1=new Turm(test,1);
	Dame d1=new Dame(test2,0);
	Koenig k1=new Koenig(test3,1);
	Springer p1=new Springer(test4,0);
	Bauer b1=new Bauer(test5,1);
	ttest.add(t1);
	ttest.add(p1);
	ttest.add(b1);
	ttest.add(k1);
	ttest.add(d1);
	}

}
