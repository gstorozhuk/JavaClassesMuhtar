package Practice_10_28_2020;

public class FrequencyOfCharacters {


    public static void main(String[] args) {

        String str = "aaaabbbcccdddaaaa";

        char ch = 'a';

        int count = 0; // 1 + 1,

        for(int i=0; i<=str.length()-1; i++){
            char eachChar = str.charAt(i); // a, b, a , a, c

            if(eachChar == ch){
                count++;

            }
        }
        System.out.println(count);

    }
}
