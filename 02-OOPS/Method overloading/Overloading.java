class Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition = " + (a + b + c));
    }
}

public class Overloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}