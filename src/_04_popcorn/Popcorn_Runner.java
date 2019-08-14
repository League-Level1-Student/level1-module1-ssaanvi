package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Runner {
public static void main(String[] args) {
	
	Popcorn Pop = new Popcorn() ;
	JOptionPane.showInputDialog("Which flavor do you want?");
	JOptionPane.showInputDialog("How long should it take?");
	Pop.setTime();
	Pop.putInMircowave () ;
	Pop.startMicrowave();
	Pop.applyHeat();
	Pop.isCooked();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
