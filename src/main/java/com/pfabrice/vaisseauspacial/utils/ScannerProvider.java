/**
 * 
 */
package com.pfabrice.vaisseauspacial.utils;

import java.util.Scanner;

/**
 * @author Fabrice
 *
 */
public class ScannerProvider {
	private Scanner scanner;

	public Scanner getScanner() {
		return scanner;
	}

	/** Constructeur priv� */
	private ScannerProvider() {
		this.scanner = new Scanner(System.in);
	}

	/** Instance unique non pr�initialis�e */
	private static ScannerProvider INSTANCE = null;

	/** Point d'acc�s pour l'instance unique du singleton */
	public static synchronized ScannerProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ScannerProvider();
		}
		return INSTANCE;
	}

	public int NextInt() {
		int result = this.scanner.nextInt();

		if (this.scanner.hasNextLine()) {
			this.scanner.nextLine();
		}
		return result;
	}
}
