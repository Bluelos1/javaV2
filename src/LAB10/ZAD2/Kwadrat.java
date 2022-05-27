package LAB10.ZAD2;

public class Kwadrat implements Figura, Comparable{
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
    public int compareTo(Object o) {
        Kwadrat that =(Kwadrat) o;
        return compareTo(that.obliczPole());
    }
}
