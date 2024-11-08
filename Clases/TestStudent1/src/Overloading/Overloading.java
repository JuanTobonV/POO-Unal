package Overloading;

public class Overloading {
    public static void main(String[] args) {
        MathOperations op1 = new MathOperations();
        MathOperations op2 = new MathOperations();

        System.out.println(op1.add(2,3));
        System.out.println(op1.add(3.2, 11.2, 5.0));
        System.out.println(op2.add(0.3, 2.5, 4.1));


    }
}
