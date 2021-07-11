package Model;

public class Formulaire {
	private String villeDepart;
	private String villeArrive;
	private int nbTotalPersonne;
	private int nbMoinsSept;
	private int nbPlage;
	
	public Formulaire(String villeD, String villeA, int nbT, int nbM, int nbP)
	{
		this.villeDepart = villeD;
		this.villeArrive = villeA;
		this.nbTotalPersonne = nbT;
		this.nbMoinsSept = nbM;
		this.nbPlage = nbP;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrive() {
		return villeArrive;
	}

	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}

	public int getNbTotalPersonne() {
		return nbTotalPersonne;
	}

	public void setNbTotalPersonne(int nbTotalPersonne) {
		this.nbTotalPersonne = nbTotalPersonne;
	}

	public int getNbMoinsSept() {
		return nbMoinsSept;
	}

	public void setNbMoinsSept(int nbMoinsSept) {
		this.nbMoinsSept = nbMoinsSept;
	}

	public int getNbPlage() {
		return nbPlage;
	}

	public void setNbPlage(int nbPlage) {
		this.nbPlage = nbPlage;
	}
	
	
}
