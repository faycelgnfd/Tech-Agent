package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Formulaire;
import Model.Vol;

public class AirAlgerieAnnexe {
	
	private Compagnie airAlgerie;
	private static AirAlgerieAnnexe instance = null;
	
	private AirAlgerieAnnexe()
	{
		this.airAlgerie = new Compagnie("Air Algerie");
		//this.airAlgerie.ajouterVol("Paris","Italy");
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
