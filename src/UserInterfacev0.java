
public class UserInterfacev0 {

	public static void main(String[] args) {
		Kundenmanager kundenMng = new Kundenmanager();
		kundenMng.addKunde("Mueller", "Gartenweg 1", 1.3);
		kundenMng.addKunde("Meier", "Hauptstrasse 2", 2.4);
		kundenMng.addKunde("Schmid", "Randweg 3", 3.1);
		kundenMng.printAllKunden();

	}

}
