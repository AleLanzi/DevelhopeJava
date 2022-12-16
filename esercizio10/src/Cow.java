public class Cow extends Animal{


    Cow(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("MOOOOOO");
    }
}
