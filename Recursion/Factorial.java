package Recursion;

public class Factorial {

    public static int Factorial(int num) {

        if (num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }

    public static void main(String[] args) {

        int result = Factorial(4);

        System.out.println(result);

    }

}
