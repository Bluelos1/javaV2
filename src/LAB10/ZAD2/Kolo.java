package LAB10.ZAD2;

import java.util.Arrays;

public class Kolo implements Figura, Comparable{
    int r;

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*r*r;
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public int compareTo(Object o) {
        Kolo that = (Kolo) o;
        return compareTo(obliczPole());
    }
}
