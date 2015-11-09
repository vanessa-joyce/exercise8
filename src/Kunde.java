public class Kunde {
	private String name;
	private String adresse;
	private double marge;
	private double offertvolumen = 0;

	public Kunde(String name, String adresse, double marge) {
		this.name = name;
		this.adresse = adresse;
		this.marge = marge;
	}
	

	public void print() {
		System.out.println("\nKunde: "+name);
		System.out.println("Adresse: "+adresse);
		System.out.println("Marge: "+marge);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAdresse() {
		return this.adresse;
	}

	public double getMarge() {
		return this.marge;
	}
	
	public double getOffertVolumen() {
		return this.offertvolumen;
	}
	
	public void addToOffertvolumen(double offertvolumen) {
		this.offertvolumen += offertvolumen; 
	}
	
	public void setOffertvolumen(double offertvolumen) {
		this.offertvolumen = offertvolumen; 
	}
	
	public void setMarge(double marge) {
		this.marge = marge; 
	}

}


