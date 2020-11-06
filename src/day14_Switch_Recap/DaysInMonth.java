package day14_Switch_Recap;

public class DaysInMonth {

    public static void main(String[] args) {

int year = 2020;
String month = "Jan";
String result = "";

switch(month){

    case "Jan": result = "31 days";
            break;

    case"Feb": result = (year%4==0)?"29 days":"28 days";
            break;

    case "Mar": result = "31 days";
            break;

    case "Apr": result = "30 days";
            break;

    case "May": result = "31 days";
        break;
    case "Jun": result = "30 days";
    break;
    case "July": result = "31 days";
    break;
    case "August": result = "31 days";
    break;
    case "September" : result = "30 days";
            break;
    case "October" : result = " 31 days";
    break;
    case "November" : result = "30 days";
    break;
    case "December" : result = "31 days";
}

System.out.println(result);

// cases: 2 == 28 or 29 days;
   // cases :4,6, 9,11 == 30 days
        // cases 1,3,5,7,8,10,12 == 31 days;

// || we cannot use in the switch or case,
    }

}
