/**
 * 
 */
package com.pfabrice.vaisseauspacial.objets;

/**
 * @author Fabrice
 *
 */
public class Compartiment {

	int poidsMax;
	Marchandise marchandise;

	/**
	 * @param poidsMax
	 * @param marchandise
	 */
	public Compartiment(int poidsMax, Marchandise marchandise) {
		super();
		this.poidsMax = poidsMax;
		this.marchandise = marchandise;
	}

	/**
	 * @return the poidsMax
	 */
	public int getPoidsMax() {
		return poidsMax;
	}

	/**
	 * @param poidsMax the poidsMax to set
	 */
	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	/**
	 * @return the marchandise
	 */
	public Marchandise getMarchandise() {
		return marchandise;
	}

	/**
	 * @param marchandise the marchandise to set
	 */
	public void setMarchandise(Marchandise marchandise) {
		this.marchandise = marchandise;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compartiment [poidsMax=" + poidsMax + ", marchandise=" + marchandise + "]";
	}

}
