import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter Number: ");
        number = input.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Odd Number");
        // }
        String output = (number % 2 == 0) ? "Even Number" : "Odd number";
        System.out.println(output);
        }
    }
