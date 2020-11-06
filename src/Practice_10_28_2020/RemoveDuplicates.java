package Practice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "gabahana";

        String nonDup = ""; //
                        //11
        for(int i=0; i< str.length()-1; i++){
            String eachChar = "" + str.charAt(i);

            if(nonDup.contains(eachChar)) { // if the character already contains
                continue;
            }else{
                nonDup +=eachChar;

            }
        }
        System.out.println(nonDup);



    }
}
