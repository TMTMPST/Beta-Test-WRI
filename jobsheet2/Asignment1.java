package jobsheet2;

import java.util.Scanner;

public class Asignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; ++i) {
            int spasi = N-i;
            for (int o = 1; o <= spasi; o++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
        System.out.println("");
    }
        }
    }
