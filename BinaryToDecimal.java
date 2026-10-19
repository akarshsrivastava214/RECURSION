import java.util.Scanner;
public class BinaryToDecimal {
    public static int decimal(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + 2 * decimal(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimal(n));
        sc.close();
    }
}
