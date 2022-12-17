package it.develhope.booleanoperators2;

public class Start {
    public static void main(String[] args) {

        boolean a1 = (55 != 55) && (false ^ true);

boolean a = true;
boolean b = false;
int c = 2;
char d = '2';

        boolean a2 = (!a || !b) || c == d;

        boolean a3 = false && true || false && !false;

        boolean a4 = (false && true) || (false || true);

System.out.println(a1); //corretto
System.out.println(a2); //corretto
System.out.println(a3); //corretto
System.out.println(a4); //corretto



    }
}
