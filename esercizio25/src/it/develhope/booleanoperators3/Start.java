package it.develhope.booleanoperators3;

public class Start {
    public static void main(String[] args) {

       boolean a1=  !(!(!(false ^ false) || (true && true)));


       int x = 3;
       int y = 2;

       boolean a2= !((x * y) <= 6) && (x - y != 1);


       System.out.println(a1); //corretto
       System.out.println(a2); //corretto
    }
}
