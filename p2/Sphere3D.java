package p2;
import p1.*;
public class Sphere3D {
	private double r;
	private Point3D4 p;
	
	public Sphere3D() {
		r=0;
		p = new Point3D4();
	}
	
	public Sphere3D(double r, Point3D4 p) {
		this.r = r;
		this.p = p;
	}
	
	public String toString() {
		return "{" + p.toString() + ","+ r + "}";
	}

	
	public boolean equals(Sphere3D s) {
		// Si on comapre le sphere avec lui m�me: C'est vrai
		if (this == s)
			return true;
		// Si l'objet s est null: c'est faux
		if (s == null)
			return false;
		
		// Si le le premier point est null et l'autre non: c'est faux
		if (p == null) {
			if (s.p != null)
				return false;
		} else if (!this.p.equals(s.p)) // Si le point 1 est diff�rent du point 2
			return false;
		// Si les deux radius sont diff�rents
		if (this.r != s.r)
			return false;
		return true;
	}
		
}
