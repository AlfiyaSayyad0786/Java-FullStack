package Shift;

public class ShiftExample {
    public static void main(String[] args) {

        int a = 8;

        System.out.println("Left Shift = " + (a << 1));
        System.out.println("Right Shift = " + (a >> 1));
        System.out.println("Unsigned Right Shift = " + (a >>> 1));
    }
}