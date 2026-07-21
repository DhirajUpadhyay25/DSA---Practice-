package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"AXy","LLm"));
        students.add(new Student(22,"Dhiraj","AI/ML"));
        students.add(new Student(20,"Hitesh","Py"));
        students.add(new Student(10,"Arman","LLm"));
        students.add(new Student(10,"Abid","LLm"));
        System.out.println(students +" ");

        Collections.sort(students);

        System.out.println(students +" ");

    }
}
