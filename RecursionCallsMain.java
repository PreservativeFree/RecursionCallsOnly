import java.util.Scanner;

public class RecursionCallsMain {
    public final static int SQUARECONST = 5;

    public static void main(String[] args) {
        double[] numArray = {4, 8, 10, 7, 9};
        double[] prodArray = {3, 2, 4, 10, 3, 13, 3};
        long userNum, result;
        double answer;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a #: ");
        userNum = input.nextLong();
        result = additionCall(userNum);
        System.out.printf("Result from addition: %d\n", result);
        System.out.print("Enter another #: ");
        userNum = input.nextLong();
        result = doubleFactorial(userNum);
        System.out.printf("Result from Double Factorial Function %d\n", result);
        System.out.println("Performing Void Square...");
        square(numArray, 5);
        System.out.println("Performing Void Product...");
        answer = product(prodArray, 7);
        System.out.printf("Product is %.2f\n", answer);
    }

    static long additionCall(long n) {
        if(n <= 1)
            return 1;
        else
            return (n + additionCall(n-1));
    }

    static long doubleFactorial(long n) {
        if(n == 0) {
            return 1;
        } else if(n%2 == 0) {
            return n*doubleFactorial(n-2);
        } else if(n%2 == 1) {
            if(n == 1)
                return 1;
            else
                return n * doubleFactorial(n-2);
        } else
            return 1;
    }
     static void square(double a[], int els) {
        if(els == 0) return;
        noLoop(a, 0);
    }

    static void noLoop(double a[], int els) {
        double display;
        if(els == SQUARECONST)
            return;
        display = power(a[els], 2);
        System.out.printf("Array at position %d is now %.2f\n", els, display);
        a[els] = display;
        noLoop(a, els + 1);
    }
    static double power(double a, int b) {
        return b > 1 ? power(a, b-1)*a: a;
    }

    static double product(double a[], int els) {
        if(els == 1)
            return a[0];
        else
            return product(a, els-1) * a[els-1];
    }

}
