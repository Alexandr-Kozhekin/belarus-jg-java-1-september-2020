package student.igor_kavalevski.level3;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the firstNumber:");
        double a = scanner.nextDouble();
        System.out.print("Please enter the secondNumber:");
        double b = scanner.nextDouble();
        System.out.print("Please enter the thirdNumber:");
        double c = scanner.nextDouble();
        double d = (a + b + c)/3;

        System.out.println(" " + a + " + " + b + " + " + c + " = " + d);
    }


}
