package TEST;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Osoba osob1 = new Osoba("Piotr","Kopec");
        Osoba osob2 = new Osoba("Mateusz","Placha");
        Osoba osob3 = new Osoba("Hubert","Labuda");
        Osoba osob4 = new Osoba("Kuba","Kniec");
Osoba[] tab = {osob1,osob2,osob3,osob4};
Arrays.sort(tab, Collections.reverseOrder());
        System.out.println(Arrays.toString(tab));


    }
}
