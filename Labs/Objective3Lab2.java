public class Objective3Lab2 {
    public static void main(String[] args) {
        double side1, side2, hypotenuse;
        side1 = 13.2;
        side2 = 11.1;
        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println("Hypotenuse: " + hypotenuse + " for a triage with side lengths of " + side1 + " and " + side2);
    }
}