package vendingmachine;


//university system

// features;
    // enrroll student
    // display students enrolled in a class

//classes
// Student
// Teacher


import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<String> courses = new ArrayList<>();

        //milan, math
        Student student1 = new Student("Milan", "math", "87665");
        student1.addCourse("Science");

        students.add(student1);

    }
}

class Student{
    String name;
    List<String> courses = new ArrayList<>();
    Address address;

   public Student(String name){
       this.name = name;
       this.courses = new ArrayList<>();
   }

  public Student(String name, String course, String address){
       this.name = name;
       this.courses.add(course);
       this.address = new Address(Integer.parseInt(address));
  }

  void addCourse(String course){
       this.courses.add(course);
  }

}

class Address{
    ZipCode zipcode;

    public Address(int zipcode) {
        this.zipcode = new ZipCode(zipcode);
    }
}

class ZipCode{
    int zipcode;

    public ZipCode(int zipcode){
        this.zipcode = zipcode;
    }

}
