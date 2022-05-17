package LAB10.ZAD1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj format daty i czasu: " +
                        "hh-godziny " +
                        "mm-minuty " +
                        "dd-dni " +
                        "MM-miesiace " +
                        "yyyy-lata ");
        String format = scanner.nextLine();
        LocalDateTime dt1 = LocalDateTime.now();

        LocalDateTime date = LocalDateTime.of(dt1.getYear(), dt1.getMonth(),dt1.getDayOfMonth(), dt1.getHour(), dt1.getMinute(), dt1.getSecond());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }
}
