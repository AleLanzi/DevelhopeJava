public class Student extends CollegePerson implements learningPerson {


    @Override
    public void studyAtHome() {
        System.out.println("A student can learn");

    }

    public int academyYear;

    void studentInformation(){
        this.collegeId = 123;
        this.name = "franco";
        this.surname = "franchi";

        System.out.println(name + " " + surname+ " " + collegeId);

    }
}
