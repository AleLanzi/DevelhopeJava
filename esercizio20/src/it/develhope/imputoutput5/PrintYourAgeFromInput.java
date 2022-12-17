package it.develhope.imputoutput5;

import java.util.Scanner;

public class PrintYourAgeFromInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create a new Scanner

System.out.print("Enter your age here: ");
        int age = input.nextInt(); // read the integer number input from user

System.out.print("Your age is " + age);

input.close(); // close the scanner (do not read anymore the user input)
    }
}
