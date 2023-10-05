import java.util.InputMismatchException;
//import scanner
import java.util.Scanner;

public class SimpleErrors {
    //made public static void
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // declare input1
        int input1;
        //declare input2
        int input2;
        try {
            input1 = stdin.nextInt();
            input2 = stdin.nextInt();

            int num1 = input1;
            //fixed typo -> changed name from in2 to input2
            int num2 = input2;

            //declared oldn1
            int oldn1;
            //declared oldn2
            int oldn2;
            //fixed while looo by adding bracket so it works
            while (num1 % num2 != 0) {
                oldn1 = num1;
                oldn2 = num2;
                num1 = oldn2;
                num2 = oldn1 % oldn2;
            }

            num2 = Math.abs(num2);
            //put final string inside try
            //changed commas to +
            System.out.println("The GCD of " + input1 + " and "+ input2 +" is num2");
        }
        //added parameter e for catch exception
        catch (InputMismatchException e) {
            System.err.println("Error: input must be two numbers.");
            System.exit(1);
        }

    }
}