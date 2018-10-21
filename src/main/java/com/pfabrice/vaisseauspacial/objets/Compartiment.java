/**
 * 
 */
package com.pfabrice.vaisseauspacial.objets;

import java.util.ArrayList;

/**
 * @author Fabrice
 *
 */
public class Compartiment {

	int poidsMax;
	ArrayList<Marchandise> marchandises;

	/**
	 * @param poidsMax
	 */
	public Compartiment(int poidsMax) {
		super();
		this.poidsMax = poidsMax;
		this.marchandises = new ArrayList<Marchandise>();
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
	 * @return the marchandises
	 */
	public ArrayList<Marchandise> getMarchandises() {
		return marchandises;
	}

	/**
	 * @param marchandises the marchandises to set
	 */
	public void setMarchandises(ArrayList<Marchandise> marchandises) {
		this.marchandises = marchandises;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compartiment [poidsMax=" + poidsMax + ", marchandises=" + marchandises + "]";
	}

}
