package jobsheet2;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value N : ");
        int N = sc.nextInt();
        for (int iouter = 1; iouter <= N; iouter++) {
        for (int i = 1; i <= N; i++) {
            System.out.print("*");

        } 
        System.out.println("");
        }
    }
}
