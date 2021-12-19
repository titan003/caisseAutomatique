package org.alioune.caisseAutomatique.impl;

import org.alioune.caisseAutomatique.model.Monnaie;
import org.alioune.caisseAutomatique.service.RenduMonnaieService;


public class RendueMonnaieImpl implements RenduMonnaieService {
	
		
	private static RenduMonnaieService service;
	
	private RendueMonnaieImpl() {
		
	}
	
	public static RenduMonnaieService getInstanceOfRenduMonnaieService() {
		
		if(service == null) {
			return new RendueMonnaieImpl();
		}
		return service;
	}

	
	public  Monnaie monnaieOptimale(long s) {

		Monnaie monnaie = new Monnaie();
		if( s<2) {
			return null;
		}  
		
		// gestion des billets de 10 euros
		monnaie.incrementBillet10NFois(s/10);
		s = s%10;
		if(s < 5  && s %2 != 0) {
			if(monnaie.getBillet10() > 0) {
				monnaie.decrementBillet10();
				s+=10;
			}
		}
		
		// gestion des billets de 5 euros 
		monnaie.incrementBillet5NFois(s/5);
		s%=5;
		if(s%2 != 0) {
			if(monnaie.getBillet5() > 0 ) {
				monnaie.decrementBillet5();
				s+=5;
			}
		}
		
		// gestion des pièces de 2 euros
		monnaie.incrementPiece2NFois(s/2);
		s%=2;

		if(s == 1) {
			monnaie = null;
		}
		
		return monnaie;
	}

}
