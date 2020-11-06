package day14_Switch_Recap;

public class DaysInAMonth2 {

    public static void main(String[] args) {

       int year = 2020;
       String month = "Feb";
       String result = "";

       switch (month) {
           case "Feb":
               result = (year % 4 == 0) ? "29 days" : "28 days";

               break;

           case "April":
           case "June":
           case "Sep":
           case "Nov":
               result = "30 days";
               break;

           case "Jan":
           case "Mar":
           case "May":
           case "Jul":
           case "Aug":
           case "Oct":
           case "Dec":
               result = "31 days";
               break;

           default:
               result = "is invalid";
       }

        System.out.println(result);
       }

    }

