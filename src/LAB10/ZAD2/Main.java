package LAB10.ZAD2;

public class Main {
    public static void main(String[] args) {
        //stworzyc obiekty i wlozyc je do jednej tablicy
        Trojkat troj1 =new Trojkat(3,4,5);
        Kwadrat kwa1 = new Kwadrat(5);
        Kolo kol1 = new Kolo(4);

        Figura[] tabFig = {troj1,kwa1,kol1};
        for (Figura figura : tabFig) {
            System.out.println("pole:");
            System.out.println(figura.obliczPole());
            System.out.println("obwod:");
            System.out.println(figura.obliczObwod());
        }
    }
}
