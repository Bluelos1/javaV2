package LAB10.ZAD2;

public class Kwadrat implements Figura{
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
}
