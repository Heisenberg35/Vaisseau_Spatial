/**
 * 
 */
package com.pfabrice.vaisseauspacial.objets;

/**
 * @author Fabrice
 *
 */
public class Cosmonaute {

	String nom;
	int poids;

	/**
	 * @param nom
	 * @param poids
	 */
	public Cosmonaute(String nom, int poids) {
		super();
		this.nom = nom;
		this.poids = poids;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cosmonaute [nom=" + nom + ", poids=" + poids + "]";
	}

}
