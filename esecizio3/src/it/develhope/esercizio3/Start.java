package it.develhope.esercizio3;

public class Start {
    public static void main(String[] args){


        House house1 = new House("via delle magnolie", 2);
        House house2 = new House("via roma", 5);

        System.out.println("first house is in " + house1.addres + " and has " + house1.numberOfFloors+ " floors");
        System.out.println("second house is in " + house2.addres + " and has " + house2.numberOfFloors+ " floors");

    }
}
