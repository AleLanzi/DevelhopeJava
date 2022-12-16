public class Programmer {

    public String name;
    public String programmingLanguage;
    public int yearsOfProgramming;





    public Programmer(String name, String programmingLanguage, int yearsOfExperience) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfProgramming = yearsOfExperience;
    }


    public void printProgrammerDetails(){


    System.out.println(name +" programming language: "+ programmingLanguage +"; years of programming: "+ yearsOfProgramming);


}

}
