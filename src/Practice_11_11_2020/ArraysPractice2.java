package Practice_11_11_2020;

public class ArraysPractice2 {

    public static void main(String[] args) {


        String[] word = {"Anna", "Level", "Lol", "Donald", "Biden", "Amir", "Agalar", "Engin" };


        int count = 0;

        for (String each : word){
            char firstChar = each.toLowerCase().charAt(0);
            char lastChar = each.toLowerCase().charAt(each.length()-1);

            if(firstChar==lastChar){
                count++;

            }
        }
        System.out.println(count);


    }
}