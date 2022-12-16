class Animal {

    String animalName;


    Animal(String name) {
        this.animalName = name;
    }

    void animalSound() {
        System.out.println("Roarr!");
    }


    void animalSound(String intensity) {
        if (intensity.equals("high")) {
            System.out.println("Roarrrrrrrr!");
        } else if (intensity.equals("low")) {
            System.out.println("Roar");
        } else {
            System.out.println("Cannot reproduce it properly in other cases");
        }
    }
}