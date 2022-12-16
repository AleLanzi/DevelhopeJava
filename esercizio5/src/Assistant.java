public class Assistant extends CollegePerson implements learningPerson, TeachingPerson {

    @Override
    public void teachToOtherPeople() {
        System.out.println("An assistant can learn");
    }

    @Override
    public void studyAtHome() {
System.out.println("An assistant can also teach");
    }


    public int isGoingToBeAPhd;

    void assistantInformation(){

        this.isGoingToBeAPhd = 2;
        this.name = "roberto";
        this.surname = "saviano";
        this.collegeId = 324;
        System.out.println(name+ " " + surname + " " + collegeId + " is going to be a phd in "+ isGoingToBeAPhd+ "years");

    }
}
