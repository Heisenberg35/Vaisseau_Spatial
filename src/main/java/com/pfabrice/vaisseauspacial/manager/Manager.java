/**
 * 
 */
package com.pfabrice.vaisseauspacial.manager;

import com.pfabrice.vaisseauspacial.objets.Coordonnee;
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

	public void voyager() {
		
		if (vaisseau.getPlanete().getNom().equals(this.planete.getNom())) {
			vaisseau.setUniteCarburant(vaisseau.getUniteCarburant()-500);
			if (vaisseau.getUniteCarburant() <= 0) {
				System.out.println("crash ...");
				
			}else {
			vaisseau.setPlanete(planete2);
			}
		}else {
			vaisseau.setUniteCarburant(vaisseau.getUniteCarburant()-800);
			if (vaisseau.getUniteCarburant() <= 0) {
				System.out.println("crash ...");
				
			}else {
			vaisseau.setPlanete(planete);
			}
		}
		
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
	

}
