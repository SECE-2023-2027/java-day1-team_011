import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int n = sc.nextInt();

        String octal = Integer.toOctalString(n);

        System.out.println("Octal number is: " + octal);
    }
}