import p1.Point3D4;
import p2.Sphere3D;
public class Main {

	public static void main(String[] args) {
		Sphere3D s1 = new Sphere3D();
		Sphere3D s2 = new Sphere3D(5, new Point3D4(1, 2, 3));
		Sphere3D s3 = new Sphere3D(5, new Point3D4(2, 2, 3));
		Sphere3D s4 = new Sphere3D(5, new Point3D4(2, 2, 3));
		
		// Appel de la méthode equalse et affichage
		if (s1.equals(s2)) {
			System.out.println("Les deux sphères sont égaux");
		} else {
			System.out.println("Les deux sphères sont différents");
		}
		if (s1.equals(s3)) {
			System.out.println("Les deux sphères sont égaux");
		} else {
			System.out.println("Les deux sphères sont différents");
		}
		if (s2.equals(s3)) {
			System.out.println("Les deux sphères sont égaux");
		} else {
			System.out.println("Les deux sphères sont différents");
		}
		if (s2.equals(s2)) {
			System.out.println("Les deux sphères sont égaux");
		} else {
			System.out.println("Les deux sphères sont différents");
		}
		if (s3.equals(s4)) {
			System.out.println("Les deux sphères sont égaux");
		} else {
			System.out.println("Les deux sphères sont différents");
		}
	}

}
