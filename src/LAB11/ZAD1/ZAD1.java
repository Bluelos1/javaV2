package LAB11.ZAD1;

import java.util.ArrayList;
import java.util.List;

public class ZAD1 {
    public static void main(String[] args) {
        List<String> literki = new ArrayList<>();
        literki.addAll(List.of("a", "b", "c", "a", "d", "b"));
        wyswietlZduplikowane(literki);
        System.out.println("//////");
        //usunDuplikaty(literki);
        System.out.println("//////");
        wyswietlZduplikowane(literki);

    }

    public static void wyswietlZduplikowane(List<String> lista) {
        System.out.println("Zduplikowane elementy: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.indexOf(lista.get(i)) != lista.lastIndexOf(lista.get(i))) {
                if (i == lista.indexOf(lista.get(i)))
                    System.out.println(lista.get(i));
            }
        }
    }

//    public static void usunDuplikaty(List<String> lista) {
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.indexOf(lista.get(i)) == lista.lastIndexOf(lista.get(i))) { // indeks "a" != indeks kolejnego "a"
//                if (i == lista.indexOf(lista.get(i)))
//                    lista.remove(i);
//
//
//            }
//            else
//                System.out.println(lista.get(i));
//        }

}

