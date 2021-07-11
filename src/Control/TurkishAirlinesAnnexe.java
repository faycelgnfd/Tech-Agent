package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Date;
import Model.Formulaire;
import Model.Vol;

public class TurkishAirlinesAnnexe {
	
	private Compagnie turkishAirlines;
	private static TurkishAirlinesAnnexe instance = null;
	
	private TurkishAirlinesAnnexe()
	{
		this.turkishAirlines = new Compagnie("Turkish Airlines");
		Boolean b=false;
		Vol v = new Vol("istanbul","Charleroi",new Date(11,11,2021),new Date (11,11,2021),b,30,500,30);
		this.turkishAirlines.ajouterVol(v);
		Vol v2 = new Vol("Ankara","Londre",new Date(6,5,2021),new Date (6,5,2021),b,30,500,30);
		this.turkishAirlines.ajouterVol(v2);
		Vol v3 = new Vol("Cambridge","Milan",new Date(2,8,2021),new Date (2,8,2021),!b,30,500,30);
		this.turkishAirlines.ajouterVol(v3);
		Vol v4 = new Vol("Venice","Brussels",new Date(13,9,2021),new Date (14,9,2021),b,30,500,30);
		this.turkishAirlines.ajouterVol(v4);
	}
	
	public static TurkishAirlinesAnnexe getInstance()
	{
		if(instance == null)
		{
			instance = new TurkishAirlinesAnnexe();
		}
		
		return instance;
	}
	
	public ArrayList<Vol> selectionnerVols(Formulaire f)
	{
		ArrayList<Vol> volsSelect = new ArrayList<Vol>();
		for(Vol v : this.turkishAirlines.getVols())
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
