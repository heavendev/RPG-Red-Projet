package Projetfilrouge;

public enum Metiers {
	Marge, Geurrier, Magistrat, soldat, Magicien;

}

public abstract class Metier  {
	protected int Xp = 0;
	protected int level = 1;
	

	public int getXp() {
		return XP;
	}

	public void setXP(int Xp) {
		XP = Xp;
	}

	public int getLevel() {
		return level;
	}

	public void addXP(personnage personnage) {
	}

	public void level() {
		level++;
	}
}


