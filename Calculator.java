public class Calculator {

    int a = 10, b = 5;

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}