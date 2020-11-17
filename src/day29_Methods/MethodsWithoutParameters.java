package day29_Methods;

public class MethodsWithoutParameters {

    public static void main(String[] args) {

printHello5Times();
        System.out.println("Galyna");
  printHello5Times();
        System.out.println("CyberteckSchool");
        printHello5Times();


        MethodsWithoutParameters.printHello5Times();
        MethodsWithoutParameters2.printOddNumbers1to100();
        MethodsWithoutParameters2.printEvenNumbers1to100();
    }

// AcceeModifier specifier returnType MethodName (Parameter)

public static void printHello5Times() {
    for (int i = 0; i<5; i++) {
        System.out.println("Hello World");


}
}
}
/*

  step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)

 */