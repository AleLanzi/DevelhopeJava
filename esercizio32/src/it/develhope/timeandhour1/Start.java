package it.develhope.timeandhour1;

import java.time.LocalDate;
import java.time.Year;

public class Start {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        int daysInMonth = today.lengthOfMonth();
        int dayOfMonth = today.getDayOfMonth();
        int daysLeft = daysInMonth - dayOfMonth;
        int currentYear = Year.now().getValue();
        int currentDayOfYear = java.time.LocalDate.now().getDayOfYear();
        int daysEndYear = 365- currentDayOfYear;


        System.out.println("There are " + daysLeft + " days left until the end of the month.");
        System.out.println("In this year remains "+ daysEndYear + " days");
    }
}
