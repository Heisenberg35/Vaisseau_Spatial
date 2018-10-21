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
	Planete planete2;
	Vaisseau vaisseau;
	Compartiment compartiment;
	Marchandise marchandise;
	

	/**
	 * @param planete
	 * @param planete2
	 * @param vaisseau
	 */
	public Manager() {
		super();
		this.planete = new Planete("Terre", new Coordonnee(10, 20, 30));
		this.planete2 = new Planete("Mars", new Coordonnee(100, 200, 300));
		this.vaisseau = new Vaisseau("fusee1", 1000, planete);
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
	 * @return the planete2
	 */
	public Planete getPlanete2() {
		return planete2;
	}

	/**
	 * @param planete2 the planete2 to set
	 */
	public void setPlanete2(Planete planete2) {
		this.planete2 = planete2;
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

	public void voyager() {

		if (vaisseau.getPlanete().getNom().equals(this.planete.getNom())) {
			vaisseau.setUniteCarburant(vaisseau.getUniteCarburant() - 500);
			vaisseau.setPlanete(planete2);
		} else {
			vaisseau.setUniteCarburant(vaisseau.getUniteCarburant() - 800);
			vaisseau.setPlanete(planete);
		}
	}
	
	public void attribuerCompartiment() {
		this.vaisseau.getCompartiments().add(this.compartiment);
	}
	
	public void affreterCompartiment() {
		this.marchandise = new Marchandise("bois", 100);
		this.compartiment = new Compartiment(1000, marchandise);
		
		for (int i = marchandise.getPoids(); i < compartiment.getPoidsMax(); i++) {
			//TODO
		}
		
	}
	
	public void attribuerCosmonaute() {
		this.vaisseau.getCosmonautes().add(new Cosmonaute("PESQUET Thomas", 75));
		this.vaisseau.getCosmonautes().add(new Cosmonaute("ARMSTRONG Neil", 80));
	}
	
	
}
