package Model;

import java.util.ArrayList;

public class Compagnie {
	
	private String nom;
	private ArrayList<Vol> vols;
	
	public Compagnie(String nom)
	{
		this.nom = nom;
		this.vols = new ArrayList<Vol>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Vol> getVols() {
		return vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}
	
	public void ajouterVol(Vol v)
	{
		this.vols.add(v);
	}
}
