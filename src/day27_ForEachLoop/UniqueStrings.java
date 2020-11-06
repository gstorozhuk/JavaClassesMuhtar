package day27_ForEachLoop;

public class UniqueStrings {

    public static void main(String[] args) {

        String[] arr = {"c#", "C#", "Java", "Python", "Python", "C++"};

        for (int j = 0; j <= arr.length - 1; j++) {
            String element = arr[j];
            int frequency = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].equalsIgnoreCase(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.print(element + " ");
            }
        }
    }
}
