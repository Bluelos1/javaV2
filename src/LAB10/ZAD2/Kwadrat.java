package LAB10.ZAD2;

public class Kwadrat implements Figura, Comparable<Figura>{
    double a;


    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double obliczPole() {
        return a*a;
    }

    @Override
    public double obliczObwod() {
        return a*4;
    }


    @Override
    public String toString() {
        return "pole:"+obliczPole();
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(obliczPole(),o.obliczPole());
    }
}
