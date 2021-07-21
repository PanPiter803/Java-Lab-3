package obliczenia;

import test.*;

public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt(3, 5);
        System.out.println(p);
        System.out.println("(" + p.x() + ";" + p.y() + ")");

        Punkt a = new Punkt(1, 4);
        Punkt b = new Punkt(2, 3);
        Odcinek o = new Odcinek(a, b);
        System.out.println(o);
        System.out.println(o.długość());

        Punkt i = new Punkt(1, 4);
        Punkt j = new Punkt(6, 8);
        Punkt k = new Punkt(2, 5);
        Trojkat t = new Trojkat(i, j, k);
        System.out.println(t);
        System.out.println(t.obwód());
        System.out.println(t.pole());
    }
}
