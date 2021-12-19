package org.alioune.caisseAutomatique.metier;


import java.util.Scanner;

import org.alioune.caisseAutomatique.impl.RendueMonnaieImpl;
import org.alioune.caisseAutomatique.model.Monnaie;
import org.alioune.caisseAutomatique.service.RenduMonnaieService;


public class CaisseAutomatiqueManager {	
		
	public static void main(String... args) {
		
		RenduMonnaieService service = RendueMonnaieImpl.getInstanceOfRenduMonnaieService();
		Scanner in = new Scanner(System.in);
		String entree = null;
		while(true) {
			
			System.out.println("paiement en espèces...");
			System.out.print("donnner un nombre (taper la lettre q pour quitter): ");
			try {
				entree = in.next();
				long value = 0L;
				if(!entree.equals("q")) {
					value = Long.parseLong(entree);
				} else {
					break;
				}
				Monnaie monnaie = service.monnaieOptimale(value);
				if(monnaie == null) {
					System.out.println("impossible");
				} else {
					System.out.println(monnaie);
				}
			} catch(NumberFormatException e) {
				System.out.println("il faut mettre un nombre ou écrire la lettre 'q' pour quitter");
			}
		}
		
		in.close();

	}

}
