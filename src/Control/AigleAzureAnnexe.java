package Control;

import java.util.ArrayList;

import Model.Compagnie;
import Model.Formulaire;
import Model.Vol;

public class AigleAzureAnnexe {
	
	private Compagnie aigleAzure;
	private static AigleAzureAnnexe instance = null;
	
	private AigleAzureAnnexe()
	{
		this.aigleAzure= new Compagnie("Aigle Azure");
	}
	
	public static AigleAzureAnnexe getInstance()
	{
		if(instance == null)
		{
			instance = new AigleAzureAnnexe();
		}
		
		return instance;
	}
	
	public ArrayList<Vol> selectionnerVols(Formulaire f)
	{
		ArrayList<Vol> volsSelect = new ArrayList<Vol>();
		for(Vol v : this.aigleAzure.getVols())
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
