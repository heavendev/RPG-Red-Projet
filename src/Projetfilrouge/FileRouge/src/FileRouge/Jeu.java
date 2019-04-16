package FileRouge;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Jeu extends JFrame implements Runnable {

	private Thread thread;
	private Mouvement mouvement; //ajouter méthode 
	private JeuKeyListener listener = new JeuKeyListener(this);
	 
	public Jeu() {
		

		this.setSize(50, 20);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addKeyListener(listener);
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() { 
		this.removeKeyListener(listener);
	}
	
	public void mouvement(Direction direction) {
		mouvement.mouvement(direction);
	}

	public static void main(String[] args) {
           Jeu jeu = new Jeu();
	}

}
