
public class TechnecienRes extends Technecien {

	private String niveau;
	
	// get - set

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	
	
	
	// constricteur
	
	public TechnecienRes() {
		super();
	}

	public TechnecienRes(String niveau,String nom, String prenom) {
		super(nom,prenom);
		this.niveau = niveau;
	}

	
	
	// Tostring
	
	@Override
	public String toString() {
		return "TechnecienRes [niveau=" + niveau + ", toString()=" + super.toString() + "]";
	}


	// Equals
	
	@Override
	public boolean equals(Object obj) {
		TechnecienRes R = (TechnecienRes) obj;
		return super.equals(R) && this.niveau == R.niveau ;
	}
	
	// afficher
	
	void afficher() {
		super.afficher();
		System.out.println(" niveau " + niveau);
	}
	
	
	
}
