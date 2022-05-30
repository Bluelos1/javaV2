package LAB11.ZAD2;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {


        Set<Integer> liczbyUser = new TreeSet<>();
        Set<Integer> liczbyLotto = new TreeSet<>();

        liczbyUser = wybierzLiczbe();
        liczbyLotto = maszynaLosujaca();
        porwonaj(liczbyUser, liczbyLotto);



    }


    public static Set<Integer> wybierzLiczbe(){
        System.out.println("Podaj liczby od 1 do 49");
        Scanner scanner = new Scanner(System.in);
        Set<Integer> liczby = new TreeSet<>();
        int temp;
        while (liczby.size() < 6) {
            System.out.printf("Podaj liczbe %d: ",liczby.size()+1);
            temp = scanner.nextInt();
            if (temp > 0 && temp<50)
                liczby.add(temp);
            else
                System.out.println("Zła liczba");
        }
        return liczby;
    }


    public static Set<Integer> maszynaLosujaca(){
        Set<Integer> liczby = new TreeSet<>();
        Random random = new Random();

        while (liczby.size()<6){
            liczby.add(random.nextInt(49)+1); //od 1 do 49

        }
        return liczby;
    }


    public static void porwonaj(Set<Integer> user, Set<Integer> maszyna){
        int wynik=0;
        System.out.println("Gracz: " + user);
        System.out.println("Wylosowano: "+ maszyna);
        for (Integer x : maszyna){
            if (user.contains(x)){
                wynik++;
            }
        }
        System.out.println("Wynik "+wynik+"/6");
    }
}