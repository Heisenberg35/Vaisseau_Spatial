/**
 * 
 */
package com.pfabrice.vaisseauspacial.objets;

/**
 * @author Fabrice
 *
 */
public class Coordonnee {

	int x;
	int y;
	int z;

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Coordonnee(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(int z) {
		this.z = z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coordonnee [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
