import java.util.Scanner;

public class Objective4Lab2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

        // prompt user to get input for all int variables
        System.out.println("Enter a whole number (positive or negative: ");
        num1 = keyboard.nextInt();
        System.out.println("Enter another whole number (positive or negative: ");
        num2 = keyboard.nextInt();
        System.out.println("Enter another whole number (positive or negative: ");
        num3 = keyboard.nextInt();
        // prompt user to get input for all double variables
        System.out.println("Enter a number (positive or negative up to two decimal places: ");
        dub1 = keyboard.nextDouble();
        System.out.println("Enter another number (positive or negative up to two decimal places: ");
        dub2 = keyboard.nextDouble();
        System.out.println("Enter another number (positive or negative up to two decimal places: ");
        dub3 = keyboard.nextDouble();
        // print three ints and their sum
        int intSum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);
        // print three doubles and their sum
        double dubSum = dub1 + dub2 + dub3;
        System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum);
        keyboard.close()
    }
}