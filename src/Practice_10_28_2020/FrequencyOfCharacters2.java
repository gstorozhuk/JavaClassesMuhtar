package Practice_10_28_2020;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {

        String str = "abababa";
        String ch = "a";

        int count = 0;
       while (str.contains(ch)){
           str = str.replaceFirst( ch, "");

           count++;

       }
        System.out.println(count);
    }


}
