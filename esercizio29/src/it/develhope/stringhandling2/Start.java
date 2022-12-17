package it.develhope.stringhandling2;

import java.util.Arrays;
import java.util.Locale;

public class Start {
    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 =  "Germany";

        String sub1= string1.substring(0,6);
        String sub2= string1.substring(7,14);


       char [] charArray = (sub1.toUpperCase(Locale.ROOT) + " " + string2.toUpperCase(Locale.ROOT) + " "+ sub2.toUpperCase(Locale.ROOT)).toCharArray();




System.out.println(charArray);
    }

}
