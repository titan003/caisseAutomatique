package org.alioune.caisseAutomatique.model;

import org.alioune.caisseAutomatique.Enum.MonnaieEnum;

public final class  Monnaie {
	
	private long piece2;
	private long billet5;
	private long billet10;
		
	
	public long getPiece2() {
		return piece2;
	}



	public void setPiece2(long piece2) {
		this.piece2 = piece2;
	}
	
	public void incrementPiece2() {
		this.piece2++;
	}
	
	public void incrementBillet5() {
		this.billet5++;
	}
	
	public void incrementBillet10() {
		this.billet10++;
	}
	
	public void incrementBillet10NFois(long n) {
		this.billet10+=n;
	}
	
	public void incrementBillet5NFois(long n) {
		this.billet5+=n;
	}
	
	public void incrementPiece2NFois(long n) {
		this.piece2+=n;
	}
	
	public void decrementPiece2() {
		this.piece2--;
	}
	
	public void decrementBillet5() {
		this.billet5--;
	}
	
	public void decrementBillet10() {
		this.billet10--;
	}
	



	public long getBillet5() {
		return billet5;
	}



	public void setBillet5(long billet5) {
		this.billet5 = billet5;
	}



	public long getBillet10() {
		return billet10;
	}



	public void setBillet10(long billet10) {
		this.billet10 = billet10;
	}
	
	@Override
	public String toString() {
		
		return "Rendu Monnaie: " + "(" + this.billet10 + " * " +MonnaieEnum.BILLET10.getValue() +" ) +  (" + this.billet5 + " * " +MonnaieEnum.BILLET5.getValue() + " ) +  (" + this.piece2 + " * " + MonnaieEnum.PIECE2.getValue() + " )";
	}

	

}
