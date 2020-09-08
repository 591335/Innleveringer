package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(showInputDialog("Skriv inn et tall for n her: "));
		
		int grense = 1;
		
		int i=0;
		while(n>1) {
			i++;
			grense = grense * n;
			n--;
			showMessageDialog(null,"n! = " + n + " * " + grense);

		}
	}

}
