    public class CompetitionRules {
    private static CompetitionRules instance = new CompetitionRules();
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";


    private CompetitionRules() {}


    public static CompetitionRules getInstance() {
        return instance;
    }


    public void printRules() {
        System.out.println("Competition rules:");
        System.out.println(this.competitionRule1);
        System.out.println(this.competitionRule2);
        System.out.println(this.competitionRule3);
    }
}