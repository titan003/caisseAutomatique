package org.alioune.caisseAutomatique.Enum;

public enum MonnaieEnum {
	
	PIECE2(2),
	BILLET5(5),
	BILLET10(10);
	
	private int value;
	
	MonnaieEnum(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
