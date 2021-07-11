package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Formulaire;
import Model.Vol;

public class AirFranceAnnexe {
	
	private Compagnie airFrance;
	private static AirFranceAnnexe instance = null;
	
	private AirFranceAnnexe()
	{
		this.airFrance = new Compagnie("Air France");
		//this.airFrance.ajouterVol("Paris","Italy");
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
