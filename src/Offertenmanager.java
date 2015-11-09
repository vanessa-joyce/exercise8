import java.util.ArrayList;
public class Offertenmanager {
	ArrayList<Offerte> alleOfferten = new ArrayList<Offerte>();
	public Kundenmanager kundenmanager;
	
	public Offertenmanager(Kundenmanager k) {
		this.kundenmanager = k;
	}
	
	public void addOfferte(int kNumber, String beschrieb) {
		this.alleOfferten.add(new Offerte(kundenmanager.getKunde(kNumber-1), beschrieb));
	}
	
	public void setLieferzeit(int oNumber, String lieferzeit) {
		this.alleOfferten.get(oNumber-1).setLieferzeit(lieferzeit);
	}
	
	public void setEinkaufspreis(int oNumber, double preis) {
		this.alleOfferten.get(oNumber-1).setEinkaufspreis(preis);
	}
	
	public void setOffertvolumenPerCustomer() {
		for (Offerte o: alleOfferten) {
			Kunde k = o.getKunde();
			k.addToOffertvolumen(o.getEinkaufspreis()+(o.getEinkaufspreis()*k.getMarge()/100));
		}
	}
		
	public void printTopKunde() {
		this.setOffertvolumenPerCustomer();
		double maxOffertVolumen = 0;
		int maxOffertUser = 0;
		for (Kunde o: kundenmanager.alleKunden) {
			if (o.getOffertVolumen() > maxOffertVolumen) {
				maxOffertVolumen = o.getOffertVolumen();
				maxOffertUser = kundenmanager.alleKunden.indexOf(o);
			}
		}
		System.out.println("---------------------------");
		System.out.println("Top Kunde");
		System.out.println("Kunde: " + kundenmanager.alleKunden.get(maxOffertUser).getName());
		System.out.println("Offertvolumen: " + maxOffertVolumen);
	}
	
	public void printAllOfferten() {
		for (Offerte o: alleOfferten) {
			Kunde k = o.getKunde();
			System.out.println("---------------------------");
			System.out.println("Offerten-Nummer: " + (alleOfferten.indexOf(o)+1));
			System.out.println("Kunde: " + k.getName());
			System.out.println("Adresse: " + k.getAdresse());
			System.out.println("Marge: " + k.getMarge());
			System.out.println("Beschreibung: " + o.getBeschreibung());
			System.out.println("Einkaufspreis: " + o.getEinkaufspreis());
			System.out.println("Lieferzeit: " + o.getLieferzeit());
		}
	}
}
