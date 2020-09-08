package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lonn = Double.parseDouble(showInputDialog("Lønnen din dette året: "));
		
		if (lonn <= 164100) {
			showMessageDialog(null, "Du trenger ikke å betale trinnskatt !");
		} 
		else if (230950 >= lonn && lonn > 164100) {
			lonn *= 0.0093;
			showMessageDialog(null, "Du må betale: " + lonn + " i trinnskatt");
		} else if (580650 > lonn && lonn > 230950) {
			lonn *= 0.0241;
			showMessageDialog(null, "Du må betale: " + lonn + " i trinnskatt");
		} else if (934050 >= lonn && lonn > 580650) {
			lonn *= 0.1152;
			showMessageDialog(null, "Du må betale: " + lonn + " i trinnskatt");
		} else if (lonn > 934050) {
			lonn *= 0.1452;
			showMessageDialog(null, "Du må betale: " + lonn + " i trinnskatt");
		}
	}

}
