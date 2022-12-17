package it.develhope.booleanoperators4;

public class Start {
    public static void main(String[] args)
            {

       int a = 1;
        int b = 3;
        int c = a*b;
        int d= c;

       boolean a1=  (d / c + 2) >= b || !(c + b - c / a == 3);
        int x=5;
        int y=6;
        boolean t=false;
        boolean f=true;
        boolean a2 = (x * x - y * y / 2 != 12) || !t && f;

        System.out.println(a1); //corretto
        System.out.println(a2); //corretto
    }
}
