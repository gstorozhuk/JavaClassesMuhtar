package day20_ForLoop;

public class Warmup_tasks {
    public static void main(String[] args) {
//4. task sum 1-100 also task 7
int num = 100, sum =0;
        for (int i=1; i<= num; ++i){
            sum += i;

            System.out.println(sum);

        }
        System.out.println("===============================================");

    //5. task


//from Tuesday task     6. write a program that can print a ~ z in same line sperated by space // 97 to 122

char i;
        for (i = 'a'; i<='z'; i++){
            System.out.print(i + " ");
        }


    }

}
