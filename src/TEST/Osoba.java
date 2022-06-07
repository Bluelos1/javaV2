package TEST;

public class Osoba implements Comparable<Osoba>{
    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }


    @Override
    public int compareTo(Osoba o) {
        Osoba that = (Osoba)o;
        return nazwisko.compareTo(that.nazwisko);
    }
}
