package TEST;

import java.util.*;

public class Zad4 {
    private static final List<String> SAMOGLOSKI=Arrays.asList("a","e","i","o","u","y");

    public static Map<String, Integer> zliczSamogloski(String o) {
        String[] litery = o.split("");
        Map<String, Integer> zbior = new LinkedHashMap<>();
        for (String litera : litery) {
            if (SAMOGLOSKI.contains(litera.toLowerCase())) {
                if(zbior.containsKey(litera.toLowerCase())){
                    int ilosc = zbior.get(litera.toLowerCase());
                    zbior.put(litera.toLowerCase(), ++ilosc);
                } else {
                    zbior.put(litera.toLowerCase(), 1);
                }
            }
        }
        return zbior;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zdanie = scanner.nextLine();
        System.out.println(zliczSamogloski(zdanie));
    }
}

