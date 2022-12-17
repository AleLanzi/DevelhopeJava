package it.develhope.dateandtime2;

import java.time.LocalDateTime;

public class Start {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getMonth());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());

        int year= time.getYear();
        int lastDigit = year %100;

        System.out.println(lastDigit);



    }

}
