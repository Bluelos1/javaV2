package LAB10.ZAD4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Mateusz", "Kozak","s25436");
        Student stud2 = new Student("Pawel", "Kazimierczyk","s25267");
        Student stud3 = new Student("Michal","Stopa","s24999");

        Student[] arr = {stud1,stud2,stud3};
        Arrays.sort(arr, new StudentIndexComparator());
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new StudentNameComparator());
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new StudentSurrnameComparator());
        System.out.println(Arrays.toString(arr));
    }
}
