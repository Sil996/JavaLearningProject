package md.otp.operationsandciclicfunctions;

public class ArithmeticOperationsExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 12;

        System.out.println("the sum is: " + (a + b));

        System.out.println("the dif is: " + (a - b));

        int div = a / b;

        System.out.println("the div is: " + div);

        double a1 = a;
        double b1 = b;

        double div2 = (double) a / b;

        System.out.println("the div is: " + div2);

        System.out.println("the multiplication is: " + (a1 + a));

        System.out.println("the reminder is: " + (a % b));

        //Write a program that will change the values of the variables, as an output you have to get a = 12 and b = 5;

        // int  temp = a;
        //a = b;
        //b = temp;

        // Schimbarea valorilor
        int temp = a;
        a = b;
        b = temp;

        // Afișarea valorilor
        System.out.println("a = " + a);// a = 12
        System.out.println("b = " + b); // b = 5


    }


}
