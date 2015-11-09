import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		Kundenmanager kundenMng = new Kundenmanager();
		Offertenmanager offertenMng = new Offertenmanager(kundenMng);

		String cmdInput = "";
		Scanner keyScan = new Scanner(System.in);
		while (!cmdInput.equals("exit")) {
			System.out.print("\nCMD>");
			cmdInput = keyScan.nextLine();
			if (cmdInput.equals("addKunde")) {
				System.out.print("Name>");
				String name = keyScan.nextLine();
				System.out.print("Adresse>");
				String adresse = keyScan.nextLine();
				System.out.print("Marge>");
				double marge = keyScan.nextDouble();
				keyScan.nextLine();
				kundenMng.addKunde(name, adresse, marge);
			} else if (cmdInput.equals("setMarge")) {
				System.out.print("Kundennummer>");
				int kundenNo = keyScan.nextInt();
				kundenNo -= 1;
				keyScan.nextLine();
				System.out.print("Marge>");
				double marge = keyScan.nextDouble();
				keyScan.nextLine();
				Kunde k = kundenMng.getKunde(kundenNo);
				k.setMarge(marge);
			} else if (cmdInput.equals("addOfferte")) {
				System.out.print("Kundennummer>");
				int kundenNo = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("Beschreibung>");
				String beschreibung = keyScan.nextLine();
				offertenMng.addOfferte(kundenNo, beschreibung);
			} else if (cmdInput.equals("setLieferzeit")) {
				System.out.print("Offerten-Nummer>");
				int offertenNo = keyScan.nextInt();
				offertenNo -= 1;
				keyScan.nextLine();
				System.out.print("Lieferzeit>");
				String lieferzeit = keyScan.nextLine();
				offertenMng.alleOfferten.get(offertenNo).setLieferzeit(lieferzeit);
			} else if (cmdInput.equals("setEkPreis")) {
				System.out.print("Offerten-Nummer>");
				int offertenNo = keyScan.nextInt();
				offertenNo -= 1;
				keyScan.nextLine();
				System.out.print("Einkaufspreis>");
				double einkaufspreis = keyScan.nextDouble();
				keyScan.nextLine();
				offertenMng.alleOfferten.get(offertenNo).setEinkaufspreis(einkaufspreis);
			} else if (cmdInput.equals("printKunden")) {
				kundenMng.printAllKunden();
			} else if (cmdInput.equals("printOfferten")) {
				offertenMng.printAllOfferten();
			} else if (cmdInput.equals("printTopKunde")) {
				offertenMng.printTopKunde();
			} 
		}
	}
}