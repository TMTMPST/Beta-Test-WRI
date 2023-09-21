import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");

        int num = scan.nextInt();

        scan.close();

        System.out.println("the number entered by user : " + num);
    }
}