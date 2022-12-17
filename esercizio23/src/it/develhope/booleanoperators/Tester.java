package it.develhope.booleanoperators;

public class Tester {
    public static void main(String[] args) {

       boolean a =  2 <= 2 && !true;
       boolean b =  !false && 3 > 2;

    boolean t=false;
    boolean f=true;
    boolean c = !(!t || f);

        boolean d = 6 > 6 ^ !(true && true);

        System.out.println(a); //corretto
        System.out.println(b); //corretto
        System.out.println(c); //corretto
        System.out.println(d); //corretto

    }
}
