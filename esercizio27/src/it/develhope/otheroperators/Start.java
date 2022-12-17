package it.develhope.otheroperators;

public class Start {
    public static void main(String[] args) {

    }

    int a = 15;

    a +=5;
    a -=4;

    int b = a;
    b++;


  if(b%2 != 0)

    {
        if ((b * (b + 1)) % 3 == 0) {
            System.out.println("Both statements are true ");
        } else {
            System.out.println("The statement is not true");
        }
    } else {
      System.out.println("Both statement aren't true");
    }
}