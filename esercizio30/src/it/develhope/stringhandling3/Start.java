package it.develhope.stringhandling3;


public class Start {
    public static void main(String[] args) {

       String [] array1 = {"I want", "to learn", "how to code!"};

        String[] array2 = new String[array1.length];

        for (int i = 0; i < array1.length; i++) {


            array2[i] = array1[i].trim();
        }

        // Compare the first and second items of the modified array
        // using lexicographical comparison
        boolean statement1 = array2[0].compareTo(array2[1]) > 0;
System.out.println(statement1);
        // Compare the first and second items of the modified array
        // ignoring the case
        boolean statement2 = array2[0].compareToIgnoreCase(array2[1]) > 0;
System.out.println(statement2);
        // Print the negation of the result of the comparison

        System.out.println(!(statement1 > statement2));
    }

    }

