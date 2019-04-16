package Projetfilrouge;

public class PersonnageFactory {

	public static Personnage getPersonnage(String personnage) {
		Personnage people = null;
		switch (personnage) {

		case "Humain":
			people = new Humain(people.setNom());
			break;
			
		case "Elfes":
			people = new Elfes(people.setNom());
			break;
			
		case "Orc":
			people = new Orc(people.setNom());
			break;
		
			default:
				throw new IllegalArgumentException("pas ce type de personnage dans la Liste");

		}
		people.getPta();
		people.getPtb();
		people.getPtd();
		people.getPtv();
		people.setMetier();
		people.getEquipement();
		people.getVitesse();
		people.getResistance();	
		return people;
	}
}