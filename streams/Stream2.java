package streams;

import java.util.Arrays;
import java.util.List;

public class Stream2 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "ram");
        Student s2 = new Student(5, "hari");
        Student s3 = new Student(23, "Nicole");
        Student s4 = new Student(11, "sam");
        Student s5 = new Student(40, "Nick");

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

        // start with N even age
        students.stream().filter(s -> s.age % 2 == 0 && s.name.startsWith("N")).forEach(s-> System.out.println(s.name));



    }
}

class Student{
    int age;
    String name;
    Student(int age, String name){
        this.age= age;
        this.name = name;
    }
}
