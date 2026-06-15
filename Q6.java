import java.util.Scanner;

public class decimal_to_hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int n = sc.nextInt();

        String hex = Integer.toHexString(n).toUpperCase();

        System.out.println("Hexadecimal number is : " + hex);
    }
}