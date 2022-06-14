package LAB13;

import java.util.Random;

public class Produkt {
   private String nazwa;
   private double cena;
   private double podatek;
   protected int gornyPrzedzial;

    public Produkt(String nazwa, double cena, double podatek) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.podatek = podatek;
    }

    public int losujIlosc(){
        Random random = new Random();
        return random.nextInt(gornyPrzedzial);
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public double getPodatek() {
        return podatek;
    }

    public int getGornyPrzedzial() {
        return gornyPrzedzial;
    }

    public double cenaBrutto(){
        return cena+cena*podatek;
    }
}
