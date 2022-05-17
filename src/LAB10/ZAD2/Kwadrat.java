package LAB10.ZAD2;

public class Kwadrat implements Figura{
    double a;

    public double getA() {
        return a;
    }

    public void setA(int a) {
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
