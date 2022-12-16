class TestProgrammer {

    public static void main(String args[]) {


        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.wearsGlasses = true;
        programmer1.age = 25;
        programmer1.name = "Claudia";
        programmer2.wearsGlasses = true;
        programmer2.age = 22;
        programmer2.name = "Alessio";




        programmer1.drinkCoffee();
        programmer1.printDetails();
        programmer2.printDetails();
        programmer2.hasGlasses();
    }




}