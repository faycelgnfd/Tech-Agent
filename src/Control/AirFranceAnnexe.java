package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Date;
import Model.Formulaire;
import Model.Vol;

public class AirFranceAnnexe {
	
	private Compagnie airFrance;
	private static AirFranceAnnexe instance = null;
	
	private AirFranceAnnexe()
	{
		this.airFrance = new Compagnie("Air France");
		Boolean b=false;
		Vol v = new Vol("Paris","Toronto",new Date(1,12,2021),new Date (1,12,2021),b,30,500,30);
		this.airFrance.ajouterVol(v);
		Vol v2 = new Vol("Vancouver","Londre",new Date(6,5,2021),new Date (6,5,2021),b,30,500,30);
		this.airFrance.ajouterVol(v2);
		Vol v3 = new Vol("Charleroi","Cambridge",new Date(22,9,2021),new Date (23,9,2021),!b,30,500,30);
		this.airFrance.ajouterVol(v3);
		Vol v4 = new Vol("Nancy","Brussels",new Date(13,9,2021),new Date (14,9,2021),b,30,500,30);
		this.airFrance.ajouterVol(v4);
	}
	
	public static AirFranceAnnexe getInstance()
	{
		if(instance == null)
		{
			instance = new AirFranceAnnexe();
		}
		
		return instance;
	}
	
	public ArrayList<Vol> selectionnerVols(Formulaire f)
	{
		ArrayList<Vol> volsSelect = new ArrayList<Vol>();
		for(Vol v : this.airFrance.getVols())
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
