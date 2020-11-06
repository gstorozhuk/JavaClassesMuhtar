package day26_Array;

public class FrequencyOfEachChar2 {

    public static void main(String[] args) {
        String str = "aaabbc";
        str=str.replace(" ", "");
        String expectResult = ""; // a3b2c1


        for (int j = 0; j<=str.length()-1; j++){

            char ch = str.charAt(j);// 'a'
            int count = 0;


            for (int i = 0; i <= str.length() - 1; i++) { // i represents the index num of str
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }

            if(expectResult.contains(""+ch)){
                continue;
            }else{
                expectResult +="" + ch + count;
            }



        }






        System.out.println(expectResult);


    }
}