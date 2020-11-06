package day21_WhileLoops;

public class
MiddleCharacter {

    public static void main(String[] args) {
        String word = "more"; // 1
        //

        if (word.length() >= 3 && word.length()%2!=0) {
            System.out.println(word.charAt(word.length() / 2));
        } else if (word.length() == 1) {
            System.out.println(word+word+word);

        } else {
          if(word.length()>=4){
    int m = word.length()/2;
                System.out.println(word.charAt(m-1) + ""+ word.charAt(m));
            }else{
                System.out.println(word+word+word);
            }
    }
    }
}