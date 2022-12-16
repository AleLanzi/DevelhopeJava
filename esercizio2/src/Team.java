public class Team {

    public String teamName;

    Programmer p1;
    Programmer p2;



    public Team(String teamName, Programmer p1, Programmer p2) {
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }


    public void printTeamDetails() {
        System.out.println("Team name: " + this.teamName);
        System.out.println("Programmer 1 details:");
        this.p1.printProgrammerDetails();
        System.out.println("Programmer 2 details:");
        this.p2.printProgrammerDetails();
    }



}

