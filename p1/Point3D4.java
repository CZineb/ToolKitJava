
package p1;

//import p2.*;

public class Point3D4 {
	// Déclaration des attributs
	private double x;
	private double y;
	private double z;

	// Le constructeur par défaut
	public Point3D4() {
		x = 0;
		y = 0;
		z = 0;
	}

	// Le constructeur avec paramètre
	public Point3D4(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// La méthode toString
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	// Ma méthode equals
	public boolean equals(Point3D4 p) {
		// Si on compare le point avec lui meme: c'est true
		if (this == p)
			return true;
		// Si le point est null: c'est faux
		if (p == null)
			return false;

		if (this.x != p.x)
			return false;
		if (this.y != p.y)
			return false;
		if (this.z != p.z)
			return false;
		return true;
	}

}
