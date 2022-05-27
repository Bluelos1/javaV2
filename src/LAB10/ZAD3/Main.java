package LAB10.ZAD3;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Mateusz", "kozak","s25436");
        Student stud2 = new Student("Pawel", "Kazimierczyk","s25267");
        Student stud3 = new Student("Michal","Stopa","s24999");
        String[] arr = new String[3];
        arr[0]= stud1.imie;
        System.out.println(arr[0]);
    }
}
