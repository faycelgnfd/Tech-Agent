package Model;
public class Vol {
	
	private String villeDepart;
	private String villeArrive;
	private Date dateDepart;
	private Date dateArrive;
	private boolean escale;
	private float dureeVol;
	private float prix;
	private int placesDispo;
	
	public Vol(String villeD, String villeA, Date dateD, Date dateA, boolean escale, float duree, float prix, int place)
	{
		this.villeDepart = villeD;
		this.villeArrive = villeA;
		this.dateDepart = dateD;
		this.dateArrive = dateA;
		this.escale = escale;
		this.dureeVol = duree;
		this.prix = prix;
		this.placesDispo = place;
	}
	
	public int getPlacesDispo()
	{
		return this.placesDispo;
	}
	
	public void setPlacesDispo(int places)
	{
		this.placesDispo = places;
	}
	
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	public String getVilleArrive() {
		return villeArrive;
	}
	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateArrive() {
		return dateArrive;
	}
	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}
	public boolean isEscale() {
		return escale;
	}
	public void setEscale(boolean escale) {
		this.escale = escale;
	}
	public float getDureeVol() {
		return dureeVol;
	}
	public void setDureeVol(float dureeVol) {
		this.dureeVol = dureeVol;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	

}
