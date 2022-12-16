public class Teacher {

    String teacherName;

    public Teacher() {
        System.out.println("Creating a Teacher object");
    }

    public void assignGrade(Student student, int finalGrade) {
        student.grade = finalGrade;
    }

    }

