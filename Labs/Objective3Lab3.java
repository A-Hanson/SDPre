public class Objective3Lab3 {
    // simulate a rolled 6 sided die
    public static void main(String[] args) {
        int first, second, third, answer;
        first = 1 + (int)(Math.random() * 6);
        second = 1 + (int)(Math.random() * 6);
        third = 1 + (int)(Math.random() * 6);
        answer = first + second + third;
        System.out.println("Rolls: " + first + ", " + second + ", and " + third + ". Sum: " + answer);
    }
}