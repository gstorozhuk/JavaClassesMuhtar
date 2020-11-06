package day18_String;

public class String_SubstringMethod {

    public static void main(String[] args) {


        String str = "I love Java Programming";

       str = str.substring(7, 11);

        System.out.println(str);

        String str1 = "Today is Monday";
        //             0123456789

        String day = str1.substring(9,14+1);

        System.out.println(day);



        String email = "cybertek@gmail.com";

        String domain = email.substring(9, 13+1);

        System.out.println("Domain of the email is : " + domain);

    }
}
