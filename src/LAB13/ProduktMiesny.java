package LAB13;

public class ProduktMiesny extends Produkt{

    public ProduktMiesny(String nazwa, double cena, double podatek) {
        super(nazwa, cena, podatek);
        this.gornyPrzedzial = 30;
    }
}
