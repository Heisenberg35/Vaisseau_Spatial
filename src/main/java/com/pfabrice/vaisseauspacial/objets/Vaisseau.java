/**
 * 
 */
package com.pfabrice.vaisseauspacial.objets;

import java.util.ArrayList;

/**
 * @author Fabrice
 *
 */
public class Vaisseau {

	String nom;
	int uniteCarburant;
	Planete planete;
	ArrayList<Cosmonaute> cosmonautes;
	ArrayList<Compartiment> compartiments;

	/**
	 * 
	 * @param nom
	 * @param uniteCarburant
	 */
	public Vaisseau(String nom, int uniteCarburant, Planete planete) {
		super();
		this.nom = nom;
		this.uniteCarburant = uniteCarburant;
		this.planete = planete;
		this.cosmonautes = new ArrayList<Cosmonaute>();
		this.compartiments = new ArrayList<Compartiment>();
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the planete
	 */
	public Planete getPlanete() {
		return planete;
	}

	/**
	 * @param planete the planete to set
	 */
	public void setPlanete(Planete planete) {
		this.planete = planete;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the uniteCarburant
	 */
	public int getUniteCarburant() {
		return uniteCarburant;
	}

	/**
	 * @param uniteCarburant the uniteCarburant to set
	 */
	public void setUniteCarburant(int uniteCarburant) {
		this.uniteCarburant = uniteCarburant;
	}

	/**
	 * @return the cosmonautes
	 */
	public ArrayList<Cosmonaute> getCosmonautes() {
		return cosmonautes;
	}

	/**
	 * @param cosmonautes the cosmonautes to set
	 */
	public void setCosmonautes(ArrayList<Cosmonaute> cosmonautes) {
		this.cosmonautes = cosmonautes;
	}

	/**
	 * @return the compartiments
	 */
	public ArrayList<Compartiment> getCompartiments() {
		return compartiments;
	}

	/**
	 * @param compartiments the compartiments to set
	 */
	public void setCompartiments(ArrayList<Compartiment> compartiments) {
		this.compartiments = compartiments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vaisseau [nom=" + nom + ", uniteCarburant=" + uniteCarburant + ", planete=" + planete + ", cosmonautes="
				+ cosmonautes + ", compartiments=" + compartiments + "]";
	}



}
