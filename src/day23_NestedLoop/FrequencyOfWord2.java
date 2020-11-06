package day23_NestedLoop;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        String sentence = "Java Java java java java java java";

        String word = "java";
        String temp = sentence.toLowerCase();

        int count = 0;

        while (temp.contains(word.toLowerCase())) {
            temp=temp.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);


        System.out.println("========================================");


    }
}