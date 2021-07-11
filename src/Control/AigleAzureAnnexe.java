package Control;

import Model.Compagnie;
import Model.Date;
import Model.Formulaire;
import Model.Vol;

import java.util.ArrayList;

public class AigleAzureAnnexe {

    private Compagnie aigleAzure;
    private static AigleAzureAnnexe instance = null;

    private AigleAzureAnnexe()
    {
        this.aigleAzure = new Compagnie("Air France");
        Boolean b=false;
        Vol v = new Vol("Cambridge","Marakech",new Date(12,12,2021),new Date (12,12,2021),b,30,500,30);
        this.aigleAzure.ajouterVol(v);
        Vol v2 = new Vol("Casablanca","Londre",new Date(6,5,2021),new Date (6,5,2021),b,30,500,30);
        this.aigleAzure.ajouterVol(v2);
        Vol v3 = new Vol("Charleroi","Hammemet",new Date(6,9,2021),new Date (7,9,2021),!b,30,500,30);
        this.aigleAzure.ajouterVol(v3);
        Vol v4 = new Vol("Tunis","Brussels",new Date(13,9,2021),new Date (14,9,2021),b,30,500,30);
        this.aigleAzure.ajouterVol(v4);
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

