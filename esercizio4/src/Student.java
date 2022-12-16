public class Student {

    private String name;
    int grade;

    public Student(String studentName) {
        System.out.println("Creating a Student object");
        this.name = studentName;
        this.grade = 0;
    }

    public void getStudentDetails() {
        System.out.println("Name: " + this.name + ", Grade: " + this.grade);
    }

}
