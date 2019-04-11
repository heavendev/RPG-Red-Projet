package Projetfilrouge;

public abstract class Personnage {
	private String nom;
	private int Ptv;
	private int Pta;
	private int Ptd;
	private int Ptb;
	private int Vitesse;
	private int Magie;
	private int Resistance;
	private  Race race;
	private Metiers metier;
	private Equipement equipement;
	
	public Personnage(String nom, Race race, Metiers metier){
		this.Ptv=100;
		this.Pta=30;
		this.Ptd=15;
		this.Ptb=Ptb;
		this.nom= nom; 
		this.equipement=equipement;
		this.metier= metier;
		this.Vitesse=Vitesse;
		this.Resistance= Resistance;
		this.Magie=Magie;
	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Metiers getMetier() {
		return metier;
	}

	public void setMetier(Metiers metier) {
		this.metier = metier;
	}

	public Equipement getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}

	public int getPtv() {
		return Ptv;
	}

	public int getPta() {
		return Pta;
	}

	public int getPtd() {
		return Ptd;
	}

	public int getPtb() {
		return Ptb;
	}

	public void addEquipement(Equipement equipe) {
		Equipement type = equipe.getEquipement();
		
	}
}
