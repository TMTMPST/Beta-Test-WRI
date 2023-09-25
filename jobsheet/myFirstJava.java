package jobsheet;
import java.util.Scanner;

public class myFirstJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int b =1;
        int sum = 0;
        double avg;

        System.out.print("Masukan angka : ");
        N = input.nextInt();
        sum = 0;
        int N2 = N/2;
        for (int i = 1; i <= N; i++) {
            if ((i%2)==0) {
                System.out.println("even number " + b + " is " + i );
                sum += i;
                b++;

            } 
        }

        System.out.println(sum);
        avg = sum / N2;
        System.out.println(avg);
    }
}
