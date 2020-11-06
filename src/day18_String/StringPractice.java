package day18_String;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println(s1==s2);


        String s3 = new String ("Cat");

        System.out.println(s1==s3); // false

        System.out.println(s2==s3);

        String s4 = new String ("Cat");

        System.out.println(s3==s4);

        //equals ()
        System.out.println(s1.equals(s3) );//true because only text is compared

        System.out.println(s2.equals(s3));//true because only text is compared
        System.out.println(s3.equals(s4)); // true

        String s5 = new String ("cat");
        System.out.println(s4.equals(s5)); // false because case sensative

        System.out.println(s4.equalsIgnoreCase(s5)); // true because not case sensative

        System.out.println("===================================================================");

        String str = "cybertek";
       str =  str.toUpperCase();// CYBERTEK

        System.out.println(str);
        str = str.toLowerCase(); // cybertek

        System.out.println(str);

        System.out.println("====================================================================");

        String firstName = "Galyna"; // 6

        String lastName = "Storozhuk"; // 9

        String initial = firstName.charAt(0) +"."+lastName.charAt(0);

   int n1 = lastName.length();

        System.out.println(n1);

        int n2 = firstName.length()-1; // to find out last letter/index
        System.out.println(n2);

        System.out.println("=================================================");
String a = "Cyberteck School";

char firstChar = a.charAt(0);
char lastChar = a.charAt(a.length()-1);

        System.out.println("First character: " + firstChar);
        System.out.println("Last character: "+ lastChar);

        System.out.println("======================================================" );


        String b = "Today is Monday";

        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-2);


        System.out.println(secondChar);
        System.out.println(secondLastChar);

    }



}
