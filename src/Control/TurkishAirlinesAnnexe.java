package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Formulaire;
import Model.Vol;

public class TurkishAirlinesAnnexe {
	
	private Compagnie turkishAirlines;
	private static TurkishAirlinesAnnexe instance = null;
	
	private TurkishAirlinesAnnexe()
	{
		this.turkishAirlines = new Compagnie("Turkish Airlines");
		//this.airFrance.ajouterVol("Paris","Italy");
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
