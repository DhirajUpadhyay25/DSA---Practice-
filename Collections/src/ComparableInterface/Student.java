package ComparableInterface;

public class Student  implements Comparable<Student>
{
    int age;
    String name;
    String subject;
    Student(int age,String name,String subject)
    {
        this.age=age;
        this.name=name;
        this.subject=subject;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if(this.age==s.age){
            return this.name.compareTo(s.name);
        }
        return this.age-s.age;
    }
}
