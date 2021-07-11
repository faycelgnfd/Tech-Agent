package Model;
public class Date {
	
	public int jour;
	public int mois;
	public int annee;
	
	public Date(int j, int m, int a)
	{
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}
	
	public int comparer(Date date)
	{
		if(this.annee < date.annee)
		{
			return -1;
		}
		else if(this.annee > date.annee)
		{
			return 1;
		}
		else
		{
			if(this.mois < date.mois)
			{
				return -1;
			}
			else if(this.mois > date.mois)
			{
				return 1;
			}
			else
			{
				if(this.jour < date.jour)
				{
					return -1;
				}
				else if(this.jour > date.jour)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}
}
