import java.util.Scanner;

public class Objective7Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        while (true) {
            System.out.println("_______Menu________");
            System.out.println("1: Say Hello");
            System.out.println("2: List my favorite foods");
            System.out.println("3: Exit");
            System.out.println();

            selection = scanner.nextInt();

            if (selection == 3) {
                break;
            } else if (selection == 2) {
                System.out.println("Apple, Banana, Coconut");
            } else {
                System.out.println("Hello human");
            }
        }
    }
}