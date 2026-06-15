import java.util.Scanner;

public class int_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        System.out.println("Binary number is: " + binary);
    }
}