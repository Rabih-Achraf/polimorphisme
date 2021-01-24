
public class Main {
	public static void main(String[] args) {
		
		TechnecienDev dv1 = new TechnecienDev(3000.5,"Achraf","Rabih");
		TechnecienDev dv2 = new TechnecienDev(3060.5,"Oussama","Rabih");
		
		
		//System.out.println(dv1.toString());
		
		//System.out.println(dv1.equals(dv2));

		// Polimorphisme
		
		TechnecienDev tv = new TechnecienDev(300.4,"ali","taha");
		TechnecienRes tr = new TechnecienRes("tdt","mohamed","bahri");
		
		Technecien T[] = {tv,tr};
		
		for (int i = 0; i < T.length; i++) {
			T[i].afficher();
		}
		
	}
}
