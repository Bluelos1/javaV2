package LAB10.ZAD2;

import java.util.Arrays;

public class Kolo implements Figura, Comparable<Figura>{
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


    public String toString() {
        return "pole:"+obliczPole();
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(obliczPole(),o.obliczPole());
    }
}
