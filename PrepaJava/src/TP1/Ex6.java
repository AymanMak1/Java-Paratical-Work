package TP1;

public class Ex6 {
	public enum Jour
	{
		LUNDI,
		MARDI,
		MERCREDI,
		JEUDI,
		VENDREDI,
		SAMEDI,
		DIMANCHE
	}
	private byte date;
	public enum Mois
	{
		JANVIER,
		FEVRIER,
		MARS,
		AVRIL,
		MAI,
		JUIN,
		JUILLET,
		AOUT,
		SEPTEMBRE,
		OCTOBRE,
		NOVEMBRE,
		DECEMBRE;	
	}
	private short annee;
	public Ex6()
	{
		this(0,0);
	}
	public Ex6(int date,int anne) {
		this.date = (byte)date;
		this.annee = (short)anne;
		//leJour = Jour.SAMEDI;
	}
	public String toString() {
		return "Le nom de la classe c'est " + this.getClass().getName() + " " + date + " " + annee ;
	}
	public static void main(String [] args) {
			Ex6 calendrier = new Ex6(-52,-48);
			System.out.println(calendrier);
	}
}
