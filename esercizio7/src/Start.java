public class Start {




    public static void main(String[] args) {

        Car myCar = new Car(4, 4, 10000);
        Boat myBoat = new Boat(40, 3000);


        myCar.showVehicleDetails();
        myCar.doVehicleSound();
        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();


        System.out.println(myBoat.getBoatWeightAndSpeed());
    }
}