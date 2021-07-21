package test;

public class Wektor {

    public static Wektor złożenie(Wektor u, Wektor v) {
        return new Wektor(u.dx + v.dx, u.dy + v.dy);
    }
    public static Wektor przeciwny(Wektor u) {
        return new Wektor(-u.dx, -u.dy);
    }

    public final double dx, dy;

    public Wektor(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
