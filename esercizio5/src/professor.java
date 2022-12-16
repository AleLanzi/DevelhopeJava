public class professor extends CollegePerson implements TeachingPerson{



    @Override
    public void teachToOtherPeople() {
        System.out.println("A teacher can teach");
    }

    void studentInformation(){

        this.name = "Damiano";
        this.surname = "Volpe";
        this.collegeId = 001;

        System.out.println("this is prof " + name +" " + surname);

    }



}



