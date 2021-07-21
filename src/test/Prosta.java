package test;

public class Prosta {

    public final double a, b, c;

    public Prosta(double a, double b, double c) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("błędne współczynniki równania prostej.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Prosta(Punkt p, Punkt q) {
        if (p.equals(q)) throw new IllegalArgumentException("para takich samych punktów.");
        this.a = q.y() - p.y();
        this.b = p.x() - q.x();
        this.c = q.x() * p.y() - p.x() * q.y();
    }
}
