package day22_JavaRecap;

public class StringPractice3 {

    public static void main(String[] args) {
        String sentence = "Capital of Canada is Washington D.C.";

        sentence = sentence.replace("Canada", "United States");


        System.out.println(sentence);


        System.out.println(sentence);

        String s = "Cybertek School is in Boston, Cybertek is in McLean";

        s = s.replaceFirst("Cybertek", "MIT");

        System.out.println(s);

        String r = "cava is cool programming language, I like to learn cava at cybertek school";
        r = r.replace("ca", "ja");

        System.out.println(r);

        ;


        String p = " I like Java and Java Java Java Java";

        p = p.replace("Java", "").replace("like", "like java");
        System.out.println(p);

        System.out.println("===============================================");

        String str2 = "            Cybertek       School";
        str2 = str2.trim();
        System.out.println(str2);

        System.out.println("==================================================");

        String s2 = " I like to learn Java";
        System.out.println("Contains c# " + s2.toLowerCase().contains("java"));

        System.out.println("===============================");


        String s3 = "Cybertek School is the best";

        System.out.println(s3.contains("cybertek"));
        System.out.println(s3.toLowerCase().contains("cybertek"));// ignore case sensitivity

        System.out.println("Java".isEmpty() );// false because has characters
        System.out.println("".isEmpty());


        System.out.println("================================");
        String URL = "https://www.amazon.com";

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com") || URL.endsWith(".edu"));

if (isValid){
    System.out.println("URL is valid");
}else{
    System.out.println("URL is invalid");
}

String email = "Java_Masters@java.com";

boolean validEmail =email.endsWith("gmail.com")|| email.endsWith("yahoo.com")
        || email.endsWith("hotmail.com");

        System.out.println(validEmail);




    }
}
