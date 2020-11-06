package day23_NestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java is a programming language, I like to learn Java Java Java Java";
        String word = "Java";

        int count =0;

        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word, ""); // we need to remove one at a time
            count++;

        }

        System.out.println(count);
        /*


        Topics: do-while loop
        branching statements
        Nested Loop Intro
Package name: day23_NestedLoop
Warmup task:
    1. write a program that can return the frequncy of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:

         */
    }
}
