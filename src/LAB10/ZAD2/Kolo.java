package LAB10.ZAD2;

public class Kolo implements Figura{
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
}
