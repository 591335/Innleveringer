package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				for (int i = 1; i < 11; i++) {
					double poeng = Double.parseDouble(showInputDialog("Poeng på prøve: "));
					String karakter = "A";
					
					while(0>poeng || poeng>100) {
						showMessageDialog(null, "Poengene må være større enn 0 og mindre enn 100!");
						poeng = Integer.parseInt(showInputDialog("Skriv inn en ny verdi for elev: " + i));
					}

					if (100 >= poeng && poeng >= 90) {
						karakter = "A";
					} else if (89 >= poeng && poeng >= 80) {
						karakter = "B";
					} else if (79 >= poeng && poeng >= 60) {
						karakter = "C";
					} else if (59 >= poeng && poeng >= 50) {
						karakter = "D";
					} else if (49 >= poeng && poeng >= 40) {
						karakter = "E";
					} else if (39 >= poeng && poeng >= 0) {
						karakter = "F";
					} 
					System.out.println(i + " Du har fått: " + poeng + " poeng, og karakteren " + karakter);
					}}}
					
					
