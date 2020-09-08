package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tallEn = Integer.parseInt(showInputDialog("Skriv inn ditt første tall her: "));
		int tallTo = Integer.parseInt(showInputDialog("Skriv inn ditt andre tall her: "));
		
		int oddEn = tallEn % 2;
		
		if (tallEn > tallTo) {
			showMessageDialog(null, "Tall en må være mindre enn tall to!");
		}
		
		if (oddEn==1) {
		
			for (int oddeTall = tallEn; oddeTall <= tallTo; oddeTall+=2) {
				
				showMessageDialog(null, "Oddetallene dine er: " + oddeTall);
				
			}		
		}
	}

}
