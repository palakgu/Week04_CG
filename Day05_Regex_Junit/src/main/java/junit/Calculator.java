package junit;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println(" The Addition of the number  : " + add(num1 ,num2));
        System.out.println(" The Subtraction of the number  : "+ subtraction(num1 ,num2));
        System.out.println(" The Multiply of the number  : "+ multiply(num1 ,num2));
        System.out.println(" The Divide of the number  : "+ divide(num1 ,num2));
    }

    public static int divide(int num1, int num2) {
        return num2/num1;
    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static int subtraction(int num1, int num2) {
        return num2-num1;
    }

    public static int add(int num1 ,int num2 ){
        return num1+num2;
    }

}
