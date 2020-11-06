package day12_NestedIf;

public class Loan {

    public static void main(String[] args) {

        double minimumSalary = 50000;
        int jobHistory = 2;
        int creditScore = 680;

        if(minimumSalary >=30000){
            if(jobHistory>=2){

                if (creditScore>=680){
                    System.out.println(" You are eligible for loan");

                }else{
                    System.out.println("You must have at least 680 credit score");
                }

            }else{
                System.out.println("You must be on your job at least for 2 years");
            }

        }else{
            System.out.println("you must have a minimum of $30000 salary");
        }


    }


}
