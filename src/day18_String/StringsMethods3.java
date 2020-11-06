package day18_String;

public class StringsMethods3 {
    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool";
        sentence = sentence.replace ("Java", "Python"); // Python is fun

        System.out.println(sentence);

        System.out.println("========================");

        String s = "I like to learn C#, C# is very cool";

        s = s.replace("C#", "Java");
        System.out.println(s);

        System.out.println("========================================================");


        String r = "Cat is friendly, Cat is cute";

        r = r.replaceFirst("Cat", "Dog");

        System.out.println(r);

        String t = "I like to learn Java, because Java is cool, Java is powerful";

        t = t.replaceFirst("Java is", "Python is");

        System.out.println(t);

        String a ="Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";

        a = a.replaceFirst("Monday", "Sunday");
        a = a.replaceFirst("e Monday", "e Tuesday");

        System.out.println(a);

        System.out.println("=========================================================");
        String emailAddress = "Cybertek_school@gmail.com";

int beginningIndex = emailAddress.indexOf('@')+1;
int endingIndex = emailAddress.indexOf(".");

String domain = emailAddress.substring(beginningIndex, endingIndex);

        System.out.println(domain);


        System.out.println("===================================================");

        String name = "My name is Muhtar";

        String result = name.substring( name.lastIndexOf("M"));

        System.out.println(result);






    }
}
