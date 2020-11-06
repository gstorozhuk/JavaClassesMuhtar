package day23_NestedLoop;

public class CatAndDog {

    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog cat CAT cAT CAt";
        String temp = sentence.toLowerCase(); // after this don't nee to worry about case sensitivity

        int countDog = 0;
        String word = "dog";
        while(temp.contains(word)) {
            temp = temp.replaceFirst(word, "");
            countDog++;
        }
            System.out.println(countDog);

            int countCat = 0;
           word = "cat";
            while(temp.contains(word)){
                temp = temp.replaceFirst(word, "");
                countCat++;

            }
            System.out.println( countCat);
        System.out.println(countCat==countDog);
        }
    }

