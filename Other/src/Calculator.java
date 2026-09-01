class Addition {
    int add(int a, int b) {
        return a + b;
    }
}

class Multiplication {
    int multiply(int a, int b) {
        return a * b;
    }
}

public class Calculator {
    public static void main(String[] args) {

        Addition obj1 = new Addition();
        Multiplication obj2 = new Multiplication();

        System.out.println("Addition = " + obj1.add(10, 20));
        System.out.println("Multiplication = " + obj2.multiply(10, 20));
    }
}