package jobsheet;
import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        int number, factorial, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        factorial = 1;
        for ( i = 1; i <= number; i++) {
            factorial = factorial * i;
            System.out.printf("the factorial of %d is %d\n", number, factorial);
        }
    }
}
