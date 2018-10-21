/**
 * 
 */
package com.pfabrice.vaisseauspacial.manager;

import com.pfabrice.vaisseauspacial.objets.Compartiment;
import com.pfabrice.vaisseauspacial.objets.Coordonnee;
import com.pfabrice.vaisseauspacial.objets.Cosmonaute;
import com.pfabrice.vaisseauspacial.objets.Marchandise;
import com.pfabrice.vaisseauspacial.objets.Planete;
import com.pfabrice.vaisseauspacial.objets.Vaisseau;

/**
 * @author Fabrice
 *
 */
public class Manager {

	Planete planete;
	Vaisseau vaisseau;
	// Compartiment compartiment;

	/**
	 * @param planete
	 * @param vaisseau
	 */
	public Manager() {
		super();
		this.planete = new Planete("Terre", new Coordonnee(10, 20, 30));
		this.vaisseau = new Vaisseau("fusee1", 1000, planete);
	}

	/**
	 * @return the vaisseau
	 */
	public Vaisseau getVaisseau() {
		return vaisseau;
	}

	/**
	 * @param vaisseau the vaisseau to set
	 */
	public void setVaisseau(Vaisseau vaisseau) {
		this.vaisseau = vaisseau;
	}

	public void voyager(Planete planete, Planete planete2) {

		// TODO
		// ((sqrt((Xa-Xb)²+(Ya-Yb)²+(Za-Zb)²)/100) * (poidsFusée / 100))

		if (this.vaisseau.getPlanete().getNom().equals(planete.getNom())) {
			if (this.vaisseau.getUniteCarburant() > 0) {
				this.vaisseau.setPlanete(planete2);
				this.vaisseau.setUniteCarburant(this.vaisseau.getUniteCarburant() - 300);
			}

		} else {
			if (this.vaisseau.getUniteCarburant() > 0) {
				this.vaisseau.setPlanete(planete);
				this.vaisseau.setUniteCarburant(this.vaisseau.getUniteCarburant() - 300);
			}
		}

	}

	public void attribuerCompartiment(Compartiment compartiment) {
		this.vaisseau.getCompartiments().add(compartiment);
	}

	public void attribuerCosmonaute(Cosmonaute cosmonaute) {
		this.vaisseau.getCosmonautes().add(cosmonaute);
	}

	public void affreterCompartiment(Compartiment compartiment, Marchandise marchandise) {

		int poidsTotalMarchandises = 0;
		while (compartiment.getPoidsMax() > poidsTotalMarchandises) {
			compartiment.getMarchandises().add(marchandise);
			poidsTotalMarchandises = poidsTotalMarchandises + marchandise.getPoids();
		}

	}

	public int poidsTotalVaisseau() {

		int poidsTotalVaisseau = 0;

		for (Compartiment el : this.vaisseau.getCompartiments()) {
			poidsTotalVaisseau = poidsTotalVaisseau + el.getPoidsMax();

		}

		for (Cosmonaute el : this.vaisseau.getCosmonautes()) {
			poidsTotalVaisseau = poidsTotalVaisseau + el.getPoids();
		}
		return poidsTotalVaisseau;

	}

}
