package LAB10.ZAD3;

public class Student {
    String imie;
    String nazwisko;
    String indeks;

    public Student(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }
}
