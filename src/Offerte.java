
public class Offerte {

	private String beschreibung;
	private double einkaufspreis;
	private String lieferzeit;
	private Kunde kunde;

	public Offerte(Kunde kunde, String beschreibung) {
		this.kunde = kunde;
		this.beschreibung = beschreibung;
		this.einkaufspreis = 1.0;
		this.lieferzeit = "undefined";
	}

	public void setEinkaufspreis(double preis) {
		this.einkaufspreis = preis;
	}

	public void setLieferzeit(String lieferzeit) {
		this.lieferzeit = lieferzeit;
	}
	
	public Kunde getKunde() {
		return this.kunde;
	}
	
	public String getBeschreibung() {
		return this.beschreibung;
	}
	
	public double getEinkaufspreis() {
		return this.einkaufspreis;
	}
	
	public String getLieferzeit() {
		return this.lieferzeit;
	}


	public void print() {
		this.kunde.print();
		System.out.println("Beschreibung: "+beschreibung);
		System.out.println("Einkaufspreis: "+einkaufspreis);
		System.out.printf("Verkaufspreis: %.02f\n",einkaufspreis*this.kunde.getMarge());
		System.out.println("Lieferzet: "+lieferzeit);
	}
}



