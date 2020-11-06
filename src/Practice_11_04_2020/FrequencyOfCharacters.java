package Practice_11_04_2020;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str= "abbacaa";
        String result = "";

        for (int j =0; j<=str.length()-1; j++){

        }

        char ch = str.charAt(0);
        int count = 0; // for the frequency

        for (int i=0; i<=str.length()-1; i++){
            if(ch == str.charAt(i)){
                count++;

            }
        }

result+=ch+count;

    }



}
