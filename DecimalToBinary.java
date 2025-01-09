import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Decimal to Binary
        System.out.print("Enter the decimal number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuffer str = new StringBuffer();
        if (num == 0) {
            str.append("0");  // Special case for 0
        }
        else {
            while (num > 0) {
                int rem = num % 2;
                num = num / 2;
                str.append(rem);  // Append the remainder
            }
        }
        // The binary number is in reverse order, so reverse it
        str.reverse();

        System.out.println("Binary representation: " + str);
    }
}
