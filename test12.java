import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        System.out.print("Masukkan Angka : ");
        i = input.nextInt();

        for (int j = 1; j < i; j++) {
            if ((j % 5) == 0) {
                
            } else {
                System.out.print(j);
            }
        }
    }
    
}
