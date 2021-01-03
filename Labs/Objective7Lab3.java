public class Objective7Lab3 {
    int counter = 1;

    public String evenOrOdd(int currentCount){
        counter = currentCount;
        if (counter % 2 == 0) {
            return " is even";
        } else {
            return " is odd";
        }
    }

    public static void main(String[] args) {
        Objective7Lab3 c = new Objective7Lab3();

        while (c.counter <= 20) {
            System.out.println(c.counter + c.evenOrOdd(c.counter));
            c.counter += 1;
        }
    }
}