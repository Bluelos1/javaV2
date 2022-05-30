package LAB11.ZAD6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZAD6 {
    public static void main(String[] args) {
        System.out.println(sumaLiczb(wprowadzLiczby()));

    }

    public static Set<Integer> wprowadzLiczby(){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> liczby = new HashSet<>();
        while (liczby.size()<10) {
            System.out.println("Wprowadz liczbe: ");
            liczby.add(scanner.nextInt());
        }
        return liczby;
    }

    public static int sumaLiczb(Set<Integer> liczby){
        int suma=0;
        Integer[] liczbyTab = liczby.toArray(new Integer[liczby.size()]);

        for (int i = 0; i < liczbyTab.length; i++) {
            suma += liczbyTab[i];
        }
        return suma;
    }
}

