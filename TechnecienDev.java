
public class TechnecienDev extends Technecien {

	private Double salaire;

	
	// get - set
	
	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	
	
	
	// constricteur
	
	public TechnecienDev() {
		super();
	}

	public TechnecienDev(Double salaire,String nom, String prenom) {
		super(nom,prenom);
		this.salaire = salaire;
	}

	
	// Tostring
	
	@Override
	public String toString() {
		return "TechnecienDev [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}

	

	
	// Equals
	
	@Override
	public boolean equals(Object obj) {
		TechnecienDev T = (TechnecienDev) obj ;
		return super.equals(T) && this.salaire == T.salaire;
	}
	
	
	// afficher
	
		void afficher() {
			super.afficher();
			System.out.println(" salaire " + salaire);
		}
	
	
	

	
	
}
