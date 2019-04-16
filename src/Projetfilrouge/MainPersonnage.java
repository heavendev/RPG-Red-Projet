package Projetfilrouge;

import java.util.Scanner;

public class MainPersonnage {

	public static void main(String[] args) {
		PersonnageFactory personnage = new PersonnageFactory();
		
		Personnage people = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez votre personnage il peut etre un humain, un orc ou un elfes");
		String choice = sc.next();
		people =PersonnageFactory.getPersonnage(choice);
		

	}

}
