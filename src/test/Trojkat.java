package test;

import static java.lang.Math.sqrt;

public class Trojkat implements Przeksztalcenia{

    private Punkt i, j, k;

    public Trojkat(Punkt i, Punkt j, Punkt k) {
        if (i == null || j == null || k == null) throw new IllegalArgumentException("Pusty (null) koniec odcinka.");
        if (i.equals(k) || j.equals(k) || i.equals(j)) throw new IllegalArgumentException("Końce odcinka są takie same.");
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public Punkt i() { return i; }
    public Punkt j() { return j; }
    public Punkt k() { return k; }

    public double długośća()
    {
        double a = i.x(), b = i.y(), c = j.x(), d = j.y();
        return sqrt((c - a) * (c - a) + (d - b) * (d - b));
    }

    public double długośćb()
    {
        double a = j.x(), b = j.y(), c = k.x(), d = k.y();
        return sqrt((c - a) * (c - a) + (d - b) * (d - b));
    }

    public double długośćc()
    {
        double a = i.x(), b = i.y(), c = k.x(), d = k.y();
        return sqrt((c - a) * (c - a) + (d - b) * (d - b));
    }

    public double obwód() {
        return długośća() + długośćb() + długośćc();
    }

    public double pole() {
        double p = obwód()/2;
        return sqrt(p * (p - sqrt(p - długośća())) * (p - długośćb()) * (p - długośćc()));
    }

    @Override
    public String toString() {
        return String.format("[%s; %s; %s]", i, j, k);
    }

    @Override
    public void translacja(Wektor v) {
        i.translacja(v);
        j.translacja(v);
        k.translacja(v);
    }

    @Override
    public void obrót(Punkt p, double kąt) {
        i.obrót(p, kąt);
        j.obrót(p, kąt);
        k.obrót(p, kąt);
    }

    @Override
    public void symetria(Punkt p) {
        i.symetria(p);
        j.symetria(p);
        k.symetria(p);
    }

    @Override
    public void symetria(Prosta p) {
        i.symetria(p);
        j.symetria(p);
        k.symetria(p);
    }
}
