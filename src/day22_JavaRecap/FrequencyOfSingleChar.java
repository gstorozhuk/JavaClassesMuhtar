package day22_JavaRecap;

public class FrequencyOfSingleChar {

    public static void main(String[] args) {
        String str = "I like to learn Java, I would love to join Cybertek";

        char ch =' ';
        int count =0;

        for (int i=0; i<=str.length()-1; i++){

            char eachChar = str.charAt(i);

            if(ch==eachChar){
                count++;
                System.out.println(count);
            }
        }
    }
}
