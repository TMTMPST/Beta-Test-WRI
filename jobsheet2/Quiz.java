package jobsheet2;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        char menu ='y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the number (1 - 10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);
            } while (!success);
            System.out.println("Do you want to repeat the game (y/n) ");
            menu = sc.next().charAt(0);
            sc.nextLine();
    }while (menu == 'Y' || menu == 'y');
}
}
