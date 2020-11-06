package day13_SwitchStatement;

import java.sql.SQLOutput;

public class DaysInMonth {

    public static void main(String[] args) {

//precondition 1 to 12
        int year = 2020;
        int month = 19;

        boolean has30Days = month==4 || month ==6 || month==9 || month ==11;
        boolean has28Or29Days = month ==2;
        boolean has31Days = (!has28Or29Days);
        String result ="";

        if(month==2) {
            if (month % 4 == 0) {
                result = "29 days";
                System.out.println("29 days");
            } else {
                result = "28 days";
            }
        }else if(has30Days) {
            result = "30 days";
        }else {
            result = "31 days";
        }

    }
}
