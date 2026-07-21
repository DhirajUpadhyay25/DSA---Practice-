package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(10,"Alex","Ai"));
        students.add(new Student(20,"Blex","ML"));
        students.add(new Student(10,"Alam","SDE"));
        students.add(new Student(24,"RRX","Py"));
        students.add(new Student(30,"COMS","LLm"));

        System.out.println(students);
//        Collections.sort(students,new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }});
        Collections.sort(students,((o1, o2) -> o1.name.compareTo(o2.name)));
        System.out.println(students);

    }
}
