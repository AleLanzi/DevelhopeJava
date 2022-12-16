class Boat extends Vehicle {
    double maxKnotsSpeed;
    int boatKilosWeight;

    // Constructor for Boat
    public Boat(double maxSpeed, int weight) {
        type = "boat";
        numberOfWheels = 0;
        maxKnotsSpeed = maxSpeed;
        boatKilosWeight = weight;
    }

    // Method to get the boat's weight and speed
    public String getBoatWeightAndSpeed() {
        return "The boat weighs " + boatKilosWeight + " kilos and has a maximum speed of " + maxKnotsSpeed + " knots.";
    }

    // Mandatory override of the abstract method to make the boat sound
    @Override
    public void doVehicleSound() {
        System.out.println("The boat goes splash splash!");
    }
}
