class Car extends Vehicle {
    int numberOfDoors;
    double carPrice;


    public Car(int wheels, int doors, double price) {
        type = "car";
        numberOfWheels = wheels;
        numberOfDoors = doors;
        carPrice = price;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("This car has " + numberOfDoors + " doors and costs $" + carPrice + ".");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("The car goes vroom vroom!");
    }
}