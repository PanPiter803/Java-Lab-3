package test;

import static java.lang.Math.sqrt;

public class Odcinek implements Przeksztalcenia{

    private Punkt a, b;

    public Odcinek(Punkt a, Punkt b) {
        if (a == null || b == null) throw new IllegalArgumentException("Pusty (null) koniec odcinka.");
        if (a.equals(b)) throw new IllegalArgumentException("Końce odcinka są takie same.");
        this.a = a;
        this.b = b;
    }

    public Punkt a() { return a; }
    public Punkt b() { return b; }

    public double długość() {
        double dx = b.x() - a.x(), dy = b.y() - a.y();
        return sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("[%s; %s]", a, b);
    }

    @Override
    public void translacja(Wektor v) {
        a.translacja(v);
        b.translacja(v);
    }

    @Override
    public void obrót(Punkt p, double kąt) {
        a.obrót(p, kąt);
        b.obrót(p, kąt);
    }

    @Override
    public void symetria(Punkt p) {
        a.symetria(p);
        b.symetria(p);
    }

    @Override
    public void symetria(Prosta p) {
        a.symetria(p);
        b.symetria(p);
    }
}
