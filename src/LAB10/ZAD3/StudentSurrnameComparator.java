package LAB10.ZAD3;

import java.util.Comparator;

public class StudentSurrnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}
