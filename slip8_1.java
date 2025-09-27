// Create a class Sphere, to calculate the volume and surface area of sphere.
// (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))

class Sphere {
    int r;

    Sphere(int r) {
        this.r = r;
    }

    double volumn() {
        return 4 * 3.14 * (r * r);
    }

    double area() {
        return (4 / 3) * 3.14 * (r * r * r);
    }
}

public class slip8_1 {
    public static void main(String args[]) {
        Sphere s = new Sphere(2);

        System.out.println("Volumn of sphere: " + s.volumn() + " Area of sphere: " + s.area());
    }
}
