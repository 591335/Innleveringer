package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = Double.parseDouble(showInputDialog("Skriv inn tall for X her: "));
		int n = Integer.parseInt(showInputDialog("Skriv inn tall for N her: "));
		
		double utregning = Math.pow(x, n);
		
		showMessageDialog(null, utregning);
		
		int i = 0;
		double grense = 1.0;
		while(i < n) {
			i++;
			grense*=x; //grense = grense * x;
			showMessageDialog(null, grense);
		}

	}

}
