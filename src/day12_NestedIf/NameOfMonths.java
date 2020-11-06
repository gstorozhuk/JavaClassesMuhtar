package day12_NestedIf;

public class NameOfMonths {

    public static void main(String[] args) {
        int n = 12;
        String month = "";

        if (n>=1 && n<=12){
            month = (n==1) ? "Jan":(n==2)?"Feb" : (n==3)? "Mar" :(n==4)?"Apr" : (n==5)? "May"
            :(n==6)?"Jun" :(n==7)?"Jul" : (n==8)?"Aug" : (n==9)?"Sep" :(n==10)?"Oct" : (n==11)? "Nov"
                    :"Dec";

            System.out.println(month);
        }else{
            System.out.println(" No such month");

        }

    }

}
