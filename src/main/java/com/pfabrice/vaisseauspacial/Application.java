/**
 * 
 */
package com.pfabrice.vaisseauspacial;

import com.pfabrice.vaisseauspacial.manager.Manager;
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
		manager.attribuerCosmonaute();
		
		//System.out.println(manager.getVaisseau().getCosmonautes().get(0).getNom());

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
				//TODO
			}

			if (choix == 2) {
				manager.voyager();
				if (manager.getVaisseau().getUniteCarburant() > 0) {
					System.out.println("Le vaisseau spacial " + manager.getVaisseau().getNom() + " est arrivé sur "
							+ manager.getVaisseau().getPlanete().getNom());
				}
			}
		}
		System.out.println("crash ...");
	}

}
