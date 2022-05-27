package LAB10.ZAD2;

public class Trojkat implements Figura, Comparable{
    double a;
    double b;
    double c;


    public Trojkat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double obliczPole() {
        double p = (a+b+c)/2;
        double s = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(s);
    }

    @Override
    public double obliczObwod() {
        return a+b+c;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
