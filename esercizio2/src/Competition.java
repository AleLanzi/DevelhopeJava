public class Competition {

    public static void main(String[] args){

        CompetitionRules rules = CompetitionRules.getInstance();
        rules.printRules();

        Team teamA = new Team("Team A", new Programmer("gino", "Java", 5), new Programmer("giulia", "Python", 3));
        Team teamB = new Team("Team B", new Programmer("marco", "C++", 4), new Programmer("maria", "JavaScript", 2));



        System.out.println("Team A details:");
        teamA.printTeamDetails();
        System.out.println("Team B details:");
        teamB.printTeamDetails();


    }
}
