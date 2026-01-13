package autowiredAndQualifier;

public class Learner {
    private String name;
    private int rollNo;
    private String course;
    private String assignedInstructor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAssignedInstructor() {
        return assignedInstructor;
    }

    public void setAssignedInstructor(String assignedInstructor) {
        this.assignedInstructor = assignedInstructor;
    }


    public void displayLearnerDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
        System.out.println("Instructor: "+assignedInstructor);
    }
}
