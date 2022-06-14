package LAB13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KasaSamoobslugowa {
    public static void main(String[] args) {
        Nabial bulka = new Nabial("grahamka",0.5,0.05);
        Owoc jablko = new Owoc("ligol",2,0.03);
        ProduktMiesny szynka = new ProduktMiesny("konserwowa",4,0.05);
        Slodycz czekolada = new Slodycz("Orzechowa",8,0.08);
        Warzywo pomidor = new Warzywo("malinowy",4,0.03);

        Map<Produkt,Integer> produkty = new HashMap<Produkt,Integer>();
        produkty.put(bulka,bulka.losujIlosc());
        produkty.put(jablko, jablko.losujIlosc());


        for( Map.Entry<Produkt, Integer> entry : produkty.entrySet() ){
            System.out.println( entry.getKey().getNazwa() + " => " + entry.getValue() );
        }
    }
}
