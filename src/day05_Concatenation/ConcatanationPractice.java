package day05_Concatenation;

public class ConcatanationPractice {

    public static void main(String[] args) {


        int houseNumber = 53;
        String streetName = "JFrunze str.";
        String cityName = "Mclean";
        String state = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber+" " +streetName+"\n" + cityName +" " +state +", "+zipCode;


        System.out.println(fullAddress);

        System.out.println("_______________________");


        String brand = "BMW";
        String model = "X7";
        int year = 2010;
        short mileage = 20000;
        double price = 18000;
        String color = "Red";
       // 2010 Toyota Camry, 55000 miles, Red, $18,000

        String carInfo =year+" "+brand+" " +model+", "+mileage+" miles, "+color+", $"+price;

        System.out.print(carInfo);









    }

}
