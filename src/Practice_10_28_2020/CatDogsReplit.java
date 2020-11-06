package Practice_10_28_2020;

import java.util.Scanner;

public class CatDogsReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        String tempWord = word.toLowerCase();

        while (tempWord.contains("dog")) {
            tempWord = tempWord.replaceFirst("dog", "");
            countOfDogs++;

        }

            while (tempWord.contains("cat")) {
                tempWord = tempWord.replaceFirst("cat", "");
                countOfCats++;

            }

            System.out.println(countOfCats == countOfDogs);
        }
    }
