import java.util.Scanner;

public class factorialwhile {
    public static void main(String[] args) {
        int number, factorial, i;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number ");
        number =  input.nextInt();

        factorial = 1;
        i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }    
            System.out.printf("The factorial of %d is %d\n", number, factorial);
        }
    }

