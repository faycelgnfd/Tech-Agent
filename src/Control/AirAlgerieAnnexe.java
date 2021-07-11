package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Date;
import Model.Formulaire;
import Model.Vol;

public class AirAlgerieAnnexe {
	
	private Compagnie airAlgerie;
	private static AirAlgerieAnnexe instance = null;
	
	private AirAlgerieAnnexe()
	{
		this.airAlgerie = new Compagnie("Air Algerie");
		Boolean b=false;
		Vol v = new Vol("Cambridge","Mombasa",new Date(11,11,2021),new Date (11,11,2021),b,30,500,30);
		this.airAlgerie.ajouterVol(v);
		Vol v2 = new Vol("Nairobi","Londre",new Date(6,5,2021),new Date (6,5,2021),b,30,500,30);
		this.airAlgerie.ajouterVol(v2);
		Vol v3 = new Vol("Oran","Charleroi",new Date(2,8,2021),new Date (2,8,2021),!b,30,500,30);
		this.airAlgerie.ajouterVol(v3);
		Vol v4 = new Vol("Alger","Brussels",new Date(13,9,2021),new Date (14,9,2021),b,30,500,30);
		this.airAlgerie.ajouterVol(v4);
	}
	
	public static AirAlgerieAnnexe getInstance()
	{
		if(instance == null)
		{
			instance = new AirAlgerieAnnexe();
		}
		
		return instance;
	}
	
	public ArrayList<Vol> selectionnerVols(Formulaire f)
	{
		ArrayList<Vol> volsSelect = new ArrayList<Vol>();
		for(Vol v : this.airAlgerie.getVols())
		{
			if(v.getPlacesDispo()>=f.getNbTotalPersonne())
			{
				if(v.getVilleDepart().equals(f.getVilleDepart()) && v.getVilleArrive().equals(f.getVilleArrive()))
				{
					volsSelect.add(v);
				}
			}
		}
		
		return volsSelect;
	}

}
