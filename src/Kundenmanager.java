import java.util.ArrayList;
public class Kundenmanager {
	ArrayList<Kunde> alleKunden = new ArrayList<Kunde>();
	
	public void addKunde(String name, String adresse, double marge) {
		alleKunden.add(new Kunde(name, adresse, marge));
	}
	
	public Kunde getKunde(int kNumber) {
		return alleKunden.get(kNumber);
	}
	
	public void printAllKunden() {
		for (Kunde k: alleKunden) {
			System.out.println("---------------------------");
			System.out.println("Kundennummer: " + (alleKunden.indexOf(k)+1));
			System.out.println("Kunde: " + k.getName());
			System.out.println("Adresse: " + k.getAdresse());
			System.out.println("Marge: " + k.getMarge());
		}
	}
	
}
