/**
 * 
 */
package com.pfabrice.vaisseauspacial;

import com.pfabrice.vaisseauspacial.manager.Manager;
import com.pfabrice.vaisseauspacial.objets.Compartiment;
import com.pfabrice.vaisseauspacial.objets.Coordonnee;
import com.pfabrice.vaisseauspacial.objets.Cosmonaute;
import com.pfabrice.vaisseauspacial.objets.Marchandise;
import com.pfabrice.vaisseauspacial.objets.Planete;
import com.pfabrice.vaisseauspacial.utils.ScannerProvider;

/**
 * @author Fabrice
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int choix = 0;

		Manager manager = new Manager();
		Compartiment compartiment = new Compartiment(1000);
		Marchandise marchandise = new Marchandise("bois", 100);
		Cosmonaute cosmonaute = new Cosmonaute("PESQUET Thomas", 75);
		Cosmonaute cosmonaute2 = new Cosmonaute("ARMSTRONG Neil", 80);
		Planete planete = new Planete("Terre", new Coordonnee(10, 20, 30));
		Planete planete2 = new Planete("Mars", new Coordonnee(20, 40, 60));

		manager.attribuerCompartiment(compartiment);
		manager.affreterCompartiment(compartiment, marchandise);
		manager.attribuerCosmonaute(cosmonaute);
		manager.attribuerCosmonaute(cosmonaute2);

		// System.out.println(manager.poidsTotalVaisseau());

		while (manager.getVaisseau().getUniteCarburant() > 0) {

			do {
				System.out.println("-----------------------Bienvenue sur la planète-----------------------");
				System.out.print("\n");
				System.out.println(manager.getVaisseau().getPlanete());
				System.out.print("\n");
				System.out.println("1 : Données de navigation");
				System.out.println("2 : Naviguer vers la planète");

				choix = ScannerProvider.getInstance().getScanner().nextInt();

			} while (choix != 1 && choix != 2);

			if (choix == 1) {

				if (manager.getVaisseau().getPlanete().getNom().equals(planete.getNom())) {
					System.out.println("La planete " + planete2
							+ " est à 300 unités de carburant da la planete actuelle " + planete);
					System.out.println(
							"Le vaisseau a " + manager.getVaisseau().getUniteCarburant() + " unités de carburant");
				} else {
					System.out.println("La planete " + planete
							+ " est à 300 unités de carburant da la planete actuelle " + planete2);
					System.out.println(
							"Le vaisseau a " + manager.getVaisseau().getUniteCarburant() + " unités de carburant");
				}
			}

			if (choix == 2) {
				manager.voyager(planete, planete2);
				if (manager.getVaisseau().getUniteCarburant() > 0) {
					System.out.println("Le vaisseau spacial " + manager.getVaisseau().getNom() + " est arrivé sur "
							+ manager.getVaisseau().getPlanete().getNom() + " en utilisant 300 unités de carburant");
				}

			}
		}
		System.out.println("crash du vaisseau spacial dans l'espace ...");
	}

}
