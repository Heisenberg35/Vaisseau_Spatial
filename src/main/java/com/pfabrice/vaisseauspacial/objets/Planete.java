/**
 * 
 */
package com.pfabrice.vaisseauspacial.objets;

/**
 * @author Fabrice
 *
 */
public class Planete {

	String nom;
	Coordonnee coordonnee;

	/**
	 * @param nom
	 * @param coordonnee
	 */
	public Planete(String nom, Coordonnee coordonnee) {
		super();
		this.nom = nom;
		this.coordonnee = coordonnee;
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

	/**s
	 * @return the coordonnee
	 */
	public Coordonnee getCoordonnee() {
		return coordonnee;
	}

	/**
	 * @param coordonnee the coordonnee to set
	 */
	public void setCoordonnee(Coordonnee coordonnee) {
		this.coordonnee = coordonnee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Planete [nom=" + nom + ", coordonnee=" + coordonnee + "]";
	}

}
